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
@Table(name = "post")
public class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        
        @Column(name = "id")
	private int id;
        @Column(name = "title")
	private String title;
        @Column(name = "content")
	private String content;
        @Column(name = "date")
	private Date date;
        @Column(name = "user_id")
	private int user_id;
        @Column(name = "user_username")
	private String user_username;
        private List<Post> contents;
        
        public List<Post> getContents() {
            return contents;
        }

        public void setContents(List<Post> contents) {
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
        
        public Post getPostId(int id) {
            return null;
        }

        public void deletePost(Post produc) {
            
        }

        public void addComment(Comment c) {

        }

        public void deleteComment(Comment c) {
            
        }

        public void editComment(Comment c) {
            
        }

        public void editPost(Post product) {
            
        }

        public void addPost(Post product) {
            
        }
}
