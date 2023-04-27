package com.himedia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController는jsp같은 뷰를 별도로 만들지 않는 대신에 컨트롤러 메소드가 리턴한 데이터 자체를 클라이언트에게 전달
@RestController
public class BoardController {


	public BoardController() {
	System.out.println("===>>BoardController생성");
	}
	
	@GetMapping("/hello")
	public String heoll(String name){
		return "Hello" + name;
		
	}
	
}
