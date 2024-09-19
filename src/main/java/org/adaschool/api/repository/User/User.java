package org.adaschool.api.repository.user;

import main.java.org.adaschool.api.repository.Location.Location;
import main.java.org.adaschool.api.repository.Review.Review;
import main.java.org.adaschool.api.repository.Preference.Preference;
import main.java.org.adaschool.api.repository.Recomendation.Recomendation;

import java.util.Date;

public class User {

    private Integer id;
    private String name;
    private String email;
    private String password;
    private Location Location;
    private List<Review> history;
    private List<Preference> preference;
    private Recomendation recomendation;

    public User(Integer id, String name, String email, String password,
            Location location, List<Review> history, List<Preference> preference,
            Recomendation recomendation) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        Location = location;
        this.history = history;
        this.preference = preference;
        this.recomendation = recomendation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location location) {
        Location = location;
    }

    public List<Review> getHistory() {
        return history;
    }

    public void setHistory(List<Review> history) {
        this.history = history;
    }

    public List<Preference> getPreference() {
        return preference;
    }

    public void setPreference(List<Preference> preference) {
        this.preference = preference;
    }

    public Recomendation getRecomendation() {
        return recomendation;
    }

    public void setRecomendation(Recomendation recomendation) {
        this.recomendation = recomendation;
    }

}
