package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise07_23
 * 概要:探索する値のある要素のインデックスを表示する
 * 作成者:S.Hiruta
 * 作成日:2024/05/02
 */
public class Exercise07_23 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：arraySearchIdx
	 * 概要:探索する値のある要素のインデックスを返却する
	 * 引数：配列(int型),探索対象の値(int型)
	 * 戻り値：要素のインデックス(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/02
	 */
	static int[] arraySearchIdx(int[] a, int x) {
		//探索値のインデックスを格納する配列の要素数を定義
		int searchValueCount = 0;
		//探索対象の値を線形探索する
		//まず、探索値のインデックスを格納する配列の必要要素数を調べる
		for (int i = 0; i < a.length; i++) {
			//探索対象が見つかった場合
			if (a[i] == x) {
				//求めるインデックスを格納する配列の要素数を1カウント
				searchValueCount++;
			}
		}

		//探索対象の値がある要素のインデックスを格納する配列を宣言
		int[] elementIndex = new int[searchValueCount];
		//求めるインデックスを格納する配列のインデックス数をカウントする変数を宣言
		int searchelementCount = 0;

		//探索対象の値を線形探索する
		for (int i = 0; i < a.length; i++) {
			//探索対象が見つかった場合
			if (a[i] == x) {
				//探索値のある要素のインデックスを格納
				elementIndex[searchelementCount] = i;
				//配列のインデックス数を1カウントする
				searchelementCount++;
			}
		}

		//インデックスを格納した配列を返却
		return elementIndex;
	}

	/*
	 * 関数名：main
	 * 概要：探索する値のある要素のインデックスを表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/02
	 */
	public static void main(String[] arg) {

		//前置きとして行う処理の説明を行う
		System.out.println("探索する値のある要素のインデックスを表示します。");

		//配列の要素数の入力を促す
		System.out.print("\n配列の要素数：");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();
		//配列の要素数として正の整数が入力されるまで繰り返し促す
		while (elementCount <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//再度配列の要素数を入力を促す
			System.out.print("\n配列の要素数：");
			//入力された配列の要素数を読み込む
			elementCount = standardInput.nextInt();
		}

		//入力された要素数を持つ配列を定義
		int[] integralArray = new int[elementCount];

		//配列aの入力を促す
		System.out.println("\n配列a：");
		//各要素の値を入力させる
		for (int i = 0; i < elementCount; i++) {
			//値を入力する要素を表示
			System.out.print("a[" + i + "]：");
			//入力された要素の値を読み込む
			integralArray[i] = standardInput.nextInt();
		}

		//探索値の入力を促す
		System.out.print("\n探索値：");
		//入力された探索値を読み込む
		int searchValue = standardInput.nextInt();

		//関数arraySearchIdxを呼び出し、配列の中で探索対象のある要素のインデックスを見つける
		int[] searchIndexArray = arraySearchIdx(integralArray, searchValue);

		//探索値が配列内にない場合
		if (searchIndexArray.length == 0) {
			//索値が見つからなかったと表示
			System.out.println("\n探索値は見つかりませんでした。");
		//探索値が配列内にある場合
		} else {
			//配列bの生成を伝える
			System.out.println("\n配列b:");
			//探索値のある要素のインデックスの表示を伝える
			System.out.println("\n探索値のある要素のインデックス：");
			//探索値のある要素のインデックスの表示していく
			for (int i = 0; i < searchIndexArray.length; i++) {
				//表示の冒頭部分の括弧の表記
				if (i == 0) {
					//括弧つきでインデックス数を表示
					System.out.print("{" + searchIndexArray[i]);
					//括弧内に、探索値のある要素のインデックス数を表示していく
				} else {
					//要素の値を表示
					System.out.print(", " + searchIndexArray[i]);
				}
			}
			//括弧を閉じる
			System.out.println("}");
		}
	}
}
