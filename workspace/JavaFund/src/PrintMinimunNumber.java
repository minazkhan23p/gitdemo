
public class PrintMinimunNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min;
		int maxcolno = 0;
int a[][]={{8,2,3},{1,-55,5},{-10,2,2}};
min=a[0][0];
for(int j=0;j<3;j++){
	for(int k=0;k<3;k++){
		if(a[j][k]<min){
		min=a[j][k];
		maxcolno=k;
	
				}
	}
}
int maxrowvalue=a[0][maxcolno];
for(int m=0; m<3;m++){
	if(a[m][maxcolno]>maxrowvalue){
		maxrowvalue=a[m][maxcolno];
	}
	
}
//another method 
/*int f=0;
while(f<3)
{
if(a[f][maxcolno]>maxrowvalue)
{
	maxrowvalue=a[f][maxcolno];
}
f++;
}*/
System.out.println(min);
System.out.println(maxrowvalue);
	}

}
