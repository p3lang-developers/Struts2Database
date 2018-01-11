package com.p3lang.struts2.action;

import java.sql.SQLException;
import java.util.List;

import org.apache.struts2.dispatcher.DefaultActionSupport;

import com.p3lang.struts2.Beans.StudentBean;
import com.p3lang.struts2.DAO.StudentDAO;

/**
 *
 * @author Abhishek
 */

@SuppressWarnings("serial")
public class StudentsAction extends DefaultActionSupport {

	private StudentDAO sDAO = null;
	private List<StudentBean> studentsList = null;

	public StudentDAO getsDAO() {
		return sDAO;
	}

	public void setsDAO(StudentDAO sDAO) {
		this.sDAO = sDAO;
	}

	public List<StudentBean> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<StudentBean> studentsList) {
		this.studentsList = studentsList;
	}

	@Override
	public String execute() throws ClassNotFoundException, SQLException {
		try {
			sDAO = new StudentDAO();
			studentsList = sDAO.getStudentsDAO();
			System.out.println(studentsList.toString());
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "success";
	}

}