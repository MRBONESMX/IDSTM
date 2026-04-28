package Main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

import controllers.AuthController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthController authController = new AuthController();
		authController.showLogin();
	}

}
