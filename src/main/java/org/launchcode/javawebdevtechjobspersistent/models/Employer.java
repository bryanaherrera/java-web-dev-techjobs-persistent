package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Valid
    private String location;

    @OneToMany
    @JoinColumn()
    private final List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer() {}
}
