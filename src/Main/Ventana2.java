package Main;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane; 

public class Ventana2 {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEmail;
	private JTextField txtTelefono;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Ventana2() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("Registro de Usuario");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(520, 380));
		frame.setLocationRelativeTo(null);
		frame.setBackground(new Color(45, 45, 45));
		frame.getContentPane().setLayout(new BorderLayout(10, 10));
		frame.getRootPane().setBorder(new EmptyBorder(10, 10, 10, 10));

		
		JLabel titulo = new JLabel("Registro de Usuario");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setOpaque(true);
		titulo.setBackground(Color.red);
		frame.getContentPane().add(titulo, BorderLayout.NORTH);

		
		JPanel panelIzquierdo = new JPanel(new GridLayout(2, 1, 8, 8));
		panelIzquierdo.setBackground(Color.orange);
		
		JPanel personalPanel = new JPanel(new GridLayout(4, 2, 8, 8));
		personalPanel.setBackground(Color.orange);
		personalPanel.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 12), null));
		
		personalPanel.add(new JLabel("Nombre:"));
		JTextField nombre = new JTextField();
		personalPanel.add(nombre);
		
		personalPanel.add(new JLabel("Apellido:"));
		JTextField apellido = new JTextField();
		personalPanel.add(apellido);
		
		personalPanel.add(new JLabel("Email:"));
		JTextField email = new JTextField();
		personalPanel.add(email);
		
		personalPanel.add(new JLabel("Teléfono:"));
		JTextField telefono = new JTextField();
		personalPanel.add(telefono);
		
		panelIzquierdo.add(personalPanel);

		JPanel accountPanel = new JPanel(new GridLayout(2, 2, 8, 8));
		accountPanel.setBackground(Color.pink);
		accountPanel.setBorder(new TitledBorder(null, "Datos de Cuenta", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 12), null));
		
		accountPanel.add(new JLabel("Usuario:"));
		JTextField usuario = new JTextField();
		accountPanel.add(usuario);
		
		accountPanel.add(new JLabel("Contraseña:"));
		JTextField contrasena = new JPasswordField();
		accountPanel.add(contrasena);
		
		panelIzquierdo.add(accountPanel);

	
		JPanel panelDerecho = new JPanel(new BorderLayout());
		panelDerecho.setBackground(Color.MAGENTA);
		
		JPanel fotoDePerfilPanel = new JPanel();
		fotoDePerfilPanel.setBackground(Color.black);
		frame.getContentPane().add(fotoDePerfilPanel, BorderLayout.EAST);
		
		ImageIcon fotoFurry = new ImageIcon("src/public/fotoFurry2.png");
		JButton fotoPro = new JButton(fotoFurry);
		fotoPro.setBackground(new Color(45, 45, 45));
		fotoPro.setPreferredSize(new Dimension(50, 50));
		fotoPro.setBorder(new LineBorder(new Color(0, 180, 216)));
		panelDerecho.add(fotoPro);
		
		JLabel fotoLabel = new JLabel("Presione para añadir foto de perfil", SwingConstants.CENTER);
		fotoLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelDerecho.add(fotoLabel, BorderLayout.SOUTH);
		

		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelIzquierdo, panelDerecho);
		splitPane.setResizeWeight(0.5); 
		splitPane.setContinuousLayout(true);
		splitPane.setOneTouchExpandable(true);
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);

		JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
		buttonsPanel.setBorder(new EmptyBorder(8, 0, 0, 0));
		buttonsPanel.setBackground(Color.yellow);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBackground(Color.cyan);
		buttonsPanel.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.green);
		buttonsPanel.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.red);
		buttonsPanel.add(btnCancelar);
		
		frame.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
		
		frame.repaint();
		frame.revalidate();
	}
	
	public static void main1(String[] args) {
	Ventana2 miVentana = new Ventana2();
	}
	
	

	
	
}