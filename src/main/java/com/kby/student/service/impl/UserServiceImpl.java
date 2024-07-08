package com.kby.student.service.impl;

import com.kby.student.entity.User;
import com.kby.student.mapper.UserMapper;
import com.kby.student.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <p>
 *
 * @author cyy
 * @version 1.0
 * @since 2024/6/24 14:15
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Boolean login(String username, String password) {
        User user = userMapper.queryByUsername(username);
        if(user!=null || password.equals(user.getPasssword())){
            return true;
        }else{
            return false;
        }

    }
}
