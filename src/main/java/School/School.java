package School;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Human> humans = new ArrayList<>();

    public String getPeoplesInSchool() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("В школе:\n");
        for (Human human : humans) {
            if (human.isInSchool()) {
                stringBuilder.append(human.toString()).append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public void add(Human human) {
        humans.add(human);
    }
}
