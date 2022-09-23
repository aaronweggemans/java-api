package com.weggemans.app.rest.Controller;

import com.weggemans.app.rest.Models.User;
import com.weggemans.app.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String GetPage() {
        return "Success!";
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping(value = "/save_user")
    public String saveUser(@RequestBody User user) {
        userRepo.save(user);
        return "User is saved...";
    }

    @PutMapping(value = "/update_user/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user) {
        User updatedUser = userRepo.findById(id).orElse(null);

        if(updatedUser == null)
            return "User is not found!";

        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setAge(user.getAge());
        updatedUser.setOccupation(user.getOccupation());

        userRepo.save(updatedUser);

        return "User is changed successfully";
    }

    @DeleteMapping(value = "/delete_user/{id}")
    public String deleteUser(@PathVariable long id) {
        User updatedUser = userRepo.findById(id).orElse(null);

        if(updatedUser == null)
            return "The user ID is not found!";

        userRepo.delete(updatedUser);
        return "User with User ID (" + id + ") is removed from the database...";
    }
}
