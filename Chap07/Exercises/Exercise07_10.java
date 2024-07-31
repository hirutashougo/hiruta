package Chap07.Exercises;

//乱数生成パッケージのインポート
import java.util.Random;
//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_10
* 概要:暗算力トレーニング
       4パターンの数式を出力し、暗算によって正解するまで解答させる
* 作成者:S.Hiruta
* 作成日:2024/04/23
*/
public class Exercise07_10 {

	//入力読み込みの為のクラスの変数を定義
	static Scanner standardInput = new Scanner(System.in);
	//数式の計算結果を格納する変数の宣言
	static int caliculationAnswer = 0;

	/*
	 * 関数名：rverseSign
	 * 概要:引数が負の値であれば、()を付けた表記にして返却する
	 * 引数:整数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/23
	*/
	static void rverseSign(int integralNumber) {
		//入力された整数が負である場合
		if (integralNumber < 0) {
			//()を付けた表記を出力
			System.out.print("(" + integralNumber + ")");
			//入力された整数が0以上の場合
		} else {
			//そのままの状態で出力
			System.out.print(integralNumber);
		}
	}

	/*
	 * 関数名：confirmRetry
	 * 概要:入力された値が0なら終了、1なら続行
	 * 引数:なし
	 * 戻り値：true,false
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/23
	*/
	static boolean confirmRetry() {
		//終了か実行かを判断する変数cont(教科書準拠)を宣言
		int cont;
		//処理終了を意味する定数を宣言
		final int FINISH_NUMBER = 0;
		//処理続行を意味する定数を宣言
		final int RETRY_NUMBER = 1;
		//入力値に応じて、処理の終了・続行を判断する
		do {
			//選択を迫る表示
			System.out.print("もう一度?<Yes…1/No…0>：");
			//入力された値を読み込む
			cont = standardInput.nextInt();
			//0か1以外が入力されれば処理を繰り返す
		} while (cont != FINISH_NUMBER && cont != RETRY_NUMBER);
		//1が入力されれば処理を返却する
		return cont == RETRY_NUMBER;
	}

	/*
	 * 関数名：questionCalculation
	 * 概要：「+」「-」の二種類の演算子を、
	        3つの整数の項と組み合わせた4パターンの数式をランダムに生成。その答えも格納する
	 * 引数：計算式の3項(int型)
	         計算式の暗算結果(int型)、計算式の種類を決める数値(int型)
	 * 戻り値：計算の正解値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/23
	*/
	static int questionCalculation(int firstIntegral, int secondIntegral, int thirdIntegral,
			int caliculationMethod) {

		//乱数の値によって4種類の計算式を出題
		//項の符号によって表記を変えるため、数式の出力は関数rverseSignを用いて行う
		switch (caliculationMethod) {
		//乱数が0の場合
		case 0: {
			//演算子が「+」「+」の順に現れる計算式を表示
			//最初の項を表示
			rverseSign(firstIntegral);
			//演算子「+」を表示
			System.out.print(" + ");
			//2番目の項を表示
			rverseSign(secondIntegral);
			//演算子「+」を表示
			System.out.print(" + ");
			//3番目の項を表示
			rverseSign(thirdIntegral);
			//記号「=」を表示
			System.out.print(" = ");
			//計算の正解を定義
			caliculationAnswer = firstIntegral + secondIntegral + thirdIntegral;
		}
			//乱数が0の場合の処理を終了
			break;

		//乱数が1の場合
		case 1: {
			//演算子が「+」「-」の順に現れる計算式を表示
			//最初の項を表示
			rverseSign(firstIntegral);
			//演算子「+」を表示
			System.out.print(" + ");
			//2番目の項を表示
			rverseSign(secondIntegral);
			//演算子「-」を表示
			System.out.print(" - ");
			//3番目の項を表示
			rverseSign(thirdIntegral);
			//記号「=」を表示
			System.out.print(" = ");
			//計算の正解を定義
			caliculationAnswer = firstIntegral + secondIntegral - thirdIntegral;
		}
			//乱数が0の場合の処理を終了
			break;

		//乱数が2の場合
		case 2: {
			//演算子が「-」「+」の順に現れる計算式を表示
			//最初の項を表示
			rverseSign(firstIntegral);
			//演算子「-」を表示
			System.out.print(" - ");
			//2番目の項を表示
			rverseSign(secondIntegral);
			//演算子「+」を表示
			System.out.print(" + ");
			//3番目の項を表示
			rverseSign(thirdIntegral);
			//記号「=」を表示
			System.out.print(" = ");
			//計算の正解を定義
			caliculationAnswer = firstIntegral - secondIntegral + thirdIntegral;
		}
			//乱数が0の場合の処理を終了
			break;

		//乱数が3の場合
		case 3: {
			//演算子が「-」「-」の順に現れる計算式を表示
			//最初の項を表示
			rverseSign(firstIntegral);
			//演算子「-」を表示
			System.out.print(" - ");
			//2番目の項を表示
			rverseSign(secondIntegral);
			//演算子「-」を表示
			System.out.print(" - ");
			//3番目の項を表示
			rverseSign(thirdIntegral);
			//記号「=」を表示
			System.out.print(" = ");
			//計算の正解を定義
			caliculationAnswer = firstIntegral - secondIntegral - thirdIntegral;
		}
			//乱数が0の場合の処理を終了
			break;
		}
		//計算式の正解を返却する
		return caliculationAnswer;
	}

