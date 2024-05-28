package Chap13.Exercises;

//Scannerをインポート
import java.util.Scanner;

//shapeパッケージのBottomLeftクラスをインポート
import shape.BottomLeft;
//shapeパッケージのBottomRightクラスをインポート
import shape.BottomRight;
//shapeパッケージのIsoscelesRightTriangleクラスをインポート
import shape.IsoscelesRightTriangle;
//shapeパッケージのTopLeftクラスをインポート
import shape.TopLeft;
//shapeパッケージのTopRightクラスをインポート
import shape.TopRight;

/*
* クラス名:IsoscelesRightTriangleTester
* 概要:直角二等辺三角形のクラス群をテストする
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class IsoscelesRightTriangleTester {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：returnPlusIntegr
	 * 概要:正の整数(int型)を入力させ、変数に格納して返却する
	 * 引数：入力内容の文言(String型)
	 * 戻り値：正の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	static int returnPlusIntegr(String desplayIssue) {

		//入力内容の文言を表示
		System.out.print(desplayIssue);

		//入力された整数を読み込む
		int plusInteger = standardInput.nextInt();
		//入力された整数が0以下の場合
		while (plusInteger <= 0) {
			//正の値で入力するように促す
			System.out.print("正の値で入力してください。\n" + desplayIssue);
			//入力された値を読み込む
			plusInteger = standardInput.nextInt();
		}

		//入力された整数を返却
		return plusInteger;
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

		//図形の表示数を入力させる
		int drawTimes = returnPlusIntegr("図形の表示数：");

		//描く図形を格納する配列を宣言
		IsoscelesRightTriangle[] storeShapes = new IsoscelesRightTriangle[drawTimes];

		//改行する
		System.out.println();

		//直角の位置として、左下を選択したことを表す定数を定義
		final int CHOSE_BOTTOM_LEFT = 1;
		//直角の位置として、右下を選択したことを表す定数を定義
		final int CHOSE_BOTTOM_RIGHT = 2;
		//直角の位置として、左上を選択したことを表す定数を定義
		final int CHOSE_TOP_LEFT = 3;
		//直角の位置として、右上を選択したことを表す定数を定義
		final int CHOSE_TOP_RIGHT = 4;
		//直角の位置の選択肢の最小数字を定数化
		final int MINIMUM_CHOICE_NUMBER = 1;
		//直角の位置の選択肢の最大数字を定数化
		final int MAXIMUM_CHOICE_NUMBER = 4;
		//順番の最初の数字を定数化
		final int FIRST_NUMBER = 1;
		//図形の順番を表す変数を宣言
		int shapeNumber = FIRST_NUMBER;

		//指定回数分、図形選択させる
		for (int i = 0; i < drawTimes; i++, shapeNumber++) {

			//直角の位置を選択させる
			int researchChoise = returnPlusIntegr(shapeNumber + "番目の三角形の直角の位置 (1…左下/2…右下/3…左上/4…右上)：");
			//入力された数字が選択肢外の場合
			while (researchChoise > MAXIMUM_CHOICE_NUMBER || researchChoise < MINIMUM_CHOICE_NUMBER) {
				//選択肢内の数字を入力するように促す
				System.out.print(MINIMUM_CHOICE_NUMBER + "～" + MAXIMUM_CHOICE_NUMBER + "の数字を入力してください。\n");
				//再度、直角の位置を選択させる
				researchChoise = returnPlusIntegr(shapeNumber + "番目の三角形の直角の位置 (1…左下/2…右下/3…左上/4…右上)：");
			}

			//直角を挟む辺の長さを入力させる
			int sideLength = returnPlusIntegr("直角を挟む辺の長さ：");

			//選択された直角の位置に応じて図形情報の入力や図形の表示を行う
			switch (researchChoise) {
			//直角の位置として、左下が選択された場合
			case CHOSE_BOTTOM_LEFT:
				//左下が直角の二等辺三角形を生成
				storeShapes[i] = new BottomLeft(sideLength);
				//処理を終了
				break;
			//直角の位置として、右下が選択された場合
			case CHOSE_BOTTOM_RIGHT:
				//右下が直角の二等辺三角形を生成
				storeShapes[i] = new BottomRight(sideLength);
				//処理を終了
				break;
			//直角の位置として、左上が選択された場合
			case CHOSE_TOP_LEFT:
				//左上が直角の二等辺三角形を生成
				storeShapes[i] = new TopLeft(sideLength);
				//処理を終了
				break;
			//直角の位置として、右上が選択された場合
			case CHOSE_TOP_RIGHT:
				//右上が直角の二等辺三角形を生成
				storeShapes[i] = new TopRight(sideLength);
				//処理を終了
				break;
			}
		}

		//改行する
		System.out.println();

		//選択された図形を表示していく
		for (int i = 0; i < drawTimes; i++) {
			//選択された図形を随時表示していく
			storeShapes[i].print();
			//改行する
			System.out.println();
		}
	}

}
