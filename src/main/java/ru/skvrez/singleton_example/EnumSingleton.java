package ru.skvrez.singleton_example;

public enum EnumSingleton {

    INSTANCE;

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private EnumSingleton() {
        System.out.println("Создано перечисление");
    }

    @Override
    public String toString() {
        return "EnumSingleton{" +
                "value=" + value +
                '}';
    }
}
