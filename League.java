import java.util.*;
import java.util.Random;
public class League
{
    //bagian pertama (variabel / field / member)
    private String name;
    private int year;
    private Club [] club = new Club [5];
    private int counter = 1;

      //bagian kedua (function / behavior / method)
    public League()
    {
        name = "Unknown";
        year = 0;
    }

    public League(String name,int year)
    {
        this.name=name;
        this.year=year;
    }

    public void addClub(Club club)
    {
        this.club[counter]=club;
        counter++;
    }
    public Club getClub(int index)
    {
        return club[index];
    }


    public String getName()
    {
      return name;
    }
    public void setName(String name)
    {
      this.name = name;
    }

    public void setYear(int year)
    {
        this.year= year;
    }
    public int getYear()
    {
      return year;
    }

    public Club search(String name)
    {
        for(int a =1;a<=4;a++)
        {
            if(club[a]!=null)
            {
                if(club[a].equals(name))
                return club[a];
            }
        }
        System.out.println("Tidak ditemukan klub");
    }


    public void viewleague()
    {
        System.out.println("Nama Liga = "+name);
        System.out.println("Tahun = "+year);
      
        System.out.println("Daftar Klub Peserta:");
        
        for(int j=1;j<=4;j++)
        {
            if (club[j]==null)
                System.out.println(j+". -");
            else   
                System.out.println(j+". "+club[j].getName()+"-"+club[j].getStadium()+"-"+club[j].getCapacity());
        }
        
    }
 int [][] listenemy = new int [7][7];
    public void scheduling()
{
        boolean [][] printed = new boolean [7][7];
       
 
        for(int a=0;a<=4;a++)
        {
            for(int b=1;b<=4;b++)
            {
                printed[a][b]=false;
                listenemy[a][b]=0;
            }     
        }

    Club mu = new Club("Manchester United", "Old Trafford", 80000);
    Player pogba = new Player ("Paul Pogba",  23,"France", 9,9,8,7,8, "Midfielder");
    mu.addPlayer(pogba);
    club[1] = mu;

    Club chel= new Club("Chelsea", "Stamford Bridge", 90000);
    Player terry = new Player ("John Terry",  30,"England", 11,14,5,4,12, "Defender");
    chel.addPlayer(terry);
    club[2] = chel;

    Club liv = new Club("Liverpool", "Anfield", 70000);
    Player virgil = new Player ("Virgil Van Djik",  10, "Netherlands",12,19,5,13,4, "Defender");
    liv.addPlayer(virgil);
    club[3] = liv;

    Club mc = new Club("Manchester City", "Etihad", 60000);
    Player grealish = new Player ("Jack Grealish",  20,"England", 5,3,8,9,14, "Winger");
    mc.addPlayer(grealish);
    club[4] = mc;

    Club no = new Club("Null", "Null", 60000);
    Player nor= new Player ("Jack Grealish",  20,"England", 5,3,8,9,14, "Winger");
    no.addPlayer(grealish);
    club[0] = no;

    int current=1;
   	int week=1;
   	int enemies = current + 1;

    while(true)
    {
	   System.out.println("current "+current+" enemy "+enemies+" week "+week);
	    if(club[current].getEnemies(week) == null )
	    {
	    	if ( club[enemies].getEnemies(week) == null)
			{
		        System.out.println("Masuk if");
		        club[current].setEnemies(week, club[enemies]);
		        club[enemies].setEnemies(week, club[current]);
                listenemy[week][current]=enemies;
                listenemy[week][enemies]=current;
		        week++;
                enemies ++;
		        if ( week > 3)
		        {
		        	week = 1;
		        	current ++;
				}
				
				if ( enemies > 4)
				{
					enemies = current + 1;
				}
		    }
		    else
		    {
		    	enemies++;
                if(enemies>4)
                {
                    enemies = current+1;
                }
			}
	    } 
	    else
	    {
	    	week++;
            if(week>=4)
            {
                week=1;
                current++;
            }
		}
		
		if ( week == 3 && current ==3)
			break;
    }

    for (int w=1;w<=3;w++)
    {
        System.out.println("Week "+w+":");
        for(int c=1;c<=4;c++)
        {
            int musuh = listenemy[w][c];
            if(printed[w][c]==false && printed[w][musuh]==false)
            {
               // System.out.print("week "+w+"current "+c);
               
                System.out.println(club[c].getName()+" vs "+club[musuh].getName());
                printed[w][c]=true;
                printed[w][musuh]=true;
            }
        }
    }
}

    public void leaguetable()
    {
        System.out.println("Rank\t\t"+"Club\t"+"Play\t"+"Win\t"+"Draw\t"+"Lose\t"+"GA\t"+"GD\t"+"Point\t");
        int [] arrpoint = new int [5];
        int [] arrclub = new int[5];
        for(int a=1;a<=4;a++)
        {
            arrpoint[a]=club[a].getPoint();
            arrclub[a]=a;
        }
        
        /*
        for(int a=1; a<=4; a++)
        {
		    for(int j=1; j<=3; j++)
			    if( arrpoint[j] > arrpoint[j+1])
			    {
				int temppoint = arrpoint[j];
				arrpoint[j] = arrpoint[j+1];
				arrpoint[j+1] = temppoint;

                int tempclub = arrclub[j];
                arrclub[j]=arrclub[j+1];
                arrclub[j+1]=temppoint;
			    }
	        }

        */

    for(int a=1; a<=4; a++)
    {
        for(int j=1; j<=3; j++)
        {
            if( club[j].getPoint() < club[j+1].getPoint())
            {
                Club temp = club[j];
                club[j] = club[j+1];
                club[j+1] = temp;
            }
        }
    }

        for(int t=1;t<=4;t++)
        {
            System.out.println(t+". \t"+club[t].getName()+"\t\t"+club[t].getPlay()+"\t"+club[t].getWin()+"\t "+club[t].getDraw()+"\t "+club[t].getLose()+"\t"+club[t].getGA()+"\t"+club[t].getGD()+"\t"+club[t].getPoint());
        }
    }

