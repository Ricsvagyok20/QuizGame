package com.quiz.game.player;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table
public class Player {
    @Id @GeneratedValue Long id;
    String name;
    String email;
    String password;
    String topicName;
    LocalDate dot;

    public Player(String name, String email, String password, String topicName, LocalDate dot) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.topicName = topicName;
        this.dot = dot;
    }
}
