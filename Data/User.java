package SeminarOOP5.Data;
// 1. Создать package – data. Работу продолжаем в нем
// 2. Реализовать абстрактный класс User и его наследники Student и Teacher. 
// Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а наследники собственные параметры 
// (какие, по выбору преподавателя – Пример: studentId для Student, disciplesTaught для Teacher).
// Создать package – view. Работу продолжаем в нем
// Создать класс StudentView, содержащий в себе метод вывода в консоль данных студента поданных 
// на вход .



public abstract class User {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}