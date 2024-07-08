package com.kby.student.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
//import com.kby.student.common.Page;
import com.kby.student.entity.Student;
import com.kby.student.mapper.StudentMapper;
import com.kby.student.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *
 * @author cyy
 * @version 1.0
 * @since 2024/6/24 16:18
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public List<Student> queryStudent(Integer studentNo, String studentName) {
        return studentMapper.queryStudent(studentNo,studentName);

        //QueryWrapper不能多表联合查询，值必填
//        QueryWrapper<Student> query = new QueryWrapper<>();
//        query.eq("studentNo",studentNo);
//        query.like("studentName",studentName);//（库中列名，参数）
//        return studentMapper.selectList(query);
    }

    @Override
    public Boolean add(Student student) {
//        return studentMapper.add(student)==1;
        return studentMapper.insert(student)==1;
    }

    @Override
    public Boolean del(Integer studentNo) {
//        return studentMapper.del(studentNo)==1;
        return  studentMapper.deleteById(studentNo)==1;
    }

//    @Override
//    public Student queryByNo(Integer studentNo) {
//        return studentMapper.queryByNo(studentNo);
//    }

    @Override
    public Boolean update(Student student) {
//        return studentMapper.update(student)==1;
        return studentMapper.updateById(student)==1;
    }


    @Override
    public PageInfo<Student> queryPage(Integer studentNo, String studentName, Integer pageNum, Integer pageSize) {
//        Integer index=(pageNum-1)*pageSize;
//        List<Student> students=studentMapper.queryPage(studentNo,studentName,index,pageSize);
//        int totalCount = studentMapper.getTotalCount(studentNo,studentName);
//        int totalPage=totalCount % pageSize == 0 ? totalCount/pageSize:totalCount/pageSize+1;

//        Page<Student> page=new Page<>();
//        page.setPageNum(pageNum);
//        page.setPageSize(pageSize);
//        page.setTotalCount(totalCount);
//        page.setTotalPage(totalPage);
//        page.setList(students);
//        return page;

        PageHelper.startPage(pageNum,pageSize);
        List<Student> students=studentMapper.queryStudent(studentNo,studentName);
        return new PageInfo<>(students);
    }
}
