public class Horse{
  public final String name;
  public final double weight;
  public final boolean tame;

  Horse(String name, double weight, boolean tame) {
    this.name = name;
    this.weight = weight;
    this.tame = tame;
  }

  public String toString(){
    return "Horse[name=" + name + ", weight=" + weight + ", tame=" + tame + "]"; 
  }
}