package com.hutech.RequestEntities;
import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RequestCreateUser {
    private String Username;
    private String Password;
    private String Email;
    private String FirstName;
    private String LastName;
    private boolean isdeleted;
}
