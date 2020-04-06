package pl.grzegorztkaczyk.usercrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.grzegorztkaczyk.usercrud.dao.UserDAO;
import pl.grzegorztkaczyk.usercrud.dao.domain.User;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public Iterable<User> showAllUsers(){
        return userDAO.findAll();
    }

    public void addUser(User user){
        userDAO.save(user);
    }

    public void deleteUserById(Integer id){
        if(userDAO.existsById(id)){
            userDAO.deleteById(id);
        }
    }

    public Optional<User> findUserById(Integer id){
        return userDAO.findById(id);
    }

    public void editUser(Integer id, User user){
        if(userDAO.existsById(user.getId())) {
            user.setId(id);
            userDAO.save(user);
        }
    }
}