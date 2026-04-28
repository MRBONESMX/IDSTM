package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import controllers.AuthController;

public class AuthView {
	int id=0;
	String password=""; 
	
	public void loginView() {
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
		
		ImageIcon icon = new ImageIcon("src/public/therian_simbolo3.jpg");
		frame.setIconImage(icon.getImage());
		
		
		frame.repaint();
		frame.revalidate();
		frame.setVisible(true);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(new Color(20, 20, 20));
		contenedor.setSize(600,600);
		contenedor.setLocation(0, 0);
		frame.add(contenedor);
		contenedor.setLayout(null);
		
		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(200, 50);
		title_login.setOpaque(false);
		title_login.setLocation(190, 10);
		title_login.setFont(new Font("Tahoma", Font.BOLD, 35));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		title_login.setForeground(new Color(0, 180, 216));
		contenedor.add(title_login);
		
		ImageIcon icon_therian = new ImageIcon("src/public/therian_simbolo3.jpg");
		JButton simbolo_therian = new JButton(icon_therian);
		simbolo_therian.setBounds(400,5,75,75);
		simbolo_therian.setBackground(new Color(45, 45, 45));
		simbolo_therian.setBorder(new LineBorder(new Color(0, 180, 216)));
		contenedor.add(simbolo_therian);
		
		JTextField username = new JTextField();
		username.setSize(300, 35);
		username.setLocation(30, 150);
		username.setFont(new Font("Tahoma", Font.PLAIN, 18));
		username.setBackground(new Color(45, 45, 45));
		username.setForeground(Color.WHITE);
		username.setCaretColor(Color.WHITE);
		username.setBorder(new LineBorder(new Color(0, 180, 216)));
		contenedor.add(username);
		
		JLabel username_text = new JLabel();
		username_text.setText("id: ");
		username_text.setSize(200,30);
		username_text.setFont(new Font("Tahoma", Font.BOLD, 18));
		username_text.setOpaque(false);
		username_text.setLocation(30,120);
		username_text.setForeground(new Color(200, 200, 200));
		contenedor.add(username_text);
		
		JTextField password = new JTextField();
		password.setSize(300, 35);
		password.setLocation(30, 240);
		password.setFont(new Font("Tahoma", Font.PLAIN, 18));
		password.setBackground(new Color(45, 45, 45));
		password.setForeground(Color.WHITE);
		password.setCaretColor(Color.WHITE);
		password.setBorder(new LineBorder(new Color(0, 180, 216)));
		contenedor.add(password);
		
		JLabel password_text= new JLabel();
		password_text.setText("password: ");
		password_text.setSize(200,30);
		password_text.setFont(new Font("Tahoma", Font.BOLD, 18));
		password_text.setOpaque(false);
		password_text.setLocation(30,210);
		password_text.setForeground(new Color(200, 200, 200));
		contenedor.add(password_text);
	
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(200, 400);
		acceder.setSize(180, 45);
		acceder.setFont(new Font("Tahoma", Font.BOLD, 20));
		acceder.setBackground(new Color(0, 180, 216));
		acceder.setForeground(Color.WHITE);
		acceder.setFocusPainted(false);
		acceder.setBorder(null);
		contenedor.add(acceder);
		
		acceder.addActionListener(e -> {
				String username_val = username.getText();
				int id_ingresado = 0;
				if(username_val.length() > 0){
					id_ingresado = Integer.parseInt(username_val);
				}
			    String password_val = new String(password.getText());

			    
			    int usernameCorrecto = this.id;
			    String passwordCorrecta = this.password;


			 
			    if (id_ingresado == usernameCorrecto && password_val.equals(passwordCorrecta)) {
			    	 	password.setBorder(new LineBorder(new Color(0, 180, 216)));
				    username.setBorder(new LineBorder(new Color(0, 180, 216)));
			    		JOptionPane.showMessageDialog(null, "Bienvenido usuario");    
			    } else {
			    	 	password.setBorder(BorderFactory.createLineBorder(Color.red));
			    	 	username.setBorder(BorderFactory.createLineBorder(Color.red));
			        JOptionPane.showMessageDialog(null, "id o contraseña incorrectos");
			       
			    }
		});
		
		JButton registrarse = new JButton();
		registrarse.setText("Registrarse");
		registrarse.setLocation(200, 450);
		registrarse.setSize(180, 45);
		registrarse.setFont(new Font("Tahoma", Font.BOLD, 20));
		registrarse.setOpaque(false);
		registrarse.setContentAreaFilled(false);
		registrarse.setForeground(Color.WHITE);
		contenedor.add(registrarse);
		
		
		registrarse.addActionListener(e -> {
			    AuthController authController = new AuthController();
		        frame.dispose();
		        authController.showRegister();
		        
		});
			
		
		
		
		JCheckBox cajita = new JCheckBox("Recordarme");
		cajita.setBounds(30, 280, 150, 30);
		cajita.setOpaque(false);
		cajita.setForeground(Color.WHITE);
		contenedor.add(cajita);
		
		JLabel forgot_password = new JLabel("¿Olvidó su contraseña?");
		forgot_password.setLocation(160,280);
		forgot_password.setSize(170,30);
		forgot_password.setFont(new Font("Tahoma", Font.PLAIN, 12));
		forgot_password.setHorizontalAlignment(JLabel.RIGHT);
		forgot_password.setOpaque(false);
		forgot_password.setForeground(new Color(0, 180, 216));
		contenedor.add(forgot_password);
 		
		frame.setVisible(true);

		contenedor.repaint();
		contenedor.revalidate();
		}
	
