import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		HashSet<String> hs= new HashSet<String>();
		hs.add("minaz");
		hs.add("Minaz");
		hs.add("mInaz");
		hs.add("minaz");
		hs.add("MiNaz");
		hs.add("MinAz");
		System.out.println(hs);
		hs.remove("mInaz");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String>i=hs.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

	}

}
