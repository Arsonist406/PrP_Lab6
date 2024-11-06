import Candy.Candy;

import java.util.List;

public class Gift {
    private List<Candy> list;

    public Gift(List<Candy> list) {
        this.list = list;
    }

    public List<Candy> getList() {
        return list;
    }

    public void setList(List<Candy> list) {
        this.list = list;
    }

    public String toString() {
        String str = "";
        for (Candy candy : list) {
            str += candy.toString();
        }
        return str;
    }
}
