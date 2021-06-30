
public class exception {
static int a=7;
static int b=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int k=a/b;
			System.out.println(k);
			
		}
	
		catch(ArithmeticException at){
			System.out.println("ArithmeticException"
					+ "");
		}
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (Exception e) {//generic exception
			System.out.println("exception");
		}
		finally {//we can use only after try and only for try and it will be executed if there's failure/no catch block /code fails
			System.out.println("final");
		}
		

	}

}
