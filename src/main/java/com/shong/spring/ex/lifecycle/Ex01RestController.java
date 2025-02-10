package com.shong.spring.ex.lifecycle;


import org.springframework.http.HttpStatus;

//해당클래스의 모든 메소드는 @ResponseBody 적용됨


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lifecycle/ex01")
@RestController // @controlloer + @ResponseBody
public class Ex01RestController {

	// 직접 만든 클래스의 객체를 리스폰스에 담는다.
	@RequestMapping("/3")
	public Person objectResponse() {

		Person me = new Person("유재석", 50);

		return me;

	}

	// statue code 직접설정
	@RequestMapping("/4")
	public ResponseEntity<Person> entityResponse() {
		Person me = new Person("유재석", 50);
		
		ResponseEntity<Person> entity = new ResponseEntity<>(me,HttpStatus.INTERNAL_SERVER_ERROR);

		return entity;

	}

}
