package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import models.User;

public class UsersView {
	private UsersView view;
	
	public UsersView() {
	
	}
	
	public void showUseres(ArrayList<User> data_users) {
		
		
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
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
