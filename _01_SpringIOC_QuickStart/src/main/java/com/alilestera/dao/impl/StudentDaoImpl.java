package com.alilestera.dao.impl;

import com.alilestera.dao.StudentDao;
import com.alilestera.domain.Student;

/**
 * @author Alilestera
 * @date 1/15/2022
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public Student getStudentById(int id) {
        return new Student("okgogogo", 30, 30);
    }
}
