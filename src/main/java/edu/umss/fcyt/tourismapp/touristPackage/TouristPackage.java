package edu.umss.fcyt.tourismapp.touristPackage;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class TouristPackage
{
    @Id
    private Long id;
    @NotBlank
    private int minimumGroup;
    @NotBlank
    private int categoryId;
    @Size(min=3, max=75)
    private String name;
    @NotEmpty
    private String description;
    @NotBlank
    private String keyword;
    @NotBlank
    private Double inversion;

    public Long getId() {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public int getMinimumGroup() {
        return minimumGroup;
    }

    public void setMinimumGroup(int minimumGroup) {
        this.minimumGroup = minimumGroup;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId)
    {
        this.categoryId = categoryId;
    }

    public String getName()
    {
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword)
    {
        this.keyword = keyword;
    }

    public Double getInversion() {
        return inversion;
    }

    public void setInversion(Double inversion) {
        this.inversion = inversion;
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
        return true;
    }
}