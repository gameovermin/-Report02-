package gugudan;

import java.util.Scanner;

class LeapNormal2{        // ���ο� Ŭ���� ����
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
public class LeapNormalYear2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in); //Scanner Ŭ������ ��ü ����
	     
		 LeapNormal2 L = new LeapNormal2(); // LeapNormal2Ŭ������ ��ü ����
	     
		 int year = 0; //���� year�� ���� �� �ʱ�ȭ
		 
		 while(true) { //���ѷ���
		 System.out.println("������ �Է��ϼ���.");
		 year=s.nextInt();//year�� �Է� ����
		 if(year==0)      //�Է¹��� year�� ���� 0�̸� ���ѷ��� ����
			 break;
		 L.Leap(year);// L�޼ҵ� ȣ��
		 }
	}

}