	/*
	 * 関数名：main
	 * 概要：暗算力トレーニング
	         4パターンの数式を出力し、暗算によって正解するまで解答させる
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	public static void main(String[] arg) {

		//Randomクラスの変数の定義
		Random randomNumber = new Random();

		//計算式の項へと代入する乱数の生成範囲を表す定数を定義
		final int RANDOM_RANGE = 900;
		//乱数の生成範囲を調整する定数を定義
		final int ADJUSTMENT_NUMBER = 100;
		//負の乱数を生成するための範囲を設定する定数
		final int NEGATIVE_RANGE = 500;
		//計算式の4パターンを定数で定義
		final int FORMULA_PATTERN = 4;
		//使用者の暗算結果の答えを格納する変数を宣言
		int mentalArithmetic = 0;

		//ゲーム「暗算力トレーニング」の開始を宣言
		System.out.println("暗算力トレーニング!!");
		//暗算力トレーニングの実行
		do {
			//計算の項として変数x(教科書準拠)を定義
			int firstIntegral = randomNumber.nextInt(RANDOM_RANGE) + ADJUSTMENT_NUMBER;
			//計算の項として変数y(教科書準拠)を定義
			int secondIntegral = randomNumber.nextInt(RANDOM_RANGE) + ADJUSTMENT_NUMBER;
			//計算の項として変数z(教科書準拠)を定義
			int thirdIntegral = randomNumber.nextInt(RANDOM_RANGE) + ADJUSTMENT_NUMBER;
			//計算式の4パターン(乱数の0～3で区別)をランダムに決定
			int caliculationMethod = randomNumber.nextInt(FORMULA_PATTERN);

			//正解するまで数値計算の暗算を行わせる
			while (true) {
				//関数questionCalculationを呼び出してクイズを実行
				questionCalculation(firstIntegral, secondIntegral, thirdIntegral, caliculationMethod);
				//入力された暗算結果を格納
				mentalArithmetic = standardInput.nextInt();
				//計算結果が正解である場合
				if (mentalArithmetic == caliculationAnswer) {
					//トレーニング終了
					break;
				}
				//計算結果が違った場合トレーニング失敗
				System.out.println("違いますよ!");
			}
			//正解であると伝える
			System.out.print("正解です。");
			//関数confirmRetryを呼び出し、トレーニングの終了・続行の意思を確認
		} while (confirmRetry());
		//終了を伝える
		System.out.print("お疲れ様でした。");
	}
}
