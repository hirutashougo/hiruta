package Chap06.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_18
 * 概要:List6-18の変更。行列の大きさと各要素を入力するようにする
 * 作成者:S.Hiruta
 * 作成日:2024/04/19
 */
public class Exercise06_18 {

	/*
	 * 関数名：main
	 * 概要:List6-18の変更。行列の大きさと各要素を入力するようにする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/19
	*/
	public static void main(String[] arg) {
		
		//入力読み込みの為のクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		
		//表示する予定の凹凸な行列を表わす、2次元配列を宣言
		int[][] irregularityArray = new int[0][0];
		
		//行列の行数の入力を促す
		System.out.println("表示したい行列の行数を入力してください。");
		//行列の行数の入力を促す
		System.out.print("行数:");
		//入力された行数を読み込む
		int columunCount = standardInput.nextInt();
		//行数が0以上の整数で入力されるまで繰り返す処理
		while (columunCount <= 0) {
			//0以上の整数で入力するように表示
			System.out.println("0以上の整数で入力してください。");
			//再度、行数の入力を促す
			System.out.print("列数:");
			//入力された行数を読み込む
			columunCount = standardInput.nextInt();
		}
		
		//凹凸な行列の行数が確定したため、改めて宣言
		irregularityArray = new int[columunCount][];
		
		//列数表記の為の調整数を、定数で定義
		final int ADJUSTMENT_NUMBER = 1;
		
		//各列の列数を入力させる処理
		for (int i = 0; i < columunCount; i++) {
			//行列の列数の入力を促す
			System.out.println("各行の列数を入力してください。");
			//行列の列数の入力を促す
			System.out.print((i + ADJUSTMENT_NUMBER) + "行目の列数:");
			//入力された列数の読み込み
			int lineCount = standardInput.nextInt();
			//列数が0以上の整数で入力されるまで繰り返す処理
			while (lineCount <= 0) {
				//0以上の整数で入力するように表示
				System.out.println("0以上の整数で入力してください。");
				//再度、行列の入力を促す
				System.out.print((i + ADJUSTMENT_NUMBER) +"行目の列数:");
				//入力された行数を読み込む
				lineCount = standardInput.nextInt();
			}
			//入力された列数の列を宣言
			irregularityArray[i] = new int[lineCount];
			
			//行列の列数の入力を促す
			System.out.println((i + ADJUSTMENT_NUMBER) +"行目の要素を入力してください。");
			//各行の全ての要素を入力させる
			for (int j = 0; j < lineCount; j++) {
				//行の要素を入力させる
				System.out.print((i + ADJUSTMENT_NUMBER) + "行の" + (j + ADJUSTMENT_NUMBER) + "列目の点数：");
				//入力された要素を配列に読み込む
				irregularityArray[i][j] = standardInput.nextInt();
				//要素が0以上の整数で入力されない限り繰り返される処理
				while (irregularityArray[i][j] < 0) {
					//0以上の値を入力するように伝える
					System.out.println("0以上の値を入力してください");
					//要素に代入する値を入力させる
					System.out.print((i + ADJUSTMENT_NUMBER) + "行の" + (j + ADJUSTMENT_NUMBER) + "列目の点数：");
					//入力された要素の値を読み込む
					irregularityArray[i][j] = standardInput.nextInt();
				}
			}
		}
		
		//入力情報(行数と列数)に基づいた凹凸な行列を表示する。
		for (int i = 0; i < irregularityArray.length; i++) {
			//各行の要素を出力
			for (int j = 0; j < irregularityArray[i].length; j++) {
				//行列の要素部分に初期子「0」を表示
				System.out.printf("%3d", irregularityArray[i][j]);
			}
			//出力の終わった行を改行し、列を進める
			System.out.println();
		}
	}
}
