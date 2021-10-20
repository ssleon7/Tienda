/*package edu.mintic.Tienda1.config;

import java.sql.*;

public class Conexion {
	
	static String bd = "tiendavirtualjh";// "tiendavirtualjh";//"tienda661"; //"BD663";
	static String login = "admin";
	static String password = "admin123";
	static String url = "jdbc:mysql://tiendavirtualjh.czo3ixoe3xoe.us-east-1.rds.amazonaws.com/" + bd;
	Connection connection;
	public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Va a conecta: " + url);
							
            connection = DriverManager.getConnection(url, login, password);
            if (connection != null) {
                System.out.println("Conexión a base de datos " + bd + " OK\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

	public Connection getConnection() {
        return connection;
    }
    public void desconectar() {
        connection = null;
    }
}
*/