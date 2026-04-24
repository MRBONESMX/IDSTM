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

public class JuegoGato {

    // referencia al panel donde se dibuja el juego
    JPanel contenedor;

    // los 9 botones del tablero
    BotonGato[] botones = new BotonGato[9];

    // matriz lógica 3x3 para validar ganador
    String[][] tablero = new String[3][3];

    // turno actual
    String turno_actual = "X";

    // marcador
    int victorias_x = 0;
    int victorias_o = 0;

    // etiquetas del marcador
    JLabel label_victorias_x;
    JLabel label_victorias_o;
    JLabel label_turno;

    public JuegoGato(JPanel panel_base) {
        this.contenedor = panel_base;
        this.iniciarTablero();
    }

    public void iniciarTablero() {
        // limpiar tablero lógico
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                tablero[fila][col] = "";
            }
        }

        // limpiar botones si ya existían
        for (int i = 0; i < 9; i++) {
            if (botones[i] != null) {
                botones[i].reiniciar();
            }
        }
    }

    // este método construye la vista completa y se llama desde Ventana
    public void construirVista(JPanel panel_padre) {

        // panel superior: marcador y turno
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

        // panel central: tablero 3x3
        JPanel panel_tablero = new JPanel();
        panel_tablero.setLayout(new GridLayout(3, 3));
        panel_tablero.setBackground(new Color(20, 20, 20));
        panel_tablero.setBounds(100, 90, 400, 400);
        panel_padre.add(panel_tablero);

        Font fuente = new Font("Tahoma", Font.BOLD, 40);

        for (int i = 0; i < 9; i++) {
            botones[i] = new BotonGato(i);
            int indice = i; // necesario para usar dentro del lambda

            botones[i].addActionListener(e -> {
                manejarClick(indice);
            });

            panel_tablero.add(botones[i]);
        }

        // botón reiniciar con ícono si existe, si no solo texto
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

        // calcular posición en la matriz
        int fila = indice / 3;
        int col = indice % 3;

        // registrar en el tablero lógico
        tablero[fila][col] = turno_actual;

        // marcar visualmente el botón
        boton.marcar(turno_actual);

        // revisar si hay ganador
        if (hayGanador()) {
            if (turno_actual.equals("X")) {
                victorias_x++;
                label_victorias_x.setText("Jugador X: " + victorias_x);
            } else {
                victorias_o++;
                label_victorias_o.setText("Jugador O: " + victorias_o);
            }

            JOptionPane.showMessageDialog(null, "¡Ganó el jugador " + turno_actual + "! 🎉");
            bloquearTodos();
            return;
        }

        // revisar empate
        if (tableroLleno()) {
            JOptionPane.showMessageDialog(null, "¡Empate! No hay ganador.");
            return;
        }

        // cambiar turno
        if (turno_actual.equals("X")) {
            turno_actual = "O";
        } else {
            turno_actual = "X";
        }

        label_turno.setText("Turno: " + turno_actual);
    }

    public boolean hayGanador() {
        // revisar filas
        for (int fila = 0; fila < 3; fila++) {
            if (!tablero[fila][0].equals("") &&
                tablero[fila][0].equals(tablero[fila][1]) &&
                tablero[fila][1].equals(tablero[fila][2])) {
                return true;
            }
        }

        // revisar columnas
        for (int col = 0; col < 3; col++) {
            if (!tablero[0][col].equals("") &&
                tablero[0][col].equals(tablero[1][col]) &&
                tablero[1][col].equals(tablero[2][col])) {
                return true;
            }
        }

        // diagonal principal
        if (!tablero[0][0].equals("") &&
            tablero[0][0].equals(tablero[1][1]) &&
            tablero[1][1].equals(tablero[2][2])) {
            return true;
        }

        // diagonal secundaria
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