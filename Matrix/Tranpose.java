class Tranpose
{
    public static void main(String[] args) {
		int a [][] = {{10,20,30},{40,50,60},{70,80,90}};
		int[][] b = new int[a.length][a[0].length];
		for(int i =0;i<=a.length-1;i++) {
			for(int j = 0 ;j<=a[i].length-1;j++) 
			{
				b[i][j]=a[j][i];
			}
			
		}
		for(int i = 0 ;i<=a.length-1;i++) 
		{
			for(int j =0 ;j<=a.length-1;j++) 
			{
				System.out.print(b[i][j] + " ");
				
			}
			System.out.println();
			
		}
	}
}