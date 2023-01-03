package unvers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class coursesDAO extends consql {

	public static void insertdata(courses s) {
	
		String query = "insert into courses values(?,?,?);";
		try(Connection conn =getconnection();PreparedStatement prstmt=conn.prepareStatement(query);) {
			

		
			prstmt.setInt(1,s.getId() );
			prstmt.setString(2, s.getName());
			prstmt.setDouble(3,s.getPrice() );
			prstmt.executeUpdate();
			if (conn != null) {
		System.out.println("Course Create successfully.");		
			}
			
		} catch (SQLException e) {
    System.out.println("Sorry we have error while insert data :");
		
		}
	}
	public static void updatedata(courses s) {
		
		String updatequery = "update  courses set name=? where id=?";
		try(Connection conn = getconnection();PreparedStatement prstmt =conn.prepareStatement(updatequery);) {
	
			prstmt.setString(1,s.getName() );
			prstmt.setInt(2,s.getId());

			prstmt.executeUpdate();
			if (conn != null) {
			
			}
			
		} catch (SQLException e) {
			System.out.println("not connection");
		

		}
	}
	public static void fatshdata() {
		Connection conn = null;
		Statement stmt = null;

		try {
			conn=getconnection();
			String query = "select * from courses";
			if (conn != null) {
			
			}
			stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print(" id:" + rs.getInt("id"));
				System.out.print(" name :" + rs.getString("name"));
				System.out.print(" price :" + rs.getDouble("price"));
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("not connection");
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}


}

