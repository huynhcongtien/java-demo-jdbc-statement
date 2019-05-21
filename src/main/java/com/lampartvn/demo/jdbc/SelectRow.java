package com.lampartvn.demo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRow extends Datasource {

    public static void main(String[] args) throws SQLException {
        openConnection();

        Statement stmt = con.createStatement();
        String    sql  = "SELECT * FROM user_info;";
        ResultSet rs   = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getInt(1) + "  " +
                    rs.getString(2) + "  " +
                    rs.getString(3));
        }

        con.close();
        System.out.println("Done!");
    }

}
