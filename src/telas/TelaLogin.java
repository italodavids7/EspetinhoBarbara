/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import javax.swing.*;
import java.awt.event.*;

public class TelaLogin extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtSenha;

    public TelaLogin() {

        setTitle("Login");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblUsuario =
        new JLabel("Usuário:");

        lblUsuario.setBounds(50,50,100,30);
        add(lblUsuario);

        txtUsuario = new JTextField();

        txtUsuario.setBounds(150,50,150,30);
        add(txtUsuario);

        JLabel lblSenha =
        new JLabel("Senha:");

        lblSenha.setBounds(50,100,100,30);
        add(lblSenha);

        txtSenha = new JPasswordField();

        txtSenha.setBounds(150,100,150,30);
        add(txtSenha);

        JButton btnEntrar =
        new JButton("Entrar");

        btnEntrar.setBounds(150,160,100,30);
        add(btnEntrar);

        btnEntrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                TelaMenu menu =
                new TelaMenu();

                menu.setVisible(true);

                dispose();
            }
        });
    }
}
