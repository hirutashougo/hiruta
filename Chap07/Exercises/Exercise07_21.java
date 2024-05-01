package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_21
* 概要:2つの配列の全要素の値を交換して表示
* 作成者:S.Hiruta
* 作成日:2024/05/01
*/
public class Exercise07_21 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//配列のインデックス数を調整するための定数1を定義
	static final int ADJUSTMENT_NUMBER = 1;
	
	/*
	 * 関数名：exchangeValue
	 * 概要：2つの配列の同じインデックスの要素の値を交換する
	 * 引数：配列その1(int型),配列その2(int型)
	 		配列の要素のインデックス(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/01
	*/
	static void exchangeValue(int[] firstIntegralArray, int[] secondIntegralArray, int indexNumber) {
		//配列その1の指定要素の値を一時的に変数に格納
		int assignmentVariable = firstIntegralArray[indexNumber];
		//配列その1の指定要素の値と配列その2の指定要素の値を交換
		firstIntegralArray[indexNumber] = secondIntegralArray[indexNumber];
		//配列その2の指定要素の値を変数に格納
		secondIntegralArray[indexNumber] = assignmentVariable;
	}

	/*
	 * 関数名：exchangeElementValue
	 * 概要：2つの配列の全要素の値を交換する
	 * 引数：配列その1(int型),配列その2(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/01
	*/
	static void exchangeElementValue(int[] firstIntegralArray, int[] secondIntegralArray) {
		//2つの配列のうち、要素数の少ないほうを選ぶ
		int shorterArray = (firstIntegralArray.length < secondIntegralArray.length) ? firstIntegralArray.length : secondIntegralArray.length;
		//要素数の少ない配列にあわせて、2つの配列の全要素の値を交換していく
		for (int i = 0; i < shorterArray; i++) {
			//2つの配列の各要素の値を交換する
			exchangeValue(firstIntegralArray, secondIntegralArray, i);
		}
	}

	/*
	* 関数名：main
	* 概要：入力した2つの配列の全要素の値を、交換して表示
	* 引数：なし
	* 戻り値：なし
	* 作成者：S.Hiruta
	* 作成日：2024/05/01
	*/
	public static void main(String[] arg) {
		
		//前置きとして扱う配列の説明をする
		System.out.println("値を交換する二つの配列を、それぞれ配列a,bとします。");

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

		//各要素の値を入力させる
		for (int i = 0; i < firstElementCount; i++) {
			//値を入力する要素を表示
			System.out.print("a[" + i + "]：");
			//入力された要素の値を読み込む
			firstIntegralArray[i] = standardInput.nextInt();
		}

		//配列bの要素数の入力を促す
		System.out.print("\n配列bの要素数：");
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

		//入力された要素数を持つ配列を定義
		int[] secondIntegralArray = new int[secondElementCount];

		//各要素の値を入力させる
		for (int i = 0; i < secondElementCount; i++) {
			//値を入力する要素を表示
			System.out.print("b[" + i + "]：");
			//入力された要素の値を読み込む
			secondIntegralArray[i] = standardInput.nextInt();
		}
		
		//関数exchangeElementValueを呼び出し、入力された二つの配列の要素を入れ替える
		exchangeElementValue(firstIntegralArray, secondIntegralArray);
		
		//2つの配列の要素の値を入れ替えたことを伝える
		System.out.println("\n2つの配列の要素の値を入れ替えましました。");
		
		//配列aの表示を始める
		System.out.println("\n配列a:");
		//入れ替え後の配列aの各要素の値表示を始める
		for (int i = 0; i < firstElementCount; i++) {
			//各要素の値を表示する
			System.out.println("a{" + i + "] = " + firstIntegralArray[i]);
		}
		//配列bの表示を始める
		System.out.println("\n配列b:");
		//入れ替え後の配列bの各要素の値表示を始める
		for (int i = 0; i < secondElementCount; i++) {
			//各要素の値を表示する
			System.out.println("b{" + i + "] = " + secondIntegralArray[i]);
		}
	}
}
