package com.kby.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kby.student.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *
 * @author cyy
 * @version 1.0
 * @since 2024/6/24 14:20
 */
public interface UserMapper extends BaseMapper<User> {
    User queryByUsername(@Param("username") String username);
}
