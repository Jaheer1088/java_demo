package inff;

class Faculty{
    //Implement your code here
	private String name;
	private float basicSalary;
	private float bonusPercantage=4f;
	private float carAllowancePercantage=2.5f;
	Faculty(String name,float basicSalary){
		this.name=name;
		this.basicSalary=basicSalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getBonusPercantage() {
		return bonusPercantage;
	}
	public void setBonusPercantage(float bonusPercantage) {
		this.bonusPercantage = bonusPercantage;
	}
	public float getCarAllowancePercantage() {
		return carAllowancePercantage;
	}
	public void setCarAllowancePercantage(float carAllowancePercantage) {
		this.carAllowancePercantage = carAllowancePercantage;
	}
	public double calculateSalary() {
		double facultysalary=0;
		facultysalary=this.basicSalary+((basicSalary/100)*4+(basicSalary/100)*25);
			return facultysalary;		
	}		
}

class OfficeStaff extends Faculty {
    //Implement your code here
	private String designation;
	
	OfficeStaff(String name,float basicSalary,String designation){
	super(name,basicSalary);
	this.designation=designation;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public double calculateSalary( ) {
		//double additionalPay=super.calculateSalary();
		double OfficestaffSalary=this.getBasicSalary();
	
		//double additionalPay=super.calculateSalary();
		if(this.designation=="Accountant") {
			OfficestaffSalary = OfficestaffSalary+10000.0;
		}
		else if(this.designation=="clerk") {
			OfficestaffSalary=OfficestaffSalary+7000.0;
		}
		else {
			OfficestaffSalary=OfficestaffSalary+4500.0;
		}
		return OfficestaffSalary;
	}
	
}

class Teacher extends Faculty{
    //Implement your code here
	private String qualification;
	Teacher(String name,float basicSalary,String qualification){
		super(name,basicSalary);
		this.qualification=qualification;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public double calculateSalary() {
		double additionalPay=super.calculateSalary();
		double Teachersalary=0;
		if(this.qualification=="Dotoral") {
			Teachersalary=additionalPay+20000;
		}
		else if(this.qualification=="Masters") {
			Teachersalary=additionalPay+18000;
		}
		else if(this.qualification=="Bachelors") {
			Teachersalary=additionalPay+15500;
		}
		else {
			Teachersalary=additionalPay+1000;
		}
		return Teachersalary;
	}
}


class Teste {
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
		Faculty faculty=new Faculty("ravi",10000);
		System.out.println("faculty details");
		System.out.println("name:"+faculty.getName());
		//System.out.println("\"Total salary: $"+faculty.getBasicSalary());
		//faculty.calculateSalary();
System.out.println(faculty.calculateSalary());


		System.out.println("Teacher Details\n***************");
		System.out.println("Name: "+teacher.getName());
		System.out.println("Qualification: "+teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0); 
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: "+officeStaff.getName());
		System.out.println("Designation: "+officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 

        //Create more objects for testing your code   

	}
}

