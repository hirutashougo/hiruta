package Chap06.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_17
 * 概要:6人の2科目(国語・数学)の点数を読み込み、科目ごとの平均・生徒ごとの平均を求める
 * 作成者:S.Hiruta
 * 作成日:2024/04/19
 */
public class Exercise06_17 {

	/*
	 * 関数名：main
	 * 概要:6人の2科目(国語・数学)の点数を読み込み、科目ごとの平均・生徒ごとの平均を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/19
	*/
	public static void main(String[] arg) {

		//入力読み込みの為のクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);

		//生徒数を表す定数の定義
		final int STUDENT_COUNT = 6;
		//科目数を表す定数の定義
		final int SBJECT_COUNT = 2;
		//生徒の人数表の際の調整数の定数
		final int ADJUSTMENT_NUMBER = 1;

		//国語と数学の点数の格納する2行6列の配列を定義
		int[][] testScore = new int[STUDENT_COUNT][SBJECT_COUNT];

		//テストの点数の入力を促す
		System.out.println("6人の各生徒の点数を入力してください。");
		//それぞれの生徒の点数を入力させる
		for (int i = 0; i < STUDENT_COUNT; i++) {
			//何人目の生徒であるかを表示
			System.out.println((i + ADJUSTMENT_NUMBER) + "人目の生徒");
			//各科目の点数を入力させる
			for (int j = 0; j < SBJECT_COUNT; j++) {
				//まずは国語の点数を入力
				if (j <= 0) {
					//国語の点数の入力を促す
					System.out.print("国語:");
					//次に数学の点数を入力
				} else {
					//数学の点数の入力を促す
					System.out.print("数学:");
				}
				//入力された点数を読み込む
				testScore[i][j] = standardInput.nextInt();
				//点数として0以上の値が入力されるまで繰り返す表示
				while (testScore[i][j] < 0) {
					//0以上の点数で入力するように伝える
					System.out.print("0以上の点数で入力してください:");
					//入力された点数を読み込む
					testScore[i][j] = standardInput.nextInt();
				}
			}
		}

		//科目別に、全生徒の点数を計算する処理
		for (int i = 0; i < SBJECT_COUNT; i++) {
			//科目ごとの合計値を算出するための変数を定義
			int subjectSum = 0;
			//科目ごとの平均点を算出するための繰り返し処理
			for (int j = 0; j < STUDENT_COUNT; j++) {
				//科目ごとに合計値を算出する
				subjectSum += testScore[j][i];
			}
			//国語の平均点を表示を示唆
			if (i <= 0) {
				//国語の平均点は、と表示
				System.out.print("国語の平均は");
			//数学の平均点を表示を示唆	
			} else {
				////数学の平均点は、と表示
				System.out.print("数学の平均は");
			}
			//科目ごとの平均を算出
			double subjectAverage = (double)subjectSum / STUDENT_COUNT;
			//科目ごとの平均を表示
			System.out.printf("%.2f", subjectAverage);
			//点を表記
			System.out.println("点です。");
		}

		//学生別に、全科目の点数を計算する処理
		for (int i = 0; i < STUDENT_COUNT; i++) {
			//科目ごとの合計値を算出するための変数を定義
			int studentSum = 0;
			//学生ごとの平均点を算出するための繰り返し処理
			for (int j = 0; j < SBJECT_COUNT; j++) {
				//学生ごとに合計値を算出する
				studentSum += testScore[i][j];
			}
			//学生ごとのテストの平均を算出
			double studentAverage = (double)studentSum / SBJECT_COUNT;
			//学生ごとのテストの平均を表示
			System.out.println((i + ADJUSTMENT_NUMBER) + "人目の学生の平均点は" + studentAverage);
		}
	}
}
