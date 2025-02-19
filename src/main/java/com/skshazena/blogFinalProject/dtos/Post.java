package com.skshazena.blogFinalProject.dtos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Shazena Khan
 *
 * Date Created: Oct 18, 2020
 */
public class Post {

    private int postId;

    @NotNull(message = "Title must be entered")
    @NotBlank(message = "Title must not be blank")
    @Size(max = 200, message = "Title must be less than 200 characters.")
    private String title;

    private LocalDateTime createdAt;

    @NotNull(message = "Publish Time must be set")
    private LocalDateTime postAt;

    private LocalDateTime expireAt;

    private LocalDateTime lastEditedAt;

    @NotNull(message = "Content must be entered")
    @NotBlank(message = "Content must not be blank")
    private String content;

    private boolean approvalStatus;

    private boolean staticPage;

    @Size(max = 255, message = "Photo File Path must be less than 255 characters.")
    private String titlePhoto;

    @NotNull(message = "Post must have an author")
    @Valid
    private User user;

    @Valid
    private List<Hashtag> hashtagsForPost;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt.withNano(0);
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt.withNano(0);
    }

    public LocalDateTime getPostAt() {
        return postAt;
    }

    public void setPostAt(LocalDateTime postAt) {
        this.postAt = postAt;
    }

    public LocalDateTime getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(LocalDateTime expireAt) {
        this.expireAt = expireAt;
    }

    public LocalDateTime getLastEditedAt() {
        return lastEditedAt.withNano(0);
    }

    public void setLastEditedAt(LocalDateTime lastEditedAt) {
        this.lastEditedAt = lastEditedAt.withNano(0);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public boolean isStaticPage() {
        return staticPage;
    }

    public void setStaticPage(boolean staticPage) {
        this.staticPage = staticPage;
    }

    public String getTitlePhoto() {
        return titlePhoto;
    }

    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Hashtag> getHashtagsForPost() {
        return hashtagsForPost;
    }

    public void setHashtagsForPost(List<Hashtag> hashtagsForPost) {
        this.hashtagsForPost = hashtagsForPost;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.postId;
        hash = 47 * hash + Objects.hashCode(this.title);
        hash = 47 * hash + Objects.hashCode(this.createdAt);
        hash = 47 * hash + Objects.hashCode(this.postAt);
        hash = 47 * hash + Objects.hashCode(this.expireAt);
        hash = 47 * hash + Objects.hashCode(this.lastEditedAt);
        hash = 47 * hash + Objects.hashCode(this.content);
        hash = 47 * hash + (this.approvalStatus ? 1 : 0);
        hash = 47 * hash + (this.staticPage ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.titlePhoto);
        hash = 47 * hash + Objects.hashCode(this.user);
        hash = 47 * hash + Objects.hashCode(this.hashtagsForPost);
        return hash;
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
        final Post other = (Post) obj;
        if (this.postId != other.postId) {
            return false;
        }
        if (this.approvalStatus != other.approvalStatus) {
            return false;
        }
        if (this.staticPage != other.staticPage) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        if (!Objects.equals(this.titlePhoto, other.titlePhoto)) {
            return false;
        }
        if (!Objects.equals(this.createdAt, other.createdAt)) {
            return false;
        }
        if (!Objects.equals(this.postAt, other.postAt)) {
            return false;
        }
        if (!Objects.equals(this.expireAt, other.expireAt)) {
            return false;
        }
        if (!Objects.equals(this.lastEditedAt, other.lastEditedAt)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.hashtagsForPost, other.hashtagsForPost)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Post{" + "postId=" + postId + ", title=" + title + ", createdAt=" + createdAt + ", postAt=" + postAt + ", expireAt=" + expireAt + ", lastEditedAt=" + lastEditedAt + ", content=" + content + ", approvalStatus=" + approvalStatus + ", staticPage=" + staticPage + ", titlePhoto=" + titlePhoto + ", user=" + user + ", hashtagsForPost=" + hashtagsForPost + '}';
    }

}
