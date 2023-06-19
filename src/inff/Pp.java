package inff;

class Teache {
	private String teacherName;
	private String subject;
	private double salary;
	public Teache(String teacherName,String subject,double salary) {
		this.teacherName=teacherName;
		this.subject=subject;
		this.salary=salary;
	}
	public String getTeacheName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
    //Implement your code here
}

class Pp {
	public static void main(String[] args) {
//		Teache[]teacher=new Teache[3];
		Teache t1=new Teache("H","Maths",10000);
//		teacher [1]=new Teache("i","English",20000);
//		teacher [2]=new Teache("j","science",15000);
		Teache[]teacher=new Teache[3];
		Teache[]teachers= {t1};
		for(Teache t:teachers) {
			System.out.println(t1.getTeacheName()+t1.getSubject());
		}
		
		
		
		
		
	    // Implement your code here 
	}
}
