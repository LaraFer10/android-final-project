package com.example.finderapp.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPG {

    private static Connection connection = null;
    private static String USER = "ixzturgxfrnlxb";
    private static String PASSWORD = "0e5363de69acbcc3767af34f69424306b9ce5216f44e92c20aba62ebdfd99ccf";
    private static String URL = "postgres://ixzturgxfrnlxb:0e5363de69acbcc3767af34f69424306b9ce5216f44e92c20aba62ebdfd99ccf@ec2-50-16-241-192.compute-1.amazonaws.com:5432/d2vmpd6abum376";
    public static Connection getConnection(){
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (Exception e){
            //TODO mandar esta mensagem para tela
            e.printStackTrace();
        }
        return connection;
    }
}
