package ArrayInterface;

import java.util.Arrays;

public class BooleanArray implements ArrayInterface {
    private boolean [] booleanArray = new boolean[sizeArray];
    private int index;

    public BooleanArray(int index) {
        setIndex(index);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        if(index >= 0 & index <= sizeArray) this.index = index;
        else throw new IllegalArgumentException("Введите корректное значение index");
    }

    @Override
    public boolean getByIndex(int index) {
        return booleanArray[index];
    }

    @Override
    public void setTrue(int index) {
        booleanArray[index] = true;
    }

    @Override
    public void setByIndex(int index, boolean value) {
        booleanArray[index] = value;
    }

    @Override
    public void setFalse(int index) {
        booleanArray[index] = false;
    }

    @Override
    public void invertByIndex(int index) {
        booleanArray[index] =! booleanArray[index];
    }

    @Override
    public int trueCount() {
        int count = 0;
        for (int i = 0; i<booleanArray.length; i++)
            if (getByIndex(i))
                ++count;
        return count;
    }

    @Override
    public String arrayToString() {
        String strArr[] = new String[booleanArray.length];
        for (int i = 0; i<booleanArray.length; i++)
            if (getByIndex(i))
                strArr[i] = "1";
            else
                strArr[i] = "0";
        return Arrays.toString(strArr);
    }
}
