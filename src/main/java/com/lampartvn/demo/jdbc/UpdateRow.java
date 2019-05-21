package com.lampartvn.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRow extends Datasource {

    public static void main(String[] args) throws SQLException {
        openConnection();

        Statement  stmt = con.createStatement();
        String     sql  = "UPDATE user_info SET address = 'VietNam' WHERE address = 'England';";
        stmt.executeUpdate(sql);
        con.close();
        System.out.println("Updated!");
    }

}
