import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.module.Configuration;

import static java.lang.Integer.parseInt;

public class Rotors {

    Character[] config = new Character[26];
    Character[] alphabet= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public Rotors(String config) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i =0; i< config.length(); i++) {
            this.config[i] = config.charAt(i);
        }
        System.out.println("do you want to rotate/config rotor ");
        System.out.println("*press 1 if yes*");
        int choice = parseInt(br.readLine());
        if (choice ==1){
            System.out.println("how many times you want to rotate fast rotor");
            choice = parseInt(br.readLine());

            for(int i=0; i<choice; i++){

                this.rotateRotors();
            }
        }
    }

    public void rotateRotors() {
        Character lastElement;

        lastElement = this.alphabet[25];

        for (int i =25; i>0; i--){

            this.alphabet[i] = this.alphabet[i-1];
        }
        this.alphabet[0]= lastElement;
    }


    public Character cipherForward( Character plain) {
        for (int i=0; i<26; i++){
            if (alphabet[i]== plain){
                return this.config[i];
            }
            else if(i==25){
                System.out.println("please enter a valid character");
            }
        }


return null;
    }


    public Character cipherBackward( Character plain) {
        for (int i=0; i<26; i++){
            if (this.config[i]== plain){
                return this.alphabet[i];
            }
            else if(i==25){
                System.out.println("please enter a valid character");
            }
        }


return null;
    }










}










/*

import java.lang.module.Configuration;

public class Rotors {

    String[] config;
    String[] alphabet= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public Rotors(String[] config) {
        this.config = config;

    }



    public void rotateRotors() {
        String lastElement;

        lastElement = this.config[25];

        for (int i =25; i>0; i--){

            this.config[i] = this.config[i-1];
        }
        this.config[0]= lastElement;

        for ( int x=0; x<26; x++){
            System.out.println(this.config[x]);
        }
    }


    public String cipher( String plain) {
        for (int i=0; i<26; i++){
            if (alphabet[i]== plain){
                System.out.println(this.config[i]);
                return this.config[i];
            }
            else if(i==25){
                System.out.println("please enter a valid character");
            }
        }


return null;
    }










}



 */

