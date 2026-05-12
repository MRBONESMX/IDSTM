package controllers;

import java.util.ArrayList;

import models.User;
import views.UsersView;

public class UsersController {
	private UsersView view;
	private User model;
	
	public UsersController() {
		view = new UsersView();
		model = new User();
	}
	
	
	public void showUsers() {
		ArrayList<User> data_users = model.get();
		view.showUseres(data_users);
	}
	
	
	


}
