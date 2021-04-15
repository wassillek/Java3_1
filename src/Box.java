import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> container;


    public Box() {
        this.container = new ArrayList<>();
    }

    public float getWeight() {
        float totalWeit = 0;
        for (T fruits : container
        ) {
            totalWeit = totalWeit + fruits.getWeight();
        }

        return totalWeit;
    }

    public void addFruit (T fruit ){
        container.add(fruit);
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.001f;
    }

    public void changeBox(Box<T> anotherBox){
        if (this == anotherBox) {
            return;
        }

        anotherBox.container.addAll(this.container);
        this.container.clear();
    }
}