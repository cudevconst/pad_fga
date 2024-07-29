package com.example.mobifonev2.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByUsernameAndPassword(String username, String password) {
        Optional<User> user = userRepository.findByUsernameAndPassword(username, password);
        if(user.isPresent()){
            return user.get();
        }
        else {
            return null;
        }
    }
}
