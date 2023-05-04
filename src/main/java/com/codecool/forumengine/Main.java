package com.codecool.forumengine;

import java.text.Normalizer;

public class Main {
    public static void main(String[] args) {
        Topic topic1 = new Topic("As you know a PA will happens soon",TopicType.ANNOUNCEMENT,"An event is coming");
        Topic topic2 = new Topic("Please stay tune for details!",TopicType.NEWS,"A new simulation is requested");
        Topic topic3 = new Topic("A great day to all!",TopicType.REGULAR,"As always please check updated news");

        Comment comment1 = new Comment("I don't know you, but I feel like I need a lot of practice!",topic1);
        Comment comment2 = new Comment("Practicing simulations will help us a lot!",topic2);
        Comment comment3 = new Comment("Let's continue working and try our best",topic3);


        comment1.toogleModerated();
        comment2.toogleModerated();
        comment3.toogleModerated();

        topic1.addComment(comment1);
        topic2.addComment(comment2);
        topic3.addComment(comment3);

        Forum forum = Forum.getInstance();
        forum.addTopic(topic1);
        forum.addTopic(topic2);
        forum.addTopic(topic3);
        forum.getForumForDisplay();
    }
}