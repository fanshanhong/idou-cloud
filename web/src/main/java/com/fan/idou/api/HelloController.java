package com.fan.idou.api;

import com.fan.idou.dao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/sec")
    public String sec(){
        DataSource dataSource = jdbcTemplate.getDataSource();
        List<User> userList =   jdbcTemplate.query("select * from user", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getLong("id"));
//                user.setNickName(resultSet.getString(i));
                return user;
            }
        });


        for (User user : userList) {
            System.out.println(user);
        }

        return "userList";
    }

}
