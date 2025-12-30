package curriculum.k;

//⑦オブジェクト指向の設計原則
//抽象クラス
abstract class Employee implements Payable {
	public String name;
	public String id;
	public int hours;

	public Employee(String name, String id, int hours) {
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
}

//Full-time 正社員
class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, String id, int hours) {
		super(name, id, hours);
	}

	@Override
	public int calculateSalary() {
		//時給1200円
		return hours * 1200; 
	}
}

//contract 契約社員
class ContractEmployee extends Employee {
	public ContractEmployee(String name, String id, int hours) {
		super(name, id, hours);
	}

	@Override
	public int calculateSalary() {
		//時給1000円
		return hours * 1000;
		}
}
