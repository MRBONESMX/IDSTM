package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Ventana extends JFrame {
	public Ventana() {
		this.setVisible(true);
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(700,700));
		this.setTitle("Pagina web de Therians (Ranking)");
		this.setBackground(Color.BLACK);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.black);
		contenedor.setSize(500, 500);
		contenedor.setLocation(50, 50);
		this.add(contenedor);
		contenedor.setLayout(null);
		
		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(200, 30);
		title_login.setOpaque(true);
		title_login.setLocation(150, 10);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial", Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JTextField username = new JTextField();
		username.setSize(300, 30);
		username.setLocation(30, 150);
		username.setFont(new Font("Aial", Font.BOLD,22));
		contenedor.add(username);
		
		JLabel username_text = new JLabel();
		username_text.setText("Username");
		username_text.setSize(200,30);
		username_text.setFont(new Font("Arial", Font.BOLD,22));
		username_text.setOpaque(true);
		username_text.setLocation(10,120);
		username_text.setBackground(Color.white);
		contenedor.add(username_text);
	
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(150, 400);
		acceder.setSize(180, 40);
		acceder.setFont(new Font("Arial", Font.BOLD,22));
		contenedor.add(acceder);
		
		
		contenedor.repaint();
		contenedor.revalidate();
		
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
