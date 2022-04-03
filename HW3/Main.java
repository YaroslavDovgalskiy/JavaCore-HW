package HW3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        swap(arr1,1,4);

        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("Задание 2");
        System.out.println("Вес фруктов: ");
        or.addFruit(new Orange(),6);
        or1.addFruit(new Orange(),5);
        ap.addFruit(new Apple(),9);
        ap1.addFruit(new Apple(),6);
        System.out.println("Коробка 1: "+or.getWeight());
        System.out.println("Коробка 2: "+or1.getWeight());
        System.out.println("Коробка 3: "+ap.getWeight());
        System.out.println("Коробка 4: "+ap1.getWeight());
        System.out.println("Сравнение: ");
        System.out.println("Коробка 1 и Коробка 3: "+or.compare(ap));
        System.out.println("Коробка 2 и Коробка 4: "+or1.compare(ap1));
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("Вес коробок после pourTo: ");
        System.out.println("Коробка 1: "+or.getWeight());
        System.out.println("Коробка 2: "+or1.getWeight());
        System.out.println("Корбка 3: "+ap.getWeight());
        System.out.println("Коробка 4: "+ap1.getWeight());


    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Задание 1: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат замены "+Arrays.toString(arr)+"\n===================================");
    }

}