import java.util.*;

class loop1{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no of nos to be printed");

        int NoOfTimes = scan.nextInt();

        for(int i=0;i<(NoOfTimes+1);i++){
            System.out.println(i);
        }

    }
}
