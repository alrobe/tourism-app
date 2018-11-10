/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umss.fcyt.tourismapp.destination;

import edu.umss.fcyt.tourismapp.circuit.Circuit;
import edu.umss.fcyt.tourismapp.location.Location;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 *
 * @author Lopez
 */
@Entity
@Table(name = "Destination")
public class Destination implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long destinyId;

    @NotBlank
    @Column(unique = true, nullable = false, name = "name")
    @Size(min = 5, max = 40)
    private String name;
    
    @NotBlank
    @Column(name = "description")
    @Size(min = 5, max = 40)
    private String description;

    @NotBlank
    @Size(min = 3, max = 50)
    @Column(name = "country")
    private String country;

    @NotBlank
    @Size(min = 2, max = 50)
    @Column(name = "department")
    private String department;

    @NotBlank
    @Size(min = 2, max = 50)
    @Column(name = "province")
    private String province;

    @NotBlank
    @Size(min = 2, max = 40)
    @Column(name = "locality")
    private String locality;

    @NotBlank
    @Size(min = 5, max = 40)
    @Column(name = "weather")
    private String weather;

    @Size(min = 5, max = 40)
    @Column(name = "availableService")
    private String availableService;

    @NotBlank
    @Size(min = 5, max = 40)
    @Column(name = "travelTime")
    private String travelTime;

    @OneToOne
    private Location location;
    
    public Destination() {
    }
    
     
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
    
    public Long getDestinyId() {
        return destinyId;
    }

    public void setDestinyId(Long destinyId) {
        this.destinyId = destinyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String Department) {
        this.department = Department;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String Province) {
        this.province = Province;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getClima() {
        return weather;
    }

    public void setClima(String clima) {
        this.weather = clima;
    }

    public String getAvailableService() {
        return availableService;
    }

    public void setAvailableService(String availableService) {
        this.availableService = availableService;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.destinyId);
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Destination other = (Destination) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.destinyId, other.destinyId)) {
            return false;
        }
        return true;
    }
}
