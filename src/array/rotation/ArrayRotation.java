package array.rotation;

public class ArrayRotation {

	static void rotateArray(int[] arr,int d,int n)  {
		
		for(int i=0; i<2; i++) {
			leftRotate(arr,n);
		}	
	}
	
	 static void leftRotate(int arr[],int n) {
		 int temp = arr[0];
		 for(int i=0; i<n-1; i++) {
			 arr[i] = arr[i+1];
		 }
		 arr[n-1] = temp;
	 }
	 
	 static void printArray(int[] arr) {
		 for (int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]+" ");
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7};
		rotateArray(arr,2,arr.length);
		printArray(arr);

	}

}
