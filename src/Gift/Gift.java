package Gift;

import Candy.Candy;

import java.util.List;

public class Gift {
    private List<Candy> list;

    public Gift(List<Candy> list) {
        this.list = list;
    }

    public List<Candy> getGift() {
        return list;
    }

    public void addCandy(Candy candy) {
        list.add(candy);
    }

    public String toString() {
        String str = "";
        for (Candy candy : list) {
            str += candy.toString();
        }
        return str;
    }
}
