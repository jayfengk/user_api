package com.example.user_api.controller;

import com.example.user_api.pojo.ResponseMessage;
import com.example.user_api.pojo.User;
import com.example.user_api.pojo.dto.UserDTO;
import com.example.user_api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController // 按口方法返回對象 轉換成json
@RequestMapping("/user") // localhost:8080/user
public class UserController {

    @Autowired
    IUserService userService;

    // REST
    // 新增
    @PostMapping // URL: localhost:8080/user method: POST
    public ResponseMessage<User> createUser(@Validated @RequestBody UserDTO user) {
        User userNew = userService.create(user);
        return ResponseMessage.success(userNew);
    }

    // 查詢
    @GetMapping("/{userId}") // URL: localhost:8080/user/user/1 method: GET
    public ResponseMessage queryUser(@PathVariable Integer userId) {
        User user = userService.query(userId);
        return ResponseMessage.success(user);
    }

    // 更新
    @PutMapping // URL: localhost:8080/user method: PUT
    public ResponseMessage updateUser(@Validated @RequestBody UserDTO user) {
        userService.update(user);
        return ResponseMessage.success(user);
    }

    // 刪除
    @DeleteMapping("/{userId}") // URL: localhost:8080/user/user/1 method: DELETE
    public ResponseMessage deleteUser(@PathVariable Integer userId) {
        userService.delete(userId);
        return ResponseMessage.success();
    }
}
