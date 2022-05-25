import java.util.Scanner;
/**
 * Write a description of class breakingintomethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeGameExtras
{
    public static void main(String[] args)
    {
        System.out.println("***** Maze Game *****");
        System.out.println("Please type in lowercase when possible");
        Scanner scanner = new Scanner(System.in);
        String move;
        junctionStart();
        
        //most comments in junctionE()
    }
    /**
     * The junction where the player begins the game in
     */
    public static void junctionStart()
    {
        System.out.println("you are in the starting junction");
        Scanner scanner = new Scanner(System.in);
        String move;
        System.out.println("Which way do you want to move?");
        System.out.println("You can move forward, left, and right");
        move = scanner.nextLine();
        if (move.equals("forward"))
        {
            move = "standing";
            System.out.println("you move forward to d");
            junctionD();
        }
        else if (move.equals("left"))
        {
            move = "standing";
            System.out.println("you move left to a, it is a dead end");
            junctionA();
        }
        else if (move.equals("right"))
        {
            move = "standing";
            System.out.println("you move right to b");
            junctionB();
        }
    }
    /**
     * method for junction A and the movement to adjacent rooms 
     */
    public static void junctionA()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        System.out.println("you can only move right");
        move = scanner.nextLine();
        if (move.equals("right"))
        {
            move = "standing";
            System.out.println("you move right to the start");
            junctionStart();
        }
        else  
        {
            System.out.println("you walk into a wall. Good job!");
            junctionA();
        }
    }
    /**
     * method for junction B and the movement to adjacent rooms
     */
    public static void junctionB()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        System.out.println("you can move forward and left");
        move = scanner.nextLine();
        if (move.equals("forward"))
        {
            move = "standing";
            System.out.println("you move forward to c");
            junctionC();
        }
        else if (move.equals("left"))
        {
            move = "standing";
            System.out.println("you move left to the start");
            junctionStart();
        }
        else
        {
            System.out.println("you walk into a wall. Good job!");
            junctionB();
        }
    }
    /**
     * method for junction C and the movement to adjacent rooms aswell as the challenge for it
     */
    public static void junctionC()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        System.out.println("Before you stands a sign that says 'what does www stand for in a website browser? Please speak your answer'");
        move = scanner.nextLine();
        if (move.equals("world wide web"))
        {
            System.out.println("The signs letters shift to say 'good job' and the sign instantly bursts into flames");
            System.out.println("you can move left and back");
            move = scanner.nextLine();
            if (move.equals("left"))
            {
                move = "standing";
                System.out.println("you move left to d");
                junctionD();
            }
            else if (move.equals("back"))
            {
                move = "standing";
                System.out.println("you move back to b");
                junctionB();
            }
            else
            {
                System.out.println("you walk into a wall. Good job! The sign appears again.");
                junctionC();
            }
        }
        else
        {
            System.out.println("The signs letters shift to 'wow. how could you get that wrong?' and you wake up at junction b.");
            junctionB();
        }
    }
    /**
     * method for junction D and the movement to adjacent rooms
     */
    public static void junctionD()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        System.out.println("you can move forward, back or right");
        move = scanner.nextLine();
        if (move.equals("forward"))
        {
            move = "standing";
            System.out.println("you move forward to e");
            junctionE();
        }
        else if (move.equals("back"))
        {
            move = "standing";
            System.out.println("you move back to the start");
            junctionStart();
        }
        else if (move.equals("right"))
        {
            move = "standing";
            System.out.println("you move right to c");
            junctionC();
        }
        else
        {
            System.out.println("you walk into a wall. Good job!");
            junctionD();
        }
    }
    /**
     * method for junction E and the movement to adjacent rooms aswell as the challenge for it
     */
    public static void junctionE()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        //the move string is the handles player inputs
        System.out.println("Before you stands a goblin, it says 'I will let you through if you awnser this riddle'");
        System.out.println("What has a spine but no bones?");
        System.out.println("1. A Snake");
        System.out.println("2. A Book");
        System.out.println("3. A Jellyfish");
        System.out.println("4. Walk past the goblin (he doesnt look very strong)");
        move = scanner.nextLine();
        //ask the question and/or allow the player to move
        if (move.equals("2"))
        {
            System.out.println("The goblin lets you through, you later notice that your wallet is missing");
            System.out.println("you can move left, right, forward and back");
            move = scanner.nextLine();
            //if the answer is correct allow the player to input a move
            if (move.equals("left"))
            {
                move = "standing";
                //ensures that there is only one movement
                System.out.println("you move left to g");
                //sets and tells the player where they moved
                junctionG();
                //execute the next method pertaining to the current room
            }
            else if (move.equals("back"))
            {
                move = "standing";
                System.out.println("you move back to d");
                junctionD();
            }
            else if (move.equals("right"))
            {
                move = "standing";
                System.out.println("you move right to f, its a dead end");
                junctionF();
            }
            else if (move.equals("forward"))
            {
                move = "standing";
                System.out.println("you move forward to i");
                junctionI();
            }
            else
            {
                System.out.println("you walk into a wall. Good job!");
                junctionE();
                // if the player does not input the allowed movements reset the room
            }
        }
        else
        {
            System.out.println("The Goblin gets furious and he attempts to drag you back!");
            System.out.println("Turns out he cant move you (Shocker) so you walk back instead because he refuses to open the door.");
            junctionD();
            // if the player gets the wrong answer make them go back to the previous room 
        }
    }
    /**
     * method for junction F and the movement to adjacent rooms
     */
    public static void junctionF()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        System.out.println("you can only move left");
        move = scanner.nextLine();
        if (move.equals("left"))
        {
            move = "standing";            
            System.out.println("you move left to e");
            junctionE();
        }
        else  
        {
            System.out.println("you walk into a wall. Good job!");
            junctionF();
        }
    }
    /**
     * method for junction G and the movement to adjacent rooms aswell as the challenge for it
     */
    public static void junctionG()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        String star = "*";
        int z = 0;
        System.out.println("how many stars are there?");
        while (z < 4)
        {
            System.out.println(star);
            star = star + star;
            z++;
        }
        move = scanner.nextLine();
        if (move.equals("15"))
        {
            System.out.println("you pass");
            System.out.println("its a dead end. you can only move right");
            move = scanner.nextLine();
            if (move.equals("right"))
            {
                move = "standing";
                System.out.println("you move right to e");
                junctionE();
            }
            else
            {
                System.out.println("you walk into a wall. Good job!");
                junctionG();
            }
        }
        else
        {
            System.out.println("you go back");
            junctionE();
        }
    }
    /**
     * method for junction J and the movement to adjacent rooms aswell as the challenge for it
     */
    public static void junctionJ()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        int x = -4;
        System.out.println("What is 4x + 2 if x is -4");
        int answer = -14; 
        int input;
        input = scanner.nextInt();
        scanner.nextLine();
        if (input == answer)
        {
            System.out.println("you pass");
            System.out.println("you can move forward or back");
            move = scanner.nextLine();
            if (move.equals("back"))
            {
                move = "standing";
                System.out.println("you move back to i");
                junctionI();
            }
            else if (move.equals("forward"))
            {
               move = "standing";
                System.out.println("you finally find the exit to this place but theres a locked door with a sticky note on it that reads:");
                junctionWIN(); 
            }
            else
            {
                System.out.println("you walk into a wall. Good job!");
                junctionJ();
            }
        }
        else
        {
            System.out.println("you go back");
            junctionI();
        }
    }
    /**
     * method for junction I and the movement to adjacent rooms
     */
    public static void junctionI()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        System.out.println("you can move left, back and forward");
        move = scanner.nextLine();
        if (move.equals("left"))
        {
            move = "standing";
            System.out.println("you move left to h, its a dead end");
            junctionH();
        }
        else if (move.equals("back"))
        {
          move = "standing";
            System.out.println("you move back to e");
            junctionE();  
        }
        else if (move.equals("forward"))
        {
           move = "standing";
            System.out.println("you move forward to j");
            junctionJ(); 
        }
        else  
        {
            System.out.println("you walk into a wall. Good job!");
            junctionI();
        }
    }
    /**
     * method for junction H and the movement to adjacent rooms
     */
    public static void junctionH()
    {
        Scanner scanner = new Scanner(System.in);
        String move;
        System.out.println("you can only move right");
        move = scanner.nextLine();
        if (move.equals("right"))
        {
            move = "standing";
            System.out.println("you move right to i");
            junctionI();
        }
        else  
        {
            System.out.println("you walk into a wall. Good job!");
            junctionH();
        }
    }
    /**
     * method for the final room where the player must recite all of the answers of the prevoius challenges in order to win
     */
    public static void junctionWIN()
    {
        System.out.println("State the awnsers to all the challenges in the order of junctions C , E , G and J to escape");
        Scanner scanner = new Scanner(System.in);
        String move;
        move = scanner.nextLine();
        // if the player wants to win they must remember and recite all the answers to the previous challenges in the given order
        if (move.equals("world wide web"))
        {
            System.out.println("Correct, next answer");
            move = scanner.nextLine();
            //these else if statements check the answer and if it is wrong send the player to the previous room
            if (move.equals("a book"))
            {
                System.out.println("Correct, next answer");
                move = scanner.nextLine();
                if (move.equals("15"))
                {
                    System.out.println("Correct, final answer");
                    move = scanner.nextLine();
                    if (move.equals("-14"))
                    {
                        System.out.println("Correct");
                        System.out.println("Congratulations! You escaped the maze");
                        // if they remember and recite the answers correctly they win the game
                    }
                    else
                    {
                        System.out.println("incorrect, go back");
                        junctionJ();
                    }
                }
                else
                {
                    System.out.println("incorrect, go back");
                    junctionJ();
                }
            }
            else
            {
                System.out.println("incorrect, go back");
                junctionJ();
            }
        }
        else
        {
            System.out.println("incorrect, go back");
            junctionJ();
        }
    }
}
