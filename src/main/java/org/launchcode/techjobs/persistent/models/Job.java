package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.ManyToOne;

import java.util.List;


//determines structure of the table
@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;

    //refactor Job.skills
    @ManyToMany
    private List<Skill> skills;


    //no arg constructor required for hibernate to create an object
    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer employer, List<Skill> skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
