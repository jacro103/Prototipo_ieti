package main.java.org.adaschool.api.repository.Preference;

import org.w3c.dom.ranges.Range;

public class Preference {

    private String foodTyoe;
    private Integer value;

    public Preference(String foodTyoe, Integer value) {
        this.foodTyoe = foodTyoe;
        this.value = value;
    }

    public String getFoodTyoe() {
        return foodTyoe;
    }

    public void setFoodTyoe(String foodTyoe) {
        this.foodTyoe = foodTyoe;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
