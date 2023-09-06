package kz.bitlab.middle01userservice.api;


import kz.bitlab.middle01userservice.model.User;
import kz.bitlab.middle01userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping(value = "{id}")
    public User getUser(@PathVariable(name = "id") Long id){
        return userRepository.findById(id).orElse(null);
    }

}