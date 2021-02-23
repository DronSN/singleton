package ru.skvrez.singleton_example;

public class MySingleton {

    private final String name = "Мой единственный объект";
    private static MySingleton singleton;

    private MySingleton() {

    }

    public static MySingleton getInstance() {
        if (singleton == null) {
            singleton = new MySingleton();
        }
        return singleton;
    }

    @Override
    public String toString() {
        return "MySingleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
