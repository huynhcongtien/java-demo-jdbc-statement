package com.lampartvn.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datasource {

    public static final String CONNECTION = "jdbc:mysql://localhost:3306/demo-jdbc";

    protected static Connection con;

    public static boolean openConnection() {
        try {
            con = DriverManager.getConnection(CONNECTION, "root", "");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
