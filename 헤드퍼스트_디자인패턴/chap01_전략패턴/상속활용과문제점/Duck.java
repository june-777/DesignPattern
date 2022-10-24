package 상속활용과문제점;

public class Duck {
	public void quack() {
		System.out.println("오리 꽥꽥");
	}
	public void swim() {
		System.out.println("오리 수영~");
	}
	public void display() {
		System.out.println("오리 종류: Duck");
	}
	//1차 추가요구사항: 모든 오리들에 대해 "날기"역할 추가
	//-> 슈퍼클래스에 fly() 메소드만 추가하여 해결
	public void fly() {
		System.out.println("오리 날다~");
	}
}
