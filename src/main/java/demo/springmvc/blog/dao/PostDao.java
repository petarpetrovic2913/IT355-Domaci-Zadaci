/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.springmvc.blog.dao;

import demo.springmvc.blog.domain.Post;
import java.util.List;

/**
 *
 * @author mirai
 */
public interface PostDao {
    public void addPost(Post p);
    public void updatePost(Post p);
    public List<Post> listPosts();
    public void removePost(int id);
}
