package org.java.collcetionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.java.dto.BoardDto;
import org.java.dto.BoardEntity;

class B {
	public static void toBoardEntity(String name) {
		System.out.println("BoardDtod -> BoardEntity" + name);
	}
}

public class StreamEx4 {

	public static void main(String[] args) {

		List<String> list2 = new ArrayList<String>();
		list2.add("m1");
		list2.add("m2");
		list2.add("m3");
		list2.add("m4");
		list2.add("m5");
		System.out.println(list2);
		// List -> Stream -> Stream의 모든요소-> (B클래스 toBoardEntity()실행)
		list2.stream().forEach(B::toBoardEntity);
		/*
		 * list2.stream().forEach(e1->{
		 * 
		 * B.toBoardEntity(el); });;
		 */

		System.out.println("Stream");
		// 게시글 5개-> List로 저장
		// Map<> "boards"로 저장

		List<BoardDto> boardList = new ArrayList<BoardDto>();

		boardList.add(new BoardDto(1l, "제목1", "내용1", "작성1", "m1"));
		boardList.add(new BoardDto(2l, "제목2", "내용2", "작성2", "m2"));
		boardList.add(new BoardDto(3l, "제목3", "내용3", "작성3", "m3"));
		boardList.add(new BoardDto(4l, "제목4", "내용4", "작성4", "m4"));
		boardList.add(new BoardDto(5l, "제목5", "내용5", "작성5", "m5"));

		// {"키":"값"} -> JSON -> Ajax, MongoDB
		Map<String, List<BoardDto>> boardMap = new HashMap<String, List<BoardDto>>();
		boardMap.put("boardList", boardList);
		System.out.println(boardMap);

		List<BoardDto> lists = boardMap.get("boardList");

		Stream<BoardDto> stream1 = lists.stream();

//		stream1.forEach(System.out::println);

//		stream1.forEach(dto->{
//			BoardEntity.toBoardEntity(dto);
//		});

		stream1.map(BoardEntity::toBoardEntity).collect(Collectors.toList()).forEach(board -> {
			System.out.println("번호:" + board.getNo() + " ");
			System.out.println("번호:" + board.getTilte() + " ");
			System.out.println("번호:" + board.getCotent() + " ");
			System.out.println("번호:" + board.getWriter() + " ");
			System.out.println("번호:" + board.getNickName() + " ");
		});

		System.out.println();
		/*
		 * stream1.filter(el->el.getNo()>=2 ) //필터링 .collect(Collectors.toList())
		 * //Stream-> List .forEach(el->{ System.out.println("번호:"+el.getNo()+" ");
		 * System.out.println("번호:"+el.getTitle()+" ");
		 * System.out.println("번호:"+el.getCotent()+" ");
		 * System.out.println("번호:"+el.getWriter()+" ");
		 * System.out.println("번호:"+el.getNickName()+" "); });
		 */

//		List<BoardDto> toList = stream1.filter(el -> el.getNo() >= 2).collect(Collectors.toList());
		// Iterator

		// String stream ->원본이 손상 입지 않고 새로운 Stream객체로 사용(한번만 사용)
		System.out.println("Iterator");

		Iterator<BoardDto> iter = boardList.iterator();

		while (iter.hasNext()) {
			BoardDto board = iter.next();
			System.out.println("번호:" + board.getNo() + " ");
			System.out.println("번호:" + board.getTitle() + " ");
			System.out.println("번호:" + board.getCotent() + " ");
			System.out.println("번호:" + board.getWriter() + " ");
			System.out.println("번호:" + board.getNickName() + " ");
		}
		System.out.println("for Each()");

		boardList.forEach(board -> {
			System.out.println("번호:" + board.getNo() + " ");
			System.out.println("번호:" + board.getTitle() + " ");
			System.out.println("번호:" + board.getCotent() + " ");
			System.out.println("번호:" + board.getWriter() + " ");
			System.out.println("번호:" + board.getNickName() + " ");
		});

	}
}
