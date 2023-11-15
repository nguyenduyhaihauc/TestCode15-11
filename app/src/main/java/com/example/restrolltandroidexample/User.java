package com.example.restrolltandroidexample;

import java.util.List;

public class User {
    private int id;
    private String name;
    private boolean inActive;
    private Job job;
    private List<Favorite> favorites;

    public User(int id, String name, boolean inActive, Job job, List<Favorite> favorites) {
        this.id = id;
        this.name = name;
        this.inActive = inActive;
        this.job = job;
        this.favorites = favorites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInActive() {
        return inActive;
    }

    public void setInActive(boolean inActive) {
        this.inActive = inActive;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }
}
