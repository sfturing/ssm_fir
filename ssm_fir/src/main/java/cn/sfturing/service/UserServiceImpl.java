package cn.sfturing.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sfturing.dao.UserDao;
import cn.sfturing.pojo.User;

/**
 * 
 * @author sfturing
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	/**
	 * sfturing
	 */
	public User selectUserById(Integer userId) {
		
		return userDao.selectUserById(userId);
	}

}
