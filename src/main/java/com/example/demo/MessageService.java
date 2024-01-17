package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> findAll() {
        return (List<Message>) messageRepository.findAll();
    }

    public void save(Message message) {
        messageRepository.save(message);
    }
}