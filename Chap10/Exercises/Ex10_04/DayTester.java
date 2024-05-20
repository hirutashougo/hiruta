package Chap10.Exercises.Ex10_04;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:DayTester
* 概要:Dayクラス[第4版]をテストする
* 作成者:S.Hiruta
* 作成日:2024/05/20
*/
public class DayTester {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名：inputIntegralNumber
	 * 概要:整数(int型)を入力させる
	 * 引数：入力内容の文言(String型)
	 * 戻り値：整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	static int inputIntegralNumber(String desplayIssue) {

		//選択の文言を表示
		System.out.print(desplayIssue);
		
		//入力された整数を読み込む
		int integralNumber = standardInput.nextInt();

		//入力された整数を返却
		return integralNumber;
	}
	
	/*
	 * 関数名：inputDate
	 * 概要:年・月・日の数値を入力させ、それをまとめた配列を返却する
	 * 引数：なし
	 * 戻り値：年・月・日の情報をまとめた配列(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public static int[] inputDate() {
		
		//年・月・日の数値を入力を促す
		System.out.println("年・月・日の数値を入力してください");
		//日付の要素である「年・月・日」の個数を表す3を定数化
		final int DATE_FACOR_COUNT = 3;
		//日付の情報を格納する配列を宣言
		int[] dateFactor = new int[DATE_FACOR_COUNT];
		
		//年数を入力させる
		dateFactor[0] = inputIntegralNumber("年数：");
		//月数を入力させる
		dateFactor[1] = inputIntegralNumber("月数：");
		//日数を入力させる
		dateFactor[2] = inputIntegralNumber("日数：");
		
		//日付の情報を格納した配列を返却
		return dateFactor;
	}

	/*
	 * 関数名：main
	 * 概要:Dayクラス[第4版]をテストする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public static void main(String[] args) {
		
		//
	}
}
