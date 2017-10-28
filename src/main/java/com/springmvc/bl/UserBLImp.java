package com.springmvc.bl;

import com.springmvc.blservice.UserBLService;
import com.springmvc.config.*;
import com.springmvc.dataservice.*;
import com.springmvc.entities.*;
import com.springmvc.vo.ResultMessageVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wzh on 17/01/2017.
 */
@Service
public class UserBLImp implements UserBLService {

    @Resource
    UserDataService memberDataService;

    public ResultMessageVO login(String memberId, String password) {
        if (memberId.equals("")||password.equals(""))
            return new ResultMessageVO(Msg.FAIL,"账号或密码为空");
        UserEntity entity = memberDataService.getUserById(memberId);
        if (entity==null)
            return new ResultMessageVO(Msg.FAIL,"没有这个账号");
        if(entity.getPassword().equals(password)){
            return new ResultMessageVO(Msg.SUCCESS,"");
        }
        return new ResultMessageVO(Msg.FAIL,"密码错误");
    }
}
