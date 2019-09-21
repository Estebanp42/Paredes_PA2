package paredes_PA2;
import java.util.Scanner;

public class hollander_p3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	int[][] ratings_arr = new int[5][11];
	String[] topics_arr = new String[5];
	double[] rating_avg_arr = new double[5];
	
	topics_arr[0] = "Politics";
	topics_arr[1] = "The Environment";
	topics_arr[2] = "Personal Finances";
	topics_arr[3] = "Traveling";
	topics_arr[4] = "Family";
	
	int i, j, k, m;
	int mintopic = 0, maxtopic = 0;
	char ch = 'n';
	
	int topic_1;
		
	for (j = 0; j < 10 && ch != 'y'; j++) {
			
		for(i = 0; i < 5; i ++) {
				
			 System.out.printf("On a scale of 1 - 10, enter how you feel about %s: ", topics_arr[i]);
			 ratings_arr[i][j] = input.nextInt();
				
		}
			
		System.out.print("\nAre you finished entering ratings? Enter 'y' for Yes, or 'n' for No: ");
		ch = input.next().charAt(0);
		System.out.print("\n");
		//j++;
		
	}
	
	
	for (i = 0; i < 5; i++) {
		
		for(k = 0; k < j; k++) {
			ratings_arr[i][10] += ratings_arr[i][k];
		}
		
	}
	
    for (i = 0; i < 5; i++) {
		
    	rating_avg_arr[i] = ratings_arr[i][10] / (j * 1.0);
	}
	
	System.out.printf("Topic\t\t\tR1\tR2\tR3\tR4\tR5\tR6\tR7\tR8\tR9\tR10\tAVG\n");
	
	for (i = 0; i < 5; i++) {
	System.out.printf("%-20s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.1f\n", topics_arr[i], 
	ratings_arr[i][0],ratings_arr[i][1],ratings_arr[i][2],ratings_arr[i][3],ratings_arr[i][4],
	ratings_arr[i][5],ratings_arr[i][6],ratings_arr[i][7],ratings_arr[i][8],ratings_arr[i][9], 
	rating_avg_arr[i]);
	}
	
	
	for ( m = 0, i = 1; i < 5; i++) {
		
		if(ratings_arr[m][10] < ratings_arr[i][10]) {
		m = i;
		}
	}
	
	System.out.printf("\nThe issue that recieved the highest point total was %s at %d", topics_arr[m], ratings_arr[m][10]);
	
	for ( m = 0, i = 1; i < 5; i++) {
		
		if(ratings_arr[m][10] > ratings_arr[i][10]) {
		m = i;
		}
	}
	
	System.out.printf("\nThe issue that recieved the lowest point total was %s at %d", topics_arr[m], ratings_arr[m][10]);
	
	}
}
