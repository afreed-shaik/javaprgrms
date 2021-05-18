package com.ojas;

import java.util.Scanner;
class Node {
    int data;
    Node link;
    Node() {
        this.link = null;
    }
}
class LinkedList {
    static Node head = null;

 

    public static void create(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.link = null;
        if (head == null) {
            head = temp;
        } else {
            Node p = head;
            while (p.link != null) {
                p = p.link;
            }
            p.link = temp;
        }
    }

 

    public static void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("No elements are present in the linked list");
        } else {
            while (temp.link != null) {
                System.out.println(temp.data);
                temp = temp.link;
            }
            System.out.println(temp.data);
        }
    }
    
    public static int length() {
        int count = 0;
        Node temp = head;
        if (temp == null) {
            System.out.println("No elements are present in the linked list");
        } else {
            while (temp.link != null) {
                count++;
                temp = temp.link;
            }
            count++;
        }
        
        return count;
        
    }
    public static void addAtBegin(int data) {
        
        Node temp = new Node();
        temp.data = data;
        temp.link = null;
        if (head == null) {
            head = temp;
        } else {
            temp.link = head; //right side connection
            head = temp;//left side connection
        }
    }
    static void menu() {
        String m = "Menu Driven Application\n";
        m += "1.Add Element \n";
        m += "2.Display Elements \n";
        m += "3.No.of elements \n";
        m += "4.Add at begin \n";
        m += "5.Delete \n";
        m += "6.Add At Specific location \n";
        m += "7.Exit\n";
        m += "Select any option ?";
        System.out.println(m);

 

    }
    
    public static  void delete(int loc) {
        Node temp = head;
        if(loc > length()) {
            System.out.println("invalid Location");
        }
        else if(loc == 1) {
            temp = head;
            head = temp.link;
            temp.link =null;
            System.out.println("deleted element is = " + temp.data);
            
        }
        else {
            Node p,q;
            p = head;
            int i  =1;
            while(i < loc--) {
                p = p.link;
                i++;
            }
            q = p.link;
            p.link = q.link;
            q.link = null;
            System.out.println("deleted element is = " + q.data);
            
        }
        
    }
    static public void accept() {
        System.out.println("Enter any value ?");
    }
    public static void addAfter(int loc,int data) {
         Node p;
        Node temp = new Node();
        temp.data = data;
        temp.link = null;
        if(loc > length()) {
            System.out.println("Invalid Location");
        }
        else {
            int i = 1;
            p = head;
             while(i < loc--) {
                    p = p.link;
                    i++;
                }
             temp.link = p.link; // right side connection
             p = temp; //left side connection
             
            
        }
        
        
    }
    public static void main(String []args) {
        LinkedList obj = new LinkedList();
        Scanner sc = new Scanner(System.in);
        while(true) {
        menu();
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            accept();
            create(sc.nextInt());
            break;
        case 2:
            print();
            break;
        case 3:
            System.out.println(length());
            break;
        case 4:
            accept();
            addAtBegin(sc.nextInt());
            break;
        case 5:
            System.out.println("Enter any value");
            delete(sc.nextInt());
            break;
        case 6:
            System.out.println("enter loc,data ?");
            addAfter(sc.nextInt(),sc.nextInt());
            break;
        case 7:
            System.exit(0);
            break;
        default:
             System.out.println("Invalid Option");

 

        }
        }
    }

 

}
