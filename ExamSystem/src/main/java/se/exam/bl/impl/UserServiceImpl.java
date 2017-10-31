package se.exam.bl.impl;

import se.exam.bl.UserService;
import se.exam.dao.UserDAO;
import com.springmvc.entity.*;
import se.exam.entity.UserEntity;
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

    public UserEntity login(String memberId, String password) {
        return null;
    }

    @Override
    public ResultMessageVO register(String username, String password, String name, String email, int userType) {
        return null;
    }
}
