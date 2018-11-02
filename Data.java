package question2;

public class Data {
	
	Node head; 
	int size = 0; 
	int length = 10; 
	int[] array = new int[10]; 
	
	public Data(){
		
	}
	
	public void add(int a){
		
		
		if(head == null){
			head = new Node(a, null); 
			size++; 
			array[size-1] = a; 
			return; 
		}
		

		if(size >= array.length){
			length = 2* length; 
			int[] newArray = new int[length]; 
			for(int i = 0; i < array.length; i++){
				newArray[i] = array[i]; 
			}
			array = newArray; 
		}
		
		
		Node ptr = head; 
		
		while (ptr.next != null){
			ptr = ptr.next; 
		}
		Node lol = new Node(a, null); 
		ptr.next = lol; 
		size++; 
		
		
		array[size-1] = a; 
	
	}
	
	public int remove(){
		int temp = head.value; 
		head = head.next; 
		size--; 

		
		int[] newArray = new int[length]; 
		for(int i = 1; i < array.length; i++){
			newArray[i-1] = array[i]; 
		}
		
		array = newArray; 
		
		
		return temp; 
	}
	
	public int getValue(int index){
		if(index > size){
			return -1; 
		}
		return array[index]; 
		
	}
	
	public void printNodes(){
		Node ptr = head; 
		while(ptr != null){
			System.out.println(ptr.value);
			ptr = ptr.next;
		}
	}
	
	public void printArray(){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public int ProblemThree(Data data, int value){
		/*
		int right = this.size; 
		int left = 0; 
		int mid = right/2; 
		while(value > data.getValue(mid) || value < data.getValue(mid)){
			if(data.getValue(mid) == value){
				return value; 
			}
			if(value > data.getValue(mid)){
				mid = (right-mid)/2; 
			}
			if(value < data.getValue(mid)){
				mid = (mid - left)/2; 
			}
			
		}
		*/ 
		
		Node ptr = data.head; 
		
		while(ptr != null){
			if(ptr.value > value){
				return -1; 
			}
			if(ptr.value == value){
				return value; 
			}
			ptr = ptr.next; 
		}
		return -1; 
		
	}
	

	public static void main(String[] args) {
		
		Data test = new Data(); 
		test.add(1);
		test.add(9);
		test.add(4);
		test.add(5);
		test.add(10);
		test.add(0);

		System.out.println(test.getValue(0));
		System.out.println(test.getValue(3));
		/*
		System.out.println(" ");
		test.printNodes();
		
		System.out.println(" ");
		
		test.printArray();
		*/ 
		

	}

}
