package Chap10.Exercises.Ex10_01;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:IdentificationTester
* 概要：人数分の識別番号を与え、最大の識別子を返却
* 作成日:2024/05/16
*/
public class IdentificationTester {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名：inputPlusInteger
	 * 概要:1以上の整数を入力させる
	 * 引数：なし
	 * 戻り値：1以上の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	static int inputPlusInteger() {
		//入力される整数を格納する変数を宣言
		int integralNumber = 0;
		//入力された整数を読み込む
		integralNumber = standardInput.nextInt();
		//入力された整数が負である場合
		while (integralNumber <= 0) {
			//1以上の整数での入力を促す
			System.out.print("1以上の整数で入力してください;");
			//入力された整数を読み込む
			integralNumber = standardInput.nextInt();
		}
		//1以上の整数を返却
		return integralNumber;
	}

	/*
	* クラス名:main
	* 概要:人数分の識別番号を与え、最大の識別子を返却
	* 作成者:S.Hiruta
	* 作成日:2024/05/16
	*/
	public static void main(String[] args) {
		
		//
		
		//識別子を与える人数を入力させる
		int humanCount = inputPlusInteger();
		//
		Identification [] humanAccount = new Identification [humanCount];
		//識別子を付与した人数をカウントする変数を宣言
		int countNumber = 1;
		//指定人数全員に識番号を付与していく
		for (int i = 0; i < humanCount; i++, countNumber++) {
			//それぞれに識別番号を付与していく
			humanAccount[i] = new Identification();
			//何番目の利用者に対し、何番を識別子として付与したか表示する
			System.out.println(countNumber + "人目の利用者の識別番号は" + humanAccount[i].getIdentification() + "です。");
		}
	}
}
