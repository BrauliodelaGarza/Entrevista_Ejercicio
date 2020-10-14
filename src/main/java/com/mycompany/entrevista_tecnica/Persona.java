/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entrevista_tecnica;

import java.awt.Image;

/**
 *
 * @author MEAP0
 */
public class Persona {
    int Id;
    String Email;
    String Name;
    String Last_Name;
    String image;

    public Persona(int Id, String Email, String Name, String Last_Name, String image) {
        this.Id = Id;
        this.Email = Email;
        this.Name = Name;
        this.Last_Name = Last_Name;
        this.image = image;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
}
