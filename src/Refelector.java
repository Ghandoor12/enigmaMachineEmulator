import java.util.HashMap;
import java.util.Map;

public class Refelector {
    Map<Character, Character> reflect  = new HashMap<Character, Character>();

    public Refelector(int choice) {
    if(choice ==1 ) {
        reflect.put('a', 'e');
        reflect.put('b', 'j');
        reflect.put('c', 'm');
        reflect.put('d', 'z');
        reflect.put('e', 'a');
        reflect.put('f', 'l');
        reflect.put('g', 'y');
        reflect.put('h', 'x');
        reflect.put('i', 'v');
        reflect.put('j', 'b');
        reflect.put('k', 'w');
        reflect.put('l', 'f');
        reflect.put('m', 'c');
        reflect.put('n', 'r');
        reflect.put('o', 'q');
        reflect.put('p', 'u');
        reflect.put('q', 'o');
        reflect.put('r', 'n');
        reflect.put('s', 't');
        reflect.put('t', 's');
        reflect.put('u', 'p');
        reflect.put('v', 'i');
        reflect.put('w', 'k');
        reflect.put('x', 'h');
        reflect.put('y', 'g');
        reflect.put('z', 'd');

    }
    else if(choice == 2){
        reflect.put('a', 'y');
        reflect.put('b', 'r');
        reflect.put('c', 'u');
        reflect.put('d', 'h');
        reflect.put('e', 'q');
        reflect.put('f', 's');
        reflect.put('g', 'l');
        reflect.put('h', 'd');
        reflect.put('i', 'p');
        reflect.put('j', 'x');
        reflect.put('k', 'n');
        reflect.put('l', 'g');
        reflect.put('m', 'o');
        reflect.put('n', 'k');
        reflect.put('o', 'm');
        reflect.put('p', 'i');
        reflect.put('q', 'e');
        reflect.put('r', 'b');
        reflect.put('s', 'f');
        reflect.put('t', 'z');
        reflect.put('u', 'c');
        reflect.put('v', 'w');
        reflect.put('w', 'v');
        reflect.put('x', 'j');
        reflect.put('y', 'a');
        reflect.put('z', 't');
    }
    }


    public Character cipher(Character text){
        Character x = this.reflect.get(text);
        return x;

    }

}
