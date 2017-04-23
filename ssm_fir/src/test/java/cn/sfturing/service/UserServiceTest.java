package cn.sfturing.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.sfturing.basetest.SpringTestCase;
import cn.sfturing.pojo.User;
  

  

public class UserServiceTest extends SpringTestCase {  
    @Autowired  
    private UserService userService;  
    Logger logger = Logger.getLogger(UserServiceTest.class);  
      
    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(10);  
        logger.debug("查找结果" + user);  
    }  
      
  
}  
