package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;


	@RequestMapping(value= "/get/{id}", method= RequestMethod.GET,headers="Accept=application/json")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public Team getTeam(@PathVariable(value="id") String id) {
		return teamService.getTeam(id);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.PUT)
	public List addTeam(@RequestBody Team f) {
		return teamService.addTeam(f);
		
	}
	
	
	@RequestMapping(value = "/delete/{id}", method=RequestMethod.DELETE)
	public List deleteTeam(@PathVariable(value= "id") String id) {
		return teamService.deleteTeam(id);
	}
	
	
	@RequestMapping(value = "/update", method  = RequestMethod.POST)
	public List updateTeam(@RequestBody Team f) {
		return teamService.updateTeam(f);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public List insertTeam() {
		return teamService.insertTeam();
	}


	
}
