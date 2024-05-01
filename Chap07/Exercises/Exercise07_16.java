package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_16
* 概要:配列の最小値を求める
* 作成者:S.Hiruta
* 作成日:2024/04/30
*/
public class Exercise07_16 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：caluculateMinumum
	 * 概要:配列a(教科書準拠)の最小値を求める
	 * 引数:配列(int型)
	 * 戻り値：配列の最小値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/30
	*/
	static int caluculateMinumum(int[] a) {
		/*配列の要素の最小値を格納していく変数を
		配列の第1要素の値を初期状態といて宣言*/
		int minimumElement = a[0];
		//配列の要素の中で最小の値を求める
		for (int i = 0; i < a.length; i++) {
			//最小値の変数に格納されている値よりも小さい場合
			if (a[i] < minimumElement) {
				//最小値は更新される
				minimumElement = a[i];
			}
		}
		//最終的な最小値を返却する
		return minimumElement;
	}

	/*
	* 関数名：main
	* 概要：配列の最小値を求める
	* 引数：なし
	* 戻り値：なし
	* 作成者：S.Hiruta
	* 作成日：2024/04/25
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

		//配列のインデックス数を調整するための定数1を定義
		final int ADJUSTMENT_NUMBER = 1;
		//各要素の値を入力させる
		for (int i = 0; i < elementCount; i++) {
			//何番目の要素か伝える
			System.out.print((i + ADJUSTMENT_NUMBER) + "番目の要素：");
			//入力された要素の値を読み込む
			integralArray[i] = standardInput.nextInt();
		}

		//配列の全要素の最小値を表示すると伝える
		System.out.println("配列の全要素の最小値：");
		//配列の全要素の最小値を表示する
		System.out.println(caluculateMinumum(integralArray) + "です。");
	}
}
