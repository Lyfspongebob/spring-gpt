package com.example.spring_gpt.controller;

import com.example.spring_gpt.entity.ChatMessage;
import com.example.spring_gpt.entity.ChatSession;
import com.example.spring_gpt.repository.ChatMessageRepository;
import com.example.spring_gpt.repository.ChatSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Controller
@RequestMapping("/session")
public class ChatSessionController {

    @Autowired
    private ChatSessionRepository chatSessionRepository;

    @Autowired
    private ChatMessageRepository chatMessageRepository;

//    @GetMapping("/get")     //session/get
//    public @ResponseBody ChatSession getSessionById(@RequestParam String id){
//        Optional<ChatSession> session = chatSessionRepository.findById(id);
//        if(session.isPresent()){
//            return session.get();
//        }else{
//            return null;
//        }
//    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<ChatSession> getAllSessions() {
        // This returns a JSON or XML with the users
        return chatSessionRepository.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody String addSession (@RequestBody ChatSession session) {
        chatSessionRepository.save(session);
        return "Saved";
    }

    @PostMapping(path="/message/add")
    public @ResponseBody String addMessage (@RequestParam String session_id, @RequestBody ChatMessage message) {
        ChatSession session = chatSessionRepository.findById(session_id).get();
        message.setSession(session);
        chatMessageRepository.save(message);
        return "Saved";
    }

    @PostMapping(path="/delete")
    public @ResponseBody String deleteSession (@RequestParam String session_id) {
        chatSessionRepository.deleteById(session_id);
        return "Deleted";
    }
}
