import java.util.*;
class square{
    public static void main(String[]Args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows and columns of square:");
        int row = scan.nextInt();

        for(int i=0;i < row;i++){
            for(int j=0;j<row;j++){
                if (j==0 || j==(row-1) || i==0 || i==(row-1)){
                    System.out.print("*");
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        
    }
}