package com.springmvc.controller;

import com.springmvc.blservice.UserBLService;
import com.springmvc.config.Msg;
import com.springmvc.vo.ResultMessageVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by wzh on 17/01/2017.
 */

@Controller
public class UserController {
    @Resource
    UserBLService userBLService;

    @RequestMapping(value = "/member/login",method = RequestMethod.POST)
    @ResponseBody
    public ResultMessageVO login(HttpSession session,String userId, String password) {
        ResultMessageVO resultMessageVO = userBLService.login(userId,password);
        if (resultMessageVO.getStatus() == Msg.SUCCESS){
            session.setAttribute("Id",userId);
        }
        return resultMessageVO;
    }
}
