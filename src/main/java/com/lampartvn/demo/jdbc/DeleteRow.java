package com.lampartvn.demo.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRow extends Datasource {

    public static void main(String[] args) throws SQLException {
        openConnection();

        Statement  stmt = con.createStatement();
        String     sql  = "DELETE FROM user_info WHERE address = 'USA';";
        stmt.executeUpdate(sql);
        con.close();
        System.out.println("Deleted!");
    }

}
