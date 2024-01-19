package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberDAO {
	// Data Access Object : 데이터에 접근하는 것을 도와주는 객체
	public int join(MemberDTO dto) {
		PreparedStatement psmt = null;
		Connection conn = null;
		int row = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
			} else {
				System.out.println("DB연결 실패");
			}

			String sql = "INSERT INTO jdbctest.bigdatamember VALUES (?, ?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setInt(5, dto.getScore());

			row = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null) {
					psmt.close();
				} else if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
}
