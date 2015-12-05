package HMS;

public class IndicatorValue {

  private int id;
  private int value;
  private String name;

  public IndicatorValue(int id, int value, String name) {
    this.id = id;
    this.value = value;
    this.name = name;
  }

  public int    getId()    { return id;     }
  public int    getValue() { return value;  }
  public String getName()  { return name;   }

}
