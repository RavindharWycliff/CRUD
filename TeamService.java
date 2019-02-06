package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamService {

	@Autowired
	TeamDAO teamDao;

	
	/*@SuppressWarnings("rawtypes")
	public List getAll() {
		return teamDao.getAll();
	}*/

	public Team getTeam(String id) {
		// TODO Auto-generated method stub
		return teamDao.getTeam(id);
	}
	
	public List addTeam(Team t) {
		return teamDao.addTeam(t);
	}
	
	public List deleteTeam(String id) {
		return teamDao.deleteTeam(id);
	}
	
	public List updateTeam(Team t) {
		return teamDao.updateTeam(t);
	}
	
	public List insertTeam() {
		return teamDao.insertTeam();
	}

}
