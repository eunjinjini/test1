package chap01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main03 {

	public static void main(String[] args) {
		//별도의 설정이 없는 경우 스프링 컨테이너가 관리하는 객체 => 싱글턴 형태

		Greeter gt1 = new Greeter();
		Greeter gt2 = new Greeter();
		
		System.out.println("gt1==gt2 : "+(gt1==gt2));
	//----------------------------------------------------------------------------	
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:application.xml");
		
		Greeter gt3 = ctx.getBean("gt",Greeter.class);
		Greeter gt4 = ctx.getBean("gt",Greeter.class);
		
		System.out.println("gt3==gt4 : "+(gt3==gt4));
		
	}

}
