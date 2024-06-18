import com.aimiko.helloword.persistence.entity.City;
import com.aimiko.helloword.persistence.entity.Country;
import com.aimiko.helloword.persistence.entity.Fraction;
import com.aimiko.helloword.persistence.entity.People;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();

        peopleList.add(new People("Іван Іванович Іваненко", "15.01.1990", "+380969556789", "Київ", "Україна", "вул. Хрещатик, 1"));
        peopleList.add(new People("Марія Володимирівна Петренко", "20.05.1985", "+380956789090", "Львів", "Україна", "вул. Грушевського, 2"));
        peopleList.add(new People("Олександр Петрович Коваленко", "25.08.1992", "+380509597856", "Одеса", "Україна", "вул. Дерибасівська, 3"));

        for (People person : peopleList) {
            System.out.println(person);
        }
        System.out.println();

        List<City> cityList = new ArrayList<>();

        cityList.add(new City("Київ", "Київська область", "Україна", 2967360, 01001, 44));
        cityList.add(new City("Львів", "Львівська область", "Україна", 721301, 79000, 32));
        cityList.add(new City("Одеса", "Одеська область", "Україна", 1012000, 65000, 48));

        for (City city : cityList) {
            System.out.println(city);
        }
        System.out.println();

        List<String> citiesInUkraine = new ArrayList<>();
        citiesInUkraine.add("Київ");
        citiesInUkraine.add("Львів");
        citiesInUkraine.add("Одеса");
        citiesInUkraine.add("Дніпро");
        citiesInUkraine.add("Харків");
        citiesInUkraine.add("Запоріжжя");
        citiesInUkraine.add("Донецьк");
        citiesInUkraine.add("Луганськ");
        citiesInUkraine.add("Вінниця");
        citiesInUkraine.add("Житомир");
        citiesInUkraine.add("Ужгород");
        citiesInUkraine.add("Івано-Франківськ");
        citiesInUkraine.add("Кропивницький");
        citiesInUkraine.add("Луцьк");
        citiesInUkraine.add("Миколаїв");
        citiesInUkraine.add("Полтава");
        citiesInUkraine.add("Рівне");
        citiesInUkraine.add("Суми");
        citiesInUkraine.add("Тернопіль");
        citiesInUkraine.add("Херсон");
        citiesInUkraine.add("Хмельницький");
        citiesInUkraine.add("Черкаси");
        citiesInUkraine.add("Чернівці");
        citiesInUkraine.add("Чернігів");

        Country ukraine = new Country("Україна", "Європа", 41732779, 380, "Київ", citiesInUkraine);

        System.out.println(ukraine);

        System.out.println();

        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(1, 2);

        Fraction sum = (f1.add(f2));
        sum.simplify();
        System.out.println(f1 + " + " + f2 + " = " + sum);

        Fraction difference = f1.subtract(f2);
        difference.simplify();
        System.out.println(f1 + " - " + f2 + " = " + difference);

        Fraction product = f1.multiply(f2);
        product.simplify();
        System.out.println(f1 + " * " + f2 + " = " + product);

        Fraction quotient = f1.divide(f2);
        quotient.simplify();
        System.out.println(f1 + " / " + f2 + " = " + quotient);

    }
}