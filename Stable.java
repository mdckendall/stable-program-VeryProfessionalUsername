import java.util.*;

public class Stable {
    public String address;
    public ArrayList<Horse> arrayList;

    public Stable() {
        arrayList = new ArrayList<>();
    }

    public String toString() {
        String output = "";
        int horseCount = 1;

        for (Horse h : arrayList) {
            output += "Horse #" + horseCount + " Name: " + h.name + 
                      " Weight: " + h.weight + " Tame: " + h.tame + "\n";
                      horseCount++;
        }

        return output;
    }
}
