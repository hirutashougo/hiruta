package Chap04.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise04_25_LIst04_25_LIst04_18
 * 概要:LIst04_18の変更。合計だけでなく平均も求めるようにする
 * 作成者:S.Hiruta
 * 作成日:2024/04/12
 */
public class Exercise04_25_List04_18 {

	/*
	 * 関数名：main
	 * 概要:読み込んだ整数を加算(合計値が1,000を超えない範囲で計算する)。
	 *      平均も算出する。
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
		
		//合計値の上限を表す定数を定義
		final int MAXIMUM_NUMBER =1000;

		//合計値を表す変数を定義
		int integralSum = 0;
		//平均値を表す変数を定義
		int integralAverage = 0;
		//処理回数のカウントする変数を定義
		int executionCount = 0;
		//0が入力されるまで整数値の加算を繰り返す処理
		for (int i = 1; i <= countNumber; i++) {
			//整数値の入力を促す
			System.out.print("整数値：");
			//入力された整数値を読み込む
			int integralNumber = standardInput.nextInt();
			//加算合計値が1000を超えたら繰り返しを終了////////////////////////////////////////////////
			if (integralSum + integralNumber > MAXIMUM_NUMBER) {
				//合計値が1000を超えたことを伝える
				System.out.println("合計値が" + MAXIMUM_NUMBER + "を超えました。");
				//最後の数値は無視することを伝える
				System.out.println("最後の数値は無視します。");
				//繰り返しを抜ける
				break;
			}
			//加算回数をカウント
			executionCount++;
			//入力された整数値は合計される
			integralSum += integralNumber;
		}
		//最初の入力で加算合計値が1000を超過した場合
		if (executionCount == 0) {
			//合計も平均も算出できないと表示
			System.out.println("1度も加算されませんでした。\n合計も平均も算出できません");
		//1回以上は加算処理が実行されている場合	
		} else {
		//入力されてきた整数の平均を算出
		integralAverage = (integralSum / executionCount);
		//最終的な合計値を表示する
		System.out.println("合計値は" + integralSum + "です。");
		//平均を表示する
		System.out.println("平均は" + integralAverage + "です。");
		}
	}
}