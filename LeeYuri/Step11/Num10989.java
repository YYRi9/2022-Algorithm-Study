package Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ī���� ������ ����Ͽ� ������������ �����ϱ�

public class Num10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bfr.readLine());
		int[] list = new int[N];	// ������ ��ҵ��� ������ �迭
		int[] sort = new int[N];	// ���ĵ� ��ҵ��� ������ �迭
		int max = 0;				// �ִ�
		StringBuilder sb = new StringBuilder();
		
		// ��Ҹ� �Է¹޾� list�� �����ϸ鼭 �ִ��� ã�� max�� �����Ѵ�.
		for(int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(bfr.readLine());
			if(list[i] > max) max = list[i];
		}
		
		int[] count = new int[max + 1];	// �ִ� + 1 ũ���� ī���� �迭�� �����. (+1�� �迭�� 0��°�� �����Ͽ� ���ش�.)
		
		for(int n : list)			// list�� �ִ� ���ڵ��� �� �� �ִ��� ī���ù迭�� �����ϵ��� �Ѵ�.
			count[n]++;
		
		for(int i = 1; i < max + 1; i++) 
			count[i] += count[i-1];	// ī���� �迭�� �ִ� ������ ���� ������ �ٲ� ���ĵ� ���ڰ� �� ��°���� �� �� �ֵ��� �Ѵ�.

		/* list[i]��°�� �ִ� ���ڰ� �� ��°���� ī���� �迭���� Ȯ���Ͽ� -1�ϰ�, 
		�� ���� sort�迭�� �ε����� �Ͽ� �� ��ġ�� list[i]��°�� �ִ� ���ڸ� �����Ѵ�. */
		// ī���� �迭���� list[i]��°�� ���� -1���ش�.
		for(int i = 0; i < N; i++) {
			sort[count[list[i]] - 1] = list[i];	
			count[list[i]]--;
		}
			
		for(int n : sort)
			sb.append(n + "\n");
		
		System.out.println(sb);	// ���ĵ� �迭 ���
	}
}