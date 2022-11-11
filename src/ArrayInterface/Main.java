package ArrayInterface;

public class Main {
    public static void main(String[] args) {
        IntArray array = new IntArray();
        BooleanArray booleanArray = new BooleanArray(10);


        System.out.println("Реализация: булевский массив");
        booleanArray.setTrue(booleanArray.getIndex());
        System.out.println("setTrue " + booleanArray.getIndex() + " = " + booleanArray.getByIndex(booleanArray.getIndex()));

        booleanArray.setByIndex(booleanArray.getIndex(), true);
        System.out.println("setByIndex " + booleanArray.getIndex() + " = " + booleanArray.getByIndex(booleanArray.getIndex()));

        booleanArray.setByIndex(5, false);
        System.out.println("setByIndex 5 = " + booleanArray.getByIndex(5));

        booleanArray.invertByIndex(1);
        System.out.println("invert 1 = " + booleanArray.getByIndex(1));

        booleanArray.setFalse(6);
        System.out.println("setFalse 6 = " + booleanArray.getByIndex(6));
        System.out.println("trueCount = " + booleanArray.trueCount());
        System.out.println("BooleanArray: " + booleanArray.arrayToString());

        System.out.println("____________");

        System.out.println("Реализация: целочисленный массив");
        array.setTrue(4);
        System.out.println("setTrue 4 = " + array.getByIndex(4));

        array.setByIndex(2, true);
        System.out.println("setByIndex 2 true = " + array.getByIndex(2));

        array.setByIndex(2, false);
        System.out.println("setByIndex 2 false = " + array.getByIndex(2));

        array.invertByIndex(6);
        System.out.println("invert 6 = " + array.getByIndex(6));

        array.setFalse(6);
        System.out.println("setFalse 6 = " + array.getByIndex(6));

        array.setTrue(9);
        System.out.println("setTrue 9 = " + array.getByIndex(9));
        System.out.println("trueCount = " + array.trueCount());
        System.out.println("IntArray: " + array.arrayToString());
    }
}