package com.codecool.forumengine;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<Topic> topics;
    private static Forum instance = new Forum();

    private Forum(){
        this.topics = new ArrayList<>();
    }

    public static Forum getInstance(){
        return instance;
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void getForumForDisplay(){
        for (Topic topic : topics){
            System.out.println();
            System.out.println(topic.getTitle());
            System.out.println(topic.getMessage());
            for(Comment comment : topic.getModeratedComments()){
                System.out.println(comment.getMessage());
            }
        }
    }

}
