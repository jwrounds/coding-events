package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Tag extends AbstractEntity {

    @Size(min = 1, max = 25, message = "Tag name must be between 1 and 25 characters")
    @NotBlank
    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public Tag() { }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return "#" + name + " ";
    }

    public void setName(String name) {
        this.name = name;
    }
}