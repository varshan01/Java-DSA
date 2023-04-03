import java.util.*;

class looper{
    public static void main(String[]Args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter the no of rows and columns");
        int r= scan.nextInt();

        for(int i=0;i<(r);i++){
            for(int j=0;j<(r);j++){
                System.out.print('*'+" ");
            }
            System.out.println();    
        }
    }
}