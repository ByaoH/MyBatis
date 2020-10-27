package com.l.dao;

import com.l.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User getUserById(int id);

    //    分页
    List<User> getUserByLimit(Map<String, Integer> map);
    //    分页 2
    List<User> getUserByRowBounds();
}
