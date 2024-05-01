package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_19
* 概要:全要素なインデックスと同じ値を持つ
* 作成者:S.Hiruta
* 作成日:2024/04/31
*/
public class List07_19 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：idxArray
	 * 概要:全要素がインデックスと同じ値を持つ要素数nの配列を生成して返却
	 * 引数：配列の要素数(int型)
	 * 戻り値：配列(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/31
	*/
	static int[] idxArray(int n) {
		//入力された要素数を持つ配列を宣言
		int[] x = new int[n];
		//インデックスと同じ値を要素に持つ配列を生成
		for (int i = 0; i < n; i++) {
			//インデックスの値を要素に代入していく
			x[i] = i;
		}
		//生成した配列を返却
		return x;
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
		System.out.print("配列xの要素数：");
		//入力された要素数を読み込む
		int firstElementCount = standardInput.nextInt();
		//配列の要素数として正の整数が入力されるまで繰り返し促す
		while (firstElementCount <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//再度配列の要素数を入力を促す
			System.out.print("配列xの要素数：");
			//入力された配列の要素数を読み込む
			firstElementCount = standardInput.nextInt();
		}

		//入力された要素数を持つ配列(配列a)を定義
		int[] firstIntegralArray = idxArray(firstElementCount);

		//各要素の値を入力させる
		for (int i = 0; i < firstElementCount; i++) {
			//生成した配列を表示
			System.out.println("x[" + i + "] = " + firstIntegralArray[i]);
		}
	}
}
