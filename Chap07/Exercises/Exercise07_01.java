package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_01
* 概要:入力される整数の符号を表示(値に応じて-1,0,1を返却)する
* 作成者:S.Hiruta
* 作成日:2024/04/22
*/
public class Exercise07_01 {
	
	/*
	 * 関数名：sign0f
	 * 概要:int型引数nの値が、負なら-1を、0なら0を、正なら1を返却する
	 * 引数:整数(int型)
	 * 戻り値：-1,0,1(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static int sign0f (int n) {
		
		//引数n(教科書準拠)が負の値の場合
		if (n < 0) {
			//-1を返却する
			return -1;
		//引数n(教科書準拠)が0の場合
		} else if (n == 0) {
			//0を返却する
			return 0;
			
		//引数n(教科書準拠)が正の値の場合
		} else {
			//1を返却する
			return 1;
		}
	}
	

	/*
	 * 関数名：main
	 * 概要:入力される整数の符号を表示(値に応じて-1,0,1を返却)する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//整数値の入力を促す
		System.out.print("整数値を入力：");
		//入力された整数値の読み込み
		int integralNumber =standardInput.nextInt();
		
		//入力された値に応じて-1,0,1を返却する
		System.out.print("返却値は" + sign0f(integralNumber) + "です。");
	}

}
