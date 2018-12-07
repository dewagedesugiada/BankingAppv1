package com.dewasulton.bootcmp;

import java.util.Scanner;

public class Auth {

	String username = "admin";
    String password = "admin";
    String user, pass;
    
    Scanner sc = new Scanner(System.in);
    
    public void login(){
        System.out.println("\n### Login ###");
        System.out.print("Enter username \t: ");
        user = sc.next();
        System.out.print("Enter password \t: ");
        pass = sc.next();
        
        if(user.equals(username) && pass.equals(password)){
            menuBank menu = new menuBank();
            menu.show();
        }else{
            System.out.println("\nWrong username or password");
            login();
        }
	    
    }

}
