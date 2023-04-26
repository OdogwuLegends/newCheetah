package service;

import Utils.Mapper;
import data.model.User;
import data.repositories.UserRepository;
import data.repositories.UserRepositoryImpl;
import dto.requests.RegisterUserRequest;
import dto.responses.RegisterUserResponse;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public RegisterUserResponse registerNewUser(RegisterUserRequest request) {
        //This creates the user object of type User and collects
        //the entire details from the user using the mapper.

        User user = Mapper.map(request);
        User savedUser = userRepository.save(user);

        return Mapper.map(savedUser);

    }

    @Override
    public User findUser(int id) {
        return userRepository.findById(id);
    }


}
