package peaksoft.service;

import peaksoft.model.users;

import java.util.List;

public interface UserService {

    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<users> getAllUsers();

    void cleanUsersTable();
}

