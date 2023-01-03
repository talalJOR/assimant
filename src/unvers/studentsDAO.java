package unvers;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class studentsDAO extends consql {


	public static void insertdata(students s) {
	
		String query = "insert into students values(?,?);";
		try(Connection conn =getconnection();PreparedStatement prstmt=conn.prepareStatement(query);) {
			

		
			prstmt.setInt(1, s.getStid());
			prstmt.setString(2, s.getStname());

			prstmt.executeUpdate();
			if (conn != null) {
				System.out.println("Student Created successfully.");
			}
			
		} catch (Exception  e   ) {
		System.out.println("Sorry we have error while insert data :");
		}
	}
	public static void updatedata(students s) {
		
		String updatequery = "update  students set name=? where id=?";
		try(Connection conn = getconnection();PreparedStatement prstmt =conn.prepareStatement(updatequery);) {
	
			prstmt.setString(1, s.getStname());
			prstmt.setInt(2,s.getStid());

			prstmt.executeUpdate();
			if (conn != null) {
				System.out.println("connected to data base ");
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
			String query = "select * from students";
			if (conn != null) {
				System.out.println("connected to data base ");
			}
			stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print("id:" + rs.getInt("id"));
				System.out.print("name :" + rs.getString("name"));
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
