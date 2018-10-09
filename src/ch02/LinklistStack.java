package ch02;

import java.util.Iterator;
import java.util.Scanner;

public class LinklistStack<Item> implements Iterable<Item> {
    private Node first;
    private int N;
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty() { return first == null; }
    public int size() { return N; }
    public void push(Item item){
        Node oldfisrt = first;
        first = new Node();
        first.item = item;
        first.next = oldfisrt;
        N++;
    }
    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
    public Item top(){
        return first.item;
    }
    private class LinklistIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() { return current == null; }
        public Item next() {
            Node returnitem = current;
            current = current.next;
            return returnitem.item;
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
                LinklistStack<String> s;
                s = new LinklistStack<String>();
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
