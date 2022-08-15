package test.day0804;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import db.DbConnect;

public class Ex4_MysqlSookje {
	DbConnect db = new DbConnect();

	// 자동차 등록 - 회사명, 자동차명, 색상, 가격 등록
	public void registration(String company, String carname, String carcolor, int carprice) {
		String sql = "insert into companycar (company,carname,carcolor,carprice,carguip) values ('" + company + "','" + carname
				+ "','" + carcolor + "','" + carprice + "',now())";
		System.out.println(sql);
		
		Connection conn = null;
		Statement stmt = null;

		conn = db.getMysqlConnection();

		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(conn, stmt);
		}
	}

	// 전체 조회 - 번호 회사 자동차명 색상 가격(￦3,500) 구입일
	public void reference() {
		String sql = "select * from companycar";
		System.out.println(sql);

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		conn = db.getMysqlConnection();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int num = rs.getInt("num");
				String company = rs.getString("company");
				String carname = rs.getString("carname");
				String carcolor = rs.getString("carcolor");
				String carprice = rs.getString("carprice");
				String carguip = rs.getString("carguip");

				

				System.out.printf("%-5d %-6s %-6s %-6s %-6s %-6s \n", num, company, carname, carcolor, carprice, carguip);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(conn, stmt);
		}
	}

	// 회사별 통계 - 회사명 등록갯수 평균단가
	public void satistic() {
		String sql = "select company, count(*) count, round(avg(carprice),-1) carprice from companycar group by company";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = db.getMysqlConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("회사명\t등록갯수\t평균단가");
			System.out.println("-------------------------------");

			while (rs.next()) {
				String company = rs.getString("company");
				int count = rs.getInt("count");
				int carprice = rs.getInt("carprice");

				System.out.println(company + "\t" + count + "\t" + carprice + "원");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(conn, stmt);
		}

	}

	// 삭제 - 자동차명으로 검색해서 삭제 / 없을 경우 없다 메세지 출력
	public void delete(String carname) {
		String sql = "delete from companycar where carname='"+carname+"'";
		System.out.println(sql);

		Connection conn = null;
		Statement stmt = null;

		conn = db.getMysqlConnection();
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if (n == 0) {
				System.out.println("해당 차량이 없습니다");
			} else {
				System.out.println("삭제되었습니다");
				this.reference();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(conn, stmt);
		}
	}

	// 수정 - 번호,자동차명,색상만 입력 후 자동차명,색상 변경 / 없을 경우 없다 메세지 출력
	public void correction(int num, String carname, String carcolor) {
		String sql = "update companycar set carname='" + carname + "',carcolor='" + carcolor+"' where num="+num;
		System.out.println(sql);

		Connection conn = null;
		Statement stmt = null;

		conn = db.getMysqlConnection();

		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if (n == 0) {
				System.out.println("해당 차량이 없습니다");
			} else {
				System.out.println("수정되었습니다");
				this.reference();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(conn, stmt);
		}

	}

	// 종료
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4_MysqlSookje mj = new Ex4_MysqlSookje(); // 디폴트 생성자 호출
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			System.out.println("1.자동차등록   2.전체 조회   3.회사별 통계    4.삭제    5.수정   6.종료");
			int n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1: {
				System.out.println("1.회사명(현대,기아,쌍용 중 선택)");
				String company = sc.nextLine();
				System.out.println("자동차이름 입력");
				String carname = sc.nextLine();
				System.out.println("자동차 색상 입력");
				String carcolor = sc.nextLine();
				System.out.println("자동차 가격 입력");
				int carprice = Integer.parseInt(sc.nextLine());
				mj.registration(company, carname, carcolor, carprice);
				break;
			}
			case 2: {
				mj.reference();
				break;
			}
			case 3: {
				mj.satistic();
				break;
			}
			case 4: {
				System.out.println("삭제할 자동차 이름을 입력하세요.");
				String carname = sc.nextLine();
				mj.delete(carname);
				break;
			}
			case 5: {
				System.out.println("수정할 자동차번호를 입력하세요");
				int num = Integer.parseInt(sc.nextLine());
				System.out.println("수정할 자동차명을 입력하세요");
				String carname = sc.nextLine();
				System.out.println("수정할 색상을 입력해주세요");
				String carcolor = sc.nextLine();
				mj.correction(num, carname, carcolor);
				break;
			}
			default:
				System.out.println("**종료합니다**");
				System.exit(0);
			}
		}

	}

}
