class addn{
    public int add(int a,int b){


        int c;
        c=a+b;

        return c;

    }
}


class addint{
    public static void main(String[]args){



        addn d = new addn();

        int result = d.add(3,4);



        System.out.println(result);

    }
}