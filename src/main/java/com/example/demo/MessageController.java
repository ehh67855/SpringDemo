package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/")
    public String viewMessages(Model model) {
        model.addAttribute("messages", messageService.findAll());
        return "index";
    }

    @PostMapping("/addMessage")
    public String addMessage(@RequestParam String content) {
        Message message = new Message();
        message.setContent(content);
        messageService.save(message);
        return "redirect:/";
    }
}
