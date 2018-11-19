package com.endava.springDataHomework;

import com.endava.springDataHomework.model.Hero;
import com.endava.springDataHomework.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataHomeworkApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataHomeworkApplication.class, args);
	}

	@Autowired
	HeroRepository heroRepository;

	@Override
	public void run(String... args) throws Exception {
		List<String> powers = new ArrayList<>();
		powers.add("Super strength");
		powers.add("Ability to fly");
		powers.add("Durability");
		powers.add("High tech weapons");
		heroRepository.save(new Hero("Iron Man","Marvel",powers));
		powers = new ArrayList<>();
		powers.add("God like strength");
		powers.add("Speed");
		powers.add("Agility");
		heroRepository.save(new Hero("Wonder Woman","DC",powers));
	}
}
