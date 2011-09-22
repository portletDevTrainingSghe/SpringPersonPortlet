package com.sungardhe.luminis.portlets.examples.SpringPersonPortlet.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class JdbcPortalPersonDaoImpl extends JdbcDaoSupport implements IPortalPersonDAO  {


	private static String GET_PORTAL_PERSONS = "select person_id, pseudonym from lp_person";

	
	@SuppressWarnings("unchecked")
	public List<PortalPerson> getPersons() {
		
		List<PortalPerson> portalPersonList = new ArrayList<PortalPerson>();
		try {
			@SuppressWarnings("rawtypes")
			List<Map> rows = getJdbcTemplate().queryForList(GET_PORTAL_PERSONS);
			
			for (Map row : rows) {
				PortalPerson portalPerson = new PortalPerson();
				portalPerson.setSpridenId((String)(row.get("person_id")));
				portalPerson.setFullName((String)row.get("pseudonym"));
				portalPersonList.add(portalPerson);
			}

			
		} catch (DataAccessException e) {
			
			e.printStackTrace();
		}
		
		return portalPersonList;
	}
}