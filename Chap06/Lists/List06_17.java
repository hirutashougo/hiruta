package Chap06.Lists;

/*
 * クラス名:List06_17
 * 概要:2行3列の行列を加算する
 * 作成者:S.Hiruta
 * 作成日:2024/04/18
 */
public class List06_17 {

	/*
	 * 関数名：main
	 * 概要:2行3列の行列を加算する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int[][] b = { {6, 3, 4}, {5, 1, 2} };
		int[][] c = { {0, 0, 0}, {0, 0, 0} };
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("行列a");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("行列b");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%3d", b[i][j]);
			}
			System.out.println();
		} 
		
		System.out.println("行列c");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		} 
	}
}
