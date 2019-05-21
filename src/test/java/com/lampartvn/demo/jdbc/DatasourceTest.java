package com.lampartvn.demo.jdbc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@RunWith(MockitoJUnitRunner.class)
public class DatasourceTest {

    @InjectMocks
    Datasource        datasource;
    @Mock
    Connection        connection;
    @Mock
    PreparedStatement stmt;
    @Before
    public void setUp() throws SQLException {
//        when(connection.prepareStatement(eq("INSERT INTO artists(name) VALUES(?)"))).thenReturn(stmt);
//        when(stmt.executeUpdate()).thenReturn(1);

    }

    @Test
    public void testInsertTable() {
        assertTrue(datasource.openConnection());

    }

}
