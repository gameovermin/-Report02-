package gugudan;

import java.util.Scanner;

class LeapNormal{            // 새로운 클래스 선언
    void Leap(int year){  //Leap 메소드 선언 , 변수 year
        if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
            System.out.println("윤년입니다.");
            //4의배수 이면서 100의 배수가 아니거나 400의 배수면 윤년출력
        }
        else {
            System.out.println("평년입니다.");
            //아니면 평년 출력
        }
    }
}

public class LeapNormalYear {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("연도를 입력하세요.");
		 
		 Scanner s = new Scanner(System.in); //Scanner 클래스의 객체 생성
	     
		 LeapNormal L = new LeapNormal(); // LeapNormal클래스의 객체 생성
	     
		 int year = 0; //변수 year의 선언 및 초기화
		 
		 year=s.nextInt();//year에 입력 받음
		 
		 L.Leap(year);// L메소드 호출

	}

}
