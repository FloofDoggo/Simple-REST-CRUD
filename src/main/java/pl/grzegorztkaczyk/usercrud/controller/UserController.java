package pl.grzegorztkaczyk.usercrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.grzegorztkaczyk.usercrud.dao.domain.User;
import pl.grzegorztkaczyk.usercrud.service.UserService;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> showAllUsers(){
        return userService.showAllUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Integer id){
        userService.deleteUserById(id);
    }

    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }

    @PutMapping("/{id}")
    public void editUser(@PathVariable Integer id, @RequestBody User user){
        userService.editUser(id, user);
    }
}
