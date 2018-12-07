package com.dewasulton.bootcmp;

import java.util.Scanner;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.beans.Statement;


public class Process {
	
	static ArrayList<BankData> data = new ArrayList<BankData>();
    Scanner sc = new Scanner(System.in);
    String no, name, address;
    int count;
    String ono, oname, oaddress;
    
    BankData file;
    
    public void setCount(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("\n### Input data ###");
            System.out.print("Numbers of customer \t: ");
            count = sc.nextInt();
        }catch(Exception e){
            System.out.println("\nInput must number");
            setCount();
        }
    }
    
    public int getCount(){
        return count;
    }
    
    public void process(String no, String name, String address){
        data.add(new BankData(no, name, address));
    }
    
    public void input(){
        setCount();
        for(int i = 0; i < getCount(); i++){
            System.out.print("\nNo \t\t: ");
            no = sc.nextLine();
            System.out.print("Name \t\t: ");
            name = sc.nextLine();
            System.out.print("Address \t: ");
            address = sc.nextLine();
            process(no, name, address);
        }
        MenuAccountNumber menu = new MenuAccountNumber();
        menu.show();
    }
    
    public void show(){
        int o = 1;
        System.out.println("\n### Customer ###");
        System.out.println("No # Account number # Customer name # Customer address");
        
        if(data.isEmpty()){
            System.out.println("\nData not found");
        }
        
        for(BankData n : data){
            System.out.println(o + " # " + n.getNoRek() + " # " + n.getName() + " # " + n.getAddress());
            o++;
        }
        System.out.print("\nEnter 'ya' to back \t : ");
        String n = sc.nextLine();
        if(n.equals("ya")){
            MenuAccountNumber menu = new MenuAccountNumber();
            menu.show();
        }else{
            System.out.println("Thank you");
            System.exit(0);
        }
    }
    
    public void find(){
        boolean ask = false;
        System.out.println("\n### Searching Customer ###");
        System.out.print("Find by account number \t: ");
        String accnum = sc.nextLine();
        for(BankData n : data){
            ask = accnum.startsWith(n.getNoRek());
              if(ask){
                    ono = n.getNoRek();
                    oname = n.getName();
                    oaddress = n.getAddress();
                  break;
              }
        }
        
        System.out.println((ask) ? "\nAccount number # Customer name # Customer address\n" 
                + ono + " # " + oname + " # " + oaddress : "\nData not found!");
        
        System.out.print("\nEnter 'ya' to back \t: ");
        String n = sc.nextLine();
        if(n.equals("ya")){
            MenuAccountNumber menu = new MenuAccountNumber();
            menu.show();
        }else{
            System.out.println("Thanks you");
            System.exit(0);
        }
    }
	
}
