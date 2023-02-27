import java.util.*;
import java.util.Random;
public class Player extends Human
{
    //bagian pertama (variabel / field / member)
      private int shooting;
      private int dribbling;
      private int heading;
      private int running;
      private int passing;
      private String position;

      //bagian kedua (function / behavior / method)
    public Player()
    {
        super("Unknown",0,"Unknown");
        shooting=0;
        dribbling=0;
        heading=0;
        running=0;
        passing=0;
        position="Unknown";
    }

    public Player(String name,int age, String nationality, int shooting, int dribbling, int heading, int running, int passing, String position)
    {
        super(name,age,nationality);
        this.shooting=shooting;
        this.dribbling=dribbling;
        this.heading=heading;
        this.running=running;
        this.passing=passing;
        this.position=position;
    }
   

    public void setShooting(int shooting)
    {
      this.shooting=shooting;
    }

    public int getAverage()
    {
      int average=(shooting+dribbling+heading+running+passing)/5;
      return average;
    }

    public int getShooting()
    {
      return shooting;
    }

    public void setDribbling(int dribbling)
    {
      this.dribbling=dribbling;
    }
    public int getDribbling()
    {
      return dribbling;
    }

    public void setHeading(int heading)
    {
      this.heading=heading;
    }
    public int getHeading()
    {
      return heading;
    }

    public void setRunning(int running)
    {
      this.running=running;
    }
    public int getRunning()
    {
      return running;
    }
    
    public void setPassing(int passing)
    {
      this.passing=passing;
    }
    public int getPassing()
    {
      return passing;
    }

    public void setPosition(String position)
    {
      this.position=position;
      
    }
    public String getPosition()
    {
      return position;
    }

    public void greetings()
    {
        System.out.println("Halo nama saya " + getName() + " berumur "+ getAge() +" berasal dari "+ getNationality()+" stats = "+shooting+" "+dribbling+" "+heading+" "+running+" "+passing+" "+position);
    }



      //bagian kedua (function / behavior / method)
}
