package com.example.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String passwordHash;
    @Column
    private String foodType;
    @Column
    private String Value;
    @OneToOne
    @JoinColumn(name = "location")
    private Location Location;
    @OneToOne
    @JoinColumn(name = "rating")
    private Rating rating;

    public Place(Long id, String name, String description, String passwordHash, String foodType, String value,
                 Location location, Rating rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.passwordHash = passwordHash;
        this.foodType = foodType;
        Value = value;
        Location = location;
        this.rating = rating;
    }

    public Place() {

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location location) {
        Location = location;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((passwordHash == null) ? 0 : passwordHash.hashCode());
        result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
        result = prime * result + ((Value == null) ? 0 : Value.hashCode());
        result = prime * result + ((Location == null) ? 0 : Location.hashCode());
        result = prime * result + ((rating == null) ? 0 : rating.hashCode());
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
        Place other = (Place) obj;
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
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (passwordHash == null) {
            if (other.passwordHash != null)
                return false;
        } else if (!passwordHash.equals(other.passwordHash))
            return false;
        if (foodType == null) {
            if (other.foodType != null)
                return false;
        } else if (!foodType.equals(other.foodType))
            return false;
        if (Value == null) {
            if (other.Value != null)
                return false;
        } else if (!Value.equals(other.Value))
            return false;
        if (Location == null) {
            if (other.Location != null)
                return false;
        } else if (!Location.equals(other.Location))
            return false;
        if (rating == null) {
            if (other.rating != null)
                return false;
        } else if (!rating.equals(other.rating))
            return false;
        return true;
    }

}