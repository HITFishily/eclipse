package webcoding;

public class Printnumbers {
	private int n;
	private int[] numbers;
	public Printnumbers(int n) {
		super();
		this.n = n;
		numbers = new int[n];
		for( int i = 0; i < n; i++) {
			numbers[i] = 0;
		}
	}
	
	public boolean increase(int[] number) {
		int length = number.length;
		int number_of_nine = 0;
		for( int i = length - 1; i >= 0; i-- ){
			if(number[i] != 9) {
				break;
			}
			number_of_nine += 1;
		}
		if( number_of_nine == length ) {
			return true;
		}
		number[length-1] += 1;
		if(number_of_nine != 0) {
			int i;
			for( i = length - 1; i > length - number_of_nine - 1; i-- ){
				number[i] = 0;
			}
			number[i] += 1;
		}
		return false;
	}
	
	public void print(int[] number) {
		int flag = 0;
		for (int i = 0; i < number.length; i++ ) {
			if( number[i] != 0) {
				flag = i;
				break;
			}
		}
		for( int i = flag; i < number.length; i++ ){
			System.out.printf("%d", number[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Printnumbers test = new Printnumbers(3);
		while( !test.increase(test.numbers) ) {
			test.print(test.numbers);
		}
	}
}
