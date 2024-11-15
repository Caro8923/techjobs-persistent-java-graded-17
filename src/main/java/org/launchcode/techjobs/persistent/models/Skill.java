package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 3, max = 1000)
    private String description;

    //add jobs field
    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill(String description) {
        super();
        this.description = description;
    }

    //no arg constructor for hibernate to create an object
    public Skill() {}

    public String getDescription() {return description;}

    public void setDescription( String description) {this.description = description;}

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
