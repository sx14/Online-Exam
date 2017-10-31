package datatest;

/**
 * Created by wzh on 16/8/28.
 */


import se.exam.bl.UserService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class DataTestDriver {

    @Resource
    UserService userService;



}