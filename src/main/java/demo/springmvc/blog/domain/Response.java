/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.springmvc.blog.domain;

import java.io.Serializable;

public class Response implements Serializable {

    private String postId;
    private int returnCode;
    private String comment;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((postId == null) ? 0
                : postId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Response other = (Response) obj;
        if (postId == null) {
            if (other.postId != null) {
                return false;
            }
        } else if (!postId.equals(other.postId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryResponse [orderId=" + postId + ",returnCode = " + returnCode + ", comment = " + comment + "]";
    }
}
