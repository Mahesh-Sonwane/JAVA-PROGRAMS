package programs;

public class CheckIfPresent {

	public static void main(String[] args) {
		
		int[] a= new int[4];
		a[0]=33;
		a[1]=22;
		a[2]=11;
		a[3]=66;
		
	
		int search=66;
		boolean flag=false;
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]==search)
			{
				System.out.println("The nunber is present in my array");
				flag=true;
				break;
			}
			System.out.println(flag);

		}
		if(flag==false)
		{
			System.out.println("The nunber is not present in my array");
		}

	}

}
