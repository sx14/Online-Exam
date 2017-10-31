package se.exam.bl;


import se.exam.entity.UserEntity;
import se.exam.vo.ResultMessageVO;

/**
 * 用户管理业务逻辑接口
 */
public interface UserService {
    /**
     * 用户登录
     * 检查用户名密码是否正确，若验证成功，则返回用户实例；否则返回Null
     * @param userName 用户名
     * @param password 密码
     * @return 用户实例
     */
    public UserEntity login(String userName, String password);

    /**
     * 用户注册
     * 用户名不可重复，各字段不为空
     * @param username 教师用户名由管理员设置；学生用户名为学号
     * @param password 密码
     * @param name 姓名
     * @param email 邮箱
     * @param userType 用户类型：1-学生/2-教师/3-管理员
     * @return 注册结果
     */
    public ResultMessageVO register(String username, String password, String name, String email, int userType);
}
