package com.kby.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kby.student.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 *
 * @author cyy
 * @version 1.0
 * @since 2024/6/24 15:57
 */
public interface StudentMapper extends BaseMapper<Student> {
    /**
     *
     * @param studentNo
     * @param studentName
     * @return
     */
    List<Student> queryStudent(@Param("stuNo") Integer studentNo, @Param("stuName") String studentName);

    /**
     *
     * @param student
     * @return
     */
//    int add(@Param("stu") Student student);

    /**
     *
     * @param studentNo
     * @return
     */
//    int del(@Param("stuNo") Integer studentNo);


//    Student queryByNo(@Param("stuNo") Integer studentNo);

    /**
     *
     * @param student
     * @return
     */
//    int update(@Param("stu") Student student);

    /**
     *
     * @param studentNo
     * @param studentName
     * @param index
     * @param pageSize
     * @return
     */
//    List<Student> queryPage(@Param("stuNo")Integer studentNo,@Param("stuName") String studentName,@Param("index") Integer index,@Param("pageSize")Integer pageSize);

    /**
     * 获取数据总条数
     * @param studentNo
     * @param studentName
     * @return
     */
//    int getTotalCount(@Param("stuNo") Integer studentNo,@Param("stuName")String studentName);
}
