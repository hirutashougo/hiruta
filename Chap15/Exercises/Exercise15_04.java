package Chap15.Exercises;

//Scannerをインポート
import java.util.Scanner;

/*
* クラス名:Exercise15_04
* 概要：入力した浮動小数点数値を、小数点以下の桁数と全体の桁数を指定して表示する
* 作成者:S.Hiruta
* 作成日:2024/05/29
*/
public class Exercise15_04 {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：inputPlusInteger
	 * 概要:1以上の整数を入力させる
	 * 引数：入力条件の文言(String型)
	 * 戻り値：1以上の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	static int inputPlusInteger(String desplayIssue) {

		//選択の文言を表示
		System.out.print(desplayIssue);

		//入力される整数を格納する変数を宣言
		int integralNumber = 0;
		//入力された整数を読み込む
		integralNumber = standardInput.nextInt();
		//入力された整数が0以下である場合
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
	 * 関数名：main
	 * 概要:入力された浮動小数点数値を、小数点以下の桁数と全体の桁数を指定して表示する
	 * 引数：浮動小数点数値(doublr型),小数点以下の桁数(int型),全体の桁数(int型)
	 * 戻り値：小数点以下の桁数と全体の桁数を指定した数値の表記(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	static void printDouble(double inputNumber, int desimalLessPoint, int digitsCount) {
		//9.2とかの数字をする
		
		//小数点以下の桁数と全体の桁数を指定して表示する
		System.out.printf (String.format(String.format("%%%%%%ddf\n", digitsCount), desimalLessPoint), inputNumber);
	}

	/*
	 * 関数名：main
	 * 概要:入力した浮動小数点数値を、小数点以下の桁数と全体の桁数を指定して表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public static void main(String[] args) {

		//浮動小数点数値の入力を促す
		System.out.print("浮動小数点数値：");
		//入力された値を読み込む
		double inputNumber = standardInput.nextDouble();
		//小数点以下の桁数を入力させる
		int desimalLessPoint = inputPlusInteger("小数点以下の桁数：");
		//全体の桁数を入力させる
		int digitsCount = inputPlusInteger("全体の桁数：");

		//入力した浮動小数点数値を、小数点以下の桁数と全体の桁数を指定して表示する
		printDouble(inputNumber, desimalLessPoint, digitsCount);
	}

}
