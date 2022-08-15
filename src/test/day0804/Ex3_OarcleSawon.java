package test.day0804;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DbConnect;

// sawon 테이블에서 부서별 인원수와 평균 급여 출력하기
public class Ex3_OarcleSawon {
DbConnect db = new DbConnect();
	
	public void list() {
		String sql = "select buseo,count(*) count, round(avg(pay),0) pay from sawon group by buseo";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		//오라클 연결
		conn = db.getOracleConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("부서명\t인원수\t평균급여");
			System.out.println("-------------------------");
			
			while(rs.next()) {
				String buseo = rs.getString("buseo");
				int count = rs.getInt("count");
				int pay = rs.getInt("pay");
				
				System.out.println(buseo+"\t"+count+"명\t"+pay+"원");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(conn, stmt, rs);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_OarcleSawon ex = new Ex3_OarcleSawon();
		ex.list();
	}

}
