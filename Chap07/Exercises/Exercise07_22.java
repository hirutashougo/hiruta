package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise07_22
 * 概要:要素数と要素の値の全てが等しいもう一つの配列を生成する
 * 作成者:S.Hiruta
 * 作成日:2024/05/01
 */
public class Exercise07_22 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//配列のインデックス数を調整するための定数1を定義
	static final int ADJUSTMENT_NUMBER = 1;

	/*
	 * 関数名：arrayClone
	 * 概要:素数と要素の値の全てが等しいもう一つの配列を生成する
	 * 引数：配列(int型)
	 * 戻り値：コピーした配列(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/31
	 */
	static int[] arrayClone(int[] a) {
		//入力された要素数を持つ配列を宣言
		int[] copyArray = new int[a.length];
		//インデックスと同じ値を要素に持つ配列を生成
		for (int i = 0; i < a.length; i++) {
			//インデックスの値を要素に代入していく
			copyArray[i] = a[i];
		}
		//生成した配列を返却
		return copyArray;
	}

	/*
	 * 関数名：main
	 * 概要：入力した配列と、要素数と要素の値の全てが等しい
			もう一つの配列を生成し、表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/01
	 */
	public static void main(String[] arg) {

		//前置きとして扱う配列の説明をする
		System.out.println("配列aと、要素数と要素の値の全てが等しい配列bを生成します。");

		//配列aの要素数の入力を促す
		System.out.print("\n配列aの要素数：");
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

		//入力された要素数を持つ配列(配列b)を定義
		int[] firstIntegralArray = new int[firstElementCount];
		//配列aの入力を促す
		System.out.println("\n配列a：");
		//各要素の値を入力させる
		for (int i = 0; i < firstElementCount; i++) {
			//値を入力する要素を表示
			System.out.print("a[" + i + "]：");
			//入力された要素の値を読み込む
			firstIntegralArray[i] = standardInput.nextInt();
		}

		//関数arrayCloneを呼び出し、要素数と要素の値の全てが等しい配列bを生成
		int[] secondIntegralArray = arrayClone(firstIntegralArray);

		//配列bの生成を伝える
		System.out.println("\n配列b:");
		//配列bの表示を行っていく
		for (int i = 0; i < secondIntegralArray.length; i++) {
			//要素の値を表示
			System.out.println("b[" + i + "] = " + secondIntegralArray[i]);
		}
	}
}
