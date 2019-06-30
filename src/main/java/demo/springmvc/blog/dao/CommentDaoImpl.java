

import demo.springmvc.blog.dao.CommentDao;
import demo.springmvc.blog.domain.Comment;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * 
 * @author mirai
 */
public class CommentDaoImpl implements CommentDao{
    
    private static final Logger logger = LoggerFactory.getLogger(CommentDaoImpl.class);
    
    private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sf){
	this.sessionFactory = sf;
    }
    
    @Override
    public void addComment(Comment c) {
	Session session = this.sessionFactory.getCurrentSession();
	session.persist(c);
        logger.info("Comment saved successfully, Comment Details="+c);
    }
    

    @Override
    public void updateComment(Comment c) {
	Session session = this.sessionFactory.getCurrentSession();
	session.update(c);
        logger.info("Comment updated successfully, Comment Details="+c);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Comment> listComments() {
        Session session = this.sessionFactory.getCurrentSession();
	List<Comment> commentList = session.createQuery("from Comment").list();
	for(Comment co : commentList){
		logger.info("Comment List::"+co);
	}
        return commentList;
    }

    @Override
    public void removeComment(int id) {
        Session session = this.sessionFactory.getCurrentSession();
	Comment c = (Comment) session.load(Comment.class, new Integer(id));
	if(null != c){
		session.delete(c);
	}
        logger.info("Comment deleted successfully, Comment details="+c);
    }
    
}
