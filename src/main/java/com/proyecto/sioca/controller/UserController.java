package com.proyecto.sioca.controller;

import com.proyecto.sioca.entity.User;
import com.proyecto.sioca.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/users/new")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
         try{
             return userService.getUser(id);
         }catch (Exception ex){
             throw new ResponseStatusException(
                   HttpStatus.NOT_FOUND, "User Not Found", ex  );
         }
    }

    @PutMapping("/users/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
         user.setId(id);
         return userService.updateUser(user);
    }

    @DeleteMapping("/users/delete/{id}")
    public List<User> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return getUsers();
    }

    @PostMapping("/users/prueba1")
    public User prueba1(@RequestBody User user){
        return userService.prueba(user.getId(),user.getNumero());
    }

}
