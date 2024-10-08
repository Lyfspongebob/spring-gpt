package com.example.spring_gpt.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Mask {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private String maskId;

    private String avatar;

    private String name;

//    private String hint;
//    @OneToMany(mappedBy = "mask", cascade = CascadeType.PERSIST)
//    private List<ChatMessage> context;

//    @OneToMany(mappedBy = "mask", cascade = CascadeType.PERSIST)
//    private List<ChatMessage> hint;

    @OneToMany(mappedBy = "mask", cascade = CascadeType.PERSIST)
    private List<ChatMessage> context;

    public String getMaskId() {
        return maskId;
    }

    public void setMaskId(String maskId) {
        this.maskId = maskId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getHint() {
//        return hint;
//    }
//
//    public void setHint(String hint) {
//        this.hint = hint;
//    }

    public List<ChatMessage> getContext() {
        return context;
    }

    public void setContext(List<ChatMessage> context) {
        this.context = context;
    }
}
