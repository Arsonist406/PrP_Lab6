package Candy;

import java.util.Map;

public class Candy {
    private String name;
    private String brand;
    private String shape;
    private String packageType;
    private float weight;
    private float calorieContent;
    private float sugarContent;
    private boolean hypoallergenic;
    private Map<String, String> filling;
    private Map<String, String> additives;
    private Map<String, String> flavors;

    public Candy(String name, String brand, String shape, String packageType, float weight,float calorieContent,
                 float sugarContent, boolean hypoallergenic, Map<String, String> filling,
                 Map<String, String> additives, Map<String, String> flavors) {
        this.name = name;
        this.brand = brand;
        this.shape = shape;
        this.packageType = packageType;
        this.weight = weight;
        this.calorieContent = calorieContent;
        this.sugarContent = sugarContent;
        this.hypoallergenic = hypoallergenic;
        this.filling = filling;
        this.additives = additives;
        this.flavors = flavors;
    }

    public String getName() {return name;}
    public String getBrand() {return brand;}
    public String getShape() {return shape;}
    public String getPackageType() {return packageType;}
    public float getWeight() {return weight;}
    public float getCalorieContent() {return calorieContent;}
    public float getSugarContent() {return sugarContent;}
    public boolean isHypoallergenic() {return hypoallergenic;}
    public Map<String, String> getFilling() {return filling;}
    public Map<String, String> getAdditives() {return additives;}
    public Map<String, String> getFlavors() {return flavors;}

    public void setName(String name) {this.name = name;}
    public void setBrand(String brand) {this.brand = brand;}
    public void setShape(String shape) {this.shape = shape;}
    public void setPackageType(String packageType) {this.packageType = packageType;}
    public void setWeight(float weight) {this.weight = weight;}
    public void setCalorieContent(float calorieContent) {this.calorieContent = calorieContent;}
    public void setSugarContent(float sugarContent) {this.sugarContent = sugarContent;}
    public void setHypoallergenic(boolean hypoallergenic) {this.hypoallergenic = hypoallergenic;}
    public void setFilling(Map<String, String> filling) {this.filling = filling;}
    public void setAdditives(Map<String, String> additives) {this.additives = additives;}
    public void setFlavors(Map<String, String> flavors) {this.flavors = flavors;}

    public String toString() {
        return "\nНазва: " + name + "\n\tВиробник: " + brand + "\n\tФорма: " + brand + "\n\tип пакунку: " + packageType +
                "\n\tВага: " + weight + "\n\tКалорійність: " + calorieContent + "\n\tВміст цукру: " + sugarContent +
                "\n\tГіпоалергенність: " + hypoallergenic + "\n\tНаповнювачі: " + filling + "\n\tДобавки: " + additives +
                "\n\tАроматизатори: " + flavors;
    }
}
