package Chap06.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_13
 * 概要:配列aの全要素をコピーして、配列bに逆順で表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/17
 */
public class Exercise06_13 {

	/*
	 * 関数名：main
	 * 概要:配列aの全要素をコピーして、配列bに逆順で表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/17
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();

		//配列aを宣言する(配列aという呼称は教科書準拠)
		int[] numberArray = new int[elementCount];
		//配列bを宣言する(配列bという呼称は教科書準拠)
		int[] copyArray = new int[elementCount];

		//配列aに値を入力していく
		for (int i = 0; i < elementCount; i++) {
			//配列のインデックスを表示
			System.out.print("a[" + i + "] = ");
			//入力された値を要素に読み込む
			numberArray[i] = standardInput.nextInt();
		}
		
		//配列aへの繰り返し処理に用いる変数を定義
		int inOrder = 0;
		//配列bの繰り返し処理変数の初期値調節のための定数を定義
		final int ADJUSTMENT_NUMBER = 1;
		//配列bへの繰り返し処理に用いる変数を、要素数を初期値として定義
		int reverseOeder = elementCount - ADJUSTMENT_NUMBER;
		
		//配列aの全要素を配列bに逆順にコピーしていく
		for (inOrder = 0; inOrder < elementCount; inOrder++) {
			//配列aの要素を配列bにコピー
			copyArray[reverseOeder] = numberArray[inOrder];
			//配列bの要素は逆順に参照するため、配列bの変数をデクリメント
			reverseOeder--;
		}

		//配列aの全要素を配列bにコピーしたことを表示
		System.out.println("配列aの全要素を配列bに逆順でコピーしました。");

		//配列bを表示
		for (int i = 0; i < elementCount; i++) {
			//要素の値を表示
			System.out.println("b[" + i + "] = " + copyArray[i]);
		}
	}
}
