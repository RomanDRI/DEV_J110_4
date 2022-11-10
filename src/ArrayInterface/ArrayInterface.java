package ArrayInterface;

public interface ArrayInterface {
    int sizeArray = 1024;
    boolean getByIndex(int index);
    void setTrue (int index);
    void setByIndex (int index, boolean value);
    void setFalse (int index);
    void invertByIndex (int index);
    int trueCount ();
    String arrayToString();

}
