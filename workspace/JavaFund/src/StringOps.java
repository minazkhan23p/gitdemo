
public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Minaz";
		String b="Contracts";
		String c="             house";
		String d="java training";
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("m"));//case sensitive
		System.out.println(b.substring(2,6));
		System.out.println(b.substring(3));
		System.out.println(a.concat(b));
		System.out.println(a.length());
		System.out.println(c.trim());
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		String[] spl=d.split(" ");
		System.out.println(spl[0]);
		System.out.println(spl[1]);
		System.out.println(d.replace("ing", "o"));
		
		
		

	}

}
