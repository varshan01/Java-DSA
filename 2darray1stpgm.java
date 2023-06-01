
class twodArray{
    public static void main(String[]args){
        int a[][] = new int[3][1];

        a[0][0] = 3;
        a[1][0] = 4;
        a[2][0] = 5;

        for(int c[] : a){
            for(int d : c){
                System.out.print(d + ",");
            }
        }
    }
}





