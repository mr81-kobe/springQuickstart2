
package com.mr81.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.mr81.biz.board.BoardVO;

@Repository("boardDAO")
public class BoardDAO {

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	public BoardDAO() {
		// TODO Auto-generated constructor stub
	}

	private final String BOARD_INSERT = "insert into board(seq,title,writer,content) values ((select nvl(max(seq),0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=?, where seq=?";
	private final String BOARD_DELETE = "delete board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";

	// insert
	public void insertBoard(BoardVO vo) {
		
		
		if(vo.getSeq()==0){
			throw new IllegalArgumentException();
		}
		System.out.println("==> spring jdbc로 insertBOard() 기능 처리");

		try {
			conn = JDBCunit.getConnection();
			stmt = conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCunit.close(stmt, conn);
		}
	}

	// update
	public void updateBoard(BoardVO vo) {

		System.out.println("==> spring jdbc로 updateBoard() 기능 처리");

		try {
			conn = JDBCunit.getConnection();
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());

			stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCunit.close(stmt, conn);
		}
	}

	// delete
	public void deleteBoard(BoardVO vo) {

		System.out.println("==> spring jdbc로 deleteBOard() 기능 처리");

		try {
			conn = JDBCunit.getConnection();
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCunit.close(stmt, conn);
		}
	}

	// finddetail
	public BoardVO getBoard(BoardVO vo) {

		conn = JDBCunit.getConnection();
		BoardVO vo1 =new BoardVO();
		try {
			stmt = conn.prepareStatement(BOARD_GET);
			stmt.setInt(1, vo.getSeq());
			rs = stmt.executeQuery();
			if (rs.next()) {
			  
				vo1.setSeq(rs.getInt("SEQ"));
				vo1.setTitle(rs.getString("TITLE"));
				vo1.setWriter(rs.getString("WRITER"));
				vo1.setContent(rs.getString("CONTENT"));
				vo1.setRegdate(rs.getDate("REGDATE"));
				vo1.setCnt(rs.getInt("CNT"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo1;

	}
	
	//findall
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===>jdbc로 getBOardList 진행중");

		List<BoardVO> boardList = new ArrayList<BoardVO>();

		try {
			conn = JDBCunit.getConnection();
			stmt = conn.prepareStatement(BOARD_UPDATE);
			rs = stmt.executeQuery();
			while (rs.next()) {

				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegdate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				boardList.add(board);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCunit.close(stmt, conn, rs);
		}
		return boardList;
	}
}
