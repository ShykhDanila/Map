import java.util.*;

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
    public void show(){
        System.out.println(getMap());
    }

    @Override
    public String toString() {
        return "Zooklub{" +
                "map=" + map.keySet() +" " + map.values() + Person.class.toString() + Animal.class.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zooklub zooklub = (Zooklub) o;
        return map.equals(zooklub.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}
