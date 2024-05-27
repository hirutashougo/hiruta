package Chap13.Exercises;

//Scannerをインポート
import java.util.Scanner;

//shapeパッケージのHorzLineクラスをインポート
import shape.HorzLine;
//shapeパッケージのPointクラスをインポート
import shape.Point;
//shapeパッケージのRectangleクラスをインポート
import shape.Rectangle;
//shapeパッケージのShapeクラスをインポート
import shape.Shape;
//shapeパッケージのVirtLineクラスをインポート
import shape.VirtLine;

/*
* クラス名:ShapeTester
* 概要:図形クラス群をテストする
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class ShapeTester {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：printText
	 * 概要:入力された文言を表示
	 * 引数：表示したい文言(String型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	static void printText(String displayText) {
		//入力された文言を表示
		System.out.print(displayText);
	}

	/*
	 * 関数名：returnIntegralNumber
	 * 概要:0以上の整数(int型)を入力させ、変数に格納して返却する
	 * 引数：入力内容の文言(String型)
	 * 戻り値：0以上の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	static int returnIntegralNumber(String desplayIssue) {

		//入力内容の文言を表示
		System.out.print(desplayIssue);

		//入力された整数を読み込む
		int integralNumber = standardInput.nextInt();
		//入力された整数が0未満の場合
		while (integralNumber < 0) {
			//0以上の値で入力するように促す
			printText("0以上の値で入力してください。\n" + desplayIssue);
			//入力された値を読み込む
			integralNumber = standardInput.nextInt();
		}

		//入力された整数を返却
		return integralNumber;
	}

	/*
	 * メソッド名：main
	 * 概要:図形クラス群をテストする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public static void main(String[] args) {

		//図形を調べる回数を入力させる。
		int researchTimes = returnIntegralNumber("図形は何個：");
		//調べる回数として0回が入力された場合
		while (researchTimes == 0) {
			//0以上の値で入力するように促す
			printText("0以上の値で入力してください。\n");
			//再度、図形を調べる回数を入力させる。
			researchTimes = returnIntegralNumber("図形は何個：");
		}
		
		//描く図形を格納する配列を宣言
		Shape[] storeShapes = new Shape[researchTimes];
		
		//改行する
		System.out.println();

		//調べる図形として、点を選択したことを表す定数を定義
		final int CHOSE_POINT = 1;
		//調べる図形として、水平直線を選択したことを表す定数を定義
		final int CHOSE_HORIZON_LINE = 2;
		//調べる図形として、垂直直線を選択したことを表す定数を定義
		final int CHOSE_VIRTICLE_LINE = 3;
		//調べる図形として、長方形を選択したことを表す定数を定義
		final int CHOSE_RECTANGLE = 4;
		//調べる図形の選択肢の最小数字を定数化
		final int MINIMUM_NUMBER = 1;
		//調べる図形の選択肢の最大数字を定数化
		final int MAXIMUM_NUMBER = 4;
		//順番の最初の数字を定数化
		final int FIRST_NUMBER = 1;
		//図形の順番を表す変数を宣言
		int shapeNumber = FIRST_NUMBER;

		//指定回数分、図形選択させる
		for (int i = 0; i < researchTimes; i++, shapeNumber++) {

			//図形の種類を選択させる
			int researchChoise = returnIntegralNumber(shapeNumber + "番目の図形の種類 (1…点/2…水平直線/3…垂直直線/4…長方形)：");
			//入力された数字が選択肢外の場合
			while (researchChoise > MAXIMUM_NUMBER || researchChoise < MINIMUM_NUMBER) {
				//選択肢内の数字を入力するように促す
				printText(MINIMUM_NUMBER + "～" + MAXIMUM_NUMBER + "の数字を入力してください。\n");
				//再度、図形の種類を選択させる
				researchChoise = returnIntegralNumber(shapeNumber + "番目の図形の種類 (1…点/2…水平直線/3…垂直直線/4…長方形)：");
			}

			//選択に応じて図形情報の入力や図形の表示を行う
			switch (researchChoise) {
			//点が選択された場合
			case CHOSE_POINT:
				//調べる点を生成
				storeShapes[i] = new Point();
				//処理を終了
				break;
			//水平直線が選択された場合
			case CHOSE_HORIZON_LINE:
				//水平直線の長さを入力させる
				int horzLineLength = returnIntegralNumber("長さ：");
				//調べる水平直線を生成
				storeShapes[i] = new HorzLine(horzLineLength);
				//処理を終了
				break;
			//垂直直線が選択された場合
			case CHOSE_VIRTICLE_LINE:
				//垂直直線の長さを入力させる
				int virtLineLength = returnIntegralNumber("長さ：");
				//調べる垂直直線を生成
				storeShapes[i] = new VirtLine(virtLineLength);
				//処理を終了
				break;
			//長方形が選択された場合
			case CHOSE_RECTANGLE:
				//長方形の幅を入力させる
				int rectangleWidth = returnIntegralNumber("幅  ：");
				//長方形の高さを入力させる
				int rectangleHeight = returnIntegralNumber("高さ：");
				//調べる長方形を生成
				storeShapes[i] = new Rectangle(rectangleWidth, rectangleHeight);
				//処理を終了
				break;
			}
		}
		
		//改行する
		System.out.println();
		
		//選択された図形を表示していく
		for (int i = 0; i < researchTimes; i++) {
			//選択された図形を随時表示していく
			storeShapes[i].print();
			//改行する
			System.out.println();
		}
	}

}
