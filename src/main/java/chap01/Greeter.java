package chap01;

public class Greeter {
	private String format;

	public void setFormat(String format) {   // 님 안녕하세요.
		this.format = format;
	}
	
	public String greet(String guest) {   //홍길동
		return String.format(format, guest);   //  홍길동님 안녕하세요.
	}
	
}
