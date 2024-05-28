package com.hutech.RequestEntities;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RequestUpdateUser {
    private String Username;
    private String Password;
    private String Email;
    private String FirstName;
    private String LastName;
    private boolean isdeleted;
}
