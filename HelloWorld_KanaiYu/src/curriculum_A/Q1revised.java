package curriculum_A;

public class Q1revised {
	
	public static void main(String[] args) {

		//課題1
		//バイト型
		byte byteNum =0;
		//短整数型
		short shortNum = 0;
		//整数型
		int intNum = 0;
		//長整数型
		long longNum = 0L;
		//単精度浮動小数点数型
		float floatNum =0.0f;
		//倍精度浮動小数点数型
		double doubleNum = 0.0;
		//文字型
		char letter = '\u0000';
		//文字列型
		String letters = null;
		//ブーリアン型
		boolean sample = false;
		
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
	
	    /*
	     * 課題6
	     */
	    //代入
	    String name = "山田太郎";
	    int age = 18;
	    float height = 170.5F;
	    float weight = 62.2F;
	    String food = "寿司";
	    //出力
	    System.out.println("初めまして" + name + "です");
	    System.out.println("年齢は" + age + "です");
	    System.out.println("身長は"+ height +"㎝です");
	    System.out.println("体重は"+ weight +"㎏です");
	    System.out.println("好きな食べ物は"+ food +"です");
	    
	    
	    /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
	
	    /*
	     * 課題7　BMIを出力させる
	     * BMI＝体重（㎏）/身長（ｍ）**２
	     */
	    //まず身長の単位をｃｍからｍに変換する
	    double height_m = (height / 100.0);
	    //BMIの計算
	    double bmi = weight / (height_m * height_m);
	    //小数第二位まで表示させる
	    String formattedBmiYamada = String.format("%.2f", bmi);
	    //出力
	    System.out.println("BMIは" + formattedBmiYamada +"です");
	    
	    
	    /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
	    
	    /*
	     * 課題8　再代入
	     */
	    //代入
	    name = "鈴木一郎";
	    age = 24;
	    height = 168.5F;
	    weight = 64.2F;
	    food = "オムライス";
	    //まず身長の単位をｃｍからｍに変換する
	    height_m = (height / 100.0);
	    //BMIの計算
	    bmi = weight / (height_m * height_m);
	    //小数第二位まで表示させる
	    String formattedBmiSuzuki = String.format("%.2f", bmi);
	    
	    //出力
	    System.out.println("初めまして" + name + "です");
	    System.out.println("年齢は" + age + "です");
	    System.out.println("身長は"+ height +"㎝です");
	    System.out.println("体重は"+ weight +"㎏です");
	    System.out.println("好きな食べ物は"+ food +"です");
	    System.out.println("BMIは" +  formattedBmiSuzuki +"です");

	    
	    /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
	
	    /*
	     * 課題9
	     */
	    age += 24;
	    height += 168.5;
	    weight += 64.2;
	    //まず身長の単位をｃｍからｍに変換する
	    height_m = (height / 100.0);
	    //BMIの計算
	    bmi = weight / (height_m * height_m);
	    //小数第二位まで表示させる
	    String formattedBmi = String.format("%.2f", bmi);
	    
	     //出力
	    System.out.println("初めまして" + name + "です");
	    System.out.println("年齢は" + age + "です");
	    System.out.println("身長は"+ height +"㎝です");
	    System.out.println("体重は"+ weight +"㎏です");
	    System.out.println("好きな食べ物は"+ food +"です");
	    System.out.println("BMIは" +  formattedBmi +"です");
	}
		}

	   
