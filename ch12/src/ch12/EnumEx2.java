package ch12;

enum Direction {
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^"); //생성자 호출임

	private static final Direction[] DIR_ARR = Direction.values();
	// values() :열거형의 모든 상수를 배열에 담아 반환
	private final int value;
	private final String symbol;

	// 생성자. enum 생성자는 모두 접근제어자가 private라 생략됨
	Direction(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}

	public int getValue() {
		return value;
	}

	public String getSymbol() {
		return symbol;
	}
	
	//Direction of(int dir) : enum Direction의 상수들 중 하나를 얻어오는 메서드
	public static Direction of(int dir) {
		if (dir < 1 || dir > 4) {
			
			throw new IllegalArgumentException("Invalid value :" + dir); // throw : 예외 발생시키기
		}
		return DIR_ARR[dir-1];
	}
	
	//방향을 회전시키는 메서드, num의 값만큼 90도씩 시계방향으로 회전
	public Direction rotate(int num) {
		num = num % 4; //회전값이 1~4까지만인데 5, 100 이런값 넣어줄 수도 있으니까 mod4 이용
		
		if(num < 0)
			num += 4; // num이 음수일 때는 반시계방향으로 회전, 음수 큰 값 넣을수도 있으니가 양수로만들어쥼
		
		return DIR_ARR[(value-1+num) % 4];
	}
	
	@Override
	public String toString() {
		return name() + getSymbol();
	}
}

public class EnumEx2 {

	public static void main(String[] args) {
		for(Direction d : Direction.values()) 
			System.out.printf("%s=%d%n", d.name(), d.getValue());
	
	Direction d1 = Direction.EAST; // 참조변수에 값 저장
	Direction d2 = Direction.of(1); // return DIR_ARR[1-1] 즉 DIR_ARR[0] 값 얻어옴
	//즉 열거형 배열의 INDEX = 0에 해당하는 상수를 반환! EAST겠지
	
	System.out.printf("%s=%d%n",d1.name(),d1.getValue()); //decimal 10진수
	System.out.printf("%s=%d%n",d2.name(),d2.getValue());
	System.out.println(Direction.EAST.rotate(1));
	System.out.println(Direction.EAST.rotate(2));
	System.out.println(Direction.EAST.rotate(-1));
	System.out.println(Direction.EAST.rotate(-2));
		
	}

}
