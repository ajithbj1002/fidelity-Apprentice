import java.util.LinkedList;
import java.io.*;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        while (true){
            String x = sc.nextLine();
            if(x.equalsIgnoreCase("exit")){
                break;
            }
            list.add(x);
        }
        System.out.println("enter the element that need to be inserted at first: ");
        String n=sc.nextLine();
        list.addFirst(n);
        System.out.println("Enter the element that need to be inserted at last: ");
        String n1=sc.nextLine();
        list.addLast(n1);
        System.out.println("Enter the element that need to be inserted at position: ");
        String n2=sc.nextLine();
        list.add(2,n2);
        System.out.println("Linked list: "+list);
        sc.close();
    }
}