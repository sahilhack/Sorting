
public class BubbleSort {
  static void bubbleSort(int[] arr)  {
		// TODO Auto-generated method stub
       
		int n=arr.length;
       
       int temp=0;
       for(int i=0;i<n;i++)
       {
    	   for(int j=0;j<n;j++)
    	   {
    		   if(arr[i]<arr[j]){
    			   temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    		   }
    	   }
       }
	}


public static void main(String[] args){
	int arr[]={3,17,42,1,64,130,7};
	System.out.println("Before Sorting:");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+"");
	}
	System.out.println();
	
BubbleSort sahil = new BubbleSort();
sahil.bubbleSort(arr);

System.out.println("After Sorting:");
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]+"");
}
}
}