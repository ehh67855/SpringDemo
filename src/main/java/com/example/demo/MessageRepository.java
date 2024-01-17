package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
    //Optional<List<Message>> findAllByContent(String content);
}
