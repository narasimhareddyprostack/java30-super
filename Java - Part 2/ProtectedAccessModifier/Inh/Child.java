package com.hdfc.child;
import com.rbi.parent.Parent;

public class Child extends Parent{
	public void m3(){
				System.out.println("class Child is Public - m3 method is public");
	}
	public static void main(String[] args){
	Child obj=new Child();
	obj.m1();
	obj.m2();
	obj.m3();
	}
}