package TrainingSample;

public class SampleClassMethodsObjectsVariable {
	
	private int ab;

	public void Access()
	{
		int a=10;
		int b=30;		
		int c=a+b;
		
		System.out.println("print C val : " +c);
		
		
	}

	public static void main(String[] args) {
		
		SampleClassMethodsObjectsVariable M1 =new SampleClassMethodsObjectsVariable();
		M1.Access();
		
		M1.ab=10;
		
		System.out.println("print ab :"+M1.ab);
		
		
		
	}}
