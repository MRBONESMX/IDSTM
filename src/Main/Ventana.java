package Main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
