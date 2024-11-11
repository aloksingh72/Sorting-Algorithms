//Dated-> 08/11/2024
// merge sort pratice
class MergeSort1 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 4, 7, 9, 4, 8 };

		// method calling

		mergeSort(arr, 0, arr.length - 1);

		for (int num : arr) {

			System.out.print(num + " ");
		}

	}

	// method declaration
	public static void mergeSort(int[] arr, int left, int right) {

		if (left < right) {

			int mid = (left + right) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			// merge the sorted halves
			merge(arr, left, mid, right);
		}

	}
       //merge method logic
	public static void merge(int[] arr, int left, int mid, int right) {

		// calculate the sizes of two sub arrays
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// create the tempoerary arrays
		int[] lArr = new int[n1];
		int[] rArr = new int[n2];

		// copy data to the temporary arrays
		// for (int i = 0; i < n1; i++) {

		// 	lArr[i] = arr[left + i];

		// }
		// for (int j = 0; j < n2; j++) {
		// 	rArr[j] = arr[mid + 1 + j];
		// }

		for(int i =0;i<n1;i++){
			lArr[i] = arr[left +i];
		}

		for(int j =0;j<n2;j++){
			rArr[j] = arr[mid+1+j];
		}
		// comparing and Merge the left arrays elements and right arrays elements

		int i = 0;
		int j = 0;
		int k = left;
		while (i < n1 && j < n2) {

			if (lArr[i] <= rArr[j]) {
				arr[k] = lArr[i];
				i++;

			}

			else {

				arr[k] = rArr[j];
				j++;
			}

			k++;
		}

		// copy the remaining elements
		while (i < n1) {

			arr[k] = lArr[i];
			i++;
			k++;

		}

		while (j < n2) {

			arr[k] = rArr[j];
			j++;
			k++;
		}

	}

}
