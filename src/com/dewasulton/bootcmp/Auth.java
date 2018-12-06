package com.dewasulton.bootcmp;

import java.util.Scanner;

public class Auth {

	String user = "admin" ;
	String pass = "admin" ;
	String username, password;
	    
	    menuBank b = new menuBank();
	    Scanner sc = new Scanner(System.in);
	    
	    public void login(){
	        System.out.println("### Banking Application ###");
	        System.out.print("Enter username \t: ");
	        username = sc.next();
	        System.out.print("Enter password \t: ");
	        password = sc.next();
	        
	        if(user.equals(username) && pass.equals(password)){
	            b.show();
	        }else{
	            System.out.println("Wrong username and password \n");
	            login();
	        }
	    }
	    
	

}
