package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
   @Size(max = 250, message = "That doesnt exist")
   @NotBlank(message = "Enter a location")
    private String location;

   public Employer () {

   }

   public String getLocation() {
       return location;
   }

   public void setLocation(String location) {
       this.location = location;
   }

}
