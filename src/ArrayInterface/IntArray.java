package ArrayInterface;

import java.util.Arrays;

public class IntArray implements ArrayInterface {
    private int[] array = new int[sizeArray/32]; // int 32 бита

    public boolean getByIndex(int index) {
        if(index<0 || index>=sizeArray) return false;
        int indexElement = index/32;
        int element = array[indexElement];
        int indexBit = index%32;
        int mask = 1<<indexBit;
        return (element & mask) == mask;
    }

    public void setTrue(int index) {
        if(index<0 || index>=sizeArray) return;
        int indexElement = index/32;
        int indexBit = index%32;
        int mask = 1<<indexBit;
        array[indexElement] = array[indexElement] | mask;
    }

    public void setByIndex(int index, boolean value){
        if(index<0 || index>=sizeArray) return;
        int indexElement = index/32;
        int indexBit = index%32;
        int element = array[indexElement];
        if (value){
            int mask = 1 << indexBit;
            array[indexElement] = element | mask;
        }
        else {
            int mask = ~(1 << indexBit);  //инвертируем маску для работы оператора and
            array[indexElement] = element & mask;
        }
    }

    public void setFalse(int index) {
        if(index<0 || index>=sizeArray) return;
        int indexElement = index / 32;
        int indexBit = index % 32;
        int element = array[indexElement];
        int mask = ~(1 << indexBit);//инвертируем маску для работы оператора and
        array[indexElement] = element & mask;
    }

    public void invertByIndex (int index){
        if(index<0 || index>=sizeArray) return;
        int indexElement = index / 32;
        int indexBit = index % 32;
        int element = array[indexElement];
        int mask = 1 << indexBit;
        array[indexElement] = element ^ mask;
    }

    public int trueCount(){
        int count = 0;
        for (int i = 0; i<array.length; i++)
            if (getByIndex(i))
                ++count;
        return count;
    }

    public String arrayToString(){
        String stringArray[] = new String[array.length];
        for (int i = 0; i<array.length; i++)
            if (getByIndex(i))
                stringArray[i] = "1";
            else
                stringArray[i] = "0";
        return Arrays.toString(stringArray);
    }

}
