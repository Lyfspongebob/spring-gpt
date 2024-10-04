package com.example.spring_gpt.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ChatSession {
    @Id
    private String sessionId;

    @OneToOne
    @JoinColumn(name = "mask_id",referencedColumnName = "maskId")
    private Mask mask;
    private String title;

    @OneToMany(mappedBy = "session",cascade = CascadeType.PERSIST)
    private List<ChatMessage> messages;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public List<ChatMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ChatMessage> messages) {
        this.messages = messages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Mask getMask() {
        return mask;
    }

    public void setMask(Mask mask) {
        this.mask = mask;
    }
}
