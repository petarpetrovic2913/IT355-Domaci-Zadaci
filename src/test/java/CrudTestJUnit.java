/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import demo.springmvc.blog.dao.CommentDao;
import demo.springmvc.blog.dao.PostDao;
import demo.springmvc.blog.domain.Comment;
import demo.springmvc.blog.domain.Post;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class CrudTestJUnit {
    
    @Autowired
    protected PostDao postDao;
    
    @Autowired
    protected CommentDao commentDao;
    
    public CrudTestJUnit() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void addPostTest(){
        Post post = new Post();
        post.setContent("Sadrzaj posta");
        postDao.addPost(post);
        Assert.assertNotNull(post);
    
    }
    
    @Test
    public void updatePostTest(){
        Post post = new Post();
        post.editPost(post);
        postDao.updatePost(post);
        Assert.assertNotNull(post);
    }
    
    @Test
    public void removePostTest(int id){
        Post post = new Post();
        post.deletePost(post);
        postDao.removePost(id);
        Assert.assertNotNull(post);
    }
    
    @Test
    public void addCommentTest(){
        Comment comment = new Comment();
        comment.setContent("Sadrzaj komentara");
        commentDao.addComment(comment);
        Assert.assertNotNull(comment);
    }
    
    public void updateCommentTest(){
        Comment comment = new Comment();
        commentDao.updateComment(comment);
        Assert.assertNotNull(comment);
    }
    
    public void removeCommentTest(int id){
        Comment comment = new Comment();
        commentDao.removeComment(id);
        Assert.assertNotNull(comment);
    }
}
