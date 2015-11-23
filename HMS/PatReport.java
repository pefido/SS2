package HMS;

public class PatReport {

  String name;
  int sex;
  int age;
  int id;

  public PatReport(String name, int sex, int age, int id) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.id = id;
  }

  public String getName() { return name; }
  public int    getSex()  { return sex;  }
  public int    getAge()  { return age;  }
  public int    getId()   { return id;   }

  public void   setName(String name) { this.name = name; }
  public void   setSex(int sex)      { this.sex = sex;   }
  public void   setAge(int age)      { this.age = age;   }
  public void   setId(int id)        { this.id = id;     }

}
