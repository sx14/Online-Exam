package com.springmvc.dataservice;

import com.springmvc.entities.UserEntity;

/**
 * Created by wzh on 17/01/2017.
 */
public interface UserDataService {

    public UserEntity getUserById(String memberId);

}
