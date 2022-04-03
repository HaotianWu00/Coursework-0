
import java.util.Scanner;
import java.lang.*;


public class MeanValuse {
	public static double meanValue(double[] data) {
		double res = 0;
		for(int i = 0; i < data.length; i++){
			res += data[i];
		}
		return res / data.length;
	}

	public static void main(String[] args) {
		double mean;
		Scanner input = new Scanner(System.in);
		String enter = input.nextLine();
		if(enter.length() == 0){
			System.err.println("Usage: java MeanValue <values...>");
			System.exit(1);
		}
		String num[] = enter.split(" ");
		double data[] = new double[num.length];
		for(int j = 0; j < num.length; j++){
			data[j] = Double.parseDouble(num[j]);
		}
		mean = meanValue(data);
		System.out.printf("Mean value = %.3f", mean);
	}
}
