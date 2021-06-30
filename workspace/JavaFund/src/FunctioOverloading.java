
public class FunctioOverloading {
	//functiom overloading
	//either the data type of argumnets of  two or more similar menthods should be different or no of arguments should be diffrent
	
	public void getdata(int a){
		System.out.println(a);
	}
	
	public void getdata(String b){
		System.out.println(b);
	}

	public void getdata(int a,int b){
		System.out.println(a+""+b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctioOverloading f=new FunctioOverloading();
				f.getdata(2);
				f.getdata("man");
				f.getdata(2, 3);
	}

}
