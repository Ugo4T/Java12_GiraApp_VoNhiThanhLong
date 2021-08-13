package cybersoft.javabackend.java12.gira.role.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java12.gira.common.ResponseHandler;
import cybersoft.javabackend.java12.gira.role.dto.CreateGroupDto;
import cybersoft.javabackend.java12.gira.role.entity.Group;
import cybersoft.javabackend.java12.gira.role.service.itf.GroupService;

@RestController

@RequestMapping("/api/group")
public class GroupController {
	@Autowired
	private GroupService service;
	
	@GetMapping
	public Object findAllRole() {
		List<Group> groups = service.findAll();
		return new ResponseEntity<>(groups,HttpStatus.OK);
	}
	

	@PostMapping
	public Object saveGroup(@Valid @RequestBody CreateGroupDto dto,BindingResult errors) {
		if (errors.hasErrors()) {
			return new ResponseEntity<>(errors.getAllErrors(),HttpStatus.BAD_REQUEST);
		}
		Group addedGroup = service.addNewGroup(dto);
		return ResponseHandler.getResponse(addedGroup, HttpStatus.CREATED);
	}
}
