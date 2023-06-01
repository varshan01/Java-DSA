class noconsonants{

    public static void main(String[]args){


        String str = "Hello,have a good day";

        String str1="";

        for(int i = 0;i<str.length();i++){

            String str2 = "" + str.charAt(i);

            if (str2.equals("a") || str2.equals("e") || str2.equals("i") || str2.equals("o") || str2.equals("u")){
                str1 = str1 + str2;
            }



            

            }
            System.out.print("The string without consonants are :" + str1);

        }

        
    }
