/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import dao.ProdutoDAO;
import javax.swing.*;
import java.awt.event.*;
import model.Produto;

public class TelaProdutos extends JFrame {

    public TelaProdutos() {

        setTitle("Cadastro Produtos");
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

        JLabel lblDescricao =
        new JLabel("Descrição:");

        lblDescricao.setBounds(30,80,100,30);
        add(lblDescricao);

        JTextField txtDescricao =
        new JTextField();

        txtDescricao.setBounds(120,80,200,30);
        add(txtDescricao);

        JLabel lblPreco =
        new JLabel("Preço:");

        lblPreco.setBounds(30,130,100,30);
        add(lblPreco);

        JTextField txtPreco =
        new JTextField();

        txtPreco.setBounds(120,130,200,30);
        add(txtPreco);

        JLabel lblCategoria =
        new JLabel("Categoria:");

        lblCategoria.setBounds(30,180,100,30);
        add(lblCategoria);

        JTextField txtCategoria =
        new JTextField();

        txtCategoria.setBounds(120,180,200,30);
        add(txtCategoria);

        JButton btnSalvar =
        new JButton("Salvar");

        btnSalvar.setBounds(120,250,100,40);
        add(btnSalvar);

        btnSalvar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                Produto produto =
                new Produto();

                produto.setNome(txtNome.getText());
                produto.setDescricao(txtDescricao.getText());

                produto.setPreco(
                Double.parseDouble(
                txtPreco.getText()));

                produto.setCategoria(
                txtCategoria.getText());

                ProdutoDAO dao =
                new ProdutoDAO();

                dao.salvar(produto);

                JOptionPane.showMessageDialog(
                        null,
                        "Produto salvo!");

            }
        });
    }
}
