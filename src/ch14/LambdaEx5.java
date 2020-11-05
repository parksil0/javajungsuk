package ch14;

public class LambdaEx5 {
	public static void main(String[] args) {
		
		
		// 2,7 나눠서 0되는 1000이하의 자연수를 더한다
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			
			if(i % 2 == 0 && i % 7 ==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
