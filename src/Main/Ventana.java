package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
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
		this.users();
		this.getContentPane().setBackground(Color.BLACK);
		
		
	}		// TODO Auto-generated method stub
		
		public void login() {
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
		
		public void registro() {
			JPanel contenedorRegistro = new JPanel();
			contenedorRegistro.setOpaque(true);
			contenedorRegistro.setBackground(Color.black);
			contenedorRegistro.setSize(600,600);
			contenedorRegistro.setLocation(0, 0);
			this.add(contenedorRegistro);
			contenedorRegistro.setLayout(null);
			
			JLabel title_register = new JLabel();
			title_register.setText("Registro");
			title_register.setSize(200, 50);
			title_register.setOpaque(false);
			title_register.setLocation(200, 10);
			title_register.setFont(new Font("Arial", Font.BOLD,30));
			title_register.setHorizontalAlignment(JLabel.CENTER);
			title_register.setForeground(Color.white);
			contenedorRegistro.add(title_register);
			
			JLabel username_registro = new JLabel();
			username_registro.setText("Username:"); 
			username_registro.setOpaque(false);
			username_registro.setSize(300,30);
			username_registro.setFont(new Font("Arial", Font.BOLD, 22));
			username_registro.setForeground(Color.WHITE);
			username_registro.setLocation(30,90);
			contenedorRegistro.add(username_registro);
			
			JLabel username_registro_text = new JLabel();
			username_registro_text.setOpaque(true);
			username_registro_text.setLocation(30,120);
			username_registro_text.setSize(300,30);
			username_registro_text.setFont(new Font("Arial", Font.BOLD, 22));
			contenedorRegistro.add(username_registro_text);
			
			JLabel bio_tag = new JLabel("Biografía: ");
			bio_tag.setBounds(30,170,250,40);
			bio_tag.setHorizontalTextPosition(JLabel.CENTER);
			bio_tag.setFont(new Font("Arial", Font.BOLD, 22));
			bio_tag.setForeground(Color.WHITE);
			contenedorRegistro.add(bio_tag);
			
			JTextArea bio_textarea = new JTextArea();
			bio_textarea.setBounds(30,210,400,100);
			bio_textarea.setFont(new Font("Arial", Font.BOLD, 22));
			bio_textarea.setBackground(Color.WHITE);
			contenedorRegistro.add(bio_textarea);
			
			JLabel therians_option = new JLabel("Sleccionar animales con los que te sientas identificado");
			therians_option.setBounds(30,320,650,30);
			therians_option.setFont(new Font("Arial", Font.BOLD, 20));
			therians_option.setForeground(Color.WHITE);
			contenedorRegistro.add(therians_option);
			
			JCheckBox checkbox1 = new JCheckBox("Gato");
			checkbox1.setBounds(30, 370, 150, 30);
			checkbox1.setOpaque(false);
			checkbox1.setFont(new Font("Arial", Font.BOLD, 18));
			checkbox1.setForeground(Color.WHITE);
			contenedorRegistro.add(checkbox1);
			
			JCheckBox checkbox2 = new JCheckBox("Perro");
			checkbox2.setBounds(150, 370, 200, 30);
			checkbox2.setOpaque(false);
			checkbox2.setFont(new Font("Arial", Font.BOLD, 18));
			checkbox2.setForeground(Color.WHITE);
			contenedorRegistro.add(checkbox2);
			
			JCheckBox checkbox3 = new JCheckBox("otro...");
			checkbox3.setBounds(270, 370, 200, 30);
			checkbox3.setOpaque(false);
			checkbox3.setFont(new Font("Arial", Font.BOLD, 18));
			checkbox3.setForeground(Color.WHITE);
			contenedorRegistro.add(checkbox3);
			
			JRadioButton accept_terms = new JRadioButton("Acepto los terminos");
			accept_terms.setBounds(30,400,150,50);
			accept_terms.setOpaque(false);
			accept_terms.setForeground(Color.WHITE);
			contenedorRegistro.add(accept_terms);
			
			JRadioButton reject_terms = new JRadioButton("Acepto los terminos");
			reject_terms.setBounds(170,400,150,50);
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
			comida_text.setFont(new Font("Arial", Font.BOLD,22));
			contenedorRegistro.add(comida_text);
			
			JComboBox list = new JComboBox(comida);
			list.setBounds(30,470,100,20);
			contenedorRegistro.add(list);
			
			JButton registrarse_boton = new JButton();
			registrarse_boton.setText("Registrate");
			registrarse_boton.setLocation(210, 490);
			registrarse_boton.setSize(180, 40);
			registrarse_boton.setFont(new Font("Arial", Font.BOLD,22));
			contenedorRegistro.add(registrarse_boton);
			
			ImageIcon icon = new ImageIcon("src/public/therian_simbolo3.jpg");
			JButton simbolo_therian = new JButton(icon);
			simbolo_therian.setBounds(500,15,75,75);
			contenedorRegistro.add(simbolo_therian);
			
			
			
			contenedorRegistro.repaint();
			contenedorRegistro.revalidate();
		}
		public void users() {

			JPanel users = new JPanel();
			users.setSize(600,600);
			users.setLocation(0,0);
			users.setBackground(Color.decode("#000000"));
			users.setLayout(null);
			this.add(users);
			
			JLabel users_title = new JLabel("Lista de therians global");
			users_title.setBounds(100,20,300,30);
			users_title.setForeground(Color.decode("#FFFFFFF"));
			users_title.setFont(new Font("Arial", Font.BOLD, 22));
			users.add(users_title);
			
			JLabel total_therians = new JLabel("Therians");
			total_therians.setBounds(30,150,170,70);
			total_therians.setForeground(Color.decode("#000000"));
			total_therians.setBackground(Color.decode("#FFFFFF"));
			total_therians.setOpaque(true);
			total_therians.setFont(new Font("Arial", Font.BOLD, 22));
			users.add(total_therians);
			
			JLabel num_therians = new JLabel("100");
			num_therians.setBounds(55,170,100,30);
			num_therians.setForeground(Color.decode("#000000"));
			num_therians.setFont(new Font("Arial", Font.BOLD, 22));
			users.add(num_therians);
			
			JButton export = new JButton("Exportar");
			export.setBounds(375, 150, 100, 40);
			users.add(export);
			
			JButton add = new JButton("Añadir");
			add.setBounds(475, 150, 100, 40);
			users.add(add);
			
			String [] table_head = {"therian","nombre", "apellido", "raza", "edad", "comida fav"};
			String[][] table_contend = {
				    {"gato", "Simba", "Torres", "fino", "6", "whiskas"},
				    {"perro", "Bruno", "Flores", "calle", "8", "pedigree"},
				    {"gato", "Nala", "Cruz", "fino", "1", "whiskas"},
				    {"perro", "Zeus", "Morales", "fino", "5", "royaleprestige"},
				    {"perro", "Lucas", "Reyes", "calle", "3", "pedigree"},
				    {"gato", "Michi", "Vargas", "calle", "4", "whiskas"},
				    {"perro", "Thor", "Jiménez", "fino", "6", "royaleprestige"},
				    {"gato", "Kira", "Navarro", "fino", "2", "whiskas"},
				    {"perro", "Bobby", "Ortega", "calle", "9", "pedigree"},
				    {"gato", "Salem", "Rojas", "fino", "7", "whiskas"},
				    {"perro", "Chester", "Mendoza", "fino", "4", "royaleprestige"},
				    {"gato", "Pelusa", "Aguilar", "calle", "5", "whiskas"},
				    {"perro", "Firulais", "Santos", "calle", "10", "pedigree"},
				    {"gato", "Tom", "Pineda", "fino", "3", "whiskas"},
				    {"perro", "Apolo", "Castillo", "fino", "2", "royaleprestige"},
				    {"gato", "Maya", "Fuentes", "fino", "6", "whiskas"},
				    {"perro", "Rex", "Valdez", "calle", "7", "pedigree"},
				    {"gato", "Lola", "Peña", "calle", "4", "whiskas"},
				    {"perro", "Duke", "Salazar", "fino", "5", "royaleprestige"},
				    {"gato", "Canela", "Mejía", "fino", "2", "whiskas"}
				};
			
			
			
			JTable table = new JTable(table_contend, table_head);
			JScrollPane scrollPane = new JScrollPane(table);
			
			scrollPane.setBounds(30,215,540,250);
			users.add(scrollPane);			
			
			users.repaint();
			users.revalidate();
			
			
		}
		
		public static void main(String[] args) {
		
	}


}
