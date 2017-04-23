package cn.sfturing.dao;

import cn.sfturing.pojo.User;

/**
 * 
 * @author sfturing
 *
 */
public interface UserDao {
	
	public User selectUserById(Integer userId);

}
