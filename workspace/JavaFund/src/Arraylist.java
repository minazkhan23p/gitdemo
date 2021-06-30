import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a= new ArrayList<String>();
a.add("minaz");
a.add("Khan");
a.add(0, "name is ");
System.out.println(a);
System.out.println(a.contains("minaz"));
System.out.println(a.indexOf("Khan"));
System.out.println(a.isEmpty());
System.out.println(a.size());
System.out.println(a.get(2));
a.remove("name is ");
a.remove(1);
System.out.println(a);

	}

}
