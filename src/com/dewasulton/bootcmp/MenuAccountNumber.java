package com.dewasulton.bootcmp;

import java.util.Scanner;
public class MenuAccountNumber {
	
	 Scanner sc = new Scanner(System.in);
	    Process process = new Process();
	    
	    public void show(){
	        System.out.println("\n### Menu account number ###");
	        System.out.println("1. Input data");
	        System.out.println("2. View data");
	        System.out.println("3. Find data");
	        System.out.println("0. Back");
	        System.out.print("Choose \t: ");
	        String no = sc.next();
	        
	        if(no.equals("1")){
	            process.input();
	        }else if(no.equals("2")){
	            process.show();
	        }else if(no.equals("3")){
	            process.find();
	        }else if(no.equals("0")){
	            menuBank menu = new menuBank();
	            menu.show();
	        }else{
	            System.out.println("Not found");
	            show();
	        }
	        
	    }
}
