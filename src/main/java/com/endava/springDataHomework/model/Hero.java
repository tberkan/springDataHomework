package com.endava.springDataHomework.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long heroId;

    private String name;

    private String studio;

    @ElementCollection
    private List<String> powers;

    public Hero() {
    }

    public Hero(String name, String studio, List<String> powers) {
        this.name = name;
        this.studio = studio;
        this.powers = powers;
    }

    public Long getHeroId() {
        return heroId;
    }

    public void setHeroId(Long heroId) {
        this.heroId = heroId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public List<String> getPowers() {
        return powers;
    }

    public void setPowers(List<String> powers) {
        this.powers = powers;
    }
}
