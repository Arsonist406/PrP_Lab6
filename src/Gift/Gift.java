package Gift;

import Candy.Candy;

import java.util.HashMap;
import java.util.Map;

public class Gift {
    private String name;
    private Map<String, Candy> listOfCandies;
    private double weight;

    public Gift(String name) {
        this.name = name;
        this.listOfCandies = new HashMap<String, Candy>();
        this.weight = 0;
    }

    public String getName() {
        return name;
    }

    public Map<String, Candy> getListOfCandies() {
        return listOfCandies;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfCandies(Map<String, Candy> listOfCandies) {
        this.listOfCandies = listOfCandies;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void addCandyToListOfCandies(Candy candy, String amount) {
        listOfCandies.put(amount, candy);
    }

    public void cleanListOfCandies() {
        listOfCandies.clear();
    }

    public String toString() {
        String str = "";
        for (Candy candy : listOfCandies.values()) {
            str += candy.toString();
            str += "\n";
        }
        return str;
    }

}
