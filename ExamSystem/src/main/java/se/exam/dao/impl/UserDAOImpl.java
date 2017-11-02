package se.exam.dao.impl;

import se.exam.config.Msg;
import se.exam.dao.UserDAO;
import se.exam.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * Created by wzh on 17/01/2017.
 */

@Service
public class UserDAOImpl implements UserDAO {

    @Resource
    BaseDAOImpl baseDao;

    public UserEntity getUserByUsername(String username) {
         List list = baseDao.findByProperty(UserEntity.class, "username", username);
         if(list.size() > 0){
             return (UserEntity)list.get(0);
         }else {
             return null;
         }
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
