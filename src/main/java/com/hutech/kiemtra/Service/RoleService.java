package com.hutech.Service;

import com.hutech.Entities.Role;
import com.hutech.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Optional<Role> findById(String roleId) {
        return roleRepository.findById(roleId);
    }

//    public Role findByRoleName(String roleName) {
//        return roleRepository.findByRoleName(roleName);
//    }
}
