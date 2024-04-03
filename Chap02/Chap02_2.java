package Chap02;
//クラスの宣言
public class Chap02_2 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		int x;        //xはint型の変数
		int y;        //yはint型の変数
		int z;        //zはint型の変数
		
		x = 63;       //xに63を代入
		y = 18;       //yに18を代入
		z = 44;       //zに44を代入
		
		
		System.out.println("xの値は" + x + "です。");                 //xの値を表示
		System.out.println("yの値は" + y + "です。");                 //yの値を表示
		System.out.println("zの値は" + z + "です。");                 //zの値を表示
		System.out.println("合計は" + ( x + y + z ) + "です。");      //合計を表示
		System.out.println("平均は" + ( x + y + z ) / 3 + "です。");  //平均を表示


	}

}
