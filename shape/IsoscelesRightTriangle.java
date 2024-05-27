package shape;

/*
* クラス名:IsoscelesRightTriangle
* 概要:直角二等辺三角形を表す抽象メソッド
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public abstract class IsoscelesRightTriangle {

	/*
	 * メソッド名：toString
	 * 概要:直角二等辺三角形の情報を表す文字列を返却
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public abstract String toString();

	/*
	 * メソッド名：printSymbol
	 * 概要:直角二等辺三角形を表す記号を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public void printSymbol(int printCount) {
		//指定回数分繰り返す
		for (int i = 0; i < printCount; i++) {
			//直角二等辺三角形を表す記号を表示
			System.out.print('＊');
		}
	}

	/*
	 * メソッド名：printSpace
	 * 概要:空白を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public void printSpace(int printCount) {
		//指定回数分繰り返す
		for (int i = 0; i < printCount; i++) {
			//空白を表示
			System.out.print("  ");
		}
	}

	/*
	 * メソッド名：draw
	 * 概要:直角二等辺三角形を描画するための抽象メソッド
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public abstract void drawTriangle();

	/*
	 * メソッド名：print
	 * 概要:直角二等辺三角形の情報の表示と図形の描画を行う
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public void prinTriangle() {
		//直角二等辺三角形を情報の表示
		System.out.println(toString());
		//図形を描画
		drawTriangle();
	}
}
