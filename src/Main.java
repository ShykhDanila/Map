import java.util.*;

public class Main {
    public static void main(String[] args) {
        int lich = 0;

        List<Person> listPerson = new ArrayList<>();
        List<Animal> listAnimal = new ArrayList<>();
        Map<Person,List<Animal>> map = new HashMap<>();


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
                String name = sc.nextLine();
                System.out.println("Введіть вік нового учасника зооклубу");
                Scanner scan = new Scanner(System.in);
                int age = scan.nextInt();
                Person person = new Person(name,age);
               // map.put(person,listAnimal);
                listPerson.add(person);
            }
            break;
            case 2:{

                System.out.println("Введіть тип тваринки");
                Scanner scan1 = new Scanner(System.in);
                String type = scan1.nextLine();
                System.out.println("Введіть ім'я тваринки");
                Scanner scan2 = new Scanner(System.in);
                String nameAnimal = scan2.nextLine();
                listAnimal.add(new Animal(type,nameAnimal));

                System.out.println("Виберіть до якого учасника додати тваринку");
                for (Person person: listPerson) {
                    lich++;
                    System.out.println(lich + ". " + person);
                }
                Scanner s = new Scanner(System.in);
                int index = s.nextInt();
                /*
                System.out.println("Виберіть тваринку, яку ви хочете додати");
                for (Animal a: listAnimal) {
                    lich2++;
                    System.out.println(lich2 + ". " + a);
                }

                 */
                map.put(listPerson.get(index-1) , listAnimal);

            }
            lich = 0;
            break;
            case 3:{

            }
            break;
            case 4:{
                System.out.println("Виберіть учасника, якого потрібно видалити");
                System.out.println(map.keySet());
            }
            break;
            case 5:{
                System.out.println("Виберіть тваринку, яку потрібно видалити");
                for (Animal s: listAnimal) {
                    lich++;
                    System.out.println(lich + ". " + s);
                }
                Scanner c = new Scanner(System.in);
                int index = c.nextInt();
                listAnimal.remove(index-1);
            }
            lich = 0;
            break;
            case 6:{
               // System.out.println(map.toString());
                for (Person p: listPerson) {
                    System.out.println(p +" has " + map.get(p));
                }
            }
            break;
            case 7:{
                System.exit(7);
            }
            break;
        }
    }


    }
}
