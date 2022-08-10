package com.ank.finalkeyword;
class Bike{  
	  final void run(){System.out.println("running...");}  
	}  
	class final2 extends Bike{  
	   public static void main(String args[]){  
	    new final2().run();  
	   }  
	} 