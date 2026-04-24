package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TareaGato {

    JPanel contenedor;

    BotonGato[] botones = new BotonGato[9];

    String[][] tablero = new String[3][3];

    String turno_actual = "X";

    int victorias_x = 0;
    int victorias_o = 0;

    JLabel label_victorias_x;
    JLabel label_victorias_o;
    JLabel label_turno;

    public TareaGato(JPanel panel_base) {
        this.contenedor = panel_base;
        this.iniciarTablero();
    }

    public void iniciarTablero() {
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                tablero[fila][col] = "";
            }
        }

        for (int i = 0; i < 9; i++) {
            if (botones[i] != null) {
                botones[i].reiniciar();
            }
        }
    }

    public void construirVista(JPanel panel_padre) {

        JPanel panel_info = new JPanel();
        panel_info.setLayout(null);
        panel_info.setBackground(new Color(20, 20, 20));
        panel_info.setBounds(0, 0, 600, 80);
        panel_padre.add(panel_info);

        label_victorias_x = new JLabel("Jugador X: 0");
        label_victorias_x.setBounds(20, 15, 160, 30);
        label_victorias_x.setFont(new Font("Tahoma", Font.BOLD, 16));
        label_victorias_x.setForeground(new Color(0, 180, 216));
        panel_info.add(label_victorias_x);

        label_victorias_o = new JLabel("Jugador O: 0");
        label_victorias_o.setBounds(420, 15, 160, 30);
        label_victorias_o.setFont(new Font("Tahoma", Font.BOLD, 16));
        label_victorias_o.setForeground(new Color(216, 80, 80));
        panel_info.add(label_victorias_o);

        label_turno = new JLabel("Turno: X");
        label_turno.setBounds(230, 15, 140, 30);
        label_turno.setFont(new Font("Tahoma", Font.BOLD, 16));
        label_turno.setForeground(Color.WHITE);
        label_turno.setHorizontalAlignment(JLabel.CENTER);
        panel_info.add(label_turno);

        JPanel panel_tablero = new JPanel();
        panel_tablero.setLayout(new GridLayout(3, 3));
        panel_tablero.setBackground(new Color(20, 20, 20));
        panel_tablero.setBounds(100, 90, 400, 400);
        panel_padre.add(panel_tablero);

        Font fuente = new Font("Tahoma", Font.BOLD, 40);

        for (int i = 0; i < 9; i++) {
            botones[i] = new BotonGato(i);
            int indice = i; 

            botones[i].addActionListener(e -> {
                manejarClick(indice);
            });

            panel_tablero.add(botones[i]);
        }

        JButton boton_reiniciar = new JButton("Reiniciar");
        boton_reiniciar.setBounds(210, 510, 180, 40);
        boton_reiniciar.setFont(new Font("Tahoma", Font.BOLD, 18));
        boton_reiniciar.setBackground(new Color(45, 45, 45));
        boton_reiniciar.setForeground(Color.WHITE);
        boton_reiniciar.setBorder(new LineBorder(new Color(0, 180, 216)));
        boton_reiniciar.setFocusPainted(false);
        panel_padre.add(boton_reiniciar);

        boton_reiniciar.addActionListener(e -> {
            reiniciarPartida();
        });

        panel_padre.repaint();
        panel_padre.revalidate();
    }

    public void manejarClick(int indice) {
        BotonGato boton = botones[indice];

        if (!boton.estaVacio()) {
            return;
        }

        int fila = indice / 3;
        int col = indice % 3;

        tablero[fila][col] = turno_actual;

        boton.marcar(turno_actual);

        if (hayGanador()) {
            if (turno_actual.equals("X")) {
                victorias_x++;
                label_victorias_x.setText("Jugador X: " + victorias_x);
            } else {
                victorias_o++;
                label_victorias_o.setText("Jugador O: " + victorias_o);
            }

            JOptionPane.showMessageDialog(null, "¡Ganó el jugador " + turno_actual + "!");
            bloquearTodos();
            return;
        }

        if (tableroLleno()) {
            JOptionPane.showMessageDialog(null, "Empate No hay ganador.");
            return;
        }

        if (turno_actual.equals("X")) {
            turno_actual = "O";
        } else {
            turno_actual = "X";
        }

        label_turno.setText("Turno: " + turno_actual);
    }

    public boolean hayGanador() {
        for (int fila = 0; fila < 3; fila++) {
            if (!tablero[fila][0].equals("") &&
                tablero[fila][0].equals(tablero[fila][1]) &&
                tablero[fila][1].equals(tablero[fila][2])) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (!tablero[0][col].equals("") &&
                tablero[0][col].equals(tablero[1][col]) &&
                tablero[1][col].equals(tablero[2][col])) {
                return true;
            }
        }

        if (!tablero[0][0].equals("") &&
            tablero[0][0].equals(tablero[1][1]) &&
            tablero[1][1].equals(tablero[2][2])) {
            return true;
        }

        if (!tablero[0][2].equals("") &&
            tablero[0][2].equals(tablero[1][1]) &&
            tablero[1][1].equals(tablero[2][0])) {
            return true;
        }

        return false;
    }

    public boolean tableroLleno() {
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                if (tablero[fila][col].equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void bloquearTodos() {
        for (int i = 0; i < 9; i++) {
            botones[i].setEnabled(false);
        }
    }

    public void reiniciarPartida() {
        turno_actual = "X";
        label_turno.setText("Turno: X");

        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                tablero[fila][col] = "";
            }
        }

        for (int i = 0; i < 9; i++) {
            botones[i].reiniciar();
        }
    }
}