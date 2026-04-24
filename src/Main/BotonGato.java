package Main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class BotonGato extends JButton {

    int posicion;
    String estado; // "" = vacío, "X" o "O"

    public BotonGato(int posicion) {
        this.posicion = posicion;
        this.estado = "";

        this.setFont(new Font("Tahoma", Font.BOLD, 40));
        this.setBackground(new Color(45, 45, 45));
        this.setForeground(Color.WHITE);
        this.setBorder(new LineBorder(new Color(0, 180, 216), 2));
        this.setFocusPainted(false);
    }

    public boolean estaVacio() {
        return this.estado.equals("");
    }

    public void marcar(String simbolo) {
        this.estado = simbolo;
        this.setText(simbolo);
        this.setEnabled(false);

        if (simbolo.equals("X")) {
            this.setForeground(new Color(0, 180, 216));
        } else {
            this.setForeground(new Color(216, 80, 80));
        }
    }

    public void reiniciar() {
        this.estado = "";
        this.setText("");
        this.setEnabled(true);
        this.setForeground(Color.WHITE);
    }
}