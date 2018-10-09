package ch02;

import java.util.Iterator;
import java.util.Scanner;

public class Prac16Queue <Item> implements Iterable<Item> {
    private class Node {
        Item item;
        Node next;
    }
    private Node first;
    private Node last;
    private int N;
    public boolean isEmpty() { return (first == last);}
    public int size() { return N; }
    public Prac16Queue() {
        this.last = new Node();
        first = last;
    }
    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        oldlast.next = last;
        N++;
    }
    public Item dequeue() {
        if(!isEmpty()) {
            Item returnitem = first.next.item;
            Node oldfirst = first;
            first = first.next;
            N--;
            oldfirst = null;
            return returnitem;
        }
        else{
            System.out.println("The Queue is empty.");
            return null;
        }
    }
    public class LinklistIterator implements Iterator<Item> {
        private Node current = first.next;
        public boolean hasNext() { return (current != null) ; }
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
        public void remove() { }
    }
    public Iterator<Item> iterator(){
        return new LinklistIterator();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputLine = "";
        try{
            while(in.hasNextLine()){
                Prac16Queue<String> s;
                s = new Prac16Queue<String>();
                inputLine = in.nextLine();
                String[] input = inputLine.split("\\s+");
                for(String iterator : input){
                    if(!iterator.equals("-")){ s.enqueue(iterator); }
                    else if(!s.isEmpty()) { System.out.print(s.dequeue() + " "); }
                }
                System.out.println("(" + s.size() + " left on queue)");
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
