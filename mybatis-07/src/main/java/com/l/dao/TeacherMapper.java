package com.l.dao;

import com.l.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeachers();

    //    获取指定老师下的所有学生 及 老师的信息
    Teacher getTeacher(@Param("tid") int id);

    //    获取指定老师下的所有学生 及 老师的信息
    Teacher getTeacher2(@Param("tid") int id);
}
