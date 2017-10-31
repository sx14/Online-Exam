package se.exam.dao;

import se.exam.config.Msg;
import se.exam.entity.CourseEntity;

import java.util.List;

public interface CourseDAO {
    /**
     * 教师查询他教授的所有课程
     * @param teacherId 用户id
     * @return 课程列表，不为null
     */
    List<CourseEntity> getCoursesByUid(int teacherId);

    /**
     * 更新课程信息，包括添加题目
     * @param course 课程实例
     * @return 更新结果，应该没有逻辑异常
     */
    boolean updateCourse(CourseEntity course);

    /**
     * 创建课程
     * 课程名称不可重复
     * @param course 课程实例
     * @return 创建结果
     */
    Msg createCourse(CourseEntity course);
}
