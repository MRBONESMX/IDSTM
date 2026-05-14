package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controllers.UsersController;
import models.User;

public class UsersView {
	private UsersView view;
	private UsersController uc;
	
	public UsersView() {
	
	}
	
	public void setController(UsersController uc) {
		this.uc = uc;
	}
	
	public void showUsers(ArrayList<User> data_users) {
		
		
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setMinimumSize(new Dimension(200,200));
		frame.setMaximumSize(new Dimension(700,700));
		frame.setTitle("Pagina web de Therians (Ranking)");
		frame.setBackground(new Color(20, 20, 20));
		frame.setLocation(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.getContentPane().setBackground(new Color(20, 20, 20));
		
		JPanel users = new JPanel();
		users.setSize(600,600);
		users.setLocation(0,0);
		users.setBackground(new Color(20, 20, 20));
		users.setLayout(null);
		frame.add(users);
		
		JLabel users_title = new JLabel("Lista de therians global");
		users_title.setBounds(30,20,300,30);
		users_title.setForeground(new Color(0, 180, 216));
		users_title.setFont(new Font("Tahoma", Font.BOLD, 22));
		users.add(users_title);
		
		JLabel total_therians = new JLabel("Therians");
		total_therians.setBounds(30,140,170,50);
		total_therians.setForeground(Color.WHITE);
		total_therians.setBackground(new Color(45, 45, 45));
		total_therians.setOpaque(true);
		total_therians.setHorizontalAlignment(JLabel.CENTER);
		total_therians.setBorder(new LineBorder(new Color(0, 180, 216)));
		total_therians.setFont(new Font("Tahoma", Font.BOLD, 18));
		users.add(total_therians);
		
		JLabel num_therians = new JLabel("100");
		num_therians.setBounds(55,175,100,30);
		num_therians.setForeground(new Color(0, 180, 216));
		num_therians.setFont(new Font("Tahoma", Font.BOLD, 22));
		users.add(num_therians);
		
		JButton export = new JButton("Exportar");
		export.setBounds(365, 150, 100, 35);
		export.setBackground(new Color(45, 45, 45));
		export.setForeground(Color.WHITE);
		export.setBorder(new LineBorder(new Color(80, 80, 80)));
		users.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(475, 150, 100, 35);
		add.setBackground(new Color(0, 180, 216));
		add.setForeground(Color.WHITE);
		add.setBorder(null);
		users.add(add);
		
		add.addActionListener(e -> {
			frame.dispose();
			uc.showAddUser();
			
		});
	
		
		String [] table_head = {"ID","Username","Email"};
		String[][] table_contend = {
				};
		
		DefaultTableModel model = new DefaultTableModel(table_contend, table_head);
		for (User item : data_users) {
			Object [] row = {item.getId(), item.getUsername(), item.getEmail()};
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		
			
		
		table.setBackground(new Color(45, 45, 45));
		table.setForeground(Color.WHITE);
		table.setGridColor(new Color(0, 180, 216));
		table.setRowHeight(25);
		
		scrollPane.getViewport().setBackground(new Color(45, 45, 45));
		scrollPane.setBorder(new LineBorder(new Color(0, 180, 216)));
		scrollPane.setBounds(30,215,540,250);
		users.add(scrollPane);	
		
		users.repaint();
		users.revalidate();
		frame.setVisible(true);
	}
	
	public void showAddUser() {

	JFrame frame = new JFrame();
	frame.setSize(400, 350);
	frame.setLocationRelativeTo(null);
	frame.setTitle("Añadir Therian");
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.getContentPane().setBackground(new Color(20, 20, 20));
	frame.setLayout(null);

	JLabel title = new JLabel("Registrar usuario");
	title.setBounds(90, 20, 250, 30);
	title.setForeground(new Color(0, 180, 216));
	title.setFont(new Font("Tahoma", Font.BOLD, 22));
	frame.add(title);

	JLabel username_label = new JLabel("Username:");
	username_label.setBounds(40, 80, 100, 25);
	username_label.setForeground(Color.WHITE);
	frame.add(username_label);

	JTextField username_field = new JTextField();
	username_field.setBounds(140, 80, 200, 30);
	username_field.setBackground(new Color(45, 45, 45));
	username_field.setForeground(Color.WHITE);
	username_field.setCaretColor(Color.WHITE);
	username_field.setBorder(new LineBorder(new Color(0, 180, 216)));
	frame.add(username_field);

	JLabel email_label = new JLabel("Email:");
	email_label.setBounds(40, 130, 100, 25);
	email_label.setForeground(Color.WHITE);
	frame.add(email_label);

	JTextField email_field = new JTextField();
	email_field.setBounds(140, 130, 200, 30);
	email_field.setBackground(new Color(45, 45, 45));
	email_field.setForeground(Color.WHITE);
	email_field.setCaretColor(Color.WHITE);
	email_field.setBorder(new LineBorder(new Color(0, 180, 216)));
	frame.add(email_field);

	JLabel password_label = new JLabel("Password:");
	password_label.setBounds(40, 180, 100, 25);
	password_label.setForeground(Color.WHITE);
	frame.add(password_label);

	JPasswordField password_field = new JPasswordField();
	password_field.setBounds(140, 180, 200, 30);
	password_field.setBackground(new Color(45, 45, 45));
	password_field.setForeground(Color.WHITE);
	password_field.setCaretColor(Color.WHITE);
	password_field.setBorder(new LineBorder(new Color(0, 180, 216)));
	frame.add(password_field);

	JButton save = new JButton("Guardar");
	save.setBounds(80, 250, 120, 35);
	save.setBackground(new Color(0, 180, 216));
	save.setForeground(Color.WHITE);
	save.setBorder(null);
	frame.add(save);

	JButton cancel = new JButton("Cancelar");
	cancel.setBounds(210, 250, 120, 35);
	cancel.setBackground(new Color(45, 45, 45));
	cancel.setForeground(Color.WHITE);
	cancel.setBorder(new LineBorder(new Color(80, 80, 80)));
	frame.add(cancel);

	save.addActionListener(e -> {

		String username = username_field.getText().trim();
		String email = email_field.getText().trim();
		String password = String.valueOf(password_field.getPassword());

		if(username.isEmpty() || email.isEmpty() || password.isEmpty()) {
			JOptionPane.showMessageDialog(
					frame,
					"Todos los campos son obligatorios",
					"Error",
					JOptionPane.ERROR_MESSAGE
			);
			return;
		}

		if(username.length() < 3) {
			JOptionPane.showMessageDialog(
					frame,
					"El username debe tener minimo 3 caracteres",
					"Error",
					JOptionPane.ERROR_MESSAGE
			);
			return;
		}

		if(!email.contains("@") || !email.contains(".")) {
			JOptionPane.showMessageDialog(
					frame,
					"Ingresa un email valido",
					"Error",
					JOptionPane.ERROR_MESSAGE
			);
			return;
		}

		if(password.length() < 6) {
			JOptionPane.showMessageDialog(
					frame,
					"La contraseña debe tener minimo 6 caracteres",
					"Error",
					JOptionPane.ERROR_MESSAGE
			);
			return;
		}
		
		uc = new UsersController();
		
		if(uc.addUser(email, username, password)) {
		
		JOptionPane.showMessageDialog(
				frame,
				"Usuario registrado correctamente"
		);
		frame.dispose();
		uc.showUsers();	
		
		}else {
			JOptionPane.showMessageDialog(
					frame,
					"Error al registrar el usuario",
					"Error",
					JOptionPane.ERROR_MESSAGE
			);
		}

		username_field.setText("");
		email_field.setText("");
		password_field.setText("");
	});

	cancel.addActionListener(e -> {
		frame.dispose();
	});

	frame.setVisible(true);
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
