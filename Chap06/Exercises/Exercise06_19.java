package Chap06.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_19
 * 概要:クラス数・各クラスの人数・全員の点数を読み込み、
        点数の合計点と平均点を求める
 * 作成者:S.Hiruta
 * 作成日:2024/04/19
 */
public class Exercise06_19 {

	/*
	 * 関数名：main
	 * 概要:クラス数・各クラスの人数・全員の点数を読み込み、
	        点数の合計点と平均点を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/19
	*/
	public static void main(String[] arg) {

		//入力読み込みの為のクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);

		//学校の全生徒の点数を格納する2次元配列を宣言
		double [][] scoreRecord = new double[0][0];

		//クラス数の入力を促す
		System.out.print("クラス数：");
		//クラス数を読み込む
		int classCount = standardInput.nextInt();
		//クラス数が正の整数で入力されるまで繰り返す処理
		while (classCount <= 0) {
			//クラス数を正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//クラス数の入力を促す
			System.out.print("クラス数：");
			//クラス数を読み込む
			classCount = standardInput.nextInt();
		}

		//凹凸な行列の列数が確定したため、改めて宣言
		scoreRecord = new double[classCount][];

		//クラス数表記の為の調整数を、定数で定義
		final int ADJUSTMENT_NUMBER = 1;

		//全てのクラスの全て生徒の点数を入力させる
		for (int i = 0; i < classCount; i++) {

			//クラスの人数を覚えて置く変数を定義
			int studentCount = 0;

			//各クラスの人数の入力を促す
			System.out.print((i + ADJUSTMENT_NUMBER) + "組の人数：");
			//各クラスの人数を読み込む
			studentCount = standardInput.nextInt();
			//各クラスの人数が正の整数で入力されるまで繰り返す処理
			while (studentCount <= 0) {
				//各クラスの人数を正の整数で入力するように促す
				System.out.println("正の整数で入力してください。");
				//各クラスの人数の入力を促す
				System.out.print((i + ADJUSTMENT_NUMBER) + "組の人数：");
				//各クラスの人数を読み込む
				studentCount = standardInput.nextInt();
			}

			//入力された人数のクラス(の配列)を宣言
			scoreRecord[i] = new double[studentCount];

			//各クラスの全て生徒の点数を入力させる
			for (int j = 0; j < studentCount; j++) {
				//クラスの1人づつの点数を入力させる
				System.out.print((i + ADJUSTMENT_NUMBER) + "組の" + (j + ADJUSTMENT_NUMBER) + "番の点数：");
				//入力された点数を該当クラス(の配列内)に読み込む
				scoreRecord[i][j] = standardInput.nextInt();
				//点数が0以上の整数で入力されない限り繰り返される処理
				while (scoreRecord[i][j] < 0) {
					//0以上の値を入力するように伝える
					System.out.println("0以上の値を入力してください");
					//クラスの1人づつの点数を入力させる
					System.out.print((i + ADJUSTMENT_NUMBER) + "組の" + (j + ADJUSTMENT_NUMBER) + "番の点数：");
					//入力された点数を該当クラス(の配列内)に読み込む
					scoreRecord[i][j] = standardInput.nextInt();
				}
			}
		}

		//全校生徒の総点数を記録するための変数
		double totalScore = 0;
		//全校生徒の総数を記録するための変数
		double totalStudent = 0;

		//合計点及び平均点表示の開始を示す
		System.out.println("   組 |    合計      平均");
		//表の仕切りの横線を表示
		System.out.println("------+------------------");

		//全クラスの合計点及び平均点を表示していく
		for (int i = 0; i < classCount; i++) {

			//表示するクラスの番号を示す
			System.out.printf("%3d", (i + ADJUSTMENT_NUMBER));
			//グラフの仕切りを表示
			System.out.print("組 |");

			//クラスの全得点を記憶するための変数を宣言
			double scoreSum = 0;

			//各クラスの生徒の点数を合計していく
			for (int j = 0; j < scoreRecord[i].length; j++) {
				//生徒の点数を合計していく
				scoreSum += (double)scoreRecord[i][j];
			}
			//合計した点数から平均点を算出
			double scoreAverage = scoreSum / scoreRecord[i].length;

			//合計点を表示
			System.out.printf("%8.0f", scoreSum);
			//合計点を表示
			System.out.printf("%10.1f", scoreAverage);
			//空白を表示
			System.out.println(" ");

			//各クラスの合計点を集計
			totalScore += scoreSum;
			//各クラスの人数を集計
			totalStudent += scoreRecord[i].length;
		}

		//表の仕切りの横線を表示
		System.out.println("------+------------------");
		//学校全体の数値の表示を示す
		System.out.print("   計 |");
		//合計点を表示
		System.out.printf("%8.0f", totalScore);
		//合計点を表示
		System.out.printf("%10.1f", totalScore / totalStudent);
		//空白を表示
		System.out.println(" ");
	}
}
