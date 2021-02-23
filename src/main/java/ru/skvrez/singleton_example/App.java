package ru.skvrez.singleton_example;

public class App {

    public static void main(String[] args) {
        MySingleton singleton = MySingleton.getInstance();
        MySingleton secondSingleton = MySingleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton.equals(secondSingleton));
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton);
        EnumSingleton secondEnumSingleton = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton.equals(secondEnumSingleton));
        enumSingleton.setValue(10);
        System.out.println(enumSingleton);
        System.out.println(secondEnumSingleton);
    }
}
