package board;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pageCount = 5;
		int curr = 10;
		int start = curr - (pageCount / 2);
		int end = curr - (pageCount / 2);
		
		if(start < 1) {
			start = 1;
		}
		
		if(end > 10) {
			end = 10;
		}
		
		for(int i = start ;i <= end + 2;i++) {
			if(i == curr) {
			System.out.print("[" + i + "]");	
		} else {
			System.out.print(i +" ");
		}
	  }
   }
}
