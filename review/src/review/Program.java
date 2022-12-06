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

			// 기본값
			kor1 = 100;
			kor2 = 99;
			kor3 = 98;

			// ------------------성적 콘솔 입력 (read)
			{
				System.out.println("┌────────────────────┐");
				System.out.println("│       성적 입력      │");
				System.out.println("└────────────────────┘");

				System.out.print("kor1 :");
				kor1 = scan.nextInt();
				System.out.print("kor2 :");
				kor2 = scan.nextInt();
				System.out.print("kor3 :");
				kor3 = scan.nextInt();

				scan.nextLine(); // 버퍼에 공백이 남아 버그를 일으키는 경우가 있어서 버퍼 비워주는 역할

			}
			// -------------파일 저장(out,write)
			{
				FileOutputStream fos = new FileOutputStream("res/data.csv");
				// fos 는 'char'단위로밖에 안되므로 PrintStream 응용
				PrintStream out = new PrintStream(fos);
				out.printf("%d,%d,%d\n", kor1, kor2, kor3);

				fos.close();

				System.out.println("작업 완료");

			}
			// ------------파일 출력(read)
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
			{ // -------------------성적 콘솔 출력(read)
				total = kor1 + kor2 + kor3; // 계산된 결과는 출력부분임
				avg = total / 3.0;

				System.out.println("┌────────────────────┐");
				System.out.println("│       성적 출력      │");
				System.out.println("└────────────────────┘");

				System.out.printf("국어1: %3d\n", kor1);
				System.out.printf("국어2: %3d\n", kor2);
				System.out.printf("국어3: %3d\n", kor3);
				System.out.printf("총점: %3d\n", total);
				System.out.printf("평균: %6.2f\n", avg);
				System.out.println("─────────────────────");

			}
		System.out.println("계속 입력하시겠습니까? 1.예 2.종료");
		int ans = scan.nextInt();
		
		if(ans == 2) 
			break;
		}//end of while
		System.out.println("종료되었습니다.");
	}

}