	public void registroView() {
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
		
		JPanel contenedorRegistro = new JPanel();
		contenedorRegistro.setOpaque(true);
		contenedorRegistro.setBackground(new Color(20, 20, 20));
		contenedorRegistro.setSize(600,600);
		contenedorRegistro.setLocation(0, 0);
		frame.add(contenedorRegistro);
		contenedorRegistro.setLayout(null);
		
		JLabel title_register = new JLabel();
		title_register.setText("Registro");
		title_register.setSize(200, 50);
		title_register.setOpaque(false);
		title_register.setLocation(200, 10);
		title_register.setFont(new Font("Tahoma", Font.BOLD, 30));
		title_register.setHorizontalAlignment(JLabel.CENTER);
		title_register.setForeground(new Color(0, 180, 216));
		contenedorRegistro.add(title_register);
		
		JLabel username_registro = new JLabel();
		username_registro.setText("Username:"); 
		username_registro.setOpaque(false);
		username_registro.setSize(300,30);
		username_registro.setFont(new Font("Tahoma", Font.BOLD, 16));
		username_registro.setForeground(Color.WHITE);
		username_registro.setLocation(30,90);
		contenedorRegistro.add(username_registro);
		
		JLabel username_registro_text = new JLabel();
		username_registro_text.setOpaque(true);
		username_registro_text.setBackground(new Color(45, 45, 45));
		username_registro_text.setLocation(30,120);
		username_registro_text.setSize(300,30);
		username_registro_text.setBorder(new LineBorder(new Color(0, 180, 216)));
		username_registro_text.setFont(new Font("Tahoma", Font.BOLD, 16));
		contenedorRegistro.add(username_registro_text);
		
		JLabel bio_tag = new JLabel("Biografía: ");
		bio_tag.setBounds(30,170,250,40);
		bio_tag.setFont(new Font("Tahoma", Font.BOLD, 16));
		bio_tag.setForeground(Color.WHITE);
		contenedorRegistro.add(bio_tag);
		
		JTextArea bio_textarea = new JTextArea();
		bio_textarea.setBounds(30,210,400,100);
		bio_textarea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bio_textarea.setBackground(new Color(45, 45, 45));
		bio_textarea.setForeground(Color.WHITE);
		bio_textarea.setBorder(new LineBorder(new Color(80, 80, 80)));
		contenedorRegistro.add(bio_textarea);
		
		JLabel therians_option = new JLabel("Seleccionar animales con los que te sientas identificado");
		therians_option.setBounds(30,320,650,30);
		therians_option.setFont(new Font("Tahoma", Font.PLAIN, 15));
		therians_option.setForeground(new Color(200, 200, 200));
		contenedorRegistro.add(therians_option);
		
		JCheckBox checkbox1 = new JCheckBox("Gato");
		checkbox1.setBounds(30, 370, 80, 30);
		checkbox1.setOpaque(false);
		checkbox1.setFont(new Font("Tahoma", Font.BOLD, 14));
		checkbox1.setForeground(Color.WHITE);
		contenedorRegistro.add(checkbox1);
		
		JCheckBox checkbox2 = new JCheckBox("Perro");
		checkbox2.setBounds(110, 370, 80, 30);
		checkbox2.setOpaque(false);
		checkbox2.setFont(new Font("Tahoma", Font.BOLD, 14));
		checkbox2.setForeground(Color.WHITE);
		contenedorRegistro.add(checkbox2);
		
		JCheckBox checkbox3 = new JCheckBox("otro...");
		checkbox3.setBounds(190, 370, 100, 30);
		checkbox3.setOpaque(false);
		checkbox3.setFont(new Font("Tahoma", Font.BOLD, 14));
		checkbox3.setForeground(Color.WHITE);
		contenedorRegistro.add(checkbox3);
		
		JRadioButton accept_terms = new JRadioButton("Acepto los terminos");
		accept_terms.setBounds(30,400,150,50);
		accept_terms.setOpaque(false);
		accept_terms.setForeground(Color.WHITE);
		contenedorRegistro.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton("No acepto los terminos");
		reject_terms.setBounds(180,400,180,50);
		reject_terms.setOpaque(false);
		reject_terms.setForeground(Color.WHITE);
		contenedorRegistro.add(reject_terms);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(reject_terms);
		terms.add(accept_terms);
		
		String comida[] = {"pedigree","royale prestige","whiskas"};
		
		JLabel comida_text = new JLabel("Croquetas favoritas");
		comida_text.setBounds(30,405,300,100);
		comida_text.setForeground(Color.WHITE);
		comida_text.setFont(new Font("Tahoma", Font.BOLD,16));
		contenedorRegistro.add(comida_text);
		
		JComboBox list = new JComboBox(comida);
		list.setBounds(30,470,150,25);
		list.setBackground(new Color(45, 45, 45));
		list.setForeground(Color.WHITE);
		contenedorRegistro.add(list);
		
		JButton registrarse_boton = new JButton();
		registrarse_boton.setText("Registrate");
		registrarse_boton.setLocation(210, 490);
		registrarse_boton.setSize(180, 40);
		registrarse_boton.setFont(new Font("Tahoma", Font.BOLD,18));
		registrarse_boton.setBackground(new Color(0, 180, 216));
		registrarse_boton.setForeground(Color.WHITE);
		registrarse_boton.setBorder(null);
		contenedorRegistro.add(registrarse_boton);
		
		ImageIcon icon = new ImageIcon("src/public/therian_simbolo3.jpg");
		JButton simbolo_therian = new JButton(icon);
		simbolo_therian.setBounds(500,15,75,75);
		simbolo_therian.setBackground(new Color(45, 45, 45));
		simbolo_therian.setBorder(new LineBorder(new Color(0, 180, 216)));
		contenedorRegistro.add(simbolo_therian);
		
		JButton volver_login = new JButton("Volver al login");
		volver_login.setBounds(395, 490, 180, 40);
		volver_login.setFont(new Font("Tahoma", Font.BOLD,18));
		volver_login.setOpaque(false);
		volver_login.setContentAreaFilled(false);
		contenedorRegistro.add(volver_login);
		
		volver_login.addActionListener(e ->{
			 AuthController authController = new AuthController();
		     frame.dispose();
		     authController.showLogin();
		});
		
		frame.setVisible(true);
		contenedorRegistro.repaint();
		contenedorRegistro.revalidate();
	}
	

	
	
}
