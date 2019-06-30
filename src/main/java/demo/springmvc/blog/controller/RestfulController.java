/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.springmvc.blog.controller;

import demo.springmvc.blog.domain.Comment;
import demo.springmvc.blog.domain.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author mirai
 */

@RestController
public class RestfulController {
    
    @Autowired
    Post postDao;
    @Autowired
    Comment commentDao;

    @RequestMapping(value = "/post", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Post>> getProducts() {
        System.out.println("Fetching posts");
        List<Post> posts = postDao.getContents();
        if (posts.size() == 0) {
            System.out.println("Post list empty");
            return new ResponseEntity<List<Post>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Post> getProduct(@PathVariable("id") int id) {
        System.out.println("Fetching posts with id " + id);
        Post posts = postDao.getPostId(id);
        if (posts == null) {
            System.out.println("Post with " + id + " not found");
            return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Post>(posts, HttpStatus.OK);
    }

    @RequestMapping(value = "/comment", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Comment>> getCategories() {
        System.out.println("Fetching comments");
        List<Comment> comments = commentDao.getContents();
        if (comments.size() == 0) {
            System.out.println("Comment list empty");
            return new ResponseEntity<List<Comment>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Comment>>(comments, HttpStatus.OK);
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Comment> getCategory(@PathVariable("id") int id) {
        System.out.println("Fetching comment with id " + id);
        Comment c = commentDao.getCommentByID(id);
        if (c == null) {
            System.out.println("Comment with " + id + " not found");
            return new ResponseEntity<Comment>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Comment>(c, HttpStatus.OK);
    }

    @RequestMapping(value = "/post/", method = RequestMethod.POST)
    public ResponseEntity<Void> addPost(@RequestBody Post product) {
        System.out.println("Adding post " + product.toString());
        postDao.addPost(product);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Post> updateProduct(@PathVariable("id") int id, @RequestBody Post product) {
        System.out.println("Updating post " + id);

        product.setId(id);
        postDao.editPost(product);
        return new ResponseEntity<Post>(product, HttpStatus.OK);
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Post> deletePost(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting posts with id " + id);

        Post produc = postDao.getPostId(id);
        if (produc == null) {
            System.out.println("Unable to delete. Post with id " + id + " not found");
            return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
        }

        postDao.deletePost(produc);
        return new ResponseEntity<Post>(HttpStatus.OK);
    }

    @RequestMapping(value = "/comment/", method = RequestMethod.POST)
    public ResponseEntity<Void> addComment(@RequestBody Comment c) {
        System.out.println("Adding category " + c.toString());
        postDao.addComment(c);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Comment> updateCategory(@PathVariable("id") int id, @RequestBody Comment c) {
        System.out.println("Updating comments " + id);

        c.setId(id);
        postDao.editComment(c);
        return new ResponseEntity<Comment>(c, HttpStatus.OK);
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Comment> deleteCategory(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting comment with id " + id);

        Comment c = commentDao.getCommentByID(id);
        if (c == null) {
            System.out.println("Unable to delete. Category with id " + id + " not found");
            return new ResponseEntity<Comment>(HttpStatus.NOT_FOUND);
        }

        postDao.deleteComment(c);
        return new ResponseEntity<Comment>(HttpStatus.OK);
}
}
