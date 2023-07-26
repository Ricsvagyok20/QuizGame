package com.quiz.game;

import com.quiz.game.player.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@RestController
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

	@GetMapping
	public List<Player> hello(){
		return List.of(new Player("Sanyi", "sanyi@gmail.com", "asdasd123", "History", LocalDate.now()));
	}

}
