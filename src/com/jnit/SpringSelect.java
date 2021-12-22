package com.jnit;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;



public class SpringSelect {
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void exampleSelect() {

		List li = jt.queryForList("select * from student");
		Iterator it = li.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

	}

}
