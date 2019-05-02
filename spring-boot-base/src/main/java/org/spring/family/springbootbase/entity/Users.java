package org.spring.family.springbootbase.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "person")
@Component
public class Users {
    private String id;

    private String name;

    private List<Integer> cars;
    private List<String> stringCars;
    private Map<String,Object> maps;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getCars() {
        return cars;
    }

    public void setCars(List<Integer> cars) {
        this.cars = cars;
    }

    public List<String> getStringCars() {
        return stringCars;
    }

    public void setStringCars(List<String> stringCars) {
        this.stringCars = stringCars;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }
}
