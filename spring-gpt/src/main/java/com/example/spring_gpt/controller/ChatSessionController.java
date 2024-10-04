package com.example.spring_gpt.controller;

import com.example.spring_gpt.entity.ChatSession;
import com.example.spring_gpt.repository.ChatSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@Controller
@RequestMapping("/session")
public class ChatSessionController {
    @Autowired
    private ChatSessionRepository chatSessionRepository;

    @GetMapping("/get")     //session/get
    public @ResponseBody ChatSession getSessionById(@RequestParam String id){
        Optional<ChatSession> session = chatSessionRepository.findById(id);
        if(session.isPresent()){
            return session.get();
        }else{
            return null;
        }
    }

    
}
