package com.shop.mysql;
/***���ݿ����Ӳ���***/

import com.shop.user.*;
import com.shop.index.*;
import com.shop.admin.*;
import java.sql.*;
import java.util.*;
import java.math.*;
import static java.lang.System.out;

public class DBconnection {
	static final String driverClass="com.mysql.jdbc.Driver";
	static final String	connStr="jdbc:mysql://localhost:3306/mall?useUnicode=true&characterEncoding=utf-8";
	static final String	user="root";
	static final String pass="admin";
	
	static Connection conn;	//����Connection����
	static PreparedStatement pres;	//�����ݿⷢ��SQL���
	static ResultSet res;	//ִ�����ݿ��ѯ
	
	public Connection getConn() {
			
			try {
				Class.forName(driverClass);
				//out.print("���ӳɹ�");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("���ݿ��������ش���!");
			}
			
			try{
				conn =  DriverManager.getConnection(connStr, user, pass);
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("���ݿ����Ӵ���!");
			}
				
			return conn;
		}
}
