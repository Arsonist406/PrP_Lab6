package Function;

import Candy.Candy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {
    private String filePath;
    private ArrayList<Candy> candyList;

    public ReadFromFile(String filePath, ArrayList<Candy> candyList) {
        this.filePath = filePath;
        this.candyList = candyList;
    }

    public void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0].trim();
                String brand = data[1].trim();
                String type = data[2].trim();
                String shape = data[3].trim();
                String packageType = data[4].trim();
                double weight = Double.parseDouble(data[5].trim());
                double calorieContent = Double.parseDouble(data[6].trim());
                double sugarContent = Double.parseDouble(data[7].trim());
                boolean hypoallergenic = Boolean.parseBoolean(data[8].trim());
                String filling = data[9].trim();
                String additives = data[10].trim();
                String flavors = data[11].trim();

                Candy candy = new Candy(name, brand, type, shape, packageType, weight, calorieContent, sugarContent,
                        hypoallergenic, filling, additives, flavors);
                candyList.add(candy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
