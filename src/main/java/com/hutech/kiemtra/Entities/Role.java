package com.hutech.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String role_id;
    private String role_name;

    @OneToMany(mappedBy = "Role")

    private List<User> users;
}
