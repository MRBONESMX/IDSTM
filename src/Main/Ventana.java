package Main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {
	public Ventana() {
		this.setSize(1200, 600);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(700,700));
		this.setTitle("Pagina web de Therians (Ranking)");
		this.setBackground(new Color(20, 20, 20));
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.mario();
		this.getContentPane().setBackground(new Color(20, 20, 20));
		
		ImageIcon icon = new ImageIcon("src/public/therian_simbolo3.jpg");
		this.setIconImage(icon.getImage());
		
		this.menu();
		
		this.repaint();
		this.revalidate();
		this.setVisible(true);
	}
		
	public void login() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(new Color(20, 20, 20));
		contenedor.setSize(600,600);
		contenedor.setLocation(0, 0);
		this.add(contenedor);
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
		
		ImageIcon icon = new ImageIcon("src/public/therian_simbolo3.jpg");
		JButton simbolo_therian = new JButton(icon);
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
		username_text.setText("Username: ");
		username_text.setSize(200,30);
		username_text.setFont(new Font("Tahoma", Font.BOLD, 18));
		username_text.setOpaque(false);
		username_text.setLocation(30,120);
		username_text.setForeground(new Color(200, 200, 200));
		contenedor.add(username_text);
		
		JPasswordField password = new JPasswordField();
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
		
		acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username_val = username.getText();
			    String password_val = new String(password.getPassword());

			    
			    String usernameCorrecto = "therian";
			    String passwordCorrecta = "1234";

			   
			    if (username_val.equals("")) {
			        username.setBorder(BorderFactory.createLineBorder(Color.red));
			    } else {
			        username.setBorder(BorderFactory.createLineBorder(Color.GREEN));
			    }

			    if (password_val.equals("")) {
			        password.setBorder(BorderFactory.createLineBorder(Color.red));
			    } else {
			        password.setBorder(BorderFactory.createLineBorder(Color.GREEN));
			    }

			 
			    if (username_val.equals(usernameCorrecto) && password_val.equals(passwordCorrecta)) {
			        JOptionPane.showMessageDialog(null, "Bienvenido usuario");
			    } else {
			        JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos");
			    }
			}});
		
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
			this.router("registro");
			
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
 		
		contenedor.repaint();
		contenedor.revalidate();
		}
	
	public void registro() {
		JPanel contenedorRegistro = new JPanel();
		contenedorRegistro.setOpaque(true);
		contenedorRegistro.setBackground(new Color(20, 20, 20));
		contenedorRegistro.setSize(600,600);
		contenedorRegistro.setLocation(0, 0);
		this.add(contenedorRegistro);
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
			this.router("login");
		});
		
		contenedorRegistro.repaint();
		contenedorRegistro.revalidate();
	}

	public void users() {
		JPanel users = new JPanel();
		users.setSize(600,600);
		users.setLocation(0,0);
		users.setBackground(new Color(20, 20, 20));
		users.setLayout(null);
		this.add(users);
		
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
		table.setBackground(new Color(45, 45, 45));
		table.setForeground(Color.WHITE);
		table.setGridColor(new Color(0, 180, 216));
		table.setRowHeight(25);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.getViewport().setBackground(new Color(45, 45, 45));
		scrollPane.setBorder(new LineBorder(new Color(0, 180, 216)));
		scrollPane.setBounds(30,215,540,250);
		users.add(scrollPane);	
		
		users.repaint();
		users.revalidate();
	}
	public void calculadora_interes() {

		this.setLayout(new BorderLayout());
	
		JPanel contenedor = new JPanel(new BorderLayout());
		contenedor.setBackground(Color.WHITE);
		this.add(contenedor);
	
		JLabel titulo = new JLabel("Calcular intereses");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setForeground(Color.RED);
		contenedor.add(titulo, BorderLayout.NORTH);
	
		JPanel zonaCentral = new JPanel(new BorderLayout());
		zonaCentral.setBackground(Color.WHITE);
		contenedor.add(zonaCentral, BorderLayout.CENTER);
	
		JLabel subtitulo = new JLabel("Intereses");
		subtitulo.setFont(new Font("Tahoma", Font.BOLD, 22));
		subtitulo.setForeground(Color.RED);
		subtitulo.setHorizontalAlignment(JLabel.LEFT);
		zonaCentral.add(subtitulo, BorderLayout.NORTH);
	
		JPanel centroWrap = new JPanel(new FlowLayout(FlowLayout.CENTER,40,20));
		centroWrap.setBackground(Color.WHITE);
		zonaCentral.add(centroWrap, BorderLayout.CENTER);
	
		JPanel panelVerde = new JPanel(new BorderLayout(10,10));
		panelVerde.setBackground(new Color(140,220,140));
		panelVerde.setBorder(new LineBorder(new Color(120,200,120),3));
		panelVerde.setPreferredSize(new Dimension(420,160));
		centroWrap.add(panelVerde);
	
		JPanel campos = new JPanel(new GridLayout(3,2,10,10));
		campos.setBackground(new Color(140,220,140));
	
		JLabel capital = new JLabel("Capital:");
		JTextField capital_text = new JTextField("1500");
	
		JLabel tiempo = new JLabel("Tiempo:");
		JTextField tiempo_text = new JTextField("2");
	
		JLabel tasa = new JLabel("Tasa interes:");
		JTextField tasa_text = new JTextField("0.1");
	
		campos.add(capital);
		campos.add(capital_text);
		campos.add(tiempo);
		campos.add(tiempo_text);
		campos.add(tasa);
		campos.add(tasa_text);
	
		panelVerde.add(campos, BorderLayout.CENTER);
	
		JPanel botones = new JPanel(new FlowLayout());
		botones.setBackground(new Color(140,220,140));
	
		JButton calcular = new JButton("Calcular");
		JButton cancelar = new JButton("Cancelar");
	
		botones.add(calcular);
		botones.add(cancelar);
	
		panelVerde.add(botones, BorderLayout.SOUTH);
	
		JPanel surWrap = new JPanel(new FlowLayout(FlowLayout.CENTER,40,20));
		surWrap.setBackground(Color.WHITE);
		contenedor.add(surWrap, BorderLayout.SOUTH);
	
		JPanel resultados = new JPanel(new GridLayout(2,2,10,10));
		resultados.setBackground(new Color(230,140,140));
		resultados.setPreferredSize(new Dimension(420,100));
	
		JLabel interes = new JLabel("Interes:");
		JTextField interes_text = new JTextField();
	
		JLabel monto = new JLabel("Monto:");
		JTextField monto_text = new JTextField();
	
		resultados.add(interes);
		resultados.add(interes_text);
		resultados.add(monto);
		resultados.add(monto_text);
	
		surWrap.add(resultados);
	
	}
	public void pintar() {
		 JPanel pane = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Graphics2D g2d = (Graphics2D) g;
	                
	                
	                g2d.drawLine(0, 0, 100, 100);
	                g2d.setStroke(new BasicStroke(3));
	                g2d.setColor(Color.red);
	                g2d.drawLine(300, 200, 300, 250);
	                g2d.setColor(new Color(150, 75, 0));
	                g2d.fillRect(250, 250, 100, 100);
	                g2d.fillOval(225, 100, 65, 65);
	                g2d.fillOval(325, 100, 65, 65);
	                g2d.setStroke(new BasicStroke(5));
	                g2d.drawArc(30, 270, 100, 100, 0, 90);
	                g2d.fillPolygon(new int[] {350, 350, 450}, new int[] {350, 450, 450}, 3);
	                g2d.fillPolygon(new int[] {250, 250, 150}, new int[] {350, 450, 450}, 3);
	                g2d.drawLine(100, 300, 500, 300);
	                g2d.setColor(Color.GRAY);
	                g2d.fillArc(500, 250, 100, 100, 45, 270);
	                
	                g2d.fillArc(20, 250, 100, 100, 220, 270);
	            }
	        };
	     pane.setSize(600, 600);
	     pane.setLocation(0, 0);
	     this.add(pane);
	}
	
	public void la_casa_del_boiler () {
		this.setBackground(Color.blue);
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.cyan);
                g2d.fillRect(0,0,600,600);
             
                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.orange);
                g2d.fillRect(100, 100, 400, 350);
                g2d.setColor(new Color(150, 75, 0));
                g2d.fillRect(310, 250, 100, 200);
                g2d.setColor(Color.gray);
                g2d.fillOval(390, 340, 10, 10);
                g2d.setColor(Color.white);
                g2d.fillRect(130, 250, 100, 130);
                g2d.setColor(Color.black);
                g2d.fillOval(120, 240, 120, 15);
                g2d.fillOval(120, 370, 120, 15);
                g2d.setStroke(new BasicStroke(5));
                g2d.drawLine(215, 240, 215, 200);
                g2d.setStroke(new BasicStroke(5));
                g2d.fillPolygon(new int[] {80, 520, 300}, new int[] {100, 100, 0}, 3);
                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.red);
                g2d.drawLine(170,270,170,350);
                g2d.fillArc(143, 269, 50, 50, 270, 180);
                g2d.fillArc(143, 315, 50, 50, 270, 180);
                g2d.setColor(new Color(150, 75, 0));
                g2d.fillRect(0,400,310, 15);
                g2d.fillRect(0,470,310, 15);
                g2d.fillRect(400,400,310, 15);
                g2d.fillRect(400,470,310, 15);
                g2d.fillRect(0,370,15, 150);
                g2d.fillRect(50,370,15, 150);
                g2d.fillRect(100,370,15, 150);
                g2d.fillRect(150,370,15, 150);
                g2d.fillRect(200,370,15, 150);
                g2d.fillRect(250,370,15, 150);
                g2d.fillRect(300,370,15, 150);
                g2d.fillRect(400,370,15, 150);
                g2d.fillRect(450,370,15, 150);
                g2d.fillRect(500,370,15, 150);
                g2d.fillRect(550,370,15, 150);

                

                

                


                
            }
        };
     pane.setSize(600, 600);
     pane.setLocation(0, 0);
     this.add(pane);
		
	}
	
	public void factura() {
		JPanel contenedor = new JPanel();
		contenedor.setLayout(null);
		contenedor.setBackground(new Color(20,20,20));
		contenedor.setBounds(0,0,600,600);
		this.add(contenedor);

		JLabel titulo = new JLabel("Registro de facturación personal - Sebastian Amir");
		titulo.setBounds(20,10,500,30);
		titulo.setForeground(new Color(0,180,216));
		titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		contenedor.add(titulo);

		

		JPanel cliente = new JPanel();
		cliente.setLayout(null);
		cliente.setBounds(20,70,550,100);
		cliente.setBackground(new Color(30,30,30));
		cliente.setBorder(new LineBorder(new Color(0,180,216)));
		contenedor.add(cliente);

		JLabel doc = new JLabel("Documento:");
		doc.setBounds(10,10,100,25);
		doc.setForeground(Color.WHITE);
		cliente.add(doc);

		JTextField doc_txt = new JTextField("123456");
		doc_txt.setBounds(110,10,120,25);
		cliente.add(doc_txt);

		JLabel nombre = new JLabel("Nombres:");
		nombre.setBounds(260,10,100,25);
		nombre.setForeground(Color.WHITE);
		cliente.add(nombre);

		JTextField nombre_txt = new JTextField("Sebastian Amir");
		nombre_txt.setBounds(340,10,150,25);
		cliente.add(nombre_txt);

		JLabel dir = new JLabel("Dirección:");
		dir.setBounds(10,50,100,25);
		dir.setForeground(Color.WHITE);
		cliente.add(dir);

		JTextField dir_txt = new JTextField("Calle opalina 3232");
		dir_txt.setBounds(110,50,120,25);
		cliente.add(dir_txt);

		JLabel tel = new JLabel("Teléfono:");
		tel.setBounds(260,50,100,25);
		tel.setForeground(Color.WHITE);
		cliente.add(tel);

		JTextField tel_txt = new JTextField("6122200450");
		tel_txt.setBounds(340,50,150,25);
		cliente.add(tel_txt);

		JPanel factura = new JPanel();
		factura.setLayout(null);
		factura.setBounds(20,180,550,60);
		factura.setBackground(new Color(30,30,30));
		factura.setBorder(new LineBorder(new Color(0,180,216)));
		contenedor.add(factura);

		JLabel num = new JLabel("N° Factura:");
		num.setBounds(10,10,100,25);
		num.setForeground(Color.WHITE);
		factura.add(num);

		JLabel num_val = new JLabel("1");
		num_val.setBounds(100,10,50,25);
		num_val.setForeground(Color.WHITE);
		factura.add(num_val);

		JLabel fecha = new JLabel("Fecha:");
		fecha.setBounds(250,10,100,25);
		fecha.setForeground(Color.WHITE);
		factura.add(fecha);
		
		JLabel fecha_val = new JLabel("23/03/2026");
		fecha_val.setBounds(310,10,150,25);
		fecha_val.setForeground(Color.WHITE);
		factura.add(fecha_val);
				
		JPanel acciones = new JPanel();
		acciones.setLayout(null);
		acciones.setBounds(20,250,550,40);
		acciones.setBackground(new Color(20,20,20));
		contenedor.add(acciones);
		
		ImageIcon listado_image = new ImageIcon("src/public/list-ico.png");
		Image listado_img = listado_image.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
		listado_image = new ImageIcon(listado_img);
		
		JButton listado = new JButton("Desplegar listado");
		listado.setBounds(0,5,140,30);
		listado.setBackground(new Color(45,45,45));
		listado.setForeground(Color.WHITE);
		listado.setBorder(new LineBorder(new Color(80,80,80)));
		listado.setIcon(listado_image);
		acciones.add(listado);
		
		ImageIcon add_image = new ImageIcon("src/public/add-ico.png");
		Image add_img = add_image.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
		add_image = new ImageIcon(add_img);
		
		JButton agregar = new JButton("Añadir");
		agregar.setBounds(350,5,90,30);
		agregar.setBackground(new Color(0,180,216));
		agregar.setForeground(Color.WHITE);
		agregar.setBorder(null);
		agregar.setIcon(add_image);
		acciones.add(agregar);
		
		ImageIcon eliminar_image = new ImageIcon("src/public/delete-ico.png");
		Image eliminar_img = eliminar_image.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
		eliminar_image = new ImageIcon(eliminar_img);
		
		JButton eliminar = new JButton("Eliminar");
		eliminar.setBounds(450,5,100,30);
		eliminar.setBackground(new Color(200,60,60));
		eliminar.setForeground(Color.WHITE);
		eliminar.setBorder(null);
		eliminar.setIcon(eliminar_image);
		acciones.add(eliminar);

		String[] head = {"Producto","Cantidad","Valor","Sub Total"};
		String[][] data = {
			{"Agua","2","500","1000"},
			{"Cereal","5","1000","5000"},
			{"Leche","2","300","600"},
			{"Galletas","3","200","600"},
			{"Desodorante","1","500","500"},
			{"Shampoo","1","500","500"}
		};

		JTable tabla = new JTable(data, head);
		tabla.setBackground(new Color(45,45,45));
		tabla.setForeground(Color.WHITE);
		tabla.setRowHeight(25);
		tabla.setGridColor(new Color(0,180,216));

		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(20,300,550,115);
		scroll.setBorder(new LineBorder(new Color(0,180,216)));
		contenedor.add(scroll);

		JLabel subtotal = new JLabel("SubTotal:");
		subtotal.setBounds(20,420,100,25);
		subtotal.setForeground(Color.WHITE);
		contenedor.add(subtotal);

		JLabel subtotal_val = new JLabel("6600.00");
		subtotal_val.setBounds(120,420,100,25);
		subtotal_val.setForeground(Color.WHITE);
		contenedor.add(subtotal_val);

		JLabel desc = new JLabel("% Descuento:");
		desc.setBounds(20,450,120,25);
		desc.setForeground(Color.WHITE);
		contenedor.add(desc);

		JTextField desc_txt = new JTextField("5");
		desc_txt.setBounds(140,450,50,25);
		contenedor.add(desc_txt);

		JCheckBox check = new JCheckBox();
		check.setBounds(200,450,20,25);
		check.setOpaque(false);
		contenedor.add(check);

		JLabel val_desc = new JLabel("Valor descontado: 330.00");
		val_desc.setBounds(240,450,200,25);
		val_desc.setForeground(Color.WHITE);
		contenedor.add(val_desc);

		JLabel iva = new JLabel("IVA 19%:");
		iva.setBounds(20,480,100,25);
		iva.setForeground(Color.WHITE);
		contenedor.add(iva);

		JLabel iva_val = new JLabel("1254.00");
		iva_val.setBounds(120,480,100,25);
		iva_val.setForeground(Color.WHITE);
		contenedor.add(iva_val);

		JLabel total = new JLabel("Total Factura:");
		total.setBounds(20,510,120,25);
		total.setForeground(Color.WHITE);
		contenedor.add(total);

		JLabel total_val = new JLabel("7524.00");
		total_val.setBounds(140,510,100,25);
		total_val.setForeground(Color.WHITE);
		contenedor.add(total_val);

		JButton finalizar = new JButton("Finalizar factura");
		finalizar.setBounds(350,500,180,35);
		finalizar.setBackground(new Color(0,180,216));
		finalizar.setForeground(Color.WHITE);
		finalizar.setBorder(null);
		contenedor.add(finalizar);

		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void recovery() {
		JPanel contenedor = new JPanel();
		contenedor.setLayout(null);
		contenedor.setBackground(new Color(20,20,20));
		contenedor.setBounds(0,0,600,600);
		this.add(contenedor);

		JLabel title = new JLabel("Recuperar contraseña");
		title.setBounds(20,10,500,30);
		title.setForeground(new Color(0,180,216));
		title.setFont(new Font("Tahoma", Font.BOLD, 16));
		contenedor.add(title);

	}
	
	public void mario() {
			 JPanel pane = new JPanel() {
		            @Override
		            protected void paintComponent(Graphics g) {
		                super.paintComponent(g);
		                Graphics2D g2d = (Graphics2D) g;
		                
		                g2d.setColor(new Color(180, 230, 255));
		                g2d.fillRect(0, 0, 1200, 600);
		                
		                g2d.setColor(new Color(180, 110, 60));
		                g2d.fillRect(0, 480, 1200, 120);
		                g2d.setColor(Color.BLACK);
		                g2d.setStroke(new BasicStroke(3));
		                g2d.drawLine(0, 480, 1200, 480);
		                
		                g2d.setColor(new Color(40, 140, 0));
		                g2d.fillOval(40, 420, 80, 80);
		                g2d.fillOval(10, 450, 70, 50);
		                g2d.fillOval(70, 450, 70, 50);
		                g2d.setColor(Color.BLACK);
		                g2d.drawArc(40, 420, 80, 80, 45, 140);
		                
		                g2d.setColor(new Color(23, 123, 230));
		                g2d.fillRect(260, 280, 150, 200);
		                g2d.setColor(Color.BLACK);
		                g2d.drawRect(260, 280, 150, 200);
		                
		                g2d.setColor(new Color(255, 190, 180));
		                g2d.fillRect(160, 330, 150, 150);
		                g2d.setColor(Color.BLACK);
		                g2d.drawRect(160, 330, 150, 150);
		                
		                g2d.setColor(Color.BLACK);
		                g2d.fillRect(310, 380, 25, 100);
		                
		                g2d.setColor(new Color(0, 100, 0));
		                g2d.fillRect(550, 330, 150, 150);
		                g2d.setColor(Color.BLACK);
		                g2d.drawRect(550, 330, 150, 150);
		      
		                g2d.setColor(new Color(0, 100, 0));
		                g2d.fillRect(530, 330, 190, 70);
		                g2d.setColor(Color.BLACK);
		                g2d.drawRect(530, 330, 190, 70);
		                
		                g2d.setColor(new Color(255, 165, 0));
		                g2d.fillRect(50, 200, 60, 60);
		                g2d.setColor(Color.BLACK);
		                g2d.drawRect(50, 200, 60, 60);
		                
		                g2d.setColor(new Color(255, 165, 0));
		                g2d.fillRect(200, 90, 58, 60);
		                g2d.setColor(Color.BLACK);
		                g2d.drawRect(198, 90, 60, 60);
		                
		                g2d.setColor(new Color(255, 165, 0));
		                g2d.fillRect(139, 90, 58, 60);
		                g2d.setColor(Color.BLACK);
		                g2d.drawRect(136, 90, 60, 60);
		                
		                g2d.setColor(Color.BLACK);
		                g2d.fillRect(410, 330, 25, 150);
		                
		                g2d.fillOval(525, 300, 200, 50);
		                
		                g2d.setColor(Color.gray);
		                g2d.fillOval(170, 340, 15, 15);
		                g2d.setColor(Color.black);
		                g2d.drawOval(170, 340, 15, 15);    
		                
		                g2d.setColor(Color.gray);
		                g2d.fillOval(283, 340, 15, 15);
		                g2d.setColor(Color.black);
		                g2d.drawOval(283, 340, 15, 15);  
		                
		                g2d.setColor(Color.gray);
		                g2d.fillOval(170, 450, 15, 15);
		                g2d.setColor(Color.black);
		                g2d.drawOval(170, 450, 15, 15); 
		                
		                g2d.setColor(Color.gray);
		                g2d.fillOval(283, 450, 15, 15);
		                g2d.setColor(Color.black);
		                g2d.drawOval(283, 450, 15, 15); 
		                
		                g2d.setColor(Color.gray);
		                g2d.fillOval(270, 290, 15, 15);
		                g2d.setColor(Color.black);
		                g2d.drawOval(270, 290, 15, 15); 
		                
		                g2d.setColor(Color.gray);
		                g2d.fillOval(385, 290, 15, 15);
		                g2d.setColor(Color.black);
		                g2d.drawOval(385, 290, 15, 15); 
		                
		                g2d.setColor(Color.gray);
		                g2d.fillOval(385, 450, 15, 15);
		                g2d.setColor(Color.black);
		                g2d.drawOval(385, 450, 15, 15); 
		                
		                g2d.fillRect(141, 95, 5, 5);
		                
		                g2d.fillRect(187, 95, 5, 5);
		                
		                g2d.fillRect(141, 140, 5, 5);
		                
		                g2d.fillRect(187, 140, 5, 5);
		                
		                g2d.fillRect(204, 95, 5, 5);
		               
		                g2d.fillRect(247, 95, 5, 5);
		                
		                g2d.fillRect(204, 140, 5, 5);
		               
		                g2d.fillRect(247, 140, 5, 5);
		                
		                g2d.fillRect(55, 205, 5, 5);
		                
		                g2d.fillRect(100, 205, 5, 5);
		                
		                g2d.fillRect(55, 250, 5, 5);
		                
		                g2d.fillRect(100, 250, 5, 5);
		                
		                g2d.setColor(new Color(55, 219, 92));
		                g2d.fillRect(900, 280, 250, 200);
		                g2d.setColor(Color.BLACK);
		                g2d.drawRect(900, 280, 250, 200);
		                
		                g2d.setColor(Color.gray);
		                g2d.fillOval(910, 450, 15, 15);
		                g2d.setColor(Color.black);
		                g2d.drawOval(910, 450, 15, 15); 
		                
		                g2d.setColor(Color.gray);
		                g2d.fillOval(910, 290, 15, 15);
		                g2d.setColor(Color.black);
		                g2d.drawOval(910, 290, 15, 15); 
		                
		                g2d.setColor(Color.gray);
		                g2d.fillOval(1125, 290, 15, 15);
		                g2d.setColor(Color.black);
		                g2d.drawOval(1125, 290, 15, 15); 
		                
		                g2d.setColor(Color.gray);
		                g2d.fillOval(1125, 450, 15, 15);
		                g2d.setColor(Color.black);
		                g2d.drawOval(1125, 450, 15, 15); 
		                
		                g2d.setColor(new Color(255, 165, 0));
		                g2d.fillRect(990, 130, 58, 60);
		                g2d.setColor(Color.BLACK);
		                g2d.drawRect(990, 130, 60, 60);
		                
		                g2d.fillRect(995, 135, 5, 5);
		                
		                g2d.fillRect(1040, 135, 5, 5);
		                
		                g2d.fillRect(995, 180, 5, 5);
		                
		                g2d.fillRect(1040, 180, 5, 5);
		                
		                
		              
		                
		               
		            }
		        };
		     pane.setSize(600, 600);
		     pane.setLocation(0, 0);
		     this.add(pane);
	}
	public void alta() {
		JPanel contenedor = new JPanel();
		contenedor.setLayout(null);
		contenedor.setBackground(new Color(20,20,20));
		contenedor.setBounds(0,0,600,600);
		this.add(contenedor);

		JLabel title = new JLabel("Alta de usuario");
		title.setBounds(20,10,500,30);
		title.setForeground(new Color(0,180,216));
		title.setFont(new Font("Tahoma", Font.BOLD, 16));
		contenedor.add(title);
		
		contenedor.repaint();
		contenedor.revalidate();
	}
	public void baja() {
		JPanel contenedor = new JPanel();
		contenedor.setLayout(null);
		contenedor.setBackground(new Color(20,20,20));
		contenedor.setBounds(0,0,600,600);
		this.add(contenedor);

		JLabel title = new JLabel("Baja de usuario");
		title.setBounds(20,10,500,30);
		title.setForeground(new Color(0,180,216));
		title.setFont(new Font("Tahoma", Font.BOLD, 16));
		contenedor.add(title);
		
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void consultar() {
		JPanel contenedor = new JPanel();
		contenedor.setLayout(null);
		contenedor.setBackground(new Color(20,20,20));
		contenedor.setBounds(0,0,600,600);
		this.add(contenedor);

		JLabel title = new JLabel("Consultar usuarios");
		title.setBounds(20,10,500,30);
		title.setForeground(new Color(0,180,216));
		title.setFont(new Font("Tahoma", Font.BOLD, 16));
		contenedor.add(title);
		
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void router(String  target) {
		this.getContentPane().removeAll();
		if (target.equals("login")) {
			this.login();
		}
		if (target.equals("registro")) {
			this.registro();
		}
		if (target.equals("recovery")) {
			this.recovery();
		}
		if (target.equals("alta")) {
			this.alta();
		}
		if (target.equals("baja")) {
			this.baja();
		}
		if (target.equals("consultar")) {
			this.consultar();
		}
		if (target.equals("crearUsuarioA")) {
			this.crearUsuario();
		}
		if (target.equals("accederSistema")) {
			this.accederSistema();
		}
		if (target.equals("olvidarContrasena")) {
			this.olvidarContrasena();
		}
		this.repaint();
		this.revalidate();
	}
	
	public void crearUsuario() {
		JPanel contenedor = new JPanel();
		contenedor.setLayout(null);
		contenedor.setBackground(new Color(20,20,20));
		contenedor.setBounds(0,0,600,600);
		this.add(contenedor);

		JLabel title = new JLabel("¿Cómo crear un usuario?");
		title.setBounds(20,10,500,30);
		title.setForeground(new Color(0,180,216));
		title.setFont(new Font("Tahoma", Font.BOLD, 16));
		contenedor.add(title);
		
		contenedor.repaint();
		contenedor.revalidate();
	}
	public void accederSistema() {
		JPanel contenedor = new JPanel();
		contenedor.setLayout(null);
		contenedor.setBackground(new Color(20,20,20));
		contenedor.setBounds(0,0,600,600);
		this.add(contenedor);

		JLabel title = new JLabel("¿Cómo acceder al sistema?");
		title.setBounds(20,10,500,30);
		title.setForeground(new Color(0,180,216));
		title.setFont(new Font("Tahoma", Font.BOLD, 16));
		contenedor.add(title);
		
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void olvidarContrasena() {
		JPanel contenedor = new JPanel();
		contenedor.setLayout(null);
		contenedor.setBackground(new Color(20,20,20));
		contenedor.setBounds(0,0,600,600);
		this.add(contenedor);

		JLabel title = new JLabel("¿Qué hacer si olvidé mi contraseña?");
		title.setBounds(20,10,500,30);
		title.setForeground(new Color(0,180,216));
		title.setFont(new Font("Tahoma", Font.BOLD, 16));
		contenedor.add(title);
		
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void menu() {
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(40, 40, 40));
		menuBar.setBorder(new LineBorder(new Color(0, 180, 216)));
		menuBar.setOpaque(true);
		
		JMenu archivo = new JMenu("Archivo");
		archivo.setForeground(Color.WHITE);
		
		JMenuItem login = new JMenuItem("Login");
		JMenuItem registro = new JMenuItem("Registro");
		JMenuItem save = new JMenuItem("Guardar");
		JMenuItem newFile = new JMenuItem("Nuevo");
		
		menuBar.add(archivo);
		
		login.addActionListener(e -> {
			this.router("login");
		});
		registro.addActionListener(e -> {
			this.router("registro");
		});
		
		JMenu submenu = new JMenu("Otros");
		archivo.addSeparator();
		
		JMenuItem docs = new JMenuItem("Nuevo");
		submenu.add(docs);
		
		docs = new JMenuItem("otroitem");
		submenu.add(docs);
		archivo.add(submenu);
		
		archivo.add(login);
		archivo.add(registro);
		archivo.add(save);
		archivo.add(newFile);
		archivo.add(submenu);
		
		this.setJMenuBar(menuBar);
		
		JMenu account_menu = new JMenu("Cuenta");
		account_menu.setForeground(Color.WHITE);
		menuBar.add(account_menu);
			
		JMenuItem login_item = new JMenuItem("Acceder");
		login_item.addActionListener(e ->{
			this.router("login");
		});
		JMenuItem registro_item = new JMenuItem("Registro");
		registro_item.addActionListener(e ->{
			this.router("registro");
		});
		JMenuItem recover_item = new JMenuItem("Recuperación de cuenta");
		recover_item.addActionListener(e ->{
			this.router("recovery");
		});
		
		JMenu usuarios_menu = new JMenu("usuarios");
		usuarios_menu.setForeground(Color.WHITE);
		menuBar.add(usuarios_menu);
		
		JMenuItem alta_item = new JMenuItem("Alta");
		alta_item.addActionListener(e ->{
			this.router("alta");
		});
		JMenuItem baja_item = new JMenuItem("baja");
		baja_item.addActionListener(e ->{
			this.router("baja");
		});
		JMenuItem consultar_item = new JMenuItem("Consultar");
		consultar_item.addActionListener(e ->{
			this.router("consultar");
		});
		
		JMenu ayuda_menu = new JMenu("Ayuda");
		ayuda_menu.setForeground(Color.WHITE);
		menuBar.add(ayuda_menu);
		
		JMenuItem crear_usuario_item = new JMenuItem("¿Cómo crear un usuario?");
		crear_usuario_item.addActionListener(e ->{
			this.router("crearUsuarioA");
		});
		JMenuItem acceder_Sistema_item = new JMenuItem("¿Cómo acceder al sistema?");
		acceder_Sistema_item.addActionListener(e ->{
			this.router("accederSistema");
		});
		JMenuItem olvidar_contraseña_item = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		olvidar_contraseña_item.addActionListener(e ->{
			this.router("olvidarContrasena");
		});
		
		account_menu.add(login_item);
		account_menu.add(registro_item);
		account_menu.add(recover_item);
		
		usuarios_menu.add(alta_item);
		usuarios_menu.add(baja_item);
		usuarios_menu.add(consultar_item);
		
		ayuda_menu.add(crear_usuario_item);
		ayuda_menu.add(acceder_Sistema_item);
		ayuda_menu.add(olvidar_contraseña_item);

		}
		                
	
	
	
	public static void main(String[] args) {
		new Ventana();
	}
	
	
	}