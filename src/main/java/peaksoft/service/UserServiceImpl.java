package peaksoft.service;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.users;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoJdbcImpl();
    UserDao userDao2 = new UserDaoHibernateImpl();

    public void createUsersTable() {
    userDao.createUsersTable();
    }

    public void dropUsersTable() {
    //userDao.dropUsersTable();
        userDao2.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        //userDao.saveUser(name,lastName,age);
        userDao2.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) {
    //userDao.removeUserById(id);
        userDao2.removeUserById(id);
    }

    public List<users> getAllUsers() {
        //return userDao.getAllUsers();
        return userDao2.getAllUsers();
    }

    public void cleanUsersTable() {
       // userDao.cleanUsersTable();
        userDao2.cleanUsersTable();
    }
}
