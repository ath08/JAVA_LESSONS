public class Arr{
	public static void main(String[] args){
		int[] arr = new int[7];
		arr[0] = 10;
		arr[1] = 52;
		arr[3] = 13;
		arr[6] = 66;

		System.out.println(arr[0]);      //10
		System.out.println(arr[1]);      //52
		System.out.println(arr[2]);      //0 int default value
		System.out.println(arr[3]);      //13
		System.out.println(arr.length);  //7
		System.out.println(arr[arr.length - 1]); //66
		System.out.println(arr[0] + arr[arr.length - 1]); //76

		int[] arr1 = {1, 5, 3};
		System.out.println(arr1[0]); //1
		arr1[0] = 7;
		System.out.println(arr1[0] + arr1[arr1.length - 1]); // 7 + 3 => 10

		int[] arr2;
		arr2 = new int[] {1, 2, 3};
		System.out.println(arr2[2]); //3


		int[] arr3 = new int[5]; //1
		int[] arr4 = {1, 2, 3, 4}; //2
		int[] arr5;
		arr5 = new int[]{1, 1, 0}; //3


	}
}