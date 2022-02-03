package com.technews.testModel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/*
Here's a brief overview of the annotations you've just added:
@Entity marks this as a persistable object, so that the User class can map to a table.
@JsonIgnoreProperties specifies properties that should be ignored when serializing this object to JSON.
The two arguments that follow the annotation are the properties to be ignored. Note that you could add
many more if necessary.
@Table specifies the name of the table that this class maps to. If this annotation isn't present, the
table name will be the class name by default.
 */

@Entity
@JsonIgnoreProperities({"hibernateLazyInitializer", "handler"})
@Table(name = "user")

public class User {
    /*
    With the class created, along with its class-level annotations, we can start adding instance variables.
    We'll create eight instance variables: id, username, email, password, loggedIn, posts, votes, and comments.
    Of those, the posts, votes, and comments instance variables will be lists—collections of objects of the same type.
     */

    /*
    Now for the proper instance-level annotations. First, we want to attach the @Id and @GeneratedValue annotations
    to the id private variable. The first signals that id will be used as the unique identifier, and the second
    denotes that it will be a generated value. We'll pass an argument into @GeneratedValue to say that this
    number should be generated automatically, by adding (strategy = GenerationType.AUTO).
    Now let's add the annotation @Column(unique = true) to email, to signal that this value must be unique;
    duplicates won't be allowed.
    Finally, we'll add @Transient to the loggedIn variable. @Transient signals to Spring Data JPA that this
    data is NOT to be persisted in the database, because we don't need or want a user's logged-in status
    to persist in the data.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;

    @Column(unique = true)
    private String email;

    private String password;

    @Transient
    boolean loggedIn;

    private List<Post> posts;
    private List<Vote> votes;
    private List<Comment> comments;
}
