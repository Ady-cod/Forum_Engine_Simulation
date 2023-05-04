package com.codecool.forumengine;

import java.util.ArrayList;
import java.util.List;

public class Topic extends Post {
    private TopicType type;
    private final String title;
    private List<Comment> comments;

    public Topic(String message, TopicType type, String title) {
        super(message);
        this.type = type;
        this.title = title;
        this.comments = new ArrayList<>();
    }


    public List<Comment> getComments() {
        return comments;
    }

    public TopicType getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public void addComment(Comment comment){
        if(comment.getTopic().equals(this)){
            comments.add(comment);
        }
    }
    public List<Comment> getModeratedComments(){
        List<Comment>moderatedComments = new ArrayList<>();
        for(Comment comment:comments){
            if(comment.isModerated()) moderatedComments.add(comment);
        }
        return moderatedComments;
    }
}
