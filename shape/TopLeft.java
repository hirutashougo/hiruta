package shape;

/*
* クラス名:TopLeft
* 概要:左上が直角の二等辺三角形を表す
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class TopLeft extends IsoscelesRightTriangle {

	//直角二等辺三角形の斜辺でない辺の長さを表すフィールドを宣言
	private int sideLength = 0;
	//直角二等辺三角形として表示する記号の数を表すフィールドを宣言
	private int symbolCount = 0;
	//直角二等辺三角形の横に表示する空白の数を表すフィールドを宣言
	private int spaceCount = 0;

	/*
	 * コンストラクタ名：TopLeft
	 * 概要:左上が直角の二等辺三角形を生成する
	 * 引数：直角二等辺三角形の斜辺でない辺の長さ(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public TopLeft(int sideLength) {
		//直角二等辺三角形の斜辺でない辺の長さを表すフィールドを初期化
		this.sideLength = sideLength;
		//表示する記号のフィールドを直角二等辺三角形の一片の長さで初期化
		this.symbolCount = sideLength;
		//表示する空白のフィールドを初期化
		spaceCount = 0;
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
		//左上が直角の二等辺三角形であると表示
		return "直角を挟む2辺の長さ：" + sideLength + "\n左上が直角の二等辺三角形";
	}

	/*
	 * メソッド名：draw
	 * 概要:左上が直角の二等辺三角形を描画する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public void draw() {
		//直角二等辺三角形の斜辺でない辺の長さ分、記号と空白を表示し、改行する
		for (int i = 0, j = symbolCount, k = spaceCount; i < sideLength; i++, j--, k++) {
			//記号を表示。徐々に表示個数は減る
			printSymbol(j);
			//空白を表示。徐々に表示個数は増える
			printSpace(k);
			//一段表示し終わったら改行
			System.out.println();
		}
	}
}
