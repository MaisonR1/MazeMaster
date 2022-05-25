import java.util.Scanner;
/**
 * Write a description of class CopyOfTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopyOfTest
{
    public static void main(String[] args)
    {
        String location = "s";
        Scanner scanner = new Scanner(System.in);
        String move;
        
        int y = 0;
        
        while (y == 0)
        {
            if (location.equals("s"))
            {
                System.out.println("Which way do you want to move?");
                move = scanner.nextLine();
                if (move.equals("forward"))
                {
                    move = "standing";
                    location = "d";
                    System.out.println("you move forward to " + location);
                
            
                }
                else if (move.equals("left"))
                {
                    move = "standing";
                    location = "a";
                    System.out.println("you move left to " + location + " it is a dead end");
                
                
            
                }
                else if (move.equals("right"))
                {
                    move = "standing";
                    location = "b";
                    System.out.println("you move right to " + location);
                
            
                }
            }
            else if (location.equals("a"))
            {
                System.out.println("you can only move right");
                move = scanner.nextLine();
                if (move.equals("right"))
                {
                    move = "standing";
                    location = "s";
                    System.out.println("you move back to " + location);
                }
                else  
                {
                    System.out.println("you walk into a wall. Good job!");
                }
            }
            else if (location.equals("b"))
            {
                System.out.println("you can move forward and left (back to s)");
                move = scanner.nextLine();
                if (move.equals("forward"))
                {
                    move = "standing";
                    location = "c";
                    System.out.println("you move to " + location);
            
                }
                else if (move.equals("left"))
                {
                    move = "standing";
                    location = "s";
                    System.out.println("you move to " + location);
                }
                else
                {
                    System.out.println("you walk into a wall. Good job!");
                }
            }
            else if (location.equals("c"))
            {
                System.out.println("Before you stands a sign that says 'whats 2 + 2? Please speak your answer'");
                move = scanner.nextLine();
                if (move.equals("4"))
                {
                    System.out.println("The signs letters shift to say 'good job' and the sign instantly bursts into flames");
                    System.out.println("you can move left and back");
                    move = scanner.nextLine();
                    if (move.equals("left"))
                    {
                        move = "standing";
                        location = "d";
                        System.out.println("you move to " + location);
                        
                    }
                    else if (move.equals("back"))
                    {
                        move = "standing";
                        location = "b";
                        System.out.println("you move to " + location);
                        
                    }
                    else
                    {
                        System.out.println("you walk into a wall. Good job!");
                    }
                }
                else
                {
                    System.out.println("The signs letters shift to 'wow. how could you get that wrong?' and you wake up a junction b.");
                    location = "b";
                    
                }
            }
            else if (location.equals("d"))
            {
                
                
                
                
            }
        }
    }
    public static void junctionC()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        String location;
        System.out.println("Before you stands a sign that says 'whats 2 + 2? Please speak your answer'");
        move = scanner.nextLine();
        if (move.equals("4"))
        {
            System.out.println("The signs letters shift to say 'good job' and the sign instantly bursts into flames");
            System.out.println("you can move left and back");
            move = scanner.nextLine();
            if (move.equals("left"))
            {
                move = "standing";
                location = "d";
                System.out.println("you move to " + location);
                        
            }
            else if (move.equals("back"))
            {
                move = "standing";
                location = "b";
                System.out.println("you move to " + location);
                        
            }
            else
            {
                System.out.println("you walk into a wall. Good job!");
            }
        }
        else
        {
            System.out.println("The signs letters shift to 'wow. how could you get that wrong?' and you wake up a junction b.");
            location = "b";
                    
        }
    }
    public static void junctionD()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        String location = "d";
        move = scanner.nextLine();
        if (move.equals("forward"))
        {
            move = "standing";
            location = "e";
            System.out.println("you move to " + location);
            
        }
        else if (move.equals("right"))
        {
            move = "standing";
            location = "c";
            System.out.println("you move to " + location);
        }
        else if (move.equals("back"))
        {
            move = "standing";
            location = "s";
            System.out.println("you move to " + location);
        }
        else
        {
             System.out.println("you walk into a wall. Good job!");
        }
    }

}
