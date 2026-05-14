package controllers;

import java.util.ArrayList;

import models.User;
import views.UsersView;

public class UsersController {
	private UsersView view;
	private User model;
	
	public UsersController() {
		view = new UsersView();
		view.setController(this);
		model = new User();
	}
	
	
	public void showUsers() {
		ArrayList<User> data_users = model.get();
		view.showUsers(data_users);
	}
	
	public boolean addUser(String e, String n, String p) {
		boolean flag = model.make(e, n, p);
		return flag;
	}
	
	public void showAddUser() {
		view.showAddUser();
	}
	
	
	


}
