import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animal {

    private String typeAnimal;

    private String nameAnimal;


    public Animal(String typeAnimal, String nameAnimal) {
        this.typeAnimal = typeAnimal;
        this.nameAnimal = nameAnimal;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(typeAnimal, animal.typeAnimal) &&
                Objects.equals(nameAnimal, animal.nameAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeAnimal, nameAnimal);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "typeAnimal='" + typeAnimal + '\'' +
                ", nameAnimal='" + nameAnimal + '\'' +
                '}';
    }
}
