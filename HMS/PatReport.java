package HMS;

public class PatReport {

  private String name;
  private int sex;
  private int age;

  public PatReport(String name, int sex, int age) {
    this.name = name;
    this.sex = sex;
    this.age = age;
  }

  public String getName() { return name; }
  public int    getSex()  { return sex;  }
  public int    getAge()  { return age;  }

  public void   setName(String name) { this.name = name; }
  public void   setSex(int sex)      { this.sex = sex;   }
  public void   setAge(int age)      { this.age = age;   }

}
