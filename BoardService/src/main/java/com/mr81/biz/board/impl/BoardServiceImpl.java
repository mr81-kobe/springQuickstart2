
package com.mr81.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr81.biz.board.BoardService;
import com.mr81.biz.board.BoardVO;
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO dao ;
	
	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		dao.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		dao.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		dao.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
		return dao.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		// TODO Auto-generated method stub
		return dao.getBoardList(vo);
	}

}

