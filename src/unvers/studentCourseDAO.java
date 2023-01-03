package unvers;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class studentCourseDAO extends consql {


	public static void insertdata(studentCourse s) {
	
		String query = "insert into studentCourse values(?,?);";
		try(Connection conn =getconnection();PreparedStatement prstmt=conn.prepareStatement(query);) {
		
			prstmt.setInt(1, s.getCorid());
			prstmt.setInt(2, s.getStuid());

			prstmt.executeUpdate();
			if (conn != null) {
				System.out.println("Assign student to course successfully.");
			}
			
		} catch (SQLException e) {
		System.out.println("Sorry we have error while insert data :");
		}
	}
	public static void updatedata(studentCourse s) {
		
		String updatequery = "update  studentCourse set stuid=? where corid=?";
		try(Connection conn = getconnection();PreparedStatement prstmt =conn.prepareStatement(updatequery);) {
	
			prstmt.setInt(1, s.getStuid());
			prstmt.setInt(2,s.getCorid());

			prstmt.executeUpdate();
			if (conn != null) {
			
			}
			
			
			
		} catch (SQLException e) {
		
		

		}
	}
	public static void fatshdata() {
		Connection conn = null;
		Statement stmt = null;

		try {
			conn=getconnection();
			String query = "select * from studentCourse";
			if (conn != null) {
				
			}
			stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print("id:" + rs.getInt("stuid"));
				System.out.print("name :" + rs.getString("corid"));
				System.out.println();
			}
		} catch (SQLException e) {
			
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

	public static int manystudincor(int coursid) {
		Connection conn = null;
		Statement stmt = null;
 
		try {
			conn=getconnection();
			String query = "select count(stuid) as count from studentCourse where stuid="+coursid+";";
			if (conn != null) {
			
			}
			stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			
	      return rs.getInt(coursid);
			
		} catch (SQLException e) {
			System.out.println("error while processing your request");
			return 0;
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
	public static int manycorforstu(int stuid) {
		Connection conn = null;
		Statement stmt = null;
 
		try {
			conn=getconnection();
			String query = "select count(corid) as count from studentCourse where corid="+stuid+";";
			if (conn != null) {
			
			}
			stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			
	      return rs.getInt(stuid);
			
		} catch (SQLException e) {
			System.out.println("error while processing your request");
			return 0;
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
