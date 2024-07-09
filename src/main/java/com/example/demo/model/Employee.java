package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.boot.autoconfigure.web.WebProperties;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
//@Table(name="employees")


public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column (name="firstName")
    private String firstName;
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    @Column(name="lastName")

    private String lastName;
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

        @Column(name = "emailId")

        private String emailId;
        public void setEmailId (String emailId){
            this.emailId = emailId;
        }
        public String getEmailId() {
            return emailId;
        }
    }