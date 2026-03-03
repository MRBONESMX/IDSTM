package calculadora;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calcu extends JFrame {
	public Calcu() {
		this.setSize(600, 650);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(700,700));
		this.setTitle("calculadora");
		this.setBackground(Color.BLACK);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.userScreen();
		this.getContentPane().setBackground(Color.BLACK);
		
		this.setVisible(true);
	}
	public void userScreen() {
		JPanel calculadoraScreen = new JPanel();
		calculadoraScreen.setBounds(0,0,600,650);
		calculadoraScreen.setOpaque(true);
		calculadoraScreen.setLayout(null);
		calculadoraScreen.setBackground(Color.BLACK);
		this.add(calculadoraScreen);
		
		JPanel center_panel = new JPanel(); 
		center_panel.setBounds(30,150, 380,450);
		center_panel.setLayout(new GridLayout(4,4));
		calculadoraScreen.add(center_panel);
		
		
		JLabel resultado = new JLabel(" 0");
		resultado.setBounds(30,30,510,100);
		resultado.setOpaque(true);
		resultado.setBackground(Color.BLACK);
		resultado.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		resultado.setFont(new Font("Arial", Font.BOLD, 35));
		resultado.setForeground(Color.WHITE);
		calculadoraScreen.add(resultado);
		
		JButton boton1 = new JButton("7");
		boton1.setSize(120,100);
		boton1.setOpaque(true);
		boton1.setFont(new Font("Arial", Font.BOLD, 22));
		boton1.setHorizontalAlignment(JLabel.CENTER);
		boton1.setForeground(Color.WHITE);
		boton1.setBackground(Color.BLACK);
		boton1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(boton1);
		
		JButton boton8 = new JButton("8");
		boton8.setSize(120,100);
		boton8.setFont(new Font("Arial", Font.BOLD, 22));
		boton8.setForeground(Color.WHITE);
		boton8.setBackground(Color.BLACK);
		boton8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(boton8);

		JButton boton9 = new JButton("9");
		boton9.setSize(120,100);
		boton9.setFont(new Font("Arial", Font.BOLD, 22));
		boton9.setForeground(Color.WHITE);
		boton9.setBackground(Color.BLACK);
		boton9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(boton9);

		JButton boton4 = new JButton("4");
		boton4.setSize(120,100);
		boton4.setFont(new Font("Arial", Font.BOLD, 22));
		boton4.setForeground(Color.WHITE);
		boton4.setBackground(Color.BLACK);
		boton4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(boton4);

		JButton boton5 = new JButton("5");
		boton5.setSize(120,100);
		boton5.setFont(new Font("Arial", Font.BOLD, 22));
		boton5.setForeground(Color.WHITE);
		boton5.setBackground(Color.BLACK);
		boton5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(boton5);

		JButton boton6 = new JButton("6");
		boton6.setSize(120,100);
		boton6.setFont(new Font("Arial", Font.BOLD, 22));
		boton6.setForeground(Color.WHITE);
		boton6.setBackground(Color.BLACK);
		boton6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(boton6);

		JButton boton1_num = new JButton("1");
		boton1_num.setSize(120,100);
		boton1_num.setFont(new Font("Arial", Font.BOLD, 22));
		boton1_num.setForeground(Color.WHITE);
		boton1_num.setBackground(Color.BLACK);
		boton1_num.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(boton1_num);

		JButton boton2 = new JButton("2");
		boton2.setSize(120,100);
		boton2.setFont(new Font("Arial", Font.BOLD, 22));
		boton2.setForeground(Color.WHITE);
		boton2.setBackground(Color.BLACK);
		boton2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(boton2);

		JButton boton3 = new JButton("3");
		boton3.setSize(120,100);
		boton3.setFont(new Font("Arial", Font.BOLD, 22));
		boton3.setForeground(Color.WHITE);
		boton3.setBackground(Color.BLACK);
		boton3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(boton3);


		JButton boton0 = new JButton("0");
		boton0.setSize(120,100);
		boton0.setFont(new Font("Arial", Font.BOLD, 22));
		boton0.setForeground(Color.WHITE);
		boton0.setBackground(Color.BLACK);
		boton0.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(boton0);
		
		JButton botonMultiplicacion = new JButton("x");
		botonMultiplicacion.setSize(120,100); 
		botonMultiplicacion.setFont(new Font("Arial", Font.BOLD, 22));
		botonMultiplicacion.setForeground(Color.WHITE);
		botonMultiplicacion.setBackground(Color.ORANGE);
		botonMultiplicacion.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(botonMultiplicacion);
		
		JButton botonDivisión = new JButton("/");
		botonDivisión.setSize(120,100); 
		botonDivisión.setFont(new Font("Arial", Font.BOLD, 22));
		botonDivisión.setForeground(Color.WHITE);
		botonDivisión.setBackground(Color.ORANGE);
		botonDivisión.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		center_panel.add(botonDivisión);
		
		JPanel right_panel = new JPanel(); 
		right_panel.setBounds(410,150, 130,450);
		right_panel.setLayout(new GridLayout(4,1));
		calculadoraScreen.add(right_panel);
		
		JButton botonIgual = new JButton("=");
		botonIgual.setSize(120,100);
		botonIgual.setFont(new Font("Arial", Font.BOLD, 22));
		botonIgual.setForeground(Color.WHITE);
		botonIgual.setBackground(Color.ORANGE);
		botonIgual.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		right_panel.add(botonIgual);
		
		JButton botonSuma = new JButton("+");
		botonSuma.setSize(120,100);
		botonSuma.setFont(new Font("Arial", Font.BOLD, 22));
		botonSuma.setForeground(Color.WHITE);
		botonSuma.setBackground(Color.ORANGE);
		botonSuma.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		right_panel.add(botonSuma);
		
		JButton botonResta = new JButton("-");
		botonResta.setSize(120,100); 
		botonResta.setFont(new Font("Arial", Font.BOLD, 22));
		botonResta.setForeground(Color.WHITE);
		botonResta.setBackground(Color.ORANGE);
		botonResta.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		right_panel.add(botonResta);
		
		JButton botonBorrar = new JButton("CE");
		botonBorrar.setSize(120,100);
		botonBorrar.setFont(new Font("Arial", Font.BOLD, 22));
		botonBorrar.setForeground(Color.WHITE);
		botonBorrar.setBackground(Color.ORANGE);
		botonBorrar.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		right_panel.add(botonBorrar);
		
		
		
		
		
		
		
		
		calculadoraScreen.repaint();
		calculadoraScreen.revalidate();
	}
	public static void main(String[] args) {
		Calcu pantallazo = new Calcu();
		

	}

}
