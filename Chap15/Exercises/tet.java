package Chap15.Exercises;

public class tet {
	
	    public static void main(String[] args) {
	        
	    	args[0] = "";
	    	args[1] = "";
	    	
	    	//
			int[] calenderFaactor = new int[2];
			//カレンダー表示のための年数を変数に格納
			calenderFaactor[0] = Integer.parseInt(args[0]);
			//カレンダー表示のための月数を変数に格納
			calenderFaactor[1] = Integer.parseInt(args[1]);
			
			System.out.println(calenderFaactor[0]);
			System.out.println(calenderFaactor[1]);
	}

}
