import java.util.*;

public class Main {
    public static void main(String[] args) {

       // List<Person> listPerson = new ArrayList<>();
        //List<Animal> listAnimal = new ArrayList<>();
       // Map<List<Person>,List<Animal>> map = new HashMap<>();

    while (true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Додати учасника зооклубу");
        System.out.println("2. Додати тваринку до учасника зооклубу");
        System.out.println("3. Видалити тваринку з учасника зооклубу");
        System.out.println("4. Видалити учасника з клубу");
        System.out.println("5. Видалити конкретну тваринку зі всіх власників");
        System.out.println("6. Вивести на екран зооклуб");
        System.out.println("7. Вийти з програми");
        int input = scanner.nextInt();
        switch (input){
            case 1:{
                System.out.println("Введіть ім'я нового учасника зооклубу");
                Scanner sc = new Scanner(System.in);
                System.out.println("Введіть вік нового учасника зооклубу");
                Scanner scan = new Scanner(System.in);
                String name = sc.nextLine();
                int age = scan.nextInt();
                Person person = new Person(name,age);
               // listPerson.add(new Person(name,age));
            }
            break;
            case 2:{
                System.out.println("Введіть тип тваринки");
                Scanner scan1 = new Scanner(System.in);
                System.out.println("Введіть ім'я тваринки");
                Scanner scan2 = new Scanner(System.in);
                String type = scan1.nextLine();
                String nameAnimal = scan2.nextLine();
                Animal animal = new Animal(type,nameAnimal);
                //listAnimal.add(new Animal(type,nameAnimal));
            }
            break;
            case 3:{

            }
            break;
            case 4:{

            }
            break;
            case 5:{

            }
            break;
            case 6:{
//Map<Person,List<Animal>> map = new HashMap<>();
//map.getClass().getName();
//map.values();
               // System.out.println(map.keySet());



                Zooklub zooklub = new Zooklub();

                   // zooklub.map.keySet();
                    //zooklub.map.values();
                    // Map<Person,List<Animal>>
                    //zooklub.toString();
                System.out.println(zooklub.map.keySet());
                System.out.println(zooklub.map.values());
                zooklub.map.toString();


            }
            break;
            case 7:{

            }
            break;
        }
    }


    }
}
