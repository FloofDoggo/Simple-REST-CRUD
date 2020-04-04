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
        }else{
            System.out.println(java.time.LocalDateTime.now()
                    + " --- [DELETE] User at id " + id + " does not exist.");
        }
    }

    public Optional<User> findUserById(Integer id){
        return userDAO.findById(id);
    }

    public void editUser(User user){
        if(userDAO.existsById(user.getId())) {
            userDAO.save(user);
        }else{
            System.out.println(java.time.LocalDateTime.now()
                    + " --- [EDIT] User at id " + user.getId()
                    + " does not exist.");
        }
    }
}