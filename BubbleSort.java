public class BubbleSort{
	public static void main(String[] args){
		int[] arr = {4, 1, -10, 100, 23, 64, 7, 0, 9};
		for(int el: arr){
			System.out.print(el + " ");
		}

		boolean whileIsTrue = true;

		while(whileIsTrue){
			whileIsTrue = false;

			for(int i = 0; i < arr.length - 1; i++){
				if(arr[i] > arr[i + 1]){
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					whileIsTrue = true;
				}
			}
		}
		
		System.out.println();
		
		for(int el : arr){
			System.out.print(el + " ");
		}

	}
}
