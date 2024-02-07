package DAO;

import java.sql.SQLException;
import java.sql.Timestamp;

import DTO.reply;

public class reply_dao extends parent_dao{

	public reply_dao() {
		createTable();
	}
	
	//작성글 데이터베이스 저장
		public void insert(reply rp) {
			String sql = "insert into reply(id, board_id, comment, wdate, writer, member_id) values(?,?,?,?,?,?,?)";

			try {
				pt=conn.prepareStatement(sql);
				pt.setInt(1, rp.getBoard_id());
				pt.setInt(2, rp.getComment());
				pt.setString(3, rp.getWriter());
				pt.setInt(4, rp.getMember_id());
				pt.executeUpdate();
				
			}catch(SQLException e) {
				System.out.println("글 저장 실패");
				e.printStackTrace();
			}
		}
		
	private void createTable() {
	    // 테이블 존재 여부
	    String sql = "show tables like 'reply'";
	    try {
	        st = conn.createStatement();
	        rs = st.executeQuery(sql); // ResultSet을 얻기 위해 executeQuery를 사용합니다
	        if (rs.next()) { // 테이블 존재
	            return;
	        }
	    } catch (SQLException e) {
	        System.out.println("reply 테이블 확인 실패");
	        e.printStackTrace();
	    }
	    // 테이블 만들기
	    sql = "create table reply("
	            + "id int auto_increment primary key,"
	            + "board_id int,"
	            + "comment varchar(255),"
	            + "wdate datetime default now(),"
	            + "writer varchar(255),"
	            + "member_id int default 0 )";
	    try {
	        st.executeUpdate(sql);
	    } catch (SQLException e) {
	        System.out.println("reply 테이블 생성 실패");
	        e.printStackTrace();
	    }
	}
}
