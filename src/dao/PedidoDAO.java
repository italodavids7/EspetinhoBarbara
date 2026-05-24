/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Pedido;

public class PedidoDAO {

    public void salvar(Pedido pedido) {

        String sql =
        "INSERT INTO pedido(cliente, status, valor_total)"
        + " VALUES (?, ?, ?)";

        try {

            Connection con =
            Conexao.conectar();

            PreparedStatement stmt =
            con.prepareStatement(sql);

            stmt.setString(1, pedido.getCliente());
            stmt.setString(2, pedido.getStatus());
            stmt.setDouble(3, pedido.getValorTotal());

            stmt.execute();

            stmt.close();

            System.out.println("Pedido salvo!");

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}
