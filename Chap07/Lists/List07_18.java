package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_18
* 概要:2つの配列が等しいか判定
* 作成者:S.Hiruta
* 作成日:2024/04/31
*/
public class List07_18 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：equal
	 * 概要:2つの配列が等しいか判定
	 * 引数：2つの配列(int型)
	 * 戻り値：true,false
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/31
	*/
	static boolean equal(int[] firstIntegralArray, int[] secondIntegralArray) {
		//二つの配列の長さ(要素数)が違う場合
		if (firstIntegralArray.length != secondIntegralArray.length) {
			//falseを返却
			return false;
		}
		//二つの配列の各要素の値を比較していく
		for (int i = 0; i < firstIntegralArray.length; i++) {
			//二つの配列の各要素の値が違う場合
			if (firstIntegralArray[i] != secondIntegralArray[i]) {
				//falseを返却
				return false;
			}
		}
		//要素数、全ての要素の値が等しかった場合、trueを返却
		return true;
	}

	/*
	 * 関数名：main
	 * 概要:入力した二つの配列が等しいか判定
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	public static void main(String[] arg) {

		//配列aの要素数の入力を促す
		System.out.print("配列aの要素数：");
		//入力された要素数を読み込む
		int firstElementCount = standardInput.nextInt();
		//配列の要素数として正の整数が入力されるまで繰り返し促す
		while (firstElementCount <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//再度配列の要素数を入力を促す
			System.out.print("配列aの要素数：");
			//入力された配列の要素数を読み込む
			firstElementCount = standardInput.nextInt();
		}

		//入力された要素数を持つ配列(配列a)を定義
		int[] firstIntegralArray = new int[firstElementCount];

		//各要素の値を入力させる
		for (int i = 0; i < firstElementCount; i++) {
			//何番目の要素か伝える
			System.out.print("a[" + i + "]：");
			//入力された要素の値を読み込む
			firstIntegralArray[i] = standardInput.nextInt();
		}

		//配列bの要素数の入力を促す
		System.out.print("配列bの要素数：");
		//入力された要素数を読み込む
		int secondElementCount = standardInput.nextInt();
		//配列の要素数として正の整数が入力されるまで繰り返し促す
		while (secondElementCount <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//再度配列の要素数を入力を促す
			System.out.print("配列bの要素数：");
			//入力された配列の要素数を読み込む
			secondElementCount = standardInput.nextInt();
		}

		//入力された要素数を持つ配列(配列a)を定義
		int[] secondIntegralArray = new int[secondElementCount];

		//各要素の値を入力させる
		for (int i = 0; i < secondElementCount; i++) {
			//何番目の要素か伝える
			System.out.print("b[" + i + "]：");
			//入力された要素の値を読み込む
			secondIntegralArray[i] = standardInput.nextInt();
		}
		
		System.out.println("配列aとbは" + 
							(equal(firstIntegralArray, secondIntegralArray) ? "等しいです。" : "等しくありません。"));
	}
}
