/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import javax.swing.*;

public class TelaEntregas extends JFrame {

    public TelaEntregas() {

        setTitle("Controle de Entregas");
        setSize(500,300);
        setLocationRelativeTo(null);

        String[] colunas = {

            "Pedido",
            "Cliente",
            "Entregador",
            "Status"

        };

        Object[][] dados = {

            {"1","Italo","Carlos","A caminho"},
            {"2","João","Pedro","Entregue"}

        };

        JTable tabela =
        new JTable(dados,colunas);

        JScrollPane scroll =
        new JScrollPane(tabela);

        add(scroll);
    }
}
