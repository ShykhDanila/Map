import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {

    private String typeAnimal;

    private String nameAnimal;

    List<String> animalList = new ArrayList<>();

    public Animal(String typeAnimal, String nameAnimal) {
        this.typeAnimal = typeAnimal;
        this.nameAnimal = nameAnimal;
    }

    public void add(){
        animalList.add(nameAnimal);
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
    public String toString() {
        return "Animal{" +
                "typeAnimal='" + typeAnimal + '\'' +
                ", nameAnimal='" + nameAnimal + '\'' +
                '}';
    }
}
