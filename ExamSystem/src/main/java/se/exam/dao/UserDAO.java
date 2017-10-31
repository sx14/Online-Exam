package se.exam.dao;

import se.exam.config.Msg;
import se.exam.entity.UserEntity;

public interface UserDAO {
    /**
     * 根据用户名查找用户
     * @param userName 用户名唯一
     * @return 唯一用户
     */
    public UserEntity getUserByUsername(String userName);

    /**
     * 创建新用户
     * 用户名重复则创建失败
     * 非空字段为空则创建失败
     * @param newUser
     * @return 创建结果
     */
    public Msg createUser(UserEntity newUser);
}
