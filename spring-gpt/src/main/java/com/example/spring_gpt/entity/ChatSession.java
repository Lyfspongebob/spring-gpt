package com.example.spring_gpt.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ChatSession {
    @Id
    private String session_id;

    private String title;



    @OneToOne
    @JoinColumn(name = "mask_id",referencedColumnName = "maskId")
    private Mask mask;


    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL)//不能是CascadeType.PERSIST,因为该方法中不包括delete
//    级联操作范围：
//    CascadeType.PERSIST仅涉及保存操作。
//    CascadeType.ALL则包括保存、更新、删除和刷新等所有持久化操作。

//    如果只需要级联保存操作，使用CascadeType.PERSIST更为合适，因为它更为专注且不会引入不必要的数据库交互。
//    如果需要全面的级联操作覆盖，包括更新、删除和刷新等，则应使用CascadeType.ALL。但需要注意的是，这可能会增加数据库交互的复杂性，因此在使用时需要谨慎考虑。
    private List<ChatMessage> messages;


    private long createTime;

    private long lastUpdate;


    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
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

    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
