package Chap02.Exercises;
//Scannerライブラリの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise02_03
 * 概要:読み込んだ整数値を反復して表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/01
 */
public class Exercise02_03 {
	
	/*
	 *関数名:main
	 *概要:読み込んだ整数値を反復して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/01
	 */
	    static void main(String[] args) {
	    	//Scannerクラスの変数を宣言
	    	Scanner standardInput = new Scanner(System.in);
	    	
	    	//整数値の入力を促す
	    	System.out.print("整数値:");
	    	//入力された整数を読み込む
	    	int integralNumber = standardInput.nextInt();
	    	
	    	//整数値を表示
	    	System.out.println( integralNumber + "と入力しましたね");  
	    	
	    }

}
