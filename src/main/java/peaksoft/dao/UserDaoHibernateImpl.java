package peaksoft.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import peaksoft.model.users;
import peaksoft.util.Util;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {

    public UserDaoHibernateImpl() {

    }

    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {
    Session session = Util.getSession().openSession();
    session.beginTransaction();
    String sql = "DROP TABLE users";
    session.createSQLQuery(sql).executeUpdate();
    session.getTransaction().commit();
    session.close();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        users user = new users(name, lastName, age);
        session.persist(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void removeUserById(long id) {
    Session session = Util.getSession().openSession();
    session.beginTransaction();
    users users = new users();
    session.get(users.class,id);
    session.delete(users);
    session.getTransaction().commit();
    }

    @Override
    public List<users> getAllUsers() {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        List users = session.createQuery("FROM users").list();
        session.getTransaction().commit();
        session.close();
        return users;
    }

    @Override
    public void cleanUsersTable() {
    Session session = Util.getSession().openSession();
    session.beginTransaction();
    String query = "DELETE FROM users";
    session.createQuery(query).executeUpdate();
    session.getTransaction().commit();
    session.close();
    }
}
