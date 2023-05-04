package com.codecool.forumengine;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Post {
    private UUID id;
    private LocalDate date;
    private final String message;

    public Post(String message) {
        this.id = UUID.randomUUID();
        this.date = LocalDate.now();
        this.message = message;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }
}
