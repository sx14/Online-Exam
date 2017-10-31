package se.exam.bl;

import se.exam.entity.CourseEntity;
import se.exam.vo.ResultMessageVO;

import java.io.File;

/**
 * 课程管理业务逻辑接口
 */
public interface CourseService {
    /**
     * 创建课程
     * @param teacherId 教师id
     * @param courseName 课程名称，中文
     * @return 课程实例
     */
    public CourseEntity createCourse(int teacherId, String courseName);

    /**
     * 导入题目
     * 检查格式是否正确，选项是否足够，是否包含正确答案
     * @param courseId 课程id
     * @param questionTable excel保存的固定格式的题目
     * @return 导入结果，成功时要提示导入的题目数量。
     */
    public ResultMessageVO importQuestions(int courseId, File questionTable);

    /**
     * 获取题目上传模板excel文件
     * @return excel
     */
    public File getQuestionTableTemplate();
}
