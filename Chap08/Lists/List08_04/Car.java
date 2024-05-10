package Chap08.Lists.List08_04;

/*
* クラス名:Car
* 概要:自動車のクラス【第一版】
* 作成者:S.Hiruta
* 作成日:2024/05/09
*/
class Car {
	//
	private String name;
	//
	private int width;
	//
	private int heigth;
	//
	private int length;
	//
	private double x;
	//
	private double y;
	//
	private double fuel;

	Car(String name, int width, int heigth, int length, double fuel) {
		//
		this.name = name;
		//
		this.heigth = heigth;
		//
		this.width = width;
		//
		this.length = length;
		//
		this.fuel = fuel;
		//
		x = y = 0.0;
	}

	//
	double getX() {
		return x;
	}

	//
	double getY() {
		return x;
	}

	//
	double getFuel() {
		return fuel;
	}

	//
	void putSpec() {
		//
		System.out.println("名前" + name);
		//
		System.out.println("車幅" + width + "mm");
		//
		System.out.println("車高" + heigth + "mm");
		//
		System.out.println("社長" + length + "mm");
	}
	
	//
	boolean move(double dx, double dy) {
		//
		double dist = Math.sqrt(dx * dx + dy * dy);

		//
		if (dist > fuel) {
			//
			return false;
		} else {
			//
			fuel -= dist;
			//
			x += dx;
			//
			y += dy;
			//
			return true;
		}
	}
}
