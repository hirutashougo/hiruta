package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_01
 * 概要:読み込んだ整数の絶対値を表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_01 {
	
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
		
		//整数値の入力を促す
		System.out.print("整数値:");
		//入力された整数値を読み込む
		int integralNumber = standardInput.nextInt();
		
		//入力された整数値が0より大きい場合
		if ( integralNumber >= 0 ) {
			//入力された整数値が0以上であると表示
			System.out.println("その絶対値は" + integralNumber + "です。");
		}
		//それ以外の場合(入力された整数値が0より小さい)
		else  {
			//入力された整数値が0より小さいと表示
			System.out.println("その絶対値は" + -integralNumber + "です。");
		}
		
	}
	
}