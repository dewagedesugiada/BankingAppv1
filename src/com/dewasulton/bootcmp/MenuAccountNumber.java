package com.dewasulton.bootcmp;

import java.util.Scanner;
public class MenuAccountNumber {
	
	  Scanner input = new Scanner(System.in);
	    int pilih ;
	    Process pcs = new Process();
	    
	    public void show(){
	    	
	        
	        System.out.println("### Select Menu ###");
	        System.out.println("1. Input Data");
	        System.out.println("2. View Data");
	        System.out.println("3. Search");
	        System.out.println("0. Back To Main Menu");
	        System.out.println("Choose \t: ");
	        pilih = input.nextInt();
	        
	        switch(pilih){
	            case 1 :
	                pcs.setCount();
	                pcs.processInput();
	                break ;
	            case 2 :
	                pcs.showData();
	                
	                break;
	            case 3 :
	                pcs.InquiryData();
	                break;
	            case 0 :
	                menuBank nm = new menuBank();
	                nm.show();
//	                System.exit(0);
	                break;
	            default:
	                System.out.println("Not Found!\n");
	                show();
	                break;
	        }
	        //ask = input.nextBoolean();
	        //}
	    }
}
