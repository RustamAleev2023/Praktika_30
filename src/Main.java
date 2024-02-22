import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }

    //Task1
    //Для набора случайно сгенерированных целых чисел
    //нужно:
    //■ Количество четных;
    //■ Количество нечетных;
    //■ Количество равных 0;
    //■ Количество равных значению, введенному пользо-
    //вателем.
    public static void task1() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(100);
            numbers.add(num);
        }
        numbers.forEach(n -> System.out.println(n));

        int even = (int) numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Кол-во четных: " + even);
        int odd = (int) numbers.stream().filter(n -> n % 2 != 0).count();
        System.out.println("Кол-во нечетных: " + odd);
        int zero = (int) numbers.stream().filter(n -> n == 0).count();
        System.out.println("Кол-во нулей: " + zero);
        int countTen = (int) numbers.stream().filter(n -> n == 10).count();
        System.out.println("Кол-во 10: " + countTen);

    }

    //Task2
    //Для набора названий городов (города могут повто-
    //ряться) нужно:
    //■ Показать все города;
    //■ Показать все города с названием длиннее шесть сим-
    //волов;
    //■ Посчитать сколько раз встречается город, чье назва-
    //ние ввёл пользователь;
    //■ Показать все города, которые начинаются на задан-
    //ную букву;
    public static void task2() {
        List<String> cities = new ArrayList<>();
        cities.add("Moscow");
        cities.add("Warszawa");
        cities.add("Berlin");
        cities.add("Paris");
        cities.add("New York");
        cities.add("Berlin");
        cities.add("Belgrad");

        System.out.println("All cities: ");
        cities.stream().forEach(System.out::println);
        System.out.println("==========================");
        System.out.println("Cities with name longer 6");
        cities.stream().filter(c -> c.length() > 6)
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("==========================");
        int count = (int) cities.stream()
                .filter(c -> c.equalsIgnoreCase("Berlin")).count();
        System.out.println("City Berlin contains: " + count);
        System.out.println("==========================");

        System.out.println("Cities start with B: ");
        cities.stream().filter(c -> c.startsWith("B"))
                .collect(Collectors.toList()).forEach(System.out::println);
    }

    //Task3
    //Создайте класс Автомобиля. Он должен хранить
    //информацию о названии автомобиля, год выпуска, цена,
    //цвет, объем двигателя. Нужно создать набор автомобилей
    //и выполнить следующие задачи:
    //■ Показать все автомобили;
    //■ Показать все автомобили заданного цвета;
    //■ Показать все автомобили заданного объёма;
    //■ Показать все автомобили дороже заданной цены;
    //■ Показать все автомобили чей год выпуска находится
    //в указанном диапазоне.
    public static void task3() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2020, 10000, "white", 2000));
        cars.add(new Car("Mercedes", 2021, 20000, "silver", 3000));
        cars.add(new Car("BMW", 2021, 50000, "blue", 3000));
        cars.add(new Car("Ferrari", 2022, 100000, "red", 6000));
        cars.add(new Car("Audi", 2023, 50000, "black", 3000));

        System.out.println("All cars:");
        cars.forEach(System.out::println);
        System.out.println("==========================");
        System.out.println("Silver cars: ");
        cars.stream().filter(car -> car.getColour().equalsIgnoreCase("silver"))
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("==========================");
        System.out.println("Cars with engine 3.0: ");
        cars.stream().filter(car -> car.getEngine() == 3000)
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("==========================");
        System.out.println("Cars with prices over 50000: ");
        cars.stream().filter(car -> car.getPrice() >= 50000)
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("==========================");
        System.out.println("Cars with year production 2021 - 2022: ");
        cars.stream().filter(car -> car.getYear() >= 2021 && car.getYear() <= 2022)
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("==========================");
    }

    //Task4
    //Создайте класс Телевизор. Он должен хранить ин-
    //формацию о названии модели, год выпуска, цена, диаго-
    //наль, производитель. Нужно создать набор телевизоров
    //и выполнить следующие задачи:
    //■ Показать все телевизоры;
    //■ Показать телевизоры с заданной диагональю;
    //■ Показать все телевизоры одного производителя;
    //■ Показать все телевизоры текущего года;
    //■ Показать все телевизоры дороже заданной цены;
    //■ Показать все телевизоры, отсортированные по цене
    //по возрастанию;
    //■ Показать все телевизоры, отсортированные по цене
    //по убыванию.
    //2
    //■ Показать все телевизоры, отсортированные по диа-
    //гонали по возрастанию;
    //■ Показать все телевизоры, отсортированные по диа-
    //гонали по убыванию.
    public static void task4(){
        List<TV> list = new ArrayList<>();
        list.add(new TV("M1", 2023, 1500, 50, "Samsung"));
        list.add(new TV("M2", 2022, 1000, 55, "Xiaomi"));
        list.add(new TV("M3", 2022, 2500, 50, "Sony"));
        list.add(new TV("M2", 2024, 2000, 60, "Xiaomi"));

        System.out.println("All TV: ");
        list.forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("TV with diaginal 50: ");
        list.stream().filter(tv -> tv.getSize() == 50)
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("TV with same producer: ");
        list.stream().filter(tv -> tv.getProducer().equalsIgnoreCase("xiaomi"))
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("TV with price over 2000: ");
        list.stream().filter(tv -> tv.getPrice() > 2000)
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("TV sorted by price: ");
        list.stream().sorted()

        System.out.println("=========================================");
    }
}