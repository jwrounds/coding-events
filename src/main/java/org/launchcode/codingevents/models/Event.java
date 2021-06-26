package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
public class Event extends AbstractEntity {

    @Size(max = 500, message = "Description is too long!")
    private String description;

    @Email(message = "Invalid email.")
    private String contactEmail;

    private EventType type;

    public Event(String name, String description, String contactEmail, EventType type) {
        this.setName(name);
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
    }

    public Event() { }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }


}
