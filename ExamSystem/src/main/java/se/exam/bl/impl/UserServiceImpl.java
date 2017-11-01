package se.exam.bl.impl;

import se.exam.bl.UserService;
import se.exam.config.Msg;
import se.exam.dao.UserDAO;
import se.exam.entity.UserEntity;
import se.exam.util.RandomStringUtil;
import se.exam.vo.ResultMessageVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wzh on 17/01/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    public UserEntity login(String userId, String password) {
        UserEntity userEntity = userDAO.getUserByUserId(userId);
        if (userEntity!=null && userEntity.getPassword().equals(password)){
            return userEntity;
        }
        return null;
    }

    @Override
    public ResultMessageVO register(String username, String password, String name, String email, int userType) {
        String uid = RandomStringUtil.getRandomNumber(10);
        if (userDAO.createUser(new UserEntity(uid, username, password, name, email, userType))== Msg.SUCCESS){
            return new ResultMessageVO(Msg.SUCCESS, "");
        }
        return new ResultMessageVO(Msg.FAIL, "");
    }
}
