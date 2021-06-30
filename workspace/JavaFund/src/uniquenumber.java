import java.util.ArrayList;

public class uniquenumber {
	//static int uniquenumber;
	public static void main(String[] args) {
		 int uniquenumber=0;	
		// TODO Auto-generated method stub
int a[]={1,2,3,1,2,3,5,6,5,6,4,1,9,2,8,8,2,9,8};
ArrayList<Integer>ar=new ArrayList<Integer>();
for(int i=0;i<a.length;i++){
	int k=0;
	if(!(ar.contains(a[i]))){
		ar.add(a[i]);
		k++;
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]){
				k++;
			}
		}
		System.out.println(a[i]+" "+k);
		
	}
	if(k==1){
		uniquenumber=a[i];
	}
	
}
System.out.println(uniquenumber+" is a unique number");

	}

}
