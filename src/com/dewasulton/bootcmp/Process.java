package com.dewasulton.bootcmp;

import java.util.Scanner;
import java.util.ArrayList;

public class Process {
	
	int count;
	static ArrayList<BankData> data = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	public void inputData(String norek, String name, String address) {
		data.add(new BankData(norek, name, address));
	}
	
	public void setCount() {
		System.out.print("Number of Customer : ");
		count = input.nextInt();
	}
	
	public int getCount() {
		return count ;
	}
	
	public void showData() {
		System.out.println("|| No. Account \t | \t Name \\t | \\t Name ||");
		for(BankData item : data) {
			System.out.println("||\t "+ item.getNoRek() +" \t | \t " + item.getName()+" \t | \t " + item.getName()+ " \t ||") ;
		}
		
		MenuAccountNumber menu = new MenuAccountNumber();
		menu.show();
				
		
	}
	
	public void processInput(){
	    for(int i = 0; i < getCount(); i++){
	        System.out.print("Enter No. Account \t: ");
	        String no = input.next ();
	        System.out.print("Enter Name \t: ");
	        String name = input.next();
	        System.out.print("Enter Address \t: ");
	        String address = input.next();
	        
	        inputData(no, name, address);
	    }
    	MenuAccountNumber menu = new MenuAccountNumber();
    	menu.show();
	}
	
	public void InquiryData(){
	    
        System.out.print("Search Your Account Number : ");
        String search = input.next();

        for(BankData item : data){
        	
            if(search.equals(item.getNoRek())){
                System.out.println(item.getName());
            }else{
                System.out.println("Not found");
            }
            
        }
        MenuAccountNumber menu = new MenuAccountNumber();
        menu.show();
    }
    

	
 	
	
}
