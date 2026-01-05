package curriculum.selfIntroduction;

public class Main {
	public static void main(String[] args) {
		// (問題5) 引数に weight (60) を追加
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);

		// インスタンスメソッドの呼び出し
		person1.print();

		// (問題10) 合計人数の出力
		// 直接 count を触るのではなく、メソッド経由で聞く
		System.out.println("合計" + Person.getCount() + "人です");
	}
}
