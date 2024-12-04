public class Person {
    public static class Name {
        private String firstName;
        private String sureName;
        private String middleName;
        Name (String firstName, String sureName, String middleName){
            Name.this.firstName = firstName;
            Name.this.sureName = sureName;
            Name.this.middleName = middleName;
        }
    }
    Person.Name name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    Person (Person.Name name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void showPersone(Person person){
        System.out.println("ФИО: " + person.name.sureName +" "+ person.name.firstName +" "+ person.name.middleName + ";");
        System.out.println("Должность: " + person.position + ";");
        System.out.println("E-mail: " + person.email + ";");
        System.out.println("Телефон: " + person.phone + ";");
        System.out.println("Зарплата: " + person.salary + ";");
        System.out.println("Возраст: " + person.age + "."+"\n");
    }
}
