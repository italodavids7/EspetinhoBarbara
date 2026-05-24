/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Cliente;

public class ClienteDAO {

    public void salvar(Cliente cliente) {

        String sql =
        "INSERT INTO cliente(nome, telefone, endereco)"
        + " VALUES (?, ?, ?)";

        try {

            Connection con =
            Conexao.conectar();

            PreparedStatement stmt =
            con.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEndereco());

            stmt.execute();

            stmt.close();

            System.out.println("Cliente salvo!");

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}