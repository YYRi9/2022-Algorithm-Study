// package Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int N;
	static int[] sorted;
	static int[] list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(bfr.readLine());
		sorted = new int[N];
		
		list = new int[N];
		
		for(int i = 0; i < N; i++) 
			list[i] = Integer.parseInt(bfr.readLine());

		merge_sort(0, N-1);
		
		for(int n : list)
			sb.append(n + "\n");
		
		System.out.println(sb);
		
	}
	
	public static void merge(int left, int mid, int right) { // ���ҵ� 2���� �迭�� �պ��ϴ� �޼ҵ�
		int i, l, m;
		
		i = left; l = left; m = mid+1;
		
		while(l <=mid && m <=right) {	// ���� �迭�� ������ �迭�� �� �� ���յ��� ���� ���Ұ� �����ִٸ�
			if(list[l] <= list[m]) 		// ���� ���Ͽ� �� ���� ���Ҹ� sorted�迭�� �ִ´�.
				sorted[i++] = list[l++];
			else 
				sorted[i++] = list[m++];
		}
		
		// �պ��� ������ �����ִ� ���Ұ� �ִٸ� �ϰ��� ��� sorted�迭�� �����Ѵ�.
		if(l > mid) {						// ���� �迭�� ��� ������ ���
			for(int k = m; k <= right; k++) // ������ �迭�� �����ִ� ���Ұ� �ִٸ� ��� sorted�迭�� ����
				sorted[i++] = list[k];
		}
		else {								// ���� �迭�� �����ִ� ���
			for(int k = l; k <= mid; k++)	// ���� �迭�� �����ִ� ���Ҹ� ��� sorted�迭�� ����
				sorted[i++] = list[k];
		}
		
		for(int h = left; h <= right; h++) { // sorted �迭 ���� list�� �ٽ� �����Ѵ�.
			list[h] = sorted[h];
		}
	}
	
	public static void merge_sort(int left, int right) { // �迭�� �����ϴ� �޼ҵ�. left: (������)�迭�� ����, right: �迭�� ��
		int mid;
		if(left < right) {				// �迭�� ���Ұ� 2�� �̻��̸� ����
			mid = (left + right) / 2;
			merge_sort(left, mid);		// ���� �迭�� �����Ѵ�
			merge_sort(mid+1, right);	// ������ �迭�� �����Ѵ�
			merge(left, mid, right);	// �迭 2���� �����Ѵ�
		}
	}
}