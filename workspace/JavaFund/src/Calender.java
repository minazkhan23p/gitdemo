import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal=Calendar.getInstance();
System.out.println(cal.get(Calendar.DAY_OF_MONTH));
System.out.println(cal.get(Calendar.AM_PM));
System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
System.out.println(cal.get(Calendar.DAY_OF_WEEK));
SimpleDateFormat sdf =new SimpleDateFormat("MM/d/yyyy HH:mm:ss");
System.out.println(sdf.format(cal.getTime()));
	}

}
