package Chap06.Lists;

//乱数生成パッケージの読み込み
import java.util.Random;
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:List06_11
 * 概要:配列の要素の順序を逆順に並べ替えて表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/17
 */
public class List06_11 {

	/*
	 * 関数名：main
	 * 概要:配列の要素の順序を逆順に並べ替えて表示 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/17
	*/
	public static void main(String[] arg) {
		//Randomクラスの変数の定義
		Random randomNumber = new Random();
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//要素数の入力を促す
		System.out.print("要素数：");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();
		//入力された要素数の配列を宣言
		int[] numberArray = new int[elementCount];
		
		//生成する乱数の範囲を表す定数の定義
		final int RANDOM_RANGE = 90;
		//生成する乱数の範囲を調節する定数の定義
		final int ADJUSTMENT_NUMBER = 10;
		
		//配列の各要素に乱数を代入していく
		for (int i = 0; i < elementCount; i++) {
		//10～99の範囲に調整して乱数を生成し、各要素に代入
			numberArray[i] = ADJUSTMENT_NUMBER + randomNumber.nextInt(RANDOM_RANGE);
		//各要素に代入された値を表示
			System.out.println("a[" + i + "] = " + numberArray[i]);
		}
		
		//配列のインデックスの調整のための定数の定義
		final int INDEX_ADJUSTMENT = 1;
		
		//配列の要素の順序を逆順に並べ替えていく
		for (int i = 0; i < elementCount / 2; i++) {
		//代入用の変数に並べ替える前の要素の値を代入
			int assigmentValuable = numberArray[i];
		//並べ替える前の要素に並べ替えた後の要素の値を代入
			numberArray[i] = numberArray[elementCount - i - INDEX_ADJUSTMENT];
		//並べ替えた後の要素に代入用の変数の値を代入
			numberArray[elementCount - i - INDEX_ADJUSTMENT] = assigmentValuable;
		}
		
		//要素の並びを逆転したことを伝える
		System.out.println("要素の並びを逆転しました。");
		//順序が逆転した各要素の値を表示していく
		for (int i = 0; i < elementCount; i++) {
		//各要素の値を表示
			System.out.println("a[" + i + "] = " + numberArray[i]);
		}
	}
}
















