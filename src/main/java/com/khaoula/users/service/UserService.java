package com.khaoula.users.service;


import com.khaoula.users.entities.Role;
import com.khaoula.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
