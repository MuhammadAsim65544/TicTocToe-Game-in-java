//RegNo: 3956-FBAS|BSCS4|F18
//Name: Muhammad Asim
//Section: (B);
//Assignment: 2
package tictoe;//added it because i'm using netbeans...
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;
class TicToee
{
  String array[]=new String[9];
  private boolean check_win;
//Constructor....
  public TicToee()
  {
    check_win=false;
    for(int i=0;i<9;i++)
    {
         array[i]="X ";
    }
  }
//Menu
  public void Menu()
  {
   System.out.println("         Tic_Toe Game\n");
   for(int i=0;i<9;i++)
    {
        if(i==3 ||i==6)
        {
          System.out.println("\n");
        }
        System.out.print("        "+array[i]);
    }
  }
//turn
  public void Turn_Sequence()
  {
     int pos;
     Scanner kb=new Scanner(System.in);
     for(int i=0;i<9;i++)
     {
        if(i%2==0)
        {
          System.out.print("\n  Player_1 Term");
          System.out.print("\n  Enter position: ");
          pos=kb.nextInt();
          if(array[pos-1]=="P1" || array[pos-1]=="P2")
          {
            i--;
            System.out.println("  Already filled");
          }
          else
           {
             Player1_turn(pos);
           }
        }
        else
        {
          System.out.print("\n  Player_2 Term");
          System.out.print("\n  Enter position: ");
          pos=kb.nextInt();
          if(array[pos-1]=="P1" || array[pos-1]=="P2")
          {
            i--;
            System.out.println("  Already filled");
          }
          else
           {
             Player2_turn(pos);
           }
        }
     }
    System.out.println("\n Game is Tied.\nExiting...");
  }

//Player1_turn()
  public void Player1_turn(int x)
  {
     /*if(array[x-1]=="P1" || array[x-1]=="P2")
     {
        Scanner kb=new Scanner(System.in);
        while(con_repeat)
        {
            System.out.println("  Already filled\n  Enter again: ");
            x=kb.nextInt();
            if(array[x-1]!="P1" || array[x-1]!="P2"){con_repeat=false;}
        }
     }*/
     array[x-1]="P1";
     Menu();
     if(CheckWin_P1())
     {
       System.out.print("\nPlayer_1 has won the game! Congrats...!!!");
       System.out.println("\nEnd of game.\nExiting...");
       System.exit(0);
     }
  }


//Player2_turn()
  public void Player2_turn(int x)
  {    
    /*if(array[x-1]=="P1" || array[x-1]=="P2")
     {
        Scanner kb=new Scanner(System.in);
        while(con_repeat)
        {
            System.out.println("  Already filled\n  Enter again: ");
            x=kb.nextInt();
            if(array[x-1]=="P1" || array[x-1]=="P2"){con_repeat=false;}
        }
     }*/
     array[x-1]="P2";
     Menu();
     if(CheckWin_P2())
     {
       System.out.print("\nPlayer_2 has won the game! Congrats...!!!");
       System.out.println("\nEnd of game.\nExiting...");
       System.exit(0);
     }
  }
// Checkwin_P1()
   public boolean CheckWin_P1()
   {
     if(array[0]=="P1" & array[1]=="P1"& array[2]=="P1")
      {
        check_win=true;
        return check_win;
      }
     else if(array[3]=="P1" & array[4]=="P1"& array[5]=="P1")
      {
        check_win=true;
        return check_win;
      }
     else if(array[6]=="P1" & array[7]=="P1"& array[8]=="P1")
      {
        check_win=true;
        return check_win;
      }
     else if(array[0]=="P1" & array[3]=="P1"& array[6]=="P1")
      {
        check_win=true;
        return check_win;
      }
     else if(array[1]=="P1" & array[4]=="P1"& array[7]=="P1")
      {
        check_win=true;
        return check_win;
      }
     else if(array[2]=="P1" & array[5]=="P1"& array[8]=="P1")
      {
        check_win=true;
        return check_win;
      }
     else if(array[0]=="P1" & array[4]=="P1"& array[8]=="P1")
      {
        check_win=true;
        return check_win;
      }
     else if(array[6]=="P1" & array[4]=="P1"& array[2]=="P1")
      {
        check_win=true;
        return check_win;
      }
     return false;
   }


// Checkwin_P2()
   public boolean CheckWin_P2()
   {
     if(array[0]=="P2" & array[1]=="P2"& array[2]=="P2")
      {
        check_win=true;
        return check_win;
      }
     else if(array[3]=="P2" & array[4]=="P2"& array[5]=="P2")
      {
        check_win=true;
        return check_win;
      }
     else if(array[6]=="P2" & array[7]=="P2"& array[8]=="P2")
      {
        check_win=true;
        return check_win;
      }
     else if(array[0]=="P2" & array[3]=="P2"& array[6]=="P2")
      {
        check_win=true;
        return check_win;
      }
     else if(array[1]=="P2" & array[4]=="P2"& array[7]=="P2")
      {
        check_win=true;
        return check_win;
      }
     else if(array[2]=="P2" & array[6]=="P2"& array[8]=="P2")
      {
        check_win=true;
        return check_win;
      }
     else if(array[0]=="P2" & array[4]=="P2"& array[8]=="P2")
      {
        check_win=true;
        return check_win;
      }
     else if(array[6]=="P2" & array[4]=="P2"& array[2]=="P2")
      {
        check_win=true;
        return check_win;
      }
    return false;
   }

}

public class TicToe
{
  public static void main(String[] args)
  {
    TicToee game=new TicToee();
    game.Menu();
   game.Turn_Sequence();
  }
}