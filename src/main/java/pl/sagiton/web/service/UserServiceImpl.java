package pl.sagiton.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import pl.sagiton.web.model.MyUser;
import pl.sagiton.web.model.UserDAO;

import java.util.List;

/**
 * Created by szymon on 03.03.16.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Transactional
    public List<MyUser> listUser() {
        return userDAO.listUser();
    }
}