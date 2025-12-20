package curriculum.b;

public class Question5 {
	public static void main(String[] args) {

		// Q1
		// 実行例
		helloWorld();

		//		問題の区切り
		System.out.println();

		// Q2
		// inputに10を設定
		int input = 10;
		int result = doubleValue(input);
		// 実行例
		System.out.println(input + " を 2 倍すると " + result + " です。");

		//		問題の区切り
		System.out.println();

		// Q3
		// num1に7,num2に10を設定
		int num1 = 7;
		int num2 = 10;

		// 実行例
		cheak(num2);
		cheak(num1);

	}

	// Method

	// Q1
	// 引数なし ,戻り値なし ,"Hello, World!" を表示
	public static void helloWorld() {
		System.out.println("Hello, World!");
	}

	// Q2
	// 引数：整数 (int num) 戻り値：整数（引数の2倍の値）
	public static int doubleValue(int num) {
		return num * 2;
	}

	// Q3
	// 引数：整数 (int num),戻り値：true（偶数なら）、false（奇数なら）
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	// 結果によって適切な文言を表示
	public static void cheak(int num) {
		if (isEven(num)) {
			System.out.println(num + " は偶数です。");
		} else {
			System.out.println(num + " は奇数です。");
		}
	}


}
