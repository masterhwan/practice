package com.repaet.repeatcycle3;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class ConnectTest {
	private static final String DRIVER = "org.mariadb.jdbc.Driver";

	private static final String URL = "jdbc:mariadb://127.0.0.1:3306/testdb";
	private static final String USER = "dev";
	private static final String PASSWORD = "test";

	@Test

	public void testConnection() throws Exception {

		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

			System.out.println(con);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
