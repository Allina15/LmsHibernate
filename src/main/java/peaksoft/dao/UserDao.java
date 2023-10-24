package peaksoft.dao;

import peaksoft.model.users;

import java.util.List;

public interface UserDao {

    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<users> getAllUsers();

    void cleanUsersTable();
}
