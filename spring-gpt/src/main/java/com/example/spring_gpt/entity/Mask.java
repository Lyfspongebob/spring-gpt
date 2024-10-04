package com.example.spring_gpt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mask {

    @Id
    private String maskId;

    private String avatar;

    private String name;

    private String hint;

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

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}
