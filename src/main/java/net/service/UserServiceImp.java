package net.service;

import net.dao.UserDao;
import net.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }


    @Transactional
    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }


    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }


    @Transactional
    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }
}
