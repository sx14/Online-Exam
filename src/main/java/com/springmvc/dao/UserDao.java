package com.springmvc.dao;

import com.springmvc.dataservice.UserDataService;
import com.springmvc.entities.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wzh on 17/01/2017.
 */

@Service
public class UserDao implements UserDataService {

    @Resource
    BaseDao baseDao;

    public UserEntity getUserById(String memberId) {
        return (UserEntity) baseDao.findById(UserEntity.class,memberId);
    }


}
