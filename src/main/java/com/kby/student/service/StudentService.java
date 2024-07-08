package com.kby.student.service;

import com.github.pagehelper.PageInfo;
//import com.kby.student.common.Page;
import com.kby.student.entity.Student;
import java.util.List;

/**
 * <p>
 *
 * @author cyy
 * @version 1.0
 * @since 2024/6/24 15:59
 */

public interface StudentService {
    List<Student> queryStudent(Integer studentNo, String studentName);

    Boolean add(Student student);

    Boolean del(Integer studentNo);

//    Student queryByNo(Integer studentNo);
    Boolean update(Student student);

    PageInfo<Student> queryPage(Integer studentNo, String studentName, Integer pageNum, Integer pageSize);
}
