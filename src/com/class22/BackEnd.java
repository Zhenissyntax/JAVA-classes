
package com.class22;
public class BackEnd extends Developer{
	private void doSql() {
		System.out.println("Back end developers do SQL coding");
	}
	public static void main(String[] args) {
		BackEnd doSql=new BackEnd();
		doSql.code();
		doSql.salary=130000;
		doSql.getPaid();
		doSql.doSql();
	}
}