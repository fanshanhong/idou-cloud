package com.fan.idou.service;

import com.fan.idou.dao.pojo.User;
import org.springframework.lang.NonNull;

public interface UserService {

    public User queryUserByPhoneNumber(@NonNull String phoneNumber);


    public boolean createUser(@NonNull User user);


}
