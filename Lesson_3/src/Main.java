public class Main {

    public static void main(String[] args) {
        int i;
        Person [] persArray = new Person [5];
        persArray[0] = new Person(new Person.Name("Иван","Иванов","Иванович"),
                "QA-Engineer","i-i-i@mail.ru.ru","+79170001111", 300000.00, 21);
        persArray[1] = new Person(new Person.Name("Петр","Петров","Петрович"),
                "QA-Engineer","p-p-p@mail.ru.ru","+79170002222", 300000.00, 22);
        persArray[2] = new Person(new Person.Name("Сергей","Сергеев","Сергеевич"),
                "QA-Engineer","s-s-s@mail.ru.ru","+79170003333", 300000.00, 23);
        persArray[3] = new Person(new Person.Name("Владимир","Владимиров","Владимирович"),
                "QA-Engineer","v-v-v@mail.ru.ru","+79170004444", 300000.00, 24);
        persArray[4] = new Person(new Person.Name("Михаил","Михайлов","Михайлович"),
                "QA-Engineer","m-m-m@mail.ru.ru","+79170005555", 300000.00, 25);

        for (i = 0; i < persArray.length; i++) {
            persArray[i].showPersone(persArray[i]);
        }

        Park centralPark;
        centralPark = new Park("Центральный");
        Park.Attraction  circleAttr = centralPark.new Attraction("Колесо обозрения: ", "С 10-00 до 22-00 ", 250);

        centralPark.showPark(centralPark , circleAttr);
    }


    private static class Attraction {
    }
}