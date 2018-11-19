package com.endava.springDataHomework.controller;

import com.endava.springDataHomework.model.Hero;
import com.endava.springDataHomework.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HeroController {

    @Autowired
    HeroRepository heroRepository;

    @GetMapping("/")
    public Hero getHero()
    {
        return heroRepository.findByName("Iron Man");
    }

    @GetMapping("/hero")
    public String getHeroPowers()
    {
        List<Hero> heroes = heroRepository.findAll();
        StringBuilder sb = new StringBuilder();

        for(Hero h : heroes)
        {
            sb.append(h.getName()).append(": ");
            for(String s : h.getPowers())
            {
                sb.append(s).append(", ");
            }
            sb.replace(sb.toString().length()-2,sb.toString().length()-1,".");
        }

        return sb.toString();
    }
}
