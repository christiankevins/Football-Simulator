import java.util.*;
import java.util.Random;
public class Club
{
    //bagian pertama (variabel / field / member)
    private String name;
    private String stadium;
    private int capacity;
    private Coach coach;
    private int win;
    private int lose;
    private int draw;
    private int GA;
    private int GD;
    private int play;
    private int point;
    private Club [] enemies = new Club [4];
    private Player [] player = new Player [25];
    private int counter = 1;

      //bagian kedua (function / behavior / method)
    public Club()
    {
        name = "Unknown";
        stadium = "Unknown";
        capacity = 0;
    }

    public Club(String name,String stadium, int capacity)
    {
        this.name=name;
        this.stadium=stadium;
        this.capacity=capacity;
    }

    public void setCoach(Coach coach)
    {
        this.coach = coach;
    }
/*
    public void setPrinted(int week, boolean printed)
    {
        this.printed[week]=printed;
    }

    public void getPrinted(int week)
    {
        return printed[week];
    }
    */
    public void setEnemies(int week, Club enemies)
    {
    this.enemies[week]=enemies;
    }


    public Club getEnemies(int index)
    {
        return enemies[index];
    }

    public void setPoint(int point)
    {
        this.point=point;
    }
    public int getPoint()
    {
        return point;
    }

    public void setPlay(int play)
    {
        this.play=play;
    }
    public int getPlay()
    {
        return play;
    }

    public void setWin(int win)
    {
        this.win=win;
    }
    public int getWin()
    {
        return win;
    }

    public void setDraw(int draw)
    {
        this.draw=draw;
    }
    public int getDraw()
    {
        return draw;
    }

    public void setLose(int lose)
    {
        this.lose=lose;
    }
    public int getLose()
    {
        return lose;
    }

    public void setGA(int GA)
    {
        this.GA=GA;
    }
    public int getGA()
    {
        return GA;
    }

    public void setGD(int GD)
    {
        this.GD=GD;
    }
    public int getGD()
    {
        return GD;
    }

    public void addPlayer(Player player)
    {
        this.player[counter]=player;
        counter++;
    }
    public String getName(String name)
    {
        return name;
    }

    public int getAverage()
    {
        int average=0;
    
        for(int t=1;t<counter;t++)
        {
            average=average+ player[t].getAverage();
        }
        average=average/(counter-1);
        return average;
    }


    public Coach getCoach()
    {
        return coach;
    }

    public Player getPlayer(int index)
    {
        return player[index];
    }

    public void setName(String name)
    {
      this.name = name;
    }

    public void setStadium(String stadium)
    {
      this.stadium=stadium;
    }

    public void setCapacity(int capacity)
    {
        this.capacity= capacity;
    }

    public String getName()
    {
      return name;
    }

    public String getStadium()
    {
      return stadium;
    }

    public int getCapacity()
    {
      return capacity;
    }


    public void viewclub()
    {
        System.out.println("Nama Klub = "+name);
        System.out.println("Nama Stadion = "+stadium);
        System.out.println("Kapasitas Stadion = "+capacity);
        if(coach==null)
            System.out.println(". -");
        else
            System.out.println("Pelatih = "+coach.getName()+"-"+coach.getNationality()+"-"+coach.getAge());
        
        System.out.println("Pemain : ");

        for(int j=1;j<=24;j++)
        {
            if (player[j]==null)
                System.out.println(j+". -");
            else   
                System.out.println(j+". "+player[j].getName()+"-"+player[j].getPosition()+"-"+player[j].getAge());
        }
    
        
    }
}