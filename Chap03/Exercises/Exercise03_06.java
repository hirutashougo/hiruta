package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_06
 * 概要:読み込んだ整数値が10の倍数であるかを判定して表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_06 {
	
	/*
	 *関数名:main
	 *概要:読み込んだ整数値が10の倍数であるかを判定して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner stadardInput = new Scanner(System.in);
		
		//整数値の入力および読み込み
		System.out.print("整数値:"); int integralNumber = stadardInput.nextInt();
		
		//入力された整数が0よりも大きい場合
		if ( integralNumber > 0 ) {
			
			//入力された整数が上記の条件であり、なおかつ10の倍数である場合
			if ( integralNumber % 10 == 0 ) {
				//入力された整数が10で割り切れることを伝える。
				System.out.println("その値は10で割り切れます。");
			}
			
			//入力された整数が上記の条件であり、なおかつ10の倍数でない場合
			else {
				//入力された整数が10で割り切れないことを伝える。
				System.out.println("その値は10で割り切れません。");
			}
			
		}
		
		//入力された整数が0よりも小さい場合
		else {
			//入力された整数が正ではないことを伝える
			System.out.println("正ではない値が入力されました。");
		}
	}

}
