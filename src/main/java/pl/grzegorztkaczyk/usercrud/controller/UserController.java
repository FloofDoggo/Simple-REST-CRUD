package pl.grzegorztkaczyk.usercrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.grzegorztkaczyk.usercrud.dao.domain.User;
import pl.grzegorztkaczyk.usercrud.service.UserService;
import java.util.Optional;

@RestController
@RequestMapping("/v1/crud")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public Iterable<User> showAllUsers(){
        return userService.showAllUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping
    public void deleteUserById(@RequestParam Integer id){
        userService.deleteUserById(id);
    }

    @GetMapping
    public Optional<User> findUserById(@RequestParam Integer id){
        return userService.findUserById(id);
    }

    @PutMapping
    public void editUser(@RequestBody User user){
        userService.editUser(user);
    }
}
