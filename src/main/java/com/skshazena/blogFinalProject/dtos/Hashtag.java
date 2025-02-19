package com.skshazena.blogFinalProject.dtos;

import java.util.Objects;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Shazena Khan
 *
 * Date Created: Oct 18, 2020
 */
public class Hashtag {

    private int hashtagId;

    @NotNull(message = "Hashtag must be entered")
    @NotBlank(message = "Hashtag must not be blank")
    @Size(max = 50, message = "Hashtag must be less than 50 characters.")
    @Pattern(regexp = "[a-zA-Z0-9]*", message = "Each Hashtag must contain letters and numbers only")
    private String title;

    private int numberOfPosts;

    public int getHashtagId() {
        return hashtagId;
    }

    public void setHashtagId(int hashtagId) {
        this.hashtagId = hashtagId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.hashtagId;
        hash = 59 * hash + Objects.hashCode(this.title);
        hash = 59 * hash + this.numberOfPosts;
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
        final Hashtag other = (Hashtag) obj;
        if (this.hashtagId != other.hashtagId) {
            return false;
        }
        if (this.numberOfPosts != other.numberOfPosts) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hashtag{" + "hashtagId=" + hashtagId + ", title=" + title + ", numberOfPosts=" + numberOfPosts + '}';
    }

}
