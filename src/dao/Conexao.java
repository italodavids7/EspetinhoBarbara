/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        Connection con = null;

        try {

            Class.forName(
            "com.mysql.cj.jdbc.Driver");

            String url =
            "jdbc:mysql://localhost:3306/espetinho_barbara";

            String usuario = "root";
            String senha = "S@ntos711";

            con = DriverManager.getConnection(
                    url,
                    usuario,
                    senha
            );

            System.out.println("Conectado!");

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }

        return con;
    }
}
