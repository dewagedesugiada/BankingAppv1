package com.dewasulton.bootcmp;

import java.util.Scanner;

public class menuBank {

	 
	    MenuAccountNumber menu = new MenuAccountNumber();
		private Scanner sc;
	    
	    public void show(){
	    	sc = new Scanner(System.in);
	        System.out.println("### Select Menu ###");
	        System.out.println("1. Account Number");
	        System.out.println("0. Exit");
	        
	        
	       int ask = sc.nextInt();
	        
	        switch(ask){
	            case 1:
	                menu.show();
	                break;
	            case 0:
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Not Found!\n");
	                show();
	                break;
	        }
	    }
}
