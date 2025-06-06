package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=mysql");
            System.out.println("Recuperei a conexão");
            connection.clearWarnings();
        }catch (SQLException e) {
            System.out.println(e);
        }
    }
}
