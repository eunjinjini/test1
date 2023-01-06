package chap01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main02 {

	public static void main(String[] args) {
		// 스프링에서의 객체 사용하는 방법
		// 스프링 컨테이너에서 객체를 알아서 만들어 둔다. 
		// 개발자는 만들어진 객체를 꺼내서 사용    => IoC (제어의 역전)

		// 1. 스프링 빈 설정파일을 읽어오세요.  => 설정파일에 작성된 빈(bean) 객체가 생성 
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:application.xml");
		
		// 2. 스프링 컨터이너에서 생성된 객체를 가져오세요.
		Greeter gt = ctx.getBean("gt",Greeter.class);
		
		// 3. 가져온 객체를 사용 
//		gt.setFormat("%s님 안녕하세요");
		String msg = gt.greet("홍길동");
		
		System.out.println(msg); 
		
		
	}

}
