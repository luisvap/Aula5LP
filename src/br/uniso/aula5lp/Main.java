package br.uniso.aula5lp;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        // carregar o driver jdbc
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // abrir a conexao a partir do Driver Manager
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/linguagemprogramacao",
                    "root", "root");
            Statement s = c.createStatement();
           /* ResultSet rs = s.executeQuery("select * from aluno");

            while(rs.next()){
                System.out.println("Nome do aluno: " + rs.getString("nome"));
            }*/

            s.executeUpdate("insert into aluno(ra,idade,nome,curso) values (246, 45, 'Andre', 'Filosofia')");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

    }
}
