package data.repositories;

import data.model.User;

import java.util.List;

public interface UserRepository {
    // THIS REPO IS USED TO STORE AND RETRIEVE USER INFO
    User save(User user);

    long count();
    void delete(User user);
    void delete(int id);
    List<User> findAll();
    User findById(int id);
}
