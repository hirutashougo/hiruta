package Chap04.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise04_25_LIst04_17
 * 概要:LIst04_17の変更。合計だけでなく平均も求めるようにする
 * 作成者:S.Hiruta
 * 作成日:2024/04/12
 */
public class Exercise04_25_List04_17 {

	/*
	 * 関数名：main
	 * 概要:読み込んだ整数を加算(0が入力されたら終了)。平均も算出する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/12
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);

		//整数値を加算することを伝える
		System.out.println("整数を加算します。");
		//何個加算するか聞く
		System.out.print("何個加算しますか：");
		//入力された個数を読み込む
		int countNumber = standardInput.nextInt();
		//個数に正の整数が入力されるまで繰り返す処理
		while (countNumber <= 0) {
			//正の整数で入力するように促す
			System.out.print("正の整数で入力してください。\n何個加算しますか：");
			//入力された個数を読み込む
			countNumber = standardInput.nextInt();
		}

		//合計値を表す変数を定義
		int integralSum = 0;
		//平均値を表す変数を定義
		int integralAverage = 0;
		//整数が加算された回数をカウントする定数の定義
		int addtionCount = 0;
		//0が入力されるまで整数値の加算を繰り返す処理
		for (addtionCount = 1; addtionCount <= countNumber; addtionCount++) {
			//整数値の入力を促す
			System.out.print("整数値(0で終了)：");
			//入力された整数値を読み込む
			int integralNumber = standardInput.nextInt();
			//0が入力されたら繰り返しを終了
			if (integralNumber == 0) {
				//繰り返しの処理を終了
				break;
			}
			//入力された整数値は合計される
			integralSum += integralNumber;
		}
		//最初に0が入力されている場合
		if (addtionCount == 1) {
			//何も加算されていないことを伝える
			System.out.println("1度も加算されなかったため、合計・平均は出せません。");
		} else {
			//入力されてきた整数の平均を算出
			integralAverage = (integralSum / addtionCount);
			//最終的な合計値を表示する
			System.out.println("合計は" + integralSum + "です。");
			//平均を表示する
			System.out.println("平均は" + integralAverage + "です。");
		}
	}
}