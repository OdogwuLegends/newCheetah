package service;

import data.model.User;
import dto.requests.RegisterUserRequest;
import dto.responses.RegisterUserResponse;

public interface UserService {
    RegisterUserResponse registerNewUser(RegisterUserRequest registerUserRequest);
    User findUser(int id);

}
