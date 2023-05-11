import java.util.*;


class Guesser{


    public int Guess(){
        System.out.print("Enter the value of number");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        return guess;
    }


}

class Player1{

    public int P1(){
        System.out.print("Enter your Guess player 1:");
        Scanner scan = new Scanner(System.in);
        int p1 = scan.nextInt();
        return p1;

    }
}

class Player2{

    public int P2(){
        System.out.print("Enter your Guess player 2:");

        Scanner scan = new Scanner(System.in);

        int p2 = scan.nextInt();

        return p2;
    }

}

class Player3{

    public int P3(){
        System.out.print("Enter your Guess player 3:");

        Scanner scan = new Scanner(System.in);

        int p3 = scan.nextInt();

        return p3;
    }

}

class umpire{
    public void compare(int guess , int p1,int p2,int p3){
        if (guess == p1 && guess!=p2 && guess!=p3){
            System.out.println("Player 1 wins!!!");
        }else if (guess==p2 && guess!=p1 && guess!=p3){
            System.out.println("Player 2 wins!!!");
        }else if (guess==p3 && guess!=p1 && guess!=p2){
            System.out.println("Player 3 wins!!!");
        }else if (guess == p1 && guess ==p2 && guess==p3){
            System.out.println("Everybody wins");
        }else {
            System.out.println("Nobody wins...Hehe...");
        }
    }
}


class launchGame{

    public static void main(String[]args){
    

        Guesser guess = new Guesser();
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();
        Player3 p3 = new Player3();

        umpire comp = new umpire();

        comp.compare(guess.Guess(),p1.P1(),p2.P2(),p3.P3());








    }
}