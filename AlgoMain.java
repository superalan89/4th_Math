
public class AlgoMain {
	public static void main(String[] args) {
		AlgoMath algo = new AlgoMath();
		int[] imsi = algo.getLottoNumbers();
		
		for (int a = 0; a < 6; a++) {
			System.out.println(imsi[a]);
		}
		
	}
	/*
	public long sum(long max) {
		long result = 0;
		//return 1 ~ max 가지 더하는 함수를 작성
		
		
		for (int i=1 ; i<max ; i++) {
			result = result + i;
		}

		// n (n+1) / 2  1~100 
	}
	*/
	
	
	public long sum(long max) {
		return max*(max+1)/2;
	}
	
	// 1~ max까지 홀수를 더하는 프로그램
	
	public long sumOdd(long max) {
		return ((max+1) / 2) * ((max+1) / 2);
	}
	
	/*
	public long sumEven(long max) {
		
		return ((max / 2) * ((max+1) / 2);
	}
	*/
	
}
