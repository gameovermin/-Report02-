package gugudan;

import java.util.Scanner;

class LeapNormal{            // ���ο� Ŭ���� ����
    void Leap(int year){  //Leap �޼ҵ� ���� , ���� year
        if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
            System.out.println("�����Դϴ�.");
            //4�ǹ�� �̸鼭 100�� ����� �ƴϰų� 400�� ����� �������
        }
        else {
            System.out.println("����Դϴ�.");
            //�ƴϸ� ��� ���
        }
    }
}

public class LeapNormalYear {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("������ �Է��ϼ���.");
		 
		 Scanner s = new Scanner(System.in); //Scanner Ŭ������ ��ü ����
	     
		 LeapNormal L = new LeapNormal(); // LeapNormalŬ������ ��ü ����
	     
		 int year = 0; //���� year�� ���� �� �ʱ�ȭ
		 
		 year=s.nextInt();//year�� �Է� ����
		 
		 L.Leap(year);// L�޼ҵ� ȣ��

	}

}
