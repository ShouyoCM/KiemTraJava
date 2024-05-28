package com.hutech.Service;

import com.hutech.Entities.User;
import com.hutech.Repository.UserReponsitory;
import com.hutech.RequestEntities.RequestCreateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserReponsitory userRepository;

    public User createUser(RequestCreateUser requestCreateUser) {
        User user = new User();
        user.setFirstName(requestCreateUser.getFirstName());
        user.setLastName(requestCreateUser.getLastName());
        user.setEmail(requestCreateUser.getEmail());
        user.setPassword(requestCreateUser.getPassword());
        return userRepository.save(user); // Save the user object
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User with id " + id + " not found")
        );
    }

    public User updateUser(String id, RequestCreateUser requestUpdateUser) {
        User user = getUserById(id);
        user.setFirstName(requestUpdateUser.getFirstName());
        user.setLastName(requestUpdateUser.getLastName());
        user.setEmail(requestUpdateUser.getEmail());
        user.setPassword(requestUpdateUser.getPassword());
        return userRepository.save(user); // Save the updated user object
    }

    public void deleteById(String id) {
        userRepository.deleteById(id);
    }
}

