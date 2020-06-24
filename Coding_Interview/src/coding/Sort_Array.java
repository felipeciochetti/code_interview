package coding;

public class Sort_Array {


	public Sort_Array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	}



	public int[]  insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while(j >= 0 && current < array[j]) {
				array[j+1] = array[j];
				j--;
			}
			// at this point we've exited, so j is either -1
			// or it's at the first element where current >= a[j]
			array[j+1] = current;
		}
		return  array;
	}
	public int[] sortArray(int[] q){
		boolean swipe = true;


		while (swipe) {
			swipe  = false;
			for (int i = 0; i < q.length -1; i++) {

				if(q[i] > q[i + 1]){

					int aux = q[i];
					q[i] = q[i + 1];
					q[i + 1] = aux;


					swipe = true;
					break;

				}
			}




		}

		return q;
	}

}
