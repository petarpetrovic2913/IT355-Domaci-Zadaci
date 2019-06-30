/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.springmvc.blog.dao;

import demo.springmvc.blog.domain.Comment;
import java.util.List;

/**
 *
 * @author mirai
 */
public interface CommentDao {

    public void addComment(Comment c);
    public void updateComment(Comment c);
    public List<Comment> listComments();
    public void removeComment(int id);
}
