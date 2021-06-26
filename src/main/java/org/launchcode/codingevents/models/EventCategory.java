package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class EventCategory extends AbstractEntity {

    public EventCategory(String name) {
        this.setName(name);
    }

    public EventCategory() {}

    @Override
    public String toString() {
        return this.getName();
    }

}
