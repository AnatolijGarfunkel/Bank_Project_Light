package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.entity.User;
import project.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService service;


//  @GET ---------------------------------------------------------------------------------------------------------------

    @GetMapping
    public List<User> getAll () {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public User getById (@PathVariable long id) {
        return service.getById(id);
    }

//  POST ---------------------------------------------------------------------------------------------------------------

    @PostMapping
    public User create(@RequestBody User user) {
        return service.create(user);
    }

//  DELETE -------------------------------------------------------------------------------------------------------------

    @DeleteMapping("/{id}")
    public User delete(@PathVariable long id) {
        return service.remove(id);
    }

}
