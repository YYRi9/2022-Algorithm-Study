package step3;

import java.util.Scanner;

public class Num25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();	// ������ �� �ݾ�
		int N = sc.nextInt();	// ������ ������ ������ ������ ��
		int a, b, sum = 0;
		
		for(int i = 0; i < N; i++) {
			a = sc.nextInt();	// �� ������ ����
			b = sc.nextInt();	// �� ������ ����
			sum += a * b;
		}
		
		if( sum == X) System.out.println("Yes");
		else System.out.println("No");
	}
}