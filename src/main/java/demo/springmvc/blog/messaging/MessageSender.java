/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.springmvc.blog.messaging;

import demo.springmvc.blog.domain.Post;
import java.io.Serializable;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;


@Component
public class MessageSender {

    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMessage(final Post post) {
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws
                    JMSException {
                ObjectMessage objectMessage
                        = session.createObjectMessage((Serializable) post);
                return objectMessage;
            }
        });
    }
}
