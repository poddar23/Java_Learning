package com;

public class ArmstrongNumber {
	public static void main(String[] args) {
	
        for (int num = 100; num <= 999; num++) {
		int o = num;
		int rab = 0;
		while(num>0)
		{ int remainder = num%10;
		rab =(remainder*remainder*remainder)+rab;
		num/=10;
			
		}
		if(rab==o) {
		System.out.println("yes");
		}else {
			System.out.println("no");
		}
       }
	}
}
        
