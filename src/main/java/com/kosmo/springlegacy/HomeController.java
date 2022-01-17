package com.kosmo.springlegacy;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	/*
		컨트롤러 만드는 순서
		1. 요청명을 먼저 생성한다.
		2. 요청명을 통해 컨트롤러를 찾아 매핑된 메소드를 호출한다.
		   컨트롤러에서는 매핑명을 통해 메소드를 호출하므로
		   메소드명은 중복되지 않는 정도의 이름을 사용하면 된다.
		   일반적으로 동일하게 씀.
		   
		 - 매핑시에는 @RequestMapping 어노테이션을 사용한다.
	 */
	// 첫번째 컨트롤러 매핑
	@RequestMapping("/home/helloSpring")
	public String helloSpring(Model model) {
		/*
			3. 요청을 처리한다.
			   Spring에서는 4가지 영역과 비슷한 Model객체를 사용해서 속성을 저장한다.
			   사용법은 거의 동일하다.
		*/
		String firstMessage = "My First Spring MVC 컨트롤러";
		model.addAttribute("firstMessage", firstMessage);
		
		/*
			4. 뷰의 이름을 반환한다.
			   서블릿에서의 forward와 비슷한 개념이다.
			   해당 뷰의 이름을 ViewResolver가 조립해서 최종적으로 뷰를 웹브라우저에 출력한다.
			   뷰의 기본 경로는 /webapp/WEB_INF/views 하위이다.
		*/
		return "HelloSpring";
	}
	
	
	
	
}
