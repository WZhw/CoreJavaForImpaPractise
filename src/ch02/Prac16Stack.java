package ch02;

import java.util.Iterator;
import java.util.Scanner;

public class Prac16Stack <Item>  implements Iterable <Item> {
    private Item[] a;
    private int N;
    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;
        public boolean hasNext() { return i > 0; }
        public Item next() { return a[--i]; }
        public void remove() { }
    }
    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }
    public Prac16Stack(int cap){
        a = (Item[]) new Object[cap];
    }
    public boolean isEmpty() { return N == 0 ;}
    public boolean isFull() { return  N == a.length; }
    public int size() { return N; }
    public void push(Item item){
        if(a.length == N){ resize(a.length * 2);}
        a[N++] = item;
    }
    public Item pop() {
        Item item = a[--N];
        a[N] = null; //避免对象游离；
        if(( N > 0) && (a.length / 4) >= N ){ resize(a.length / 2);}
        return item;
    }
    public void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for(int i = 0; i < N; i++){
            temp[i] = a[i];
        }
        a = temp;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inputLine = "";
        try{
            while(in.hasNextLine()){
                Prac16Stack<String> s;
                s = new Prac16Stack<String>(100);
                inputLine = in.nextLine();
                String[] input = inputLine.split("\\s+");
                for(String iterator : input){
                    if(!iterator.equals("-")){ s.push(iterator); }
                    else if(!s.isEmpty()) { System.out.print(s.pop() + " "); }
                }
                System.out.println("(" + s.size() + " left on stack)");
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        finally {
            in.close();
        }
    }
}
