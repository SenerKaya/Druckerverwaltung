package com.tin19.test_projekt.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Drucker")
public class Drucker {
    @Id                                                     //Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO)         //Primary Key
    @Column(name = "drucker_id", nullable = false)
    private Long d_id;
    @Column(name = "druckername")
    private String druckername;
    @OneToMany(
            mappedBy = "drucker",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Person> person= new ArrayList<>();


    //Getters Setters
    public void setName(String druckername) {
        this.druckername = druckername;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public String getDruckername() {
        return druckername;
    }

    public List<Person> getPerson() {
        return person;
    }

    public Long getD_id() {
        return d_id;
    }


}
