package Chap13.Lists;

//
import shape.HorzLine;
//
import shape.Point;
//
import shape.Rectangle;
//
import shape.Shape;
//
import shape.VirtLine;

/*
* クラス名:ShapeTester
* 概要:図形クラス群をテストする
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class ShapeTester {

	/*
	 * メソッド名：main
	 * 概要:図形クラス群をテストする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public static void main(String[] args) {

		//
		Shape[] P = new Shape[4];

		//
		P[0] = new Point();
		//
		P[1] = new HorzLine(5);
		//
		P[2] = new VirtLine(3);
		//
		P[3] = new Rectangle(4, 3);

		//
		for (Shape s : P) {
			//
			s.print();
			//
			System.out.println();
		}

	}

}
