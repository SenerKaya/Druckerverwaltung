package com.tin19.test_projekt.model;

import javax.persistence.*;

@Entity
@Table(name = "Personen")
public class Person {

    @Id
    @Column(name = "person_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long p_id;
    @Column(name = "Vorname")
    private String firstName;
    @Column(name = "Nachname")
    private String lastName;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "drucker_id")      //JoinColumn referenziert auf Foreign Key
    private Drucker drucker;


    //Getters Setters
    public long getP_id() {
        return p_id;
    }

    public void setP_id(long p_id) {
        this.p_id = p_id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }


    public Drucker getDrucker() {
        return drucker;
    }

    public void setDrucker(Drucker drucker) {
        this.drucker = drucker;
    }

}
