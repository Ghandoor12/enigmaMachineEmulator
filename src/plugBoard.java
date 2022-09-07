import java.util.*;

public class plugBoard {
    Map<Character, Character> board  = new HashMap<Character, Character>();

    public plugBoard() {

        board.put('a','z');
        board.put('b','p');
        board.put('c','h');
        board.put('d','n');
        board.put('e','m');
        board.put('f','s');
        board.put('g','w');
        board.put('h','c');
        board.put('i','i');
        board.put('j','y');
        board.put('k','t');
        board.put('l','q');
        board.put('m','e');
        board.put('n','d');
        board.put('o','o');
        board.put('p','b');
        board.put('q','l');
        board.put('r','r');
        board.put('s','f');
        board.put('t','k');
        board.put('u','u');
        board.put('v','v');
        board.put('w','g');
        board.put('x','x');
        board.put('y','j');
        board.put('z','a');
    }


    public void configureBoard(Character alpha1, Character alpha2){
        Character first  = this.board.get(alpha1);
        Character second = this.board.get(alpha2);
        this.board.put(first, first);
        this.board.put(second, second);
        this.board.put(alpha1, alpha2);
        this.board.put(alpha2, alpha1);
    }

    public Character cipher(Character text){

        return this.board.get(text);

    }














}
