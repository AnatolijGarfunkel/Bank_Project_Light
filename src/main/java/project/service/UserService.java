package project.service;

import project.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User create(User user);

    User getById(long id);

    User remove(long id);
}
