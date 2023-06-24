public class BreakContinue {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i<11) { //Calculates the sum of 0 up to 10
			if(i==10)
				break;
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		int j = 0;
		int total = 0;
		
		for(;j<11;) {
			if(j==9)
				continue;
			j++;
			total += j;
			if(j==9)
				System.out.print("value of \"total\" couldn't calculate");
		}
		//System.out.print(total);
	}
}