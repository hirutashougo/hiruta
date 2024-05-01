package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_19
* 概要:配列の指定した要素から連続するいくつかの要素をの削除し、
		詰めて出力する
* 作成者:S.Hiruta
* 作成日:2024/05/01
*/
public class Exercise07_19 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//配列のインデックス数を調整するための定数1を定義
	static final int ADJUSTMENT_NUMBER = 1;

	/*
	 * 関数名：removeElement
	 * 概要:配列の指定した要素から連続するいくつか要素を削除し、詰める
	 * 引数:配列(int型),削除する要素のインデックス(int型)
	 		連続するインデックス数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/01
	*/
	static void removeElement(int[] integralArray, int elementCount, int consecutiveCout) {
		//配列の要素の値を一時的に格納する変数を宣言
		int assignmentVariable = 0;
		//値を削除する要素の箇所に、それ以降の要素の値を代入していく
		//代入する値が足りない場合は元の要素の値のまま
		for (int i = elementCount; i < integralArray.length - consecutiveCout; i++) {
			//値を削除しない要素の値を一時的に格納
			assignmentVariable = integralArray[i + consecutiveCout];
			//一時的に格納した値を、値を削除する要素に代入
			integralArray[i] = assignmentVariable;
		}
	}

	/*
	* 関数名：main
	* 概要：配列を入力し、指定要素が削除され詰められた配列を表示
	* 引数：なし
	* 戻り値：なし
	* 作成者：S.Hiruta
	* 作成日：2024/05/01
	*/
	public static void main(String[] arg) {

		//要素数の入力を促す
		System.out.print("要素数：");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();
		//配列の要素数として正の整数が入力されるまで繰り返し促す
		while (elementCount <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//再度配列の要素数を入力を促す
			System.out.print("要素数：");
			//入力された配列の要素数を読み込む
			elementCount = standardInput.nextInt();
		}

		//入力された要素数を持つ配列(配列a)を定義
		int[] integralArray = new int[elementCount];

		//各要素の値を入力させる
		for (int i = 0; i < elementCount; i++) {
			//値を入力する要素を表示
			System.out.print("要素[" + i + "]：");
			//入力された要素の値を読み込む
			integralArray[i] = standardInput.nextInt();
		}

		//処理の起点となる要素のインデックスの入力を促す
		System.out.print("処理の起点となる要素のインデックス：");
		//入力された値を読み込む
		int targetElement = standardInput.nextInt();
		//処理の起点となる要素のインデックスとして配列のインデックス数が入力されるまで繰り返し促す
		while (targetElement < 0 || targetElement >= integralArray.length) {
			//配列のインデックス数で入力するように促す
			System.out.println("配列のインデックス数を入力してください。");
			//再度処理の起点となる要素のインデックスを入力を促す
			System.out.print("処理の起点となる要素のインデックス：");
			//入力された処理の起点となる要素のインデックスを読み込む
			targetElement = standardInput.nextInt();
		}

		//連続要素数の入力を促す
		System.out.print("連続して処理する要素数を入力してください。\n連続要素数：");
		//入力された連続要素数を読み込む
		int consecutiveCout = standardInput.nextInt();
		//配列の連続要素数として配列のインデックス数の範囲内で入力されるまで繰り返し促す
		while (consecutiveCout <= 0 || consecutiveCout > integralArray.length - targetElement) {
			//配列のインデックス数の範囲内で入力するように促す
			System.out.println("要素数1～" + (integralArray.length - targetElement) + "で入力してください。");
			//再度配列の連続要素数を入力を促す
			System.out.print("連続要素数：");
			//入力された配列の連続要素数を読み込む
			consecutiveCout = standardInput.nextInt();
		}

		//配列の指定した要素を削除して詰める処理を行う
		removeElement(integralArray, targetElement, consecutiveCout);
		//指定要素を削除したことを伝える
		System.out.println("指定要素を削除しました。");

		//要素数1を表わす定数を定義
		final int ONE_ELEMENT_COUNT = 1;
		//要素数が1の場合
		if (elementCount == ONE_ELEMENT_COUNT) {
			//削除後は配列に要素は残らないと表示
			System.out.println("削除したため、配列に要素はありません。");
		//要素数が1ではない場合
		} else {
			//削除後の配列の表示を行う
			for (int i = 0; i < elementCount; i++) {
				//配列の各要素を表示していく
				System.out.println("要素{" + i + "] = " + integralArray[i]);
			}
		}
	}
}
