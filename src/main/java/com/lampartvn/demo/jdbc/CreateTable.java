package com.lampartvn.demo.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable extends Datasource {

    public static void main(String[] args) throws SQLException {
        openConnection();

        Statement stmt = con.createStatement();

        String sqlDropTable = "DROP TABLE IF EXISTS `user_info`";
        String sqlCreateTable = "" +
                " CREATE TABLE user_info (" +
                "   id INT(11) UNSIGNED NOT NULL AUTO_INCREMENT," +
                "   name VARCHAR(45) NULL DEFAULT NULL," +
                "   address VARCHAR(255) NULL DEFAULT NULL," +
                "   PRIMARY KEY (id)" +
                " )";

        stmt.execute(sqlDropTable);
        stmt.execute(sqlCreateTable);
        con.close();
        System.out.println("Created!");
    }

}
