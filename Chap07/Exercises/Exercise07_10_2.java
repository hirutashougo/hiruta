package Chap07.Exercises;

import java.util.Random;
//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_10_2
* 概要:暗算力トレーニング
       4パターンの数式を出力し、暗算によって正解するまで解答させる
* 作成者:S.Hiruta
* 作成日:2024/04/24
*/
public class Exercise07_10_2 {

	//入力読み込みの為のクラスの変数を定義
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名：confirmRetry
	 * 概要:引数が0なら終了、1なら続行
	 * 引数:なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/24
	*/
	static boolean confirmRetry() {
		//終了か実行かを判断する変数を宣言
		int cont;
		//引数に応じて、処理の終了・続行を判断する
		do {
			//選択を迫る表示
			System.out.print("もう一度?<Yes…1/No…0>：");
			//入力された値を読み込む
			cont = standardInput.nextInt();
		//0か1以外が入力されれば処理を繰り返す
		} while(cont != 0 && cont != 1);
		//1が入力されれば処理を返却する
		return cont == 1;
	}

	/*
	 * 関数名：main
	 * 概要:数値と式を表示し、その計算を行う暗算トレーニング
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/24
	*/
	public static void main(String[] arg) {
		
		//Randomクラスの変数の定義
		Random randomNumber = new Random();
		
		//ゲーム「暗算力トレーニング」の開始を宣言
		System.out.println("暗算力トレーニング!!");
		
		//暗算力トレーニングの実行
		do {
			//計算の項として変数x(教科書準拠)を定義
			int x = randomNumber.nextInt(900) + 100;
			//計算の項として変数y(教科書準拠)を定義
			int y = randomNumber.nextInt(900) + 100;
			//計算の項として変数z(教科書準拠)を定義
			int z = randomNumber.nextInt(900) + 100;
			
			//正解するまで数値計算の暗算を行わせる
			while (true) {
				//3つの項の計算を表示
				System.out.print(x + " + " + y + " + " + z + " = ");
				//入力される計算結果の読み込み
				int k = standardInput.nextInt();
				//計算結果が正解である場合
				if (k == x + y + z) {
					//トレーニング終了
					break;
				}
				//計算結果が違った場合トレーニング失敗
				System.out.println("違いますよ!");
			}
		//関数confirmRetryを呼び出し、トレーニングの終了・続行の意思を確認
		} while (confirmRetry());
	}
}
