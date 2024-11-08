package Gift;

import Candy.Candy;

import java.util.HashMap;
import java.util.Map;

public class Gift {
    private String name;
    private Map<String, Candy> listOfCandies;

    public Gift(String name) {
        this.name = name;
        this.listOfCandies = new HashMap<String, Candy>();
    }

    public String getName() {
        return name;
    }

    public Map<String, Candy> getListOfCandies() {
        return listOfCandies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfCandies(Map<String, Candy> listOfCandies) {
        this.listOfCandies = listOfCandies;
    }

    public void addCandyToListOfCandies(Candy candy, String amount) {
        listOfCandies.put(amount, candy);
    }

}
