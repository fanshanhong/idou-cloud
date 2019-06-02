package com.fan.idou.service;

import com.fan.idou.dao.mapper.UserMapper;
import com.fan.idou.dao.pojo.User;
import com.fan.idou.dao.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User queryUserByPhoneNumber(String phoneNumber){

        // 查询用户名是否存在
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneNumberEqualTo(phoneNumber);
        List<User> users = userMapper.selectByExample(example);
        if (users != null && users.size() > 0) {
            return users.get(0); // 已经存在
        }
        return null;
    }

    /**
     * 创建新用户
     * @param user
     * @return
     */
    @Override
    public boolean createUser(User user) {
        return false;
    }
}
