package com.ojas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;



public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/java200", "root", "root");
			System.out.println("Connected" + con);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter empno : ");
			CallableStatement cst = con.prepareCall("{?=CALL getAverage(?,?)}");
			
			cst.registerOutParameter(1, Types.FLOAT);
			cst.setInt(2, scan.nextInt());
			cst.setInt(3, scan.nextInt());
			cst.execute();
			float salary = cst.getFloat(1);
			System.out.println("Your Average Salary is = " + salary);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
//	delimiter //
//	mysql> create function getAverage(id1 int, id2 int) returns int DETERMINISTIC
//	    -> BEGIN
//	    -> declare sal1 int;
//	    -> declare sal2 int;
//	    -> select salary into sal1 from employees where empno=id1;
//	    -> select salary into sal2 from employees where empno=id2;
//	    -> return (sal1+sal2)/2;
//	    -> end;
//	    -> //

}
