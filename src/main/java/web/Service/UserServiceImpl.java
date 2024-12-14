package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.UserDAO;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl (UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public User userById(int id) {
        return userDAO.userById(id);
    }

    @Override
    public void update(int id, User updatedUser) {
        userDAO.update(id, updatedUser);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
