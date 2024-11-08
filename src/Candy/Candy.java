package Candy;

public class Candy {
    private String name;
    private String brand;
    private String shape;
    private String packageType;
    private double weight;
    private double calorieContent;
    private double sugarContent;
    private boolean hypoallergenic;
    private String filling;
    private String additives;
    private String flavors;

    public Candy(String name, String brand, String shape, String packageType, double weight, double calorieContent,
                 double sugarContent, boolean hypoallergenic, String filling, String additives, String flavors) {
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
    public double getWeight() {return weight;}
    public double getCalorieContent() {return calorieContent;}
    public double getSugarContent() {return sugarContent;}
    public boolean isHypoallergenic() {return hypoallergenic;}
    public String getFilling() {return filling;}
    public String getAdditives() {return additives;}
    public String getFlavors() {return flavors;}

    public void setName(String name) {this.name = name;}
    public void setBrand(String brand) {this.brand = brand;}
    public void setShape(String shape) {this.shape = shape;}
    public void setPackageType(String packageType) {this.packageType = packageType;}
    public void setWeight(double weight) {this.weight = weight;}
    public void setCalorieContent(double calorieContent) {this.calorieContent = calorieContent;}
    public void setSugarContent(double sugarContent) {this.sugarContent = sugarContent;}
    public void setHypoallergenic(boolean hypoallergenic) {this.hypoallergenic = hypoallergenic;}
    public void setFilling(String filling) {this.filling = filling;}
    public void setAdditives(String additives) {this.additives = additives;}
    public void setFlavors(String flavors) {this.flavors = flavors;}

    public String toString() {
        return "\nНазва: " + name + "\n Виробник: " + brand + "\n Тип: " + getClass().getSimpleName() + "\n Форма: " + shape +
                "\n Тип пакунку: " + packageType + "\n Вага: " + weight + " грам" + "\n Калорійність: " + calorieContent + " ккал" +
                "\n Вміст цукру: " + sugarContent + " грам" + "\n Гіпоалергенність: " + hypoallergenic +
                "\n Наповнювач: " + filling + "\n Добавки: " + additives + "\n Ароматизатори: " + flavors;
    }
}
