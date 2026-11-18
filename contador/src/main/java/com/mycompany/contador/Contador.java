/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contador;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Contador {

    private static int contador = 0;

    public static void main(String[] args) {
        // Criação da janela principal
        JFrame janela = new JFrame("Roteiro 1 - Contador de Cliques");
        janela.setSize(420, 260);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new BorderLayout(10, 15));

        // Texto grande na parte do meio para cima
        JLabel lblTitulo = new JLabel("CONTADOR DE CLIQUES", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 5, 10));
        janela.add(lblTitulo, BorderLayout.NORTH);

        // Painel central com a "telinha" (visor) exibindo os cliques acumulados
        JPanel painelCentro = new JPanel();
        JTextField visorCliques = new JTextField("0", 8);
        visorCliques.setEditable(false);
        visorCliques.setHorizontalAlignment(JTextField.CENTER);
        visorCliques.setFont(new Font("Arial", Font.BOLD, 30));
        visorCliques.setBackground(Color.WHITE);
        visorCliques.setPreferredSize(new Dimension(180, 55));
        painelCentro.add(visorCliques);
        janela.add(painelCentro, BorderLayout.CENTER);

        // Painel inferior com o botão "Clique aqui"
        JPanel painelInferior = new JPanel();
        painelInferior.setBorder(BorderFactory.createEmptyBorder(0, 10, 25, 10));
        JButton btnClique = new JButton("Clique aqui");
        btnClique.setFont(new Font("Arial", Font.BOLD, 14));
        btnClique.setPreferredSize(new Dimension(150, 40));

        // Evento para incrementar e atualizar a telinha a cada clique
        btnClique.addActionListener(e -> {
            contador++;
            visorCliques.setText(String.valueOf(contador));
        });

        painelInferior.add(btnClique);
        janela.add(painelInferior, BorderLayout.SOUTH);

        janela.setVisible(true);
    }
}