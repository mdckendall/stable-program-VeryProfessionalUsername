import java.util.*;
public class Stable {
  public String address;
  public ArrayList<Horse> arrayList;

  Stable() {
    arrayList = new ArrayList<>();
  }
  
  public String toString() {
    String result = "";
    for (int i = 0; i < arrayList.size(); i++) {
      result += "Horse #" + (i + 1) + " " + arrayList.get(i).toString();
    }
    return result;
  }
}
