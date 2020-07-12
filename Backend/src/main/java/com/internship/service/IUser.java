package com.internship.service;

import com.internship.entity.User;
import java.util.List;

public interface IUser {
    List<User> GetAllUser();

    User FindUser(int userId);

    User Create(User objUser);

    User update(int userId, User objUser);

    void Delete(int userId);
}