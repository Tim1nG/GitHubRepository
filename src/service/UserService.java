package service;

import java.util.List;

import org.springframework.stereotype.Service;

import domain.User;

public interface UserService {
	List<User> getUserList();
}
