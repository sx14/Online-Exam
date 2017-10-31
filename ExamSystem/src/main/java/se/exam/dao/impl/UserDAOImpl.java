package se.exam.dao.impl;

import se.exam.dao.UserDAO;
import se.exam.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wzh on 17/01/2017.
 */

@Service
public class UserDAOImpl implements UserDAO {

    @Resource
    BaseDAOImpl baseDao;

    public UserEntity getUserByUsername(String memberId) {
        return (UserEntity) baseDao.findById(UserEntity.class,memberId);
    }

    @Override
    public boolean createUser(UserEntity newUser) {
        return false;
    }
}
