import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Enigma {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fastRotorCounter=0 ;
        int choice =1;
        System.out.println("do you want to modify your plugboard");
        System.out.println("*press 1 if yes*");
        choice = parseInt(br.readLine());
        plugBoard plug = new plugBoard();
        for (;choice==1; ) {

            if (choice == 1) {
                System.out.println("please enter the character you want to swap");
                String swapper1 = br.readLine();
                System.out.println("please enter the second character you want to swap");
                String swapper2 = br.readLine();
                plug.configureBoard(swapper1.charAt(0), swapper2.charAt(0));

            }
            System.out.println("do you want to modify your plugboard");
            System.out.println("*press 1 if yes*");
            choice = parseInt(br.readLine());

        }
        System.out.println("please choose your reflector");
        System.out.println("1:ejmzalyxvbwfcrquontspikhgd");
        System.out.println("2:yruhqsldpxngokmiebfzcwvjat");
        choice = parseInt(br.readLine());
        Refelector ref = new Refelector(choice);
        String [] rotorsConfigs = {"ekmflgdqvzntowyhxuspaibrcj" , "ajdksiruxblhwtmcqgznpyfvoe" , "bdfhjlcprtxvznyeiwgakmusqo", "esovpzjayquirhxlnftgkdcmwb", "vzbrgityupsdnhlxawmjqofeck" };
        System.out.println("please choose your fast Rotor ");
        for (int i =0 ; i< rotorsConfigs.length; i++){
        System.out.println( (i+1) + ":" + rotorsConfigs[i]);
        }
        choice = parseInt(br.readLine());
        if (choice <= 5 && choice > 0) {
            Rotors I = new Rotors(rotorsConfigs[choice - 1]);
            rotorsConfigs[choice-1] = null;

            System.out.println("please choose your middle Rotor ");
            for (int i =0 ; i< rotorsConfigs.length; i++){
                if (rotorsConfigs[i] != null){
                System.out.println( (i+1) + ":" + rotorsConfigs[i]);
                }
            } //rkbekwn
            choice = parseInt(br.readLine());
            if (choice <= 5 && choice > 0) {
                Rotors II = new Rotors(rotorsConfigs[choice - 1]);
                rotorsConfigs[choice - 1] = null;

                System.out.println("please choose your slow Rotor ");
                for (int i =0 ; i< rotorsConfigs.length; i++){
                    if (rotorsConfigs[i] != null){
                        
                        System.out.println( (i+1) + ":" + rotorsConfigs[i]);
                    }
                }
                choice = parseInt(br.readLine());
                if (choice <= 5 && choice > 0) {

                    Rotors III = new Rotors(rotorsConfigs[choice - 1]);
                    rotorsConfigs[choice - 1] = null;

                    for (int loop=0; loop<1; loop--) {
                        System.out.println(" ");
                        System.out.println("enter your sentence");
                        String text = br.readLine();
                        text = text.replaceAll("\\s", "");
                        text= text.toLowerCase();
                        System.out.println(text);
                        for (int i = 0; i < text.length(); i++) {

                            char plain = text.charAt(i);
                            plain = plug.cipher(plain);
                            plain = I.cipherForward(plain);
                            plain = II.cipherForward(plain);
                            plain = III.cipherForward(plain);
                            plain = ref.cipher(plain);
                            plain = III.cipherBackward(plain);
                            plain = II.cipherBackward(plain);
                            plain = I.cipherBackward(plain);
                            I.rotateRotors();
                            fastRotorCounter++;
                            if (fastRotorCounter % 26 == 0) {
                                II.rotateRotors();
                            }
                            if (fastRotorCounter % 676 == 0) {
                                III.rotateRotors();
                            }
                            plain = plug.cipher(plain);
                            System.out.print(plain);
                        }
                    }
                }
                else {
                    System.out.println("please enter a valid choice");
                }
            }
            else {
                System.out.println("please enter a valid choice");
            }
        }
        else {
            System.out.println("please enter a valid choice");
        }


    }

}
