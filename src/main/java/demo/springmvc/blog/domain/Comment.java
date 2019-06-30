package demo.springmvc.blog.domain;

/**
 *
 * @author mirai
 */

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name = "comment")
public class Comment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        
        @Column(name = "id")
	private int id;
        @Column(name = "content")
	private String content;
        @Column(name = "price")
	private Date date;
        @Column(name = "user_id")
	private int user_id;
        @Column(name = "post_id")
	private int post_id;
        @Column(name = "user_username")
	private String user_username;
        private List<Comment> contents;

        public List<Comment> getContents() {
            return contents;
        }

        public void setContents(List<Comment> contents) {
            this.contents = contents;
        }
        
        
	public String getUser_username() {
		return user_username;
	}

	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

        public Comment getCommentByID(int id) {
            return null;
        }
}
