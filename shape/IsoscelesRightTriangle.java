package shape;

/*
* クラス名:IsoscelesRightTriangle
* 概要:直角二等辺三角形を表す抽象メソッド
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public abstract class IsoscelesRightTriangle extends Shape{
	
	/*
	 * メソッド名：toString
	 * 概要:直角二等辺三角形の情報を表す文字列を返却
	 * 引数：なし
	 * 戻り値：直角三角形表示の文言(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public String toString() {
		//直角二等辺三角形を表示すると返却
		return "直角二等辺三角形を表示します。\n";
	}

	/*
	 * メソッド名：printSymbol
	 * 概要:直角二等辺三角形を表す記号を表示
	 * 引数：記号を表示する回数(int型)
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
	 * 引数：空白を表示する回数(int型)
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
	 * 概要:直角二等辺三角形を描画する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public  void draw() {
	}

}
