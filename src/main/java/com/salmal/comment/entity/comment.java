package com.salmal.comment.entity;

public class comment {

    //@Id
    //@generatedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(columnDefinition = "TEXT", nullable = false)
    private String comment;

    //@Column(name = "created_date")
    //@LastModifiedDate
    private String modifiedDate;

    //@ManyToOne
    //@JoinColumn(name = "posts_id")
    //private Posts posts;

    //@ManyToOne
    //@JoinColumn(name = "user_id")
    //private User user;
}
