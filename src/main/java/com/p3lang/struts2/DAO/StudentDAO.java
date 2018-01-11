/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.p3lang.struts2.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.p3lang.struts2.Beans.StudentBean;
import com.p3lang.struts2.database.DBConnection;

/**
 *
 * @author Abhishek
 */
public class StudentDAO {

	private StudentBean sb = null;
	private List<StudentBean> al = null;

	public StudentBean getSb() {
		return sb;
	}

	public void setSb(StudentBean sb) {
		this.sb = sb;
	}

	public List<StudentBean> getAl() {
		return al;
	}

	public void setAl(List<StudentBean> al) {
		this.al = al;
	}

	public List<StudentBean> getStudentsDAO() {
		Connection connection = null;
		try {
			connection = DBConnection.getConnection();

			PreparedStatement ps = connection.prepareStatement("select * from students");
			ResultSet rs = ps.executeQuery();

			
			al = new ArrayList<StudentBean>(); // Initialize ArrayList to store the students details

			while (rs.next()) {
				sb = new StudentBean(); // Initialize the bean class to hold the values
				sb.setStudentName(rs.getString(1));
				sb.setStudentEmail(rs.getString(2));
				sb.setStudentProgram(rs.getString(3));
				sb.setStudentGrade(rs.getString(4));
				al.add(sb);
			}
			connection.close();
		}

		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return al;
	}
}
