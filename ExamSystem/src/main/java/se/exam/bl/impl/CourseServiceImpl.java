package se.exam.bl.impl;

import se.exam.bl.CourseService;
import se.exam.entity.CourseEntity;
import se.exam.vo.ResultMessageVO;

import java.io.File;

public class CourseServiceImpl implements CourseService {
    @Override
    public CourseEntity createCourse(int teacherId, String courseName) {
        return null;
    }

    @Override
    public ResultMessageVO importQuestions(int courseId, File questionTable) {
        return null;
    }

    @Override
    public File getQuestionTableTemplate() {
        return null;
    }
}
