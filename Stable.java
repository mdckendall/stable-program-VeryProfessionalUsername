import java.util.*;
public class Stable {
  public String address;
  public ArrayList<Horse> arrayList;

  Stable() {
    arrayList = new ArrayList<>();
  }
  
  public String toString() {
    return "Stable[address=" + address + ", arrayList=" + arrayList+"]"; 
  }
}