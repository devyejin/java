package ch12;

enum Direction {
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^"); //������ ȣ����

	private static final Direction[] DIR_ARR = Direction.values();
	// values() :�������� ��� ����� �迭�� ��� ��ȯ
	private final int value;
	private final String symbol;

	// ������. enum �����ڴ� ��� ���������ڰ� private�� ������
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
	
	//Direction of(int dir) : enum Direction�� ����� �� �ϳ��� ������ �޼���
	public static Direction of(int dir) {
		if (dir < 1 || dir > 4) {
			
			throw new IllegalArgumentException("Invalid value :" + dir); // throw : ���� �߻���Ű��
		}
		return DIR_ARR[dir-1];
	}
	
	//������ ȸ����Ű�� �޼���, num�� ����ŭ 90���� �ð�������� ȸ��
	public Direction rotate(int num) {
		num = num % 4; //ȸ������ 1~4�������ε� 5, 100 �̷��� �־��� ���� �����ϱ� mod4 �̿�
		
		if(num < 0)
			num += 4; // num�� ������ ���� �ݽð�������� ȸ��, ���� ū �� �������� �����ϰ� ����θ������
		
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
	
	Direction d1 = Direction.EAST; // ���������� �� ����
	Direction d2 = Direction.of(1); // return DIR_ARR[1-1] �� DIR_ARR[0] �� ����
	//�� ������ �迭�� INDEX = 0�� �ش��ϴ� ����� ��ȯ! EAST����
	
	System.out.printf("%s=%d%n",d1.name(),d1.getValue()); //decimal 10����
	System.out.printf("%s=%d%n",d2.name(),d2.getValue());
	System.out.println(Direction.EAST.rotate(1));
	System.out.println(Direction.EAST.rotate(2));
	System.out.println(Direction.EAST.rotate(-1));
	System.out.println(Direction.EAST.rotate(-2));
		
	}

}
