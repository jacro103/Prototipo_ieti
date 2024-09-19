package com.example.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recomendation")
public class Recomendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @OneToMany
    @JoinColumn(name = "preference") 
    private List<Preference> preference;
    @OneToMany
    @JoinColumn(name = "place") 
    private List<Place> place;
    @OneToOne
    @JoinColumn(name = "user")
    private User user;

    public Recomendation(Long id, List<Preference> preference, List<Place> place, User user) {
        this.id = id;
        this.preference = preference;
        this.place = place;
        this.user = user;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((preference == null) ? 0 : preference.hashCode());
        result = prime * result + ((place == null) ? 0 : place.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Recomendation other = (Recomendation) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (preference == null) {
            if (other.preference != null)
                return false;
        } else if (!preference.equals(other.preference))
            return false;
        if (place == null) {
            if (other.place != null)
                return false;
        } else if (!place.equals(other.place))
            return false;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        return true;
    }

}
