
public class implementInterface implements Central {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		implementInterface i= new implementInterface();
		//or Central i= new implementInterface();
		i.RedStop();
		i.Greengo();
		i.YellowWait();
		i.park();
	}
	

	@Override
	public void Greengo() {
		// TODO Auto-generated method stub
		System.out.println("Greengo");
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("RedStop");
	}

	@Override
	public void YellowWait() {
		// TODO Auto-generated method stub
		System.out.println("YellowWait");
	}
	
	public void park() {
		// TODO Auto-generated method stub
		System.out.println("park");
	}

}
