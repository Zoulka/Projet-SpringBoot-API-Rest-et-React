package com.example.springbootbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nom")
    private String Nom;
    @Column(name = "Prénom")
    private  String Prenom;
    @Column(name = "Email")
    private String Email;


    public User() {
    }

    public User(String nom, String prenom, String email) {
        this.Nom = nom;
        this.Prenom = prenom;
        this.Email = email;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getNom() {

        return Nom;
    }

    public void setNom(String nom) {

        this.Nom = nom;
    }

    public String getPrenom() {

        return Prenom;
    }

    public void setPrenom(String prenom) {

        this.Prenom = prenom;
    }

    public String getEmail() {

        return Email;
    }

    public void setEmail(String email) {

        this.Email = email;
    }
}
