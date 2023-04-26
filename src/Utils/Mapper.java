package Utils;

import data.model.User;
import dto.requests.RegisterUserRequest;
import dto.responses.RegisterUserResponse;

public class Mapper {
    public static User map(RegisterUserRequest request){
        //This creates the user object of type User and collects
        //the entire details from the user using the mapper.

        User newUser = new User();
        newUser.setFirstName(request.getFirstName());
        newUser.setLastName(request.getLastName());
        newUser.setEmail(request.getEmail());
        newUser.setAddress(request.getAddress());
        newUser.setPhoneNumber(request.getPhoneNumber());
        return newUser;
    }
    public static RegisterUserResponse map(User savedUser){
        //This creates and object of response and transfers only
        //the details of the fields we want the user to see.

        RegisterUserResponse response = new RegisterUserResponse();
        response.setId(savedUser.getId());
        response.setFirstName(savedUser.getFirstName());
        return response;
    }
}
