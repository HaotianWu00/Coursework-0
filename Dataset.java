

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Dataset {
    ArrayList<Double> data;
    public Dataset(String filename) throws IOException {
        data = new ArrayList<>();
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String temp = sc.nextLine();
            data.add(Double.parseDouble(temp));
        }
    }
    public int size(){
        return this.data.size();
    }
    public double meanValue(){
        double res = 0;
        for (Double datum : this.data) {
            res += datum;
        }
        return res / this.data.size();
    }
}
