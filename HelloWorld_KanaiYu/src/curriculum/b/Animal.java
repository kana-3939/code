package curriculum.b;

// Q5
public class Animal {
	//（？）なぜ　private　は必要なのか…（？）
	//動物名
	private String name;
	//体長
	private double length;
	//速度
	private int speed;

	// Setter method
	public void setName(String name) {
		// thisを使ってフィールドに代入
		this.name = name;
	}

	public void setLength(double length) {
		// thisを使ってフィールドに代入
		this.length = length;
	}

	public void setSpeed(int speed) {
		// thisを使ってフィールドに代入
		this.speed = speed;
	}

	// Getter method
	public String getName() {
		// return を使って値を返す
		return name;
	}

	public double getLength() {
		// return を使って値を返す
		return length;
	}

	public int getSpeed() {
		// return を使って値を返す
		return speed;
	}
}