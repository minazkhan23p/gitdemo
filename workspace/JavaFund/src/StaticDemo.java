
public class StaticDemo {
	
	String name;//instance variable
	String address;
	static String city;//class or static variable
	static int stat;
	int nonstat=0;
	static{
		city="BA";
		stat=0;
	}

	public StaticDemo(String name,String address){//local variable
		this.name=name;
		this.address=address;
		stat++;
		nonstat++;
		System.out.println(stat);
		System.out.println(nonstat);
		
		
		
	}
	public void getdata(){
		System.out.println(name+","+address+","+city);
		
	}
	public static void getd(int m){
		System.out.println(city);//we can get sts
		System.out.println(m);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticDemo obj1= new StaticDemo("minaz", "MA");
		StaticDemo obj2= new StaticDemo("min", "sd");
		obj1.getdata();
		obj2.getdata();
		System.out.println(city);
		getd(2);
	}

}
