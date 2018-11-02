package question1;

public class sort {
	
	public static void ExamSort(int[] a, int size){
		mergeSort(a,0, size -1); 
	}
	
	public static void mergeSort(int[] a, int left, int right){
		if (left < right){
			
			int mid = (right - left)/2; 
			mergeSort(a, left, mid);
			mergeSort(a, mid, right-1);
			sort1(a, left, mid, right);
		} else {
			return; 
		}
	}
	
	public static void sort1(int[] a, int left, int mid, int right){
		
		int n1 = mid; 
		int n2 = right - mid + 1; 
		
		// new arrays
		int[] L = new int[n1];
		int[] R = new int[n2]; 
		
		
		// fill in new arrays
		for(int i = 0; i < n1; i++){
			L[i] = a[left + i]; 
		}
		for(int i = 0; i < n2; i++){
			R[i] = a[mid + i]; 
		}
		int i = 0, j = 0; 
		int k = 0; 
		
		
		// compare the unmerged arrays and merge them
		while(i < n1 && j < n2){
			if(L[i] <= R[j]){
				a[k] = L[i]; 
				i++; 
				k++; 
			} else {
				a[k] = R[j]; 
				j++; 
				k++; 
			}
			
		
				
			

		}
		// whatever is left of the unmerged arrays => merge them 
		while(i < n1){
			a[k] = L[i]; 
			i++; 
			k++;

		}
		
		while(j < n2){
			a[k] = R[j]; 
			j++; 

			k++;
		}
		
		
	}
	
	public static void print(int[]a){
		System.out.println(" ");
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = {15,9,60,44,12,1,4}; 
		print(a);
		ExamSort(a,a.length); 
		print(a); 
		
	}

}
