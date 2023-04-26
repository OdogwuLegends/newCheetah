package controller;

import data.model.User;
import dto.requests.RegisterUserRequest;
import dto.responses.RegisterUserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;
import service.UserServiceImpl;

@RestController
public class userController {
    private UserService userService = new UserServiceImpl();

    @PostMapping("/user")
    public RegisterUserResponse registerNewUser(@RequestBody RegisterUserRequest user){
        return userService.registerNewUser(user);
    }
    @GetMapping
    public User findUserById(int userId){
        return userService.findUser(userId);
    }

}
