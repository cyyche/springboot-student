package com.kby.student;

import com.kby.student.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author cyy
 * @version 1.0
 * @since 2024/7/8 15:17
 */
@SpringBootTest
public class RedisTest {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;

//    @Resource
//    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test(){
//        System.out.println(123);
        Student zhangsan=Student.builder().studentNo(890).studentName("aaa").build();
        redisTemplate.opsForValue().set("zs",zhangsan);
        System.out.println(redisTemplate.opsForValue().get("zs"));
    }
}
