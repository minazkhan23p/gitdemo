
public class child extends ParentAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c= new child();
		c.colour();
		c.engine();
		c.safety();
	
	}
	public void safety(){//functrion overriding: if the parent anmd child have same method and same argument then the  prefrence is given
		//for child class and not parent
		System.out.println("safety child");
	
		
	}
	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("colour");
	}

}
