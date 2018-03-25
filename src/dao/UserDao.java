package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import domain.User;

@Repository("userDao") 
public interface UserDao {
	List<User> getList();
}
