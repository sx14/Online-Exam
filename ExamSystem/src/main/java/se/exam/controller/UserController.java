package se.exam.controller;

import se.exam.bl.UserService;
import se.exam.config.Msg;
import se.exam.entity.UserEntity;
import se.exam.vo.ResultMessageVO;
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
    UserService userService;

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @ResponseBody
    public ResultMessageVO login(HttpSession session, String userId, String password) {
        UserEntity user = userService.login(userId,password);
        if (user != null){
            return new ResultMessageVO(Msg.SUCCESS, "");
        }else {
            return new ResultMessageVO(Msg.FAIL, "");
        }
    }

    @RequestMapping(value = "/user/register",method = RequestMethod.POST)
    @ResponseBody
    public ResultMessageVO register(String username, String password, String name, String email, int userType) {
        return userService.register(username, password, name, email, userType);
    }
}
