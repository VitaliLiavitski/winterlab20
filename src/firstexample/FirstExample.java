package firstexample;

public class FirstExample {

	public static void main(String[] args) {

//		int a = 5;
//		double b = 9.9;
//		double result = 0;
//		
//		result = a + b;

//		int a = 10;
//		int b = 4;
//		int result = 0;
//		result = a % b;
//		result++;

		
//		result = result + 38;
//		result -= 8;

//		if (result > 0) {
//			
//			System.out.println("Positive number!");
//			
//		} else {
//			
//			System.out.println("Negative number!");
//			result *= -1;
//			if(result == 15) {
//				System.out.println("OK!");
//			}
//		}
		
		
//		boolean d = true;
//		
//		if(d) {
//			System.out.println("Boolean!");
//		}
//		
//		int index = 1;
//		do {
//			System.out.println(index + " DO-While!");
//			result --;
//			index++;
//		} while (result > 10);
		
//		while(d) {
//			System.out.println(index + " DO-While!");
//			result --;
//			index++;
//			if(result == 20) {
//				d = false;
//			}
//		}
		
//		for(int i = 0; i < result; i++) {
//			
//			System.out.println(i + " FOR!");
//			result--;
//			if(result >= 20) {
//				System.out.println("===== RESULT");
//			}
//			
//		}
		
		int a = 10;
		int b = 0;
		int result = 1000;

		
//		if ((a == b) & (a == result)) {
//			System.out.println("WOW");
//		} else {
//			System.out.println("false");
//		}
		
		
		
		
//		if ((a != b) || (a == result)) {
//			System.out.println("WOW");
//		} else {
//			System.out.println("false");
//		}
		
		int[] nums = new int[] {1, 3, 5, 6, 6, 9, 0, 999};
		
		for(int i = 0; i < nums.length; i++) {
			
			System.out.println("index= " + i + " value=" + nums[i]);
			
		}
		
		
		
		int[][] nums2 = {{1, 3, 5, 6, 6, 9, 0, 999}, {13, 83, 5, 6, 78, 9, 50, 999}};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.println("indexI= " + i + " indexJ= " + j + " value=" + nums2[i][j]);
			}
			
		}
		
	}

}
