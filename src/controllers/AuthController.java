package controllers;

import views.AuthView;

public class AuthController {
	
	private AuthView vista;
	
	public AuthController() {
		
		vista = new AuthView(); 
	}
	
	public void showLogin() {
		vista.loginView();
	}
	
	public void showRegister() {
		vista.registroView();
	}
	
	
	
	

	public static void main(String[] args) {
		AuthController authController = new AuthController();
		authController.showLogin();

	}

}
