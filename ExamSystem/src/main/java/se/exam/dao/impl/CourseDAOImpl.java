package se.exam.dao.impl;

import se.exam.config.Msg;
import se.exam.dao.CourseDAO;
import se.exam.entity.CourseEntity;

import java.util.List;

public class CourseDAOImpl implements CourseDAO {

    @Override
    public List<CourseEntity> getCoursesByUid(int teacherId) {
        return null;
    }

    @Override
    public boolean updateCourse(CourseEntity course) {
        return false;
    }

    @Override
    public Msg createCourse(CourseEntity course) {
        return null;
    }
}
