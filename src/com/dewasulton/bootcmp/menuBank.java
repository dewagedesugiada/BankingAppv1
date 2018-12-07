package com.dewasulton.bootcmp;

import java.util.Scanner;

public class menuBank {
	 	 Scanner sc = new Scanner(System.in);
	    
	    public void show(){
	        System.out.println("\n### Menu home ###");
	        System.out.println("1. Account number");
	        System.out.println("0. Exit");
	        System.out.print("Choose \t: ");
	        String no = sc.next();
	        
	        if(no.equals("1")){
	            MenuAccountNumber menu = new MenuAccountNumber();
	            menu.show();
	        }else if(no.equals("0")){
	            System.exit(0);
	        }else{
	            System.out.println("Not found");
	            show();
	        }
	    }
	  }
	    

