import java.util.Scanner;
public class Main{

        static void textToMorse(char arr[] , String morse[] , String s) {
            //      here I'm using linear search for every letters
            for(int i = 0; i < s.length(); i++){

                boolean found = false;
                char key = s.charAt(i);

                if(key == ' '){
                    System.out.print(" / ");
                    continue;
                }

                for(int j = 0; j < arr.length; j++){
                    if(arr[j] == key){

                        System.out.print(morse[j] +" ");
                        found = true;
                        break;
                    }
                }
                if(!found){
                    System.out.print("Not found");
                }
            }

        }

        static void morseToText(){

        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

//        letters array
        char arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

//        morse array
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};


        int choice = 0;

        while(choice != 3){
            System.out.println();
            System.out.println("--------------------------------------------");
            System.out.println("1. Text to Morse");
            System.out.println("2. Morse to Text");
            System.out.println("3. Exit");
            System.out.print("Choose a number between (1 to 3): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter text: ");
                    String str = sc.nextLine().toUpperCase();
                    textToMorse(arr,morse,str);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter morse: ");
                    String morseInput = sc.nextLine();
//                    morse to call
                    break;

                case 3:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid Choice");


            }
        }















    }
}
