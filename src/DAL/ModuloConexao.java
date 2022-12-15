/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.*;

/**
 * modelo de conexao ao BANCO DE DADOS: AQUI VC COLOCA: DRIVER CAMINHO NOME,
 * SENHA,
 */
public class ModuloConexao {

    public static Connection conector() {
        java.sql.Connection conexao = null;

        // local de armanezamento do BANCO DE DADOS   
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/pjseguradora";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

        ///   shift + Alt + Letra F = indentar
    }

}
