package com.ltts.playerproj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.relation.RelationNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.playerproj.bo.playerbo;
import com.ltts.playerproj.model.player;

@RestController

public class Externalcontroller {
	
	@Autowired
	playerbo pb;
	
	@GetMapping("ex_players")
	public List<player> getplayers() {
		return pb.findAll();
	}
	
	@GetMapping("/ex_players/{id}")
	public player getplayerbyid(@PathVariable int id) {
		return pb.findById(id).get();
	}
	
	/*@DeleteMapping("/ex_players/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") int id)
	  throws RelationNotFoundException {
	     player em = pb.findById(id).get();
	     
	     pb.delete(em);
	     Map<String, Boolean> response = new HashMap<>();
	     response.put("deleted", Boolean.TRUE);
	     return response;
	
	}*/
}
