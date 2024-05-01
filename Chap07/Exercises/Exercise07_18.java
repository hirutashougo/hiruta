package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_18
* 概要:配列の指定した要素の削除し、詰めて出力する
* 作成者:S.Hiruta
* 作成日:2024/05/01
*/
public class Exercise07_18 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//配列のインデックス数を調整するための定数1を定義
	static final int ADJUSTMENT_NUMBER = 1;

	/*
	 * 関数名：slideElement
	 * 概要:配列の指定した要素に、ひとつ後の要素の値を代入する
	 * 引数:配列(int型)、削除する要素(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/01
	*/
	static void slideElement(int[] integralArray, int targetElement) {
		//配列の要素に、ひとつ後の値を挿入していく
		if (targetElement < integralArray.length - ADJUSTMENT_NUMBER) {
			//指定要素のひとつ後の要素の値を変数に格納する
			int assignmentVariable = integralArray[targetElement + ADJUSTMENT_NUMBER];
			//指定要素に、変数に格納しておいた値を挿入する
			integralArray[targetElement] = assignmentVariable;
		}
	}

	/*
	 * 関数名：deleteElement
	 * 概要:配列の指定した要素を削除し、詰める
	 * 引数:配列(int型)、削除する要素のインデックス(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/01
	*/
	static void deleteElement(int[] integralArray, int deletingTarget) {
		//値を削除する要素に、1要素ずつ詰める形で後の要素の値を代入して行く
		for (int i = deletingTarget; i < integralArray.length; i++) {
			//配列の要素に、一つ後の要素の値を代入していく
			slideElement(integralArray, i);
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
		//配列の要素数として0以上の整数が入力されるまで繰り返し促す
		while (elementCount <= 0) {
			//0以上の整数で入力するように促す
			System.out.println("0以上の整数で入力してください。");
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

		//削除する要素のインデックスの入力を促す
		System.out.print("削除する要素のインデックス：");
		//入力された値を読み込む
		int deleteTarget = standardInput.nextInt();
		//削除する要素のインデックスとして配列のインデックス数が入力されるまで繰り返し促す
		while (deleteTarget < 0 || deleteTarget >= integralArray.length) {
			//配列のインデックス数で入力するように促す
			System.out.println("配列のインデックス数を入力してください。");
			//再度削除する要素のインデックスを入力を促す
			System.out.print("削除する要素のインデックス：");
			//入力された削除する要素のインデックスを読み込む
			deleteTarget = standardInput.nextInt();
		}

		//配列の指定した要素を削除して詰める処理を行う
		deleteElement(integralArray, deleteTarget);
		//指定要素を削除したことを伝える
		System.out.println("指定要素を削除しました。");
		
		//要素数1を表わす定数を定義
		final int ONE_ELEMENT_COUNT = 1;
		//要素数が1の場合
		if (elementCount == ONE_ELEMENT_COUNT) {
			//削除後は配列に要素は残らないと表示
			System.out.println("削除したため、配列に要素はありません。");
		//削除する配列の要素数が1ではない場合
		} else {
			//削除後の配列の表示を行う
			for (int i = 0; i < elementCount; i++) {
				//配列の各要素を表示していく
				System.out.println("要素{" + i + "] = " + integralArray[i]);
			}
		}
	}
}
