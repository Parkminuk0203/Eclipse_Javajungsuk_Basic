import java.util.*;
public class CH4_221109_3 {

	public static void main(String[] args) {
//	�ֻ����� 100�� ������ ������ ���� 20���� ����Ͽ���
		Random rnd = new Random();
		int[] arr = new int[100];
		int[] freq = new int[7];
		int i;
		
		for(i=0; i<100; i++) { // ���� ���� 100��
			arr[i] = rnd.nextInt(6)+1;
		}
		System.out.println("#### �ֻ��� 100�� ���� ��� ####");
		for(i=0; i<7; i++)
			freq[i] = 0;
		for(i=0; i<100; i++)
			freq[arr[i]]++;
		for(i=1; i<7; i++) {
			System.out.println(i+" : " + freq[i] + "��");
		}
	} // end of main

} // end of class