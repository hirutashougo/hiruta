package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_18
* 概要:配列の最も末尾にある探索対象を線形探索する
* 作成者:S.Hiruta
* 作成日:2024/04/30
*/
public class Exercise07_18 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//探索対象の値が見つからなかったことを表わす定数-1を定義
	static final int NOT_FOUND_CONSTANT = -1;

	/*
	 * 関数名：linearSearchR
	 * 概要:配列の最も末尾にある探索対象を線形探索する
	 * 引数:配列(int型)
	 * 戻り値：探索対象のある要素の中で、配列の最も末尾のもの(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/30
	*/
	static int linearSearchR(int[] a, int searchValue) {
		//配列のインデックス数を調整するための定数1を定義
		final int ADJUSTMENT_NUMBER = 1;
		//配列の要素の線形探索を、末尾から行う
		for (int i = a.length - ADJUSTMENT_NUMBER; i >= 0; i--) {
			//探索対象の数値が見つかった場合
			if (a[i] == searchValue) {
				//見つかった要素のインデックスを返却する
				return i;
			}
		}
		//探索対象の数値が見つから無ければ、-1を返却する
		return NOT_FOUND_CONSTANT;
	}

	/*
	* 関数名：main
	* 概要：入力した配列の中で、最も末尾にある探索対象の要素を表示
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
		//配列の要素数として正の整数が入力されるまで繰り返し促す
		while (elementCount < 0) {
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
			//何番目の要素か伝える
			System.out.print((i + 1) + "番目の要素：");
			//入力された要素の値を読み込む
			integralArray[i] = standardInput.nextInt();
		}

		//探索する値の入力を促す
		System.out.print("探す値：");
		//入力された値を読み込む
		int searchValue = standardInput.nextInt();

		//探索対象の値が入っている要素のインデックスを、扱いやすいよに変数化
		int searchIndex = linearSearchR(integralArray, searchValue);

		//探索対象が見つからなかった場合
		if (searchIndex == NOT_FOUND_CONSTANT) {
			//探索対象が見つからなかったと表示
			System.out.println("その値の要素は存在しません。");
			//探索対象が見つかった場合
		} else {
			//探索対象の値が入っている要素のインデックスを表示
			System.out.println("その値はx[" + searchIndex + "]にあります。");
		}
	}
}
