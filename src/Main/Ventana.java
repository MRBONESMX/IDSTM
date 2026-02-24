package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
		contenedor.setSize(600,600);
		contenedor.setLocation(0, 0);
		this.add(contenedor);
		contenedor.setLayout(null);
		
		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(200, 50);
		title_login.setOpaque(false);
		title_login.setLocation(190, 10);
		title_login.setFont(new Font("Arial", Font.BOLD,30));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		title_login.setForeground(Color.white);
		contenedor.add(title_login);
		
		JTextField username = new JTextField();
		username.setSize(300, 30);
		username.setLocation(30, 150);
		username.setFont(new Font("Aial", Font.BOLD,22));
		contenedor.add(username);
		
		JLabel username_text = new JLabel();
		username_text.setText("Username: ");
		username_text.setSize(200,30);
		username_text.setFont(new Font("Arial", Font.BOLD,22));
		username_text.setOpaque(false);
		username_text.setLocation(30,120);
		username_text.setForeground(Color.white);
		contenedor.add(username_text);
		
		JPasswordField password = new JPasswordField();
		password.setSize(300, 30);
		password.setLocation(30, 240);
		password.setFont(new Font("Aial", Font.BOLD,22));
		contenedor.add(password);
		
		JLabel password_text= new JLabel();
		password_text.setText("password: ");
		password_text.setSize(200,30);
		password_text.setFont(new Font("Arial", Font.BOLD,22));
		password_text.setOpaque(false);
		password_text.setLocation(30,210);
		password_text.setForeground(Color.white);
		contenedor.add(password_text);
	
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(200, 400);
		acceder.setSize(180, 40);
		acceder.setFont(new Font("Arial", Font.BOLD,22));
		contenedor.add(acceder);
		
		JCheckBox cajita = new JCheckBox("Recordarme");
		cajita.setLocation(0,0);
		cajita.setBounds(30, 280, 150, 30);
		cajita.setOpaque(false);
		cajita.setForeground(Color.WHITE);
		contenedor.add(cajita);
		
		JLabel forgot_password = new JLabel("¿Olvidó su contraseña?");
		forgot_password.setLocation(160,280);
		forgot_password.setSize(170,30);
		forgot_password.setFont(new Font("Arial", Font.BOLD,14));
		forgot_password.setHorizontalAlignment(JLabel.RIGHT);
		forgot_password.setOpaque(false);
		forgot_password.setForeground(Color.WHITE);
		contenedor.add(forgot_password);
 		
		contenedor.repaint();
		contenedor.revalidate();

	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
