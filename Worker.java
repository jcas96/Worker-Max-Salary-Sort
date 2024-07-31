
public class Worker implements Comparable<Worker>{
	private int id;
	private String name;
	private Integer salary;
	private String jobTitle;
	
	public void setID(int iden) {
		id=iden;
	}
	public void setName(String n) {
		name=n;
	}
	public void setSalary(Integer sal) {
		salary = sal;
	}
	public void setTitle(String t) {
		jobTitle = t;
	}

	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getSalary() {
		return salary;
	}
	
	public String getTitle() {
		return jobTitle;
	}
	
	Worker(int i, String n,Integer sal, String t){
		setID(i);
		setName(n);
		setSalary(sal);
		setTitle(t);
	}
	
	@Override
	public int compareTo(Worker w) {
		if(salary ==w.salary) {
			return 0;
		}
		else if(salary <w.salary) {
			return 1;
		}
		else {
			return -1;
		}
	}
	@Override
	public String toString() {
		
		return String.format("ID: %d Name: %S Salary: $%d Job Title: %S\n", id,name,salary,jobTitle);
	}

}