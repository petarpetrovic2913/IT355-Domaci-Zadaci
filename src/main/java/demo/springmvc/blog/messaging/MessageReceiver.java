/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.springmvc.blog.messaging;

import demo.springmvc.blog.dao.PostDaoImpl;
import javax.jms.JMSException;
import javax.jms.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    static final Logger LOG
            = LoggerFactory.getLogger(MessageReceiver.class);
    private static final String ORDER_RESPONSE_QUEUE
            = "order-response-queue";
    @Autowired
    PostDaoImpl postService;

    /**
     *
     * @param message
     * @throws JMSException
     */
    @JmsListener(destination = ORDER_RESPONSE_QUEUE)
    public void receiveMessage(final Message message) throws JMSException {
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int headers = message.DEFAULT_DELIVERY_MODE;
        LOG.info("Application : headers received : {}", headers);
        String response = message.getJMSMessageID();
        LOG.info("Application : response received : {}",response);
        postService.updatePost(response);
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
