package Chap04.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise04_26
 * 概要:List04_19を変更。平均値も算出する。
 * 作成者:S.Hiruta
 * 作成日:2024/04/12
 */
public class Exercise04_26 {

	/*
	 * 関数名：main
	 * 概要:読み込んだ整数値を加算(負の値は加算しない)。平均値も算出する。
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

		//合計を表す変数を定義
		int integralSum = 0;
		//平均を表す変数を定義
		int integralAverage = 0;
		//整数が加算された回数をカウントする定数の定義
		int addtionCount = 0;
		//正の整数値の加算を繰り返す処理///////////////////////////////////
		for (int i = 1; i <= countNumber; i++) {
			//整数値の入力を促す
			System.out.print("整数値：");
			//入力された整数値を読み込む
			int integralNumber = standardInput.nextInt();
			//負の整数が入力された場合
			if (integralNumber < 0) {
				//負の整数は加算しないと表示
				System.out.println("負の整数は加算しません。");
				//処理の継続
				continue;
			}
			//加算回数をカウント
			addtionCount++;
			//入力された整数値は合計される
			integralSum += integralNumber;
		}
		//1度も正の整数が入力されなかった場合
		if (addtionCount == 0) {
			//合計も平均も出せないことを表示
			System.out.print("1度も加算されなかったため、合計・平均は出せません。");
		//1度でも加算がされた場合	
		} else {
			//平均値を算出する
			integralAverage = (integralSum / addtionCount);
			//最終的な合計を表示する
			System.out.println("合計は" + integralSum + "です。");
			//平均を表示する
			System.out.println("平均は" + integralAverage + "です。");
		}
	}
}