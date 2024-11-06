package Candy;

import java.util.Map;

public class Dragee extends Candy{
    public Dragee(String name, String brand, String shape, String packageType, float weight,float calorieContent,
                  float sugarContent, boolean hypoallergenic, Map<String, String> filling,
                  Map<String, String> additives, Map<String, String> flavors){
        super(name, brand, shape, packageType, weight, calorieContent,
                sugarContent, hypoallergenic, filling, additives, flavors);
    }
}
