import java.util.AbstractList;

public class MyList extends AbstractList<Integer> {


    private int size;
    // contructor
    public MyList(int size) {
        this.size = size;
    }

    @Override
    public Integer get(int index) {
        return index;
    }

    @Override
    public int size() {
        return size;
    }
    // abstractlist kullanabilmek icin bu ii metodun impelement edilmesi gerekir
}
