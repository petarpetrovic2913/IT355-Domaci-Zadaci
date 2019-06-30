/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.springmvc.blog.dao;

import demo.springmvc.blog.domain.Post;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author mirai
 */
public class PostDaoImpl implements PostDao{
    
    private static final Logger logger = LoggerFactory.getLogger(PostDaoImpl.class);
    
    private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sf){
	this.sessionFactory = sf;
    }
    
    @Override
    public void addPost(Post p) {
	Session session = this.sessionFactory.getCurrentSession();
	session.persist(p);
        logger.info("Post saved successfully, Post Details="+p);
    }

    @Override
    public void updatePost(Post p) {
	Session session = this.sessionFactory.getCurrentSession();
	session.update(p);
        logger.info("Post updated successfully, Post Details="+p);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Post> listPosts() {
        Session session = this.sessionFactory.getCurrentSession();
	List<Post> postList = session.createQuery("from Post").list();
	for(Post po : postList){
		logger.info("Post List::"+po);
	}
        return postList;
    }

    @Override
    public void removePost(int id) {
        Session session = this.sessionFactory.getCurrentSession();
	Post p = (Post) session.load(Post.class, new Integer(id));
	if(null != p){
		session.delete(p);
	}
        logger.info("Post deleted successfully, Post details="+p);
    }

    public void updatePost(String response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
