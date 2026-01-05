package curriculum.selfIntroduction;

public class Person {
	// (問題1)インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	//(問題4)
	public double weight;

	// (問題10) 人数の合計を保持するためのクラス変数
	public static int count = 0;

	// (問題2・3) コンストラクタを定義し、各インスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		//(問題4)
		this.weight = weight;
	// (問題10)	
		count++;
	}

	// (問題6, 7) BMIを計算して返すメソッド
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	// (問題8, 9) 情報を出力するインスタンスメソッド
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		// String.formatなどを使うと小数点以下の桁数を調整できます
		System.out.printf("BMIは%.1fです\n", this.bmi());
	}
	
	// (問題10) 合計人数を出力するメソッド
    public static int getCount() {
        return count;
    }
}
