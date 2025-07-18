package com.jspider.passingandreturningvalue;
import java.util.*;
class Player{
	int jerseynumber;
	String name;
	Player(int jerseynumber,String name){
		this.jerseynumber=jerseynumber;
		this.name=name;
		
	}
}
class Team{
	private static int jerseynumber;
	static void showPlayer(Player p) {
		if(p!=null) {
			System.out.println("Jerssey number :"+p.jerseynumber);
			System.out.println("palyer name :"+p.name);
			
			
		}
	}
	static Player createPlayer() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the jersey number");
		int jerseey= sc.nextInt();
		System.out.println("Enter the player name");
		String name= sc.next();
		Player p= new Player(jerseynumber,name);
		return p;
		
		
	}
}

public class Mainclass6 {
	public static void main(String[] args) {
		Player p1= Team.createPlayer();
		Team.showPlayer(p1);
		Player p2= Team.createPlayer();
		Team.showPlayer(p2);
				
		
	}
	

}
