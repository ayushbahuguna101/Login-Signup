package com.login.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.login.models.NewUser;
import com.login.models.User;


@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	JdbcTemplate template;
	
	@Autowired
	DataSource datasource;
	
	@Override
	public boolean checkingCredentials(User user) {
		System.out.println("LoginDaoImpl is working");
		String sql = "select * from myusers where username='"+user.getUsername()+"' and password='"+user.getPassword()+"'";
		List<User> usersFound = this.template.query(sql, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int RowNumber) throws SQLException {
				User u = new User();
				u.setUsername(rs.getString(1));
				u.setPassword(rs.getString(2));
				return u;
			}
		});
		if(usersFound.size()>0)
			return true;
		else
			return false;
		
//		LoginDaoImpl ld = new LoginDaoImpl();
//		if(ld.findById(user.getUsername())!=null)
//			return true;
//		else return false;
		
	}

	@Override
	public void saveDetails(NewUser newUser) {
		String sql = "insert into myusers values ('"+newUser.getFirst_name()+"', '"+newUser.getLast_name()+"', '"+newUser.getEmail()+"', '"+newUser.getUsername()+"', '"+newUser.getPassword()+"');";
		this.template.update(sql);	
	}

}
