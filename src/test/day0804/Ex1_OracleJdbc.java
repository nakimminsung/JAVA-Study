package test.day0804;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// 드라이버 -> Connection -> Statement,PreparedStatment,CallableStatement ->
// execute(실행) -> select같은 경우는 ResultSet이라는 클래스를 이용해서 데이타를 가져옴 ->
// 모든 작업이 끝난 후 항상 모든 자원은 close

public class Ex1_OracleJdbc {
	static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String ORACLE_URL="jdbc:oracle:thin:@192.168.0.213:1521:xe";

	public Ex1_OracleJdbc() { // 디폴트 생성자
		// TODO Auto-generated constructor stub
		// 위 드라이버는 스트링 형식이라 Class.forName으로 해줘야한다
		try {
			Class.forName(DRIVER);
			System.out.println("오라클 드라이버 클래스 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 클래스 실패"+e.getMessage()); 
			// e.getMessage는 이셉션 메세지를 호출하겠다는 뜻
		} 
	}
	
	//오라클 서버에 연결 후 반환하는 메서드
	public Connection getConnection() {
		Connection conn = null;
		// 반환받는 url,계정,계정비밀번호
		// try,catch로 설정해서 url,계정명,비밀번호 중 틀려서 연결이 안되었을경우 이셉션 메세지 호출
		try {
			conn = DriverManager.getConnection(ORACLE_URL, "angel", "a1234");
			System.out.println("오라클 연결 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클 연결 성공"+e.getMessage());
		} 
		return conn;
	}
	// food 테이블의 데이터를 조회해서 가져오기
	public void foodSelect() {
		// 무조건 java.sql껄로 가져와야한다 데이터
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select foodno,fname,to_char(fprice,'L99,999') fprice from food order by fname asc";
		// 제목
		System.out.println("foodno\tfood\tprice");
		System.out.println("----------------------------");
		
		//오라클 서버에 연결
		conn = this.getConnection(); 
		
		//statement
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); // 무조건 쿼리
			while(rs.next()) { // rs.next()는 다음 레코드로 이동, 데이타가 없으면 false반환
				// index로 가져와보자!
//				int fno = rs.getInt(1);
//				String fname = rs.getString(2);
//				int fprice = rs.getInt(3);
				
				// column name으로 가져와보자!
				int fno = rs.getInt("foodno");
				String fname = rs.getString("fname");
				String fprice = rs.getString("fPrice");
				System.out.println(fno+"\t"+fname+"\t"+fprice);
				
			}
			System.out.println("**조회 끝**");
		} catch (SQLException e) {
			System.out.println("select오류:" + e.getMessage());
		}finally { // 항상 finally를 넣어줘야한다
			try{
				if (rs!=null) rs.close();
				if (stmt!=null) stmt.close();
				if (conn!=null) conn.close();
			}catch(SQLException e) {}
		}
	}
	
	//insert method
	public void insertFood(String fname, int fprice) {
		String sql = "insert into food values (seq1.nextval,' " +fname+ " ', "+fprice+ ")" ;
		System.out.println(sql);
		
		// 변수 선언
		Connection conn = null;
		Statement stmt = null;
		
		//db 연결
		conn = this.getConnection();
		try {
			stmt = conn.createStatement();
			
			//실행
			stmt.execute(sql);
			
			//결과 다시 출력
			System.out.println("** insert 후 전체 다시 출력 **");
			this.foodSelect();
		} catch (SQLException e) {
			System.out.println("insert 오류 : "+ e.getMessage());
		}finally{
			try{
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {}
		}
	}
	
	//delete method
	public void deleteFood(String fname) {
		String sql="delete from food where fname='"+fname+"'";
		System.out.println(sql);
		
		Connection conn = null;
		Statement stmt = null;
		
		conn = this.getConnection();
		
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql); // 삭제된 레코드의 갯수를 반환한다
			if(n == 0)
				System.out.println(fname+"메뉴는 없습니다!");
			else
				System.out.println("총 "+n+"개의 메뉴가 삭제되었습니다");
			
		} catch (SQLException e) {
			System.out.println("delete 오류:"+e.getMessage());
		}finally {
			try {
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			}catch(SQLException e) {};
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_OracleJdbc ex = new Ex1_OracleJdbc(); // 디폴트 생성자 호출
		
		Scanner sc = new Scanner(System.in);
		String num = "";
		while(true) {
			System.out.println("1.추가   2. 전체출력   3.삭제   4.종료");
			num = sc.nextLine();
			switch(num) {
			case "1" : {
				System.out.println("추가할 메뉴명");
				String fname = sc.nextLine();
				System.out.println("가격은?");
				int fprice  = Integer.parseInt(sc.nextLine()); 
				//메서드 호출
				ex.insertFood(fname, fprice);
			}
				break;
			case "2":
				ex.foodSelect();
				break;
			case "3":{
				System.out.println("삭제할 메뉴명을 입력하세요");
				String fname = sc.nextLine();
				// 삭제 메서드 호출
				ex.deleteFood(fname);
			}
				break;
			default:
				System.out.println("** 종료합니다 **");
				System.exit(0);
			}
		}
	}
	
	

}
