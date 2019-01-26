package chap02;

public class Greeter {

	//필드
	private String format;

	//메서드
	public String greet(String guest) {
		//String을 파라미터로 받는다.
		return String.format(format,  guest);
		// String 클래스의 .format 메서드에 파라미터를 넣어서 리턴한다.
	}
	
	public void setFormat(String format) {
		this.format = format;
		
	}

}
