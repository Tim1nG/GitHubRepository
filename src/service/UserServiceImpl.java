package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import domain.User;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource(name = "userDao")
	private UserDao userDao;
	
	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userDao.getList();
	}
	
}
