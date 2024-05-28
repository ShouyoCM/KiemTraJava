package com.hutech.Repository;

import com.hutech.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReponsitory extends JpaRepository<User, String> {
}
