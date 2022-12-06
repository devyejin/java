package review;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		int kor1, kor2, kor3;
		int total;
		double avg;

		Scanner scan = new Scanner(System.in);

		while (true) {

			// �⺻��
			kor1 = 100;
			kor2 = 99;
			kor3 = 98;

			// ------------------���� �ܼ� �Է� (read)
			{
				System.out.println("��������������������������������������������");
				System.out.println("��       ���� �Է�      ��");
				System.out.println("��������������������������������������������");

				System.out.print("kor1 :");
				kor1 = scan.nextInt();
				System.out.print("kor2 :");
				kor2 = scan.nextInt();
				System.out.print("kor3 :");
				kor3 = scan.nextInt();

				scan.nextLine(); // ���ۿ� ������ ���� ���׸� ����Ű�� ��찡 �־ ���� ����ִ� ����

			}
			// -------------���� ����(out,write)
			{
				FileOutputStream fos = new FileOutputStream("res/data.csv");
				// fos �� 'char'�����ιۿ� �ȵǹǷ� PrintStream ����
				PrintStream out = new PrintStream(fos);
				out.printf("%d,%d,%d\n", kor1, kor2, kor3);

				fos.close();

				System.out.println("�۾� �Ϸ�");

			}
			// ------------���� ���(read)
			{
				FileInputStream fis = new FileInputStream("res/data.csv");
				// 100,50,60
				Scanner readScan = new Scanner(fis);
				String line = readScan.nextLine();
				String[] kors = line.split(",");
				kor1 = Integer.parseInt(kors[0]);
				kor2 = Integer.parseInt(kors[1]);
				kor3 = Integer.parseInt(kors[2]);

				readScan.close();
				fis.close();

			}
			{ // -------------------���� �ܼ� ���(read)
				total = kor1 + kor2 + kor3; // ���� ����� ��ºκ���
				avg = total / 3.0;

				System.out.println("��������������������������������������������");
				System.out.println("��       ���� ���      ��");
				System.out.println("��������������������������������������������");

				System.out.printf("����1: %3d\n", kor1);
				System.out.printf("����2: %3d\n", kor2);
				System.out.printf("����3: %3d\n", kor3);
				System.out.printf("����: %3d\n", total);
				System.out.printf("���: %6.2f\n", avg);
				System.out.println("������������������������������������������");

			}
		System.out.println("��� �Է��Ͻðڽ��ϱ�? 1.�� 2.����");
		int ans = scan.nextInt();
		
		if(ans == 2) 
			break;
		}//end of while
		System.out.println("����Ǿ����ϴ�.");
	}

}
