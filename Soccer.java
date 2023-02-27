import java.util.*;
import java.util.Random;
public class Soccer
{
      public static void main(String args[])
      {

          

          Scanner s = new Scanner(System.in);
          String temp="0";
          League league = null;
          Club club = null;
          Coach coach = null;
          Player player = null;
          int input =0;

          
         while(input!=7)
         {
          System.out.println("Menu League\n1. Create League\n2. Add Club\n3. View League\n4. Scheduling\n5. Match Score\n6. League Table\n7. Exit");
          System.out.print("Choose menu league = ");
          input=s.nextInt();

            if(input==1)
            {
                System.out.print("Nama Liga =");
                temp = s.nextLine();
                String leaguename = s.nextLine();
                System.out.print("Tahun =");
                int leagueyear = s.nextInt();

                league = new League (leaguename,leagueyear);
            }
            else if(input==2)
            {
              input=0;
              int clubke=0;
              while(input!=5)
              {
              System.out.println("Menu Club");
              System.out.println("1. Create Club\n2. Add coach\n3. Add Player\n4. View Club\n5. Exit");
              System.out.print("Choose menu club = ");
              input = s.nextInt();

              if(input==1)
              {
                clubke++;
                System.out.println("Membuat Klub Baru\n---------");
                System.out.print("Nama Klub = ");
                temp = s.nextLine();
                String nameclub = s.nextLine();
                System.out.print("Nama Stadion = ");
                String stadium = s.nextLine();
                System.out.print("Kapasitas Stadion = ");
                int capacity = s.nextInt();
                club = new Club (nameclub,stadium,capacity);
                System.out.println("Club successfully created !");
                System.out.println("-------------");
                league.addClub(club);
              }
              else if(input==2)
              {
                if(club==null)
                  System.out.println("Club belum dibuat");
                else
                {
                  System.out.print("Masukkan klub = ");
                  temp = s.nextLine();
                  String nameklub = s.nextLine();
                  Club tempklub = league.search(nameklub);


                  System.out.println("Menambah Pelatih------------");
                  System.out.print("Nama Pelatih = ");
                  temp = s.nextLine();
                  String namecoach = s.nextLine();

                  System.out.print("Usia = ");
                  int age = s.nextInt();
                  System.out.print("Kebangsaan = ");
                  temp = s.nextLine();
                  String nationality = s.nextLine();
                  
                  System.out.print("Tahun Melatih = ");
                  int yearstart = s.nextInt();

                  coach = new Coach(namecoach,age,nationality,yearstart);
                  tempklub.setCoach(coach);
                }
              }
              else if(input==3)
              {
                  if(club==null)
                    System.out.println("Club belum dibuat");
                  else
                  {
                    System.out.print("Masukkan klub = ");
                    temp = s.nextLine();
                    String nameklub = s.nextLine();
                    Club tempklub = league.search(nameklub);
          

                    System.out.println("Menambah Pemain\n-------");
                   System.out.print("Nama Pemain = ");
                   temp=s.nextLine();
                    String nameplayer = s.nextLine();
                    System.out.print("Usia = ");
                    int ageplayer = s.nextInt();
                    System.out.print("Kebangsaan = ");
                    temp = s.nextLine();
                    String nationalityplayer = s.nextLine();
                    System.out.println("\nKemampuan Pemain\n-------");
                    System.out.print("Posisi = ");
                    temp = s.nextLine();
                    String position = s.nextLine();
                    System.out.print("Shooting = ");
                    int shooting = s.nextInt();
                    System.out.print("Heading = ");
                    int heading = s.nextInt();
                    System.out.print("Dribbling = ");
                    int dribbling = s.nextInt();
                    System.out.print("Running = ");
                    int running=s.nextInt();
                    System.out.print("Passing = ");
                    int passing = s.nextInt(); 

                    player = new Player (nameplayer,ageplayer,nationalityplayer,shooting,dribbling,running,heading,passing,position);
                    tempklub.addPlayer(player);
                    System.out.println("\nPemain berhasil ditambahkan!");
                  }
                  
              }
              else if (input==4)
              {
                  System.out.print("Masukkan klub = ");
                  temp = s.nextLine();
                  String nameklub = s.nextLine();
                  Club tempklub = league.search(nameklub);
                  tempklub.viewclub();
                  
                  
              }
              else if(input==5)
              break;
          }
            }
            else if(input==3)
            {
                System.out.println("Melihat Isi Liga");
                System.out.println("---------------");
                league.viewleague();
            }
            else if(input==4)
            {
                System.out.println("Hasil Penjadwalan Liga");
                System.out.println("---------------------");
                league.scheduling();
            }
            else if(input==5)
            {
                System.out.println("Hasil Pertandingan Liga");
                System.out.println("---------------------");
                league.matchscore();
            }
            else if(input==6)
            {
                System.out.println("Klasemen Liga");
                System.out.println("---------------------");
                league.leaguetable();
            }
            else if(input==7)
            break;
         } 
      
          
        
       }
}
