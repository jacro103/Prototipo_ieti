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
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
    @OneToOne
    @JoinColumn(name = "Location") 
    private Location Location;
    @OneToMany
    @JoinColumn(name = "review") 
    private List<Review> history;
    @OneToMany
    @JoinColumn(name = "preference") 
    private List<Preference> preference;
    @OneToOne
    @JoinColumn(name = "recomendation")
    private Recomendation recomendation;

    
    public User() {
    }

    public User(Long id, String name, String email, String password,
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((Location == null) ? 0 : Location.hashCode());
        result = prime * result + ((history == null) ? 0 : history.hashCode());
        result = prime * result + ((preference == null) ? 0 : preference.hashCode());
        result = prime * result + ((recomendation == null) ? 0 : recomendation.hashCode());
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
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (Location == null) {
            if (other.Location != null)
                return false;
        } else if (!Location.equals(other.Location))
            return false;
        if (history == null) {
            if (other.history != null)
                return false;
        } else if (!history.equals(other.history))
            return false;
        if (preference == null) {
            if (other.preference != null)
                return false;
        } else if (!preference.equals(other.preference))
            return false;
        if (recomendation == null) {
            if (other.recomendation != null)
                return false;
        } else if (!recomendation.equals(other.recomendation))
            return false;
        return true;
    }

}
