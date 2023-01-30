import java.util.*;
public class linkedListDs{
    static Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void add(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void deleteF(){
        if(head==null) return;
        head=head.next;
    }
    public static void deleteL(){
        Node follow=head;
        Node curr=head.next;
        while(curr!=null){
            curr=curr.next;
            follow=follow.next;
        }
        follow.next=null;
    }
    public void printL(){
        Node trav=head;
        while(trav!=null){
            System.out.print(trav.data+"->");
            trav=trav.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        linkedListDs a=new linkedListDs();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.deleteF();
        a.deleteL();
        a.printL();
    }
}
