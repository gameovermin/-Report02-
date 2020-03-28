package gugudan;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;

		int i = 1;

		int j;

		Scanner scan = new Scanner(System.in);

		System.out.println("원하는 단을 입력하세요");

		value = scan.nextInt();


		while (i <= 9) {

			j = value * i;

			System.out.println(value + "*" + i + "=" + j + " 입니다");

			i++;

		}
		
	}

}
