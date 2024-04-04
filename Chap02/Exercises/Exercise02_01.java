package Chap02.Exercises;
//クラスの宣言
public class Exercise02_01 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		int x;        //xはint型の変数
		int y;        //yはint型の変数
		
		x = 63.3;       //xに63.3を代入
		y = 18.2;       //yに18.2を代入
		
		
		System.out.println("xの値は" + x + "です。");                 //xの値を表示
		System.out.println("yの値は" + y + "です。");                 //yの値を表示
		System.out.println("合計は" + ( x + y ) + "です。");      //合計を表示
		System.out.println("平均は" + ( x + y ) / 2 + "です。");  //平均を表示

	}

}
