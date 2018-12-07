package com.dewasulton.bootcmp;

import java.util.Scanner;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.Menu;
import java.beans.Statement;


public class Process {
	
	
	static ArrayList<BankData> data = new ArrayList<BankData>();
    Scanner sc = new Scanner(System.in);
    String no, name, address;
    int count;
    
    ResultSet rs ;
    
    
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
    	String sql_query = "INSERT INTO customer (AccountNumber, Name, Address) VALUES ('"+no+"','"+name+"','"+address+"')";
    	
    	try {
			Conn db = new Conn();
			db.ExecuteSQLStatement(sql_query);
		} catch (Exception e) {
			System.out.println("Process Input Failed");
			MenuAccountNumber menu = new MenuAccountNumber() ;
			menu.show();
		}
    	
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
    	try {
			Conn db = new Conn();
			String sql = "Select * from customer" ;
			System.out.println("\n### Customer ###");
	        System.out.println("No # Account number # Customer name # Customer address");
		    
	        rs = db.ReadRecords(sql);
	        int i = 1;
	        while (rs.next()) {
	        	System.out.println(i + " # " + rs.getInt("AccountNumber") + " # " + rs.getString("Name") + " # " + rs.getString("Address"));
	            i++;	
			}
	        
	        db.Disconnect();
	        
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
        
}
    
    public void find(){
        boolean ask = true;
        System.out.println("\n### Searching Customer ###");
        System.out.print("Find by account number \t: ");
        int i = 1 ;
        String search = sc.nextLine();
        System.out.println("\nNo # Account number # Customer name # Customer address\n");
        try {
			Conn db = new Conn() ;
			String sql = "Select * from customer ";
			ResultSet rs = db.ReadRecords(sql) ;
			
			while(rs.next()){
                ask = search.startsWith(rs.getString("no_account"));
                if(ask){
                    System.out.println(i + " # " + rs.getInt("AccountNumber") + " # " + rs.getString("Name") + " # " + rs.getString("Address"));
                    i++;
                }
            }
			db.Disconnect();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
    
    }
	
}
