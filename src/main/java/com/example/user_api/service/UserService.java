package com.example.user_api.service;

import com.example.user_api.pojo.User;
import com.example.user_api.pojo.dto.UserDTO;
import com.example.user_api.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // spring bean
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User create(UserDTO user) {
        User userPojo = new User();

        BeanUtils.copyProperties(user, userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public User query(Integer userId) {
        return userRepository.findById(userId).orElseThrow(() -> {
            throw new IllegalArgumentException("user:" + userId + " not found");
        });
    }

    @Override
    public User update(UserDTO user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user, userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public void delete(Integer userId) {
        userRepository.deleteById(userId);
    }
}
