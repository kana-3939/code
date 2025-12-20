package curriculum.b;

public class Main {
	public static void main(String[] args) {

		// Q4
		// Greeting クラスをインポート
		Greeting greeting = new Greeting();
		// sayHello() を実行
		greeting.sayHello();
		
		
//		問題の区切り
		System.out.println();

		// Q5
		// Animalクラスをインポート
		Animal lion = new Animal();

		// setterで値をセット
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);

		// getterで値を取得して表示
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");

	}

}
