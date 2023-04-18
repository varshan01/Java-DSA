class Alphabets{
    public static void main(String[]args){
        int n=9;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==(n-1)/4 || i+j==(n-1)/2 || j-i == (n-1)/2 ){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }

                
            }
            System.out.println();


        }
        for(int k=0;k<n;k++){
            for(int l = 0;l<n;l++){
                if(k==0 || l==0 || k==(n-1)/2 || k==(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int m=0;m<n;m++){
            for(int o = 0;o<n;o++){
                if(m==0 || o==0 || m==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int a=0;a<n;a++){
            for(int b=0;b<n;b++){
                if(b==0 || a==0 || a==(n-1)){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int c=0;c<n;c++){
            for(int d=0;d<n;d++){
                if(c==0 || d==0 || c==(n-1) || (d==(n-1) && c>(n-1)/2) || (c==(n-1)/2 && d>(n-1)/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int e=0;e<n;e++){
            for(int f=0;f<n;f++){
                if(e==0 || f==0 || e==(n-1) || e==(n-1)/2 || f==(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int g=0;g<n;g++){
            for(int h=0;h<n;h++){
                if(g==0 || h==0 || g==(n-1) || h==(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            
    }
        
}