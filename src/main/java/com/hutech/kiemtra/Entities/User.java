package com.hutech.Entities;

import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String Username;
    private String Password;
    private String Email;
    private String FirstName;
    private String LastName;
    private boolean isdeleted;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
