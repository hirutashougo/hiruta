package Chap09.Exercises.Ex09_01;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:HumanTester1
* 概要:5人の人間の名前・身長・体重を入力し、表示する
* 作成者:S.Hiruta
* 作成日:2024/05/13
*/
public class HumanTester1 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：returnRegurlarNumber
	 * 概要：実数を入力させ、0以下なら再入力させる
	 * 引数：なし
	 * 戻り値：0超過の実数(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	static double returnRegurlarNumber() {
		//入力された実数を読み込む
		double imputNumber = standardInput.nextDouble();
		//引数の数値(入力された値)が0以下の場合繰り返す
		while (imputNumber <= 0) {
			//0超過の数値の入力を促す
			System.out.println("0超過の数値を入力してください");
			//入力された値を読み込む
			imputNumber = standardInput.nextDouble();
		}
		//0超過の値を返却する
		return imputNumber;
	}

	/*
	 * 関数名：main
	 * 概要：人数分の人間の名前・身長・体重を入力し、表示する
	 		配列の生成後に情報を代入する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public static void main(String[] args) {

		//表示する人間の数を表す定数5を宣言
		final int HUMAN_COUNT = 5;

		//人数分の人間の名前を格納する配列を宣言
		String[] individualName = new String[HUMAN_COUNT];
		//人数分の人間の身長を格納する配列を宣言
		Double[] individualHeight = new Double[HUMAN_COUNT];
		//人数分の人間の体重を格納する配列を宣言
		Double[] individualWeight = new Double[HUMAN_COUNT];

		//配列のインデックスと、実際の人数表記を調整するための定数1を定義
		final int ADJUSTMENT_NUMBER = 1;

		//人数分、それぞれの情報を入力させる
		for (int i = 0; i < HUMAN_COUNT; i++) {
			//何人目の情報か表示する
			System.out.println((i + ADJUSTMENT_NUMBER) + "人目：");
			//名前の入力を促す
			System.out.print("名前：");
			//入力された名前を読み込む
			individualName[i] = standardInput.next();
			//身長の入力を促す
			System.out.print("身長(cm)：");
			//入力された身長の数値を読み込む
			individualHeight[i] = returnRegurlarNumber();
			//体重の入力を促す
			System.out.print("体重(kg)：");
			//入力された体重の数値を読み込む
			individualWeight[i] = returnRegurlarNumber();
		}

		//≪人間クラス≫型配列を各要素の初期化とともに宣言
		Human[] individualInfomation = {
				//1人目の要素を宣言
				new Human(individualName[0], individualHeight[0], individualWeight[0]),
				//2人目の要素を宣言
				new Human(individualName[1], individualHeight[1], individualWeight[1]),
				//3人目の要素を宣言
				new Human(individualName[2], individualHeight[2], individualWeight[2]),
				//4人目の要素を宣言
				new Human(individualName[3], individualHeight[3], individualWeight[3]),
				//5人目の要素を宣言
				new Human(individualName[4], individualHeight[4], individualWeight[4]),
		};

		//表示を見やすくするための改行
		System.out.println();

		//全員の情報を表示
		for (int i = 0; i < HUMAN_COUNT; i++) {
			//何人目かを表示
			System.out.print((i + ADJUSTMENT_NUMBER) + "人目：");
			//それぞれの人間の情報を表示
			individualInfomation[i].putSpec();
		}
	}
}
