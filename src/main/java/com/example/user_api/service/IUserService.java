package com.example.user_api.service;

import com.example.user_api.pojo.User;
import com.example.user_api.pojo.dto.UserDTO;

public interface IUserService {
    /**
     * 插入用戶
     * @param user 參數
     */
    User create(UserDTO user);

    /**
     * 查詢用戶
     * @param userId 用戶ID
     * @return
     */
    User query(Integer userId);

    /**
     * 更新用戶
     * @param user 用戶對象
     */
    User update(UserDTO user);

    /**
     * 刪除用戶
     *
     * @param userId
     */
    void delete(Integer userId);
}
