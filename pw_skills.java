class pw_skills {
    public static void main(String[]args){

        int n=9;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==(n-1)/2 || (j==(n-1) && i<=(n-1)/2)){

                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int k=0;k<n;k++){
            for(int l =0;l<n;l++){
                if (l==0 || l == (n-1)/2 || l==(n-1) || k==(n-1)){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(int m=0;m<n;m++){
            for(int p=0;p<n;p++){
                if (m==0 || m==(n-1)/2 || m==(n-1) || (p==0 && m<(n-1)/2) || (p==(n-1) && m>(n-1)/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int q=0;q<n;q++){
            for(int r=0;r<n;r++){
                if(r==0 || r+q==(n-1)/2 || q-r==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int s=0;s<n;s++){
            for(int t = 0;t<n;t++){
                if (s==0 || s==(n-1) || t==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int u=0;u<n;u++){
            for(int v=0;v<n;v++){
                if(v==0 || u==(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int w=0;w<n;w++){
            for(int x=0;x<n;x++){
                if(x==0 || w==(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println();

        for(int y=0;y<n;y++){
            for(int z=0;z<n;z++){
                if (y==0 || y==(n-1)/2 || y==(n-1) || (z==0 && y<(n-1)/2) || (z==(n-1) && y>(n-1)/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




        

    }
    
}
