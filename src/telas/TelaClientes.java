/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import dao.ClienteDAO;
import javax.swing.*;
import java.awt.event.*;
import model.Cliente;

public class TelaClientes extends JFrame {

    public TelaClientes() {

        setTitle("Cadastro Clientes");
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblNome =
        new JLabel("Nome:");

        lblNome.setBounds(30,30,100,30);
        add(lblNome);

        JTextField txtNome =
        new JTextField();

        txtNome.setBounds(120,30,200,30);
        add(txtNome);

        JLabel lblTelefone =
        new JLabel("Telefone:");

        lblTelefone.setBounds(30,80,100,30);
        add(lblTelefone);

        JTextField txtTelefone =
        new JTextField();

        txtTelefone.setBounds(120,80,200,30);
        add(txtTelefone);

        JLabel lblEndereco =
        new JLabel("Endereço:");

        lblEndereco.setBounds(30,130,100,30);
        add(lblEndereco);

        JTextField txtEndereco =
        new JTextField();

        txtEndereco.setBounds(120,130,200,30);
        add(txtEndereco);

        JButton btnSalvar =
        new JButton("Salvar");

        btnSalvar.setBounds(120,220,100,40);
        add(btnSalvar);

        btnSalvar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                Cliente cliente =
                new Cliente();

                cliente.setNome(txtNome.getText());
                cliente.setTelefone(txtTelefone.getText());
                cliente.setEndereco(txtEndereco.getText());

                ClienteDAO dao =
                new ClienteDAO();

                dao.salvar(cliente);

                JOptionPane.showMessageDialog(
                        null,
                        "Cliente salvo!");

            }
        });
    }
}
