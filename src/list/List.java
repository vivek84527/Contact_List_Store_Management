package list;

import person.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    ArrayList<Person> per=new ArrayList<Person>();
    Scanner sc =new Scanner(System.in);
    public void add(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the First Name");
        String f=sc.nextLine();
        System.out.println("Enter the Last Name");
        String l=sc.nextLine();
        System.out.println("Enter Your Mobile No");
        String m=sc.nextLine();
        System.out.println("ENter your EMail Id");
        String e=sc.nextLine();
        Person p=new Person(f,l,e,m);
        per.add(p);
    }
    public void view(){
        System.out.println("---Here are all your contacts---\n" +
                "-------- * -------- * -------- * --------");
        for(Person i:per){
            System.out.println("First Name: "+i.getFirst_name()+"\n"+"Last Name: "+i.getLast_name()+"\n"+"Contact Number(s): "+i.getContact_number()+"\n"+"Email address:"+i.getEmail_id());
            System.out.println("-------- * -------- * -------- * --------\n" +
                    "-------- * -------- * -------- * --------");
        }
    }
    public void delete(){
        System.out.println("Here are all your contacts:");
        int c=1;
        String name=null;
        for(Person i:per){
            System.out.println(c + "."+i.getFirst_name()+" "+i.getLast_name());
            c++;
            name=i.getFirst_name()+" "+i.getLast_name();
        }
        System.out.print("Press the number against the contact to delete it: ");
        int i=sc.nextInt();
        System.out.println(i);
        per.remove(i-1);
        System.out.println(name +" contact deleted from list!");


    }
    public void search(){
        System.out.println("You could search for a contact from their first names: ");
        String s=sc.nextLine();
        int c1=0;
        for(Person i:per){
            if(s.equalsIgnoreCase(i.getFirst_name())) {
                c1++; }
        }
        System.out.println(c1+" match found!");
        System.out.println("-------- * -------- * -------- * --------");
        for(Person i:per){
            if(s.equalsIgnoreCase(i.getFirst_name())){
                System.out.println("First Name: "+i.getFirst_name()+"\n"+"Last Name: "+i.getLast_name()+"\n"+"Contact Number(s): "+i.getContact_number()+"\n"+"Email address:"+i.getEmail_id());
                System.out.println("-------- * -------- * -------- * --------");
            }



        }
    }


}
