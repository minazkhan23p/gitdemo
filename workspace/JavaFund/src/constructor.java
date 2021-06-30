
public class constructor {
 
	public constructor(){//dafault type1 contructor
		System.out.println("constructor");
	}
	public constructor(int a, int b){//parameterized contructor 
		System.out.println(a+b);
	}
	public constructor(String c){//parameterized contructor 
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor cs=new constructor();// when we create a object for class if there is contrcutor it will execute or it will 
		//create an implicit constructor (dafault type2)
		constructor cs2=new constructor(2,3);
		constructor cs3=new constructor("HELLO");
	}

}
