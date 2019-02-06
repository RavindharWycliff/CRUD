package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TeamDAO {

ArrayList<Team> T1;
	
	@Autowired
	private TeamRepo teamRepo;
	
	public TeamDAO() {
		// TODO Auto-generated constructor stub
		T1 = new ArrayList<Team>();
		T1.add(new Team("1", "Anu", "23","22000"));
		T1.add(new Team("2", "Tamil","25","45000"));
		T1.add(new Team("3", "Priya","28","35000"));
		
		
	}
	
	
	/*public List getAll() {
		
		ArrayList<TeamEntity> teamEntities = (ArrayList<TeamEntity>) teamRepo.findAll();
		ArrayList<Team> T1 = new ArrayList<Team>();
		for(TeamEntity fe:  teamEntities) {
			T1.add(new Team(fe.getId(), fe.getName(), fe.getAge(), fe.getSalary()));
		}
		return T1;
	}*/


	public Team getTeam(String id) {
	
		
		TeamEntity fe = teamRepo.findById(id).orElse(null);
		Team f = new Team(fe.getId(), fe.getName(),  fe.getAge(), fe.getSalary());
		return f;
	}
	
	
	public List addTeam(Team f) {
		
		TeamEntity fe = new TeamEntity(f.getId(), f.getName(), f.getAge(), f.getSalary());
		teamRepo.save(fe);
		ArrayList<TeamEntity>  teamEntities = (ArrayList<TeamEntity>) teamRepo.findAll();
		ArrayList<Team> T1 = new ArrayList<Team>();
		for(TeamEntity fe1:  teamEntities) {
			T1.add(new Team(fe1.getId(), fe1.getName(),  fe.getAge(), fe.getSalary()));
		}
		return T1;
		
	}
	
	public List deleteTeam(String id) {
		
	
		teamRepo.deleteById(id);
		ArrayList<TeamEntity>  teamEntities = (ArrayList<TeamEntity>) teamRepo.findAll();
		ArrayList<Team> T1 = new ArrayList<Team>();
		for(TeamEntity fe1:  teamEntities) {
			T1.add(new Team(fe1.getId(), fe1.getName(),  fe1.getAge(), fe1.getSalary()));
		}
		
		return T1;
		
	}
	
	public List updateTeam(Team f) {
		
		TeamEntity fe = new TeamEntity(f.getId(), f.getName(), f.getAge(), f.getSalary());
		teamRepo.save(fe);
		ArrayList<TeamEntity>  teamEntities = (ArrayList<TeamEntity>) teamRepo.findAll();
		ArrayList<Team> T1 = new ArrayList<Team>();
		for(TeamEntity fe1:  teamEntities) {
			T1.add(new Team(fe1.getId(), fe1.getName(),  fe1.getAge(), fe1.getSalary()));
		}
		return T1;
		
	}
	
	public List insertTeam() {
		ArrayList<TeamEntity> teamEntities;
		teamEntities = new ArrayList<TeamEntity>();
		for(Team f: T1) {
			teamEntities.add(new TeamEntity(f.getId(),f.getName(), f.getAge(), f.getSalary()));
		}
		
		return teamRepo.saveAll(teamEntities);
		
		
	}
	
}
