// package Step10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 1, i = 666;	// 666���� ���� ���� �� �ʿ� �����Ƿ� 666���� �����Ѵ�.
		
		while(count < N) {		// count�� N���� �۴ٸ� �ݺ�
			i++;				// i�� 1�� �߰��ϸ鼭
			if((i+"").contains("666")) count++;	// ���� 666�� �����Ѵٸ� count�� 1 ������Ų��.
		}
		
		System.out.println(i);	// count�� N�� �������� �ݺ����� �������� i�� ����Ѵ�.
	}
}