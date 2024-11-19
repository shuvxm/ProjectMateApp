package com.shuvxm.PMA.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private String category;
    //    @ElementCollection
    private List<String> tags = new ArrayList<>();

    //    @JsonIgnore
//    @OneToOne(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)  // this mappedBy will go to chat and mapped with chat project
//    private Chat chat;
    @OneToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;


    @ManyToOne
    private User owner;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Issue> issues = new ArrayList<>();

    //    @ManyToMany
//    private List<User> team = new ArrayList<>();
    @ManyToMany
    @JoinTable(
            name = "user_project_team",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> team = new ArrayList<>();

}
