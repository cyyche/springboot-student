package com.kby.student.controller;

import com.github.pagehelper.PageInfo;
//import com.kby.student.common.Page;
import com.kby.student.entity.Student;
import com.kby.student.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *
 * @author cyy
 * @version 1.0
 * @since 2024/6/24 15:55
 */
@Controller
@RequestMapping("student")
@ResponseBody
public class StudentController {

     @Resource
     private StudentService studentService;

    @RequestMapping(value="query",method= RequestMethod.GET)
    public List<Student> queryStudent(@RequestParam(value = "stuNo",required = false) Integer studentNo, @RequestParam(value = "stuName",required = false) String studentName){
        return studentService.queryStudent(studentNo,studentName);
    }

    @RequestMapping(value="query/page",method= RequestMethod.GET)
    public PageInfo<Student> queryPage(@RequestParam(value = "stuNo",required = false) Integer studentNo,
                                       @RequestParam(value = "stuName",required = false) String studentName,
                                       @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                       @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        return studentService.queryPage(studentNo,studentName,pageNum,pageSize);
    }

    @RequestMapping(value="add",method= RequestMethod.POST)
    public Boolean add(@RequestBody Student student){
       return  studentService.add(student);
    }

    @RequestMapping(value="del/{stuNo}",method= RequestMethod.DELETE)
    public Boolean del(@PathVariable("stuNo") Integer studentNo){
        return studentService.del(studentNo);
    }

//    @RequestMapping(value ="queryByNo/{stuNo}",method=RequestMethod.GET)
//    public Student queryByNo(@PathVariable("stuNo") Integer studentNo){
//        return studentService.queryByNo(studentNo);
//    }

    @RequestMapping(value="update",method= RequestMethod.PUT)
    public Boolean update(@RequestBody Student student){
        return studentService.update(student);
    }













}
