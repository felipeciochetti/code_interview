package coding;

public class MinimumSwipe {
	
	
	public MinimumSwipe() {
		// TODO Auto-generated constructor stub
	}
	
	// to resolve the minimum swipe you just need compare the index of the array with value of the index.
	 
	//[1,2,3,4] index
	//[1,4,3,2] value

	public int minimumSwipe(int[] array){

		int qtdSwipe = 0;
		boolean swipe =  true;

		while( swipe ){

			swipe = false;
			for (int i = 0; i < array.length; i++) {
				
				
				// if my value is diferent your indice
				// them you swipe the current value to your rigth place
				if(array[i] != (i + 1)){

					int auxValue = array[i];

					array[i] = array[auxValue -1];
					array[auxValue -1] = auxValue; 

					qtdSwipe++;
					swipe  = true;
					break;
				}


			}

		}	
		
		return qtdSwipe;
	}

}
