/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import javax.swing.*;

public class TelaPedidos extends JFrame {

    public TelaPedidos() {

        setTitle("Pedidos");
        setSize(500,300);
        setLocationRelativeTo(null);

        String[] colunas = {
            "Pedido",
            "Cliente",
            "Status",
            "Valor"
        };

        Object[][] dados = {

            {"1","Italo","Preparando","24.00"},
            {"2","João","Entrega","18.00"}

        };

        JTable tabela =
        new JTable(dados,colunas);

        JScrollPane scroll =
        new JScrollPane(tabela);

        add(scroll);
    }
}