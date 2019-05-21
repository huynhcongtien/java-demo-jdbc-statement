package com.lampartvn.demo.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertRow extends Datasource {

    public static void main(String[] args) throws SQLException {
        openConnection();

        Statement  stmt = con.createStatement();
        String     sql1 = "INSERT INTO user_info (name, address) VALUES ('Harry', 'England');";
        String     sql2 = "INSERT INTO user_info (name, address) VALUES ('Batman', 'USA');";
        stmt.executeUpdate(sql1);
        stmt.executeUpdate(sql2);
        con.close();
        System.out.println("Inserted!");
    }

}
