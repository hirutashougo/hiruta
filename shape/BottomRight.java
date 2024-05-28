package shape;

/*
* クラス名:BottomRirht
* 概要:右下が直角の二等辺三角形を表す
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class BottomRight extends IsoscelesRightTriangle {

	//直角二等辺三角形の斜辺でない辺の長さを表すフィールドを宣言
	private int sideLength = 0;
	//直角二等辺三角形の横に表示する空白の数を表すフィールドを宣言
	private int spaceCount = 0;

	//表示する空白の個数を算出するために用いる定数を宣言
	private final int ADJUSTMENT_SPACE_COUNT = 1;

	/*
	 * コンストラクタ名：BottomRirht
	 * 概要:右下が直角の二等辺三角形を生成する
	 * 引数：直角二等辺三角形の一片の長さ(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public BottomRight(int sideLength) {
		//直角二等辺三角形の斜辺でない辺の長さを表すフィールドを初期化
		this.sideLength = sideLength;
		//表示する空白のフィールドを初期化
		spaceCount = sideLength - ADJUSTMENT_SPACE_COUNT;
	}

	/*
	 * メソッド名：toString
	 * 概要:直角二等辺三角形の情報を表す文字列を返却
	 * 引数：なし
	 * 戻り値：直角二等辺三角形の情報を表す文字列(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public String toString() {
		//右下が直角の三角形であると表示
		return "直角を挟む2辺の長さ：" + sideLength + "\n右下が直角の二等辺三角形";
	}

	/*
	 * メソッド名：draw
	 * 概要:右下が直角の二等辺三角形を描画する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public void draw() {
		//記号を最初に表示する個数を定数化
		final int FIRST_SYMBOL_COUNT = 1;
		//直角二等辺三角形の斜辺でない辺の長さ分、記号と空白を表示し、改行する
		for (int i = 0, j = FIRST_SYMBOL_COUNT, k = spaceCount; i < sideLength; i++, j++, k--) {
			//空白を表示。徐々に表示個数は減る
			printSpace(k);
			//記号を表示。徐々に表示個数は増える
			printSymbol(j);
			//一段表示し終わったら改行
			System.out.println();
		}
	}
}