    public void matchscore()
    {
        boolean [][] printed = new boolean [6][6];
     
    
        for(int a=1;a<=4;a++)
        {
            for(int b=1;b<=5;b++)
            {
                printed[a][b]=false;
            }     
        }
    for (int w=1;w<=3;w++)
    {
        System.out.println("Week "+w+":");
        for(int c=1;c<=4;c++)
        {
             int musuh = listenemy[w][c];
            Club klub1 = club[c];
            Club klub2 = club[c].getEnemies(w);

            if(printed[w][c]==false && printed[w][musuh]==false) 
            {
                // System.out.print("week "+w+"current "+c);
             

                Random rand = new Random();
                int ability1= klub1.getAverage();
                int ability2 = klub2.getAverage();
                int jmlability = ability1+ability2;
                int [] arr1 = new int [jmlability+5];
                int [] arr2=new int [jmlability+5];

                for(int i=1;i<=jmlability;i++)
                {
                    int rand_angkabagus=rand.nextInt(3)+2;
                    int rand_angkajelek=rand.nextInt(2);
                    if(i>=ability1)
                    arr1[i]=rand_angkabagus;
                    else
                    arr1[i]=rand_angkajelek;
                }

                for(int i=1;i<=jmlability;i++)
                {
                    int rand_angkabagus=rand.nextInt(3)+2;
                    int rand_angkajelek=rand.nextInt(2);
                    if(i>=ability2)
                    arr2[i]=rand_angkabagus;
                    else
                    arr2[i]=rand_angkajelek;
                }
               

                int randpilihskor1 = rand.nextInt(jmlability-1)+1;
                int skor1= arr1[randpilihskor1];
                int randpilihskor2 = rand.nextInt(jmlability-1)+1;
                int skor2= arr2[randpilihskor2];

                System.out.println(klub1.getName()+" "+skor1+" vs "+" "+skor2+klub2.getName());
                //klub1.setPrinted(w)=true;
                //klub2.setPrinted(w)=true;

                printed[w][c]=true;
                printed[w][musuh]=true;
                if(skor1==skor2)
                {
                    int draw=klub1.getDraw();
                    klub1.setDraw(draw+1);
                    draw=klub2.getDraw();
                    klub2.setDraw(draw+1);

                    int pointskrg=klub1.getPoint();
                    klub1.setPoint(pointskrg+1);
                    pointskrg=klub2.getPoint();
                    klub2.setPoint(pointskrg+1);

                    int playskrg=klub1.getPlay();
                    klub1.setPlay(playskrg+1);
                    playskrg=klub2.getPlay();
                    klub2.setPlay(playskrg+1);

                    int gaskrg=klub1.getGA();
                    klub1.setGA(gaskrg+skor1);
                    gaskrg=klub2.getGA();
                    klub2.setGA(gaskrg+skor2);

                    int gdskrg=klub2.getGD();
                    klub1.setGD(gdskrg+skor2);
                    gdskrg=klub2.getGD();
                    klub2.setGD(gdskrg+skor1);
                }
                else if(skor1>skor2)
                {
                    int winlose =klub1.getWin();
                    winlose=winlose+1;
                    klub1.setWin(winlose);
                    winlose=klub2.getLose();
                    winlose=winlose+1;
                    klub2.setLose(winlose);

                    int pointskrg=klub1.getPoint();
                    klub1.setPoint(pointskrg+3);
                    pointskrg=klub2.getPoint();
                    klub2.setPoint(pointskrg+0);

                    int playskrg=klub1.getPlay();
                    klub1.setPlay(playskrg+1);
                    playskrg=klub2.getPlay();
                    klub2.setPlay(playskrg+1);

                    int gaskrg=klub1.getGA();
                    klub1.setGA(gaskrg+skor1);
                    gaskrg=klub2.getGA();
                    klub2.setGA(gaskrg+skor2);

                    int gdskrg=klub2.getGD();
                    klub1.setGD(gdskrg+skor2);
                    gdskrg=klub2.getGD();
                    klub2.setGD(gdskrg+skor1);
                }
                else
                {
                    int winlose =klub2.getWin();
                    klub2.setWin(winlose+1);
                    winlose=klub1.getLose();
                    klub1.setLose(winlose+1);

                    int pointskrg=klub2.getPoint();
                    klub2.setPoint(pointskrg+3);
                    pointskrg=klub1.getPoint();
                    klub1.setPoint(pointskrg+0);

                    int playskrg=klub1.getPlay();
                    klub1.setPlay(playskrg+1);
                    playskrg=klub2.getPlay();
                    klub2.setPlay(playskrg+1);

                    int gaskrg=klub1.getGA()+skor1;
                    klub1.setGA(gaskrg);
                    gaskrg=klub2.getGA()+skor2;
                    klub2.setGA(gaskrg);

                    int gdskrg=klub2.getGD()+skor2;
                    klub1.setGD(gdskrg);
                    gdskrg=klub2.getGD()+skor1;
                    klub2.setGD(gdskrg);
                }
            }
        }
    }

        

    
    }
}