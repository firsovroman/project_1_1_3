package firsov.core.jdbc.dao;

import firsov.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    void createUsersTable() throws SQLException;

    void dropUsersTable();

    void saveUser(String name, String lastName, Integer age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}