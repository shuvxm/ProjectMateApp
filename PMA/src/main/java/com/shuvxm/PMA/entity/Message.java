package com.shuvxm.PMA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;
    private LocalDateTime createdAt;


    //    @ManyToMany(mappedBy = "message", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //    private List<Chat> chats;
//    @ManyToMany
//    @JoinTable(
//            name = "chat_messages",
//            joinColumns = @JoinColumn(name = "message_id"),
//            inverseJoinColumns = @JoinColumn(name = "chat_id")
//    )
//    private List<Chat> chats = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "chat_id")  // Maps to 'messages' in Chat
    private Chat chat;


    @ManyToOne
    private User sender;
}
