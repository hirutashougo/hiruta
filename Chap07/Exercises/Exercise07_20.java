package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_20
* 概要:配列の指定した要素に入力した値を代入し、
		要素の値は1つずつ後ろへスライドした配列を表示
* 作成者:S.Hiruta
* 作成日:2024/05/01
*/
public class Exercise07_20 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//配列のインデックス数を調整するための定数1を定義
	static final int ADJUSTMENT_NUMBER = 1;

	/*
	 * 関数名：assignElementValue
	 * 概要:配列の指定した要素に入力した値を挿入し、要素は1ずつ後ろへスライドさせる
	 * 引数:配列(int型),削除する要素のインデックス(int型)
	 		挿入する値(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/01
	*/
	static void assignElementValue(int[] integralArray, int targetElement, int assigmentValue) {
		//対象となる要素が配列の末尾の要素ではない場合
		if (targetElement < integralArray.length) {
			//配列の要素の値を一時的に格納する変数を宣言
			int assignmentVariable = 0;
			//要素の値は1つずつ後の要素にスライドする
			for (int i = integralArray.length - ADJUSTMENT_NUMBER; i > targetElement; i--) {
				//値を変更した要素の、元の値を一時的に格納
				assignmentVariable = integralArray[i - ADJUSTMENT_NUMBER];
				//一時的に格納した値を、1後ろの要素へ入れる
				integralArray[i] = assignmentVariable;
			}
		}
		//対象となる要素に、入力された値を挿入する
		integralArray[targetElement] = assigmentValue;
	}

	/*
	* 関数名：main
	* 概要：配列の指定した要素に入力した値を挿入し、
			要素の値は1つずつ後ろへスライドした配列を表示
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

		//値を挿入する要素のインデックスの入力を促す
		System.out.print("値を挿入する要素のインデックス：");
		//入力された値を読み込む
		int targetElement = standardInput.nextInt();
		//値を挿入する要素のインデックスとして配列のインデックス数が入力されるまで繰り返し促す
		while (targetElement < 0 || targetElement >= integralArray.length) {
			//配列のインデックス数で入力するように促す
			System.out.println("配列のインデックス数を入力してください。");
			//再度値を挿入する要素のインデックスを入力を促す
			System.out.print("値を挿入する要素のインデックス：");
			//入力された値を挿入する要素のインデックスを読み込む
			targetElement = standardInput.nextInt();
		}

		//挿入する値の入力を促す
		System.out.print("挿入する値を入力してください。\n挿入する値：");
		//入力された挿入する値を読み込む
		int assigmentValue = standardInput.nextInt();

		//配列の指定した要素を削除して詰める処理を行う
		assignElementValue(integralArray, targetElement, assigmentValue);
		//指定要素に値を挿入したことを伝える
		System.out.println("指定要素に値を挿入しました。");

		//挿入後の配列の表示を行う
		for (int i = 0; i < elementCount; i++) {
			//配列の各要素を表示していく
			System.out.println("要素{" + i + "] = " + integralArray[i]);
		}
	}
}
