import java.util.*;
import java.util.Random;
public class Coach extends Human
{

    private int yearstart;

    public Coach()
    {
        super("Unknown",0,"Unknown");
        yearstart=0;
    }

    public Coach(String name,int age, String nationality, int yearstart)
    {
        super(name,age,nationality);
        this.yearstart = yearstart;
    }
   

    public void setYearstart(int yearstart)
    {
      this.yearstart = yearstart;
    }

     public int getYearstart()
    {
      return yearstart;
    }


         public void greetings()
      {
           System.out.println("Halo nama saya " + getName() + " berumur "+ getAge() +" berasal dari "+ getNationality()+" melatih dari "+yearstart);
    }


      //bagian kedua (function / behavior / method)
}
