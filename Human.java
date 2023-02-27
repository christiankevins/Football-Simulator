import java.util.*;
import java.util.Random;
public class Human
{
    //bagian pertama (variabel / field / member)
      private String name;
      private int age;
      private String nationality;

      //bagian kedua (function / behavior / method)
    public Human()
    {
        name = "Unknown";
        age = 0;
        nationality ="Unknown";
    }

    public Human(String name,int age, String nationality)
    {
        this.name=name;
        this.age=age;
        this.nationality=nationality;
    }

    public void setName(String name)
    {
      this.name = name;
    }

    public void setAge(int age)
    {
      this.age= age;
    }

    public void setNationality(String nationality)
    {
        this.nationality= nationality;
    }

    public String getName()
    {
      return name;
    }

    public int getAge()
    {
      return age;
    }

    public String getNationality()
    {
      return nationality;
    }
      public void greetings()
      {
           System.out.println("Halo nama saya " + name + " berumur "+age+" berasal dari "+nationality);
    }
}