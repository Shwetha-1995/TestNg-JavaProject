package TrainingSample;

public class AccessVariablefromotherclass {
	
	public static void main(String[] args) {
		demoClass acc = new demoClass();
				
				acc.slno = 1;
				acc.name = "shwetha";
		acc.rollno = 1234;
		
		System.out.println("Slno :" +acc.slno );
		
		System.out.println("Name :"+acc.name);
		
		System.out.println("rollno :" + acc.rollno);
	}
	

}
