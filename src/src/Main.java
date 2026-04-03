import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

//        Taking text input from user
        String str;
        System.out.print("Type text to convert into morse code: ");
        str = sc.nextLine().toUpperCase();

//        letters array
        char arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

//        morse array
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};


//      here I'm using linear search for every letters
        for(int i = 0; i < str.length(); i++){

            boolean found = false;
            char key = str.charAt(i);

            for(int j = 0; j < arr.length; j++){
                if(arr[j] == key){
                    System.out.println("found at "+j);
                    found = true;
                    break;
                }
            }
                if(!found){
                    System.out.println("Not found");
                }



        }











    }
}
