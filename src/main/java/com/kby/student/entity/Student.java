package com.kby.student.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * <p>
 *
 * @author cyy
 * @version 1.0
 * @since 2024/6/3 16:21
 */
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("student")
public class Student {
    @TableId(type = IdType.NONE)
    private Integer studentNo;
    private String studentName;
    private String loginPwd;
    private String sex;
    private Integer gradeID;
    private String gradeName;
//    private Integer age;
    private String phone;
    private String address;

//    public Integer getGradeID() {
//        return gradeID;
//    }
//
//    public void setGradeID(Integer gradeID) {
//        this.gradeID = gradeID;
//    }
//
//    public String getLoginPwd() {
//        return loginPwd;
//    }
//
//    public void setLoginPwd(String loginPwd) {
//        this.loginPwd = loginPwd;
//    }
//
//    public Integer getStudentNo() {
//        return studentNo;
//    }
//
//    public void setStudentNo(Integer studentNo) {
//        this.studentNo = studentNo;
//    }
//
//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public String getGradeName() {
//        return gradeName;
//    }
//
//    public void setGradeName(String gradeName) {
//        this.gradeName = gradeName;
//    }
//
////    public Integer getAge() {
////        return age;
////    }
////
////    public void setAge(Integer age) {
////        this.age = age;
////    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "studentNo=" + studentNo +
//                ", studentName='" + studentName + '\'' +
//                ", sex='" + sex + '\'' +
//                ", gradeName='" + gradeName + '\'' +
//                ", phone='" + phone + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
