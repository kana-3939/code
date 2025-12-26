package curriculum.i;

//⑤ポリモーフィズム
import java.util.ArrayList;
import java.util.List;

//定義済みクラス

abstract class Employee {
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract int calculateDailyWage(int hoursWorked);
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {
        int hourlyRate = 1250;
        int overtime = Math.max(0, hoursWorked - 8);
        int regularHours = hoursWorked - overtime;
        return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
    }
}

class ContractEmployee extends Employee {
    public ContractEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {
        int hourlyRate = 1000;
        // Simple calculation: No overtime multiplier for contract employees
        return hoursWorked * hourlyRate;
    }
}

// ここから課題

public class Main {
    public static void main(String[] args) {
        // リストを作る　List<データ型名> オブジェクト名 = new ArrayList<データ型名>();
        List<Employee> employees = new ArrayList<>();
        // リストに追加する
        employees.add(new FullTimeEmployee("F001", "佐藤太郎"));
        employees.add(new ContractEmployee("C001", "田中花子"));
        employees.add(new FullTimeEmployee("F002", "伊藤次郎"));
        employees.add(new ContractEmployee("C002", "仲田草子"));

        // 勤務時間を代入
        int hoursWorked = 9;

        //  勤務時間表示
        System.out.println("勤務時間: " + hoursWorked + "h");
        //  for-each を使う　 for (Employee e : employees) { ... }
        for (Employee e : employees) {
         // 給与計算
            int wage = e.calculateDailyWage(hoursWorked);
         //社員ID、名前、給与を表示
            System.out.println("社員ID: " + e.id + "  Name: " + e.name + "  給与: " + wage + " 円");
        }
    }
}
