package java_8;

class Employee{
	private int Eid;
	private String Ename;
	private int salary;
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int eid, String ename, int salary) {
		super();
		Eid = eid;
		Ename = ename;
		this.salary = salary;
	}
	}
	

