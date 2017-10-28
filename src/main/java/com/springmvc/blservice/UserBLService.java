package com.springmvc.blservice;


import com.springmvc.vo.ResultMessageVO;

import java.util.List;

/**
 * Created by wzh on 17/01/2017.
 */
public interface UserBLService {
    //登录
    public ResultMessageVO login(String memberId, String password);

}
