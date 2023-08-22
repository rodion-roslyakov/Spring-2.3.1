package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> index() {
//        return userRepository.findAll();
        return userDao.index();
    }


    public User show(int id) {
//        Optional<User> findUser = userRepository.findById(id);
//        return findUser.orElse(null);
        return userDao.show(id);
    }

    @Transactional
    public void update(int id, User updateUser) {
//        updateUser.setId(id);
//        userRepository.save(updateUser);
        userDao.update(id, updateUser);
    }

    @Transactional
    public void delete(int id) {
//        userRepository.deleteById(id);
        userDao.delete(id);
    }

    @Transactional
    public void save(User user) {
//        userRepository.save(user);
        userDao.save(user);
    }
}