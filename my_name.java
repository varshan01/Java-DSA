class my_name {
    public static void main(String[]args){
        int n = 11;
        int z=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==(n-1)+(n-1)/2 || i-j==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                if(k+l==(n-1)/2 || l-k==(n-1)/2 || k==(n-1)/4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int m=0;m<n;m++){
            for(int o=0;o<n;o++){
                if(o==0 || m==0 || (o==(n-1) && m<=(n-1)/2) || m==(n-1)/2 || m-o==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int p=0;p<n;p++){
            for(int q=0;q<n;q++){
                if(p==0 || (q==0 && p<=(n-1)/2) || p==(n-1)/2 || p==(n-1) || (q==(n-1) && p>=(n-1)/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int r=0;r<n;r++){
            for(int s=0;s<n;s++){
                if(s==0 || r==(n-1)/2 || s==(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println();
        for(int t=0;t<n;t++){
            for(int u=0;u<n;u++){
                if(t+u==(n-1)/2 || u-t==(n-1)/2 || t==(n-1)/4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int v=0;v<n;v++){
            for(int w=0;w<n;w++){
                if(w==0 || w==(n-1) || w==v){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




         
    }
    
}
