/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Produto;

public class ProdutoDAO {

    public void salvar(Produto produto) {

        String sql =
        "INSERT INTO produto(nome, descricao, preco, categoria)"
        + " VALUES (?, ?, ?, ?)";

        try {

            Connection con =
            Conexao.conectar();

            PreparedStatement stmt =
            con.prepareStatement(sql);

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPreco());
            stmt.setString(4, produto.getCategoria());

            stmt.execute();
            stmt.close();

            System.out.println("Produto salvo!");

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}