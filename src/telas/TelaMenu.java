/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import javax.swing.*;
import java.awt.event.*;

public class TelaMenu extends JFrame {

    public TelaMenu() {

        setTitle("Menu Principal");
        setSize(500,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // BOTÃO PRODUTOS
        JButton btnProdutos =
        new JButton("Produtos");

        btnProdutos.setBounds(150,50,180,40);
        add(btnProdutos);

        // BOTÃO PEDIDOS
        JButton btnPedidos =
        new JButton("Pedidos");

        btnPedidos.setBounds(150,120,180,40);
        add(btnPedidos);

        // BOTÃO CLIENTES
        JButton btnClientes =
        new JButton("Clientes");

        btnClientes.setBounds(150,190,180,40);
        add(btnClientes);

        // BOTÃO ENTREGAS
        JButton btnEntregas =
        new JButton("Entregas");

        btnEntregas.setBounds(150,260,180,40);
        add(btnEntregas);

        // BOTÃO SAIR
        JButton btnSair =
        new JButton("Sair");

        btnSair.setBounds(150,330,180,40);
        add(btnSair);

        // AÇÃO PRODUTOS
        btnProdutos.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                TelaProdutos tela =
                new TelaProdutos();

                tela.setVisible(true);

            }
        });

        // AÇÃO PEDIDOS
        btnPedidos.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                TelaPedidos tela =
                new TelaPedidos();

                tela.setVisible(true);

            }
        });

        // AÇÃO CLIENTES
        btnClientes.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                TelaClientes tela =
                new TelaClientes();

                tela.setVisible(true);

            }
        });

        // AÇÃO ENTREGAS
        btnEntregas.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                TelaEntregas tela =
                new TelaEntregas();

                tela.setVisible(true);

            }
        });

        // AÇÃO SAIR
        btnSair.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }
        });
    }
}