package main.java.org.adaschool.api.repository.Recomendation;

import main.java.org.adaschool.api.repository.Preference.Preference;
import main.java.org.adaschool.api.repository.Place.Place;
import main.java.org.adaschool.api.repository.User.User;

public class Recomendation {

    private List<Preference> preference;
    private List<Place> place;
    private User user;

    public Recomendation(List<Preference> preference, List<Place> place, User user) {
        this.preference = preference;
        this.place = place;
        this.user = user;
    }

    public List<Preference> getPreference() {
        return preference;
    }

    public void setPreference(List<Preference> preference) {
        this.preference = preference;
    }

    public List<Place> getPlace() {
        return place;
    }

    public void setPlace(List<Place> place) {
        this.place = place;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
