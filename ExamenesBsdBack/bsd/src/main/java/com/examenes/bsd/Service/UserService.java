package com.examenes.bsd.Service;

import com.examenes.bsd.Model.User;
import com.examenes.bsd.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUsers(){
        return (List<User>) userRepository.findAll();
    }
}
