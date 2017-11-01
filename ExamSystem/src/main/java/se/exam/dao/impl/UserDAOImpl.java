package se.exam.dao.impl;

import se.exam.config.Msg;
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

    public UserEntity getUserByUserId(String userId) {
        return (UserEntity) baseDao.findById(UserEntity.class,userId);
    }

    @Override
    public Msg createUser(UserEntity newUser) {
        try
        {
            baseDao.save(newUser);
        }
        catch (Exception e){
            return  Msg.FAIL;
        }
        return Msg.SUCCESS;

    }
}
