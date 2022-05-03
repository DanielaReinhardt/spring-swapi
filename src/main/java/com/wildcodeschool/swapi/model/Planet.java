package com.wildcodeschool.swapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {

    // TODO : add attributes
    private Long id; //kann sein, dass ich die gar nicht brauche
    @JsonProperty("name")
    private String name;
    private Long rotation_period;
    private Long orbital_period;
    private Long diameter;
    private String climate;
    @JsonProperty ("gravity")
    private String gravity; 
    @JsonProperty("terrain")
    private String terrain;
    @JsonProperty("surface_water")
    private int surface_water;
    @JsonProperty("population")
    private Long population;
    private String[] residents;
    private String[] films;
    private String created;
    private String edited;
    private String url;

    // TODO : add an empty constructor
    public Planet() {

    }
    

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(Long rotation_period) {
        this.rotation_period = rotation_period;
    }

    public Long getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(Long orbital_period) {
        this.orbital_period = orbital_period;
    }

    public Long getDiameter() {
        return diameter;
    }

    public void setDiameter(Long diameter) {
        this.diameter = diameter;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public int getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(int surface_water) {
        this.surface_water = surface_water;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String[] getResidents() {
        return residents;
    }

    public void setResidents(String[] residents) {
        this.residents = residents;
    }

    public String[] getFilms() {
        return films;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }
    
    
}