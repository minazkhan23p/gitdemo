import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d= new Date();
SimpleDateFormat sdf= new SimpleDateFormat("MM/d/YYYY HH:mm:ss");
System.out.println(sdf.format(d));

System.out.println(d.toString());
	}

}
