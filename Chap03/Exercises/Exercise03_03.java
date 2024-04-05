package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_03
 * 概要:読み込んだ整数値の符号を判定して表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_03 {
	
	/*
	 *関数名:main
	 *概要:読み込んだ整数の絶対値を表示する
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//整数値の入力
		System.out.print("整数値:");
		
		//入力された整数値の読み込み
		int integralNumber = standardInput.nextInt();
		
		
		//入力された整数が0より大きい場合
		if ( integralNumber > 0 )  {
			
			//入力された整数の符号が正だと伝える
			System.out.println("その値は正です。");
		}
		
		//入力された整数が0より小さい場合
		else if  ( integralNumber < 0 ) {
			
			//入力された整数の符号が負だと伝える
			System.out.println("その値は負です。");
		}
		
		/*入力された整数が0である場合。
		 この部分をelse ifに置き換えても動作に影響なし*/
		else if  ( integralNumber == 0 ) {
			
			//入力された整数が0である事を伝える
			System.out.println("その値は0です。");
		}

	}

}