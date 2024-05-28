package com.hutech.kiemtra.Controller;

import com.hutech.kiemtra.Entities.User;
import com.hutech.kiemtra.RequestEntities.RequestCreateUser;
import com.hutech.kiemtra.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

        @Autowired
        private UserService userService;

        // Create a new user
        @PostMapping
        public ResponseEntity<User> createUser(@RequestBody RequestCreateUser requestCreateUser) {
            return ResponseEntity.ok(userService.createUser(requestCreateUser));
        }

        // Get all users
        @GetMapping
        public ResponseEntity<List<User>> getAllUsers() {
            return ResponseEntity.ok(userService.getAllUsers());
        }

        // Get user by ID
        @GetMapping("/{id}")
        public ResponseEntity<User> getUserById(@PathVariable String id) {
            return ResponseEntity.ok(userService.getUserById(id));
        }

        // Update user
        @PutMapping("/{id}")
        public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody RequestCreateUser requestUpdateUser) {
            return ResponseEntity.ok(userService.updateUser(id, requestUpdateUser));
        }

        // Delete user
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteUser(@PathVariable String id) {
            userService.deleteById(id);
            return ResponseEntity.ok().build();
        }
}
