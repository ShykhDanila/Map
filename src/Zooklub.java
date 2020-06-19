import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Zooklub {

   // Map<Integer,String> map = new HashMap<>();

    Map<Person, List<Animal>> map = new HashMap<>();

    public Zooklub( ) {

    }

    public Map<Person, List<Animal>> getMap() {
        return map;
    }

    public void setMap(Map<Person, List<Animal>> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Zooklub{" +
                "map=" + map.keySet() +" " + map.values() + Person.class.toString() + Animal.class.toString() +
                '}';
    }
}
