package data.repositories;

import data.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private int lastIdCreated;

    private List<User> users = new ArrayList<>();

    @Override
    public User save(User user) {
        boolean isSaved = user.getId()!= 0;
        if (isSaved) update(user);else saveNewUser(user);

        return user;
    }

    @Override
    public long count() {
        return users.size();
    }

    private void update(User user){
        User savedUser = findById(user.getId());
        users.remove(savedUser);
        users.add(user);
    }

    private void saveNewUser(User user){
        user.setId(generateId());
        users.add(user);
        lastIdCreated++;

    }

    private int generateId() {
        return lastIdCreated +1;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
