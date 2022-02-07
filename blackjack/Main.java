import java.util.ArrayList;
class Main{
    public static void main(String [] args){
        ArrayList<Cards> lista = new ArrayList<>();
        lista.add(new Cards("two", 2));
        lista.add(new Cards("three", 3));
        lista.add(new Cards("four", 4));
        lista.add(new Cards("five", 5));
        lista.add(new Cards("six", 6));
        lista.add(new Cards("seven", 7));
        lista.add(new Cards("eight", 8));
        lista.add(new Cards("nine", 9));
        lista.add(new Cards("ten", 10));
        lista.add(new Cards("jack", 10));
        lista.add(new Cards("queen", 10));
        lista.add(new Cards("king", 10));
        lista.add(new Cards("ace", 11));
    }
}