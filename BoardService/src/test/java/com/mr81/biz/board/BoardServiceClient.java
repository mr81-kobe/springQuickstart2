
package com.mr81.biz.board;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.mr81.biz.board.impl.BoardDAO;

public class BoardServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BoardVO vo = new BoardVO(); 
			vo.setSeq(0);
			vo.setContent("Ű���� ���峪����"); 
			vo.setTitle("���� �־�����");
			vo.setWriter("Ȳ����");
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("aplicationContext.xml");
		BoardService service= (BoardService) context.getBean("boardServiceImpl");
				//boardDAO.updateBoard(vo);
				service.insertBoard(vo);  
				vo.setSeq(2);
				BoardVO board = new BoardVO();  
				
				
			
				System.out.println(	service.getBoard(vo).toString());
	BoardService service2=(BoardService) context.getBean("boardServiceImpl"); 
	System.out.println(service2.getBoard(vo).toString());
	
	}

}
