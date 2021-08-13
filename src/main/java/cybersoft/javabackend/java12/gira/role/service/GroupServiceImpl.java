package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cybersoft.javabackend.java12.gira.role.dto.CreateGroupDto;
import cybersoft.javabackend.java12.gira.role.repository.GroupRepository;
import cybersoft.javabackend.java12.gira.role.entity.Group;
import cybersoft.javabackend.java12.gira.role.service.itf.GroupService;

@Service
public class GroupServiceImpl implements GroupService {
	@Autowired
	private GroupRepository repository;
	@Override
	public List<Group> findAll() {
		
		return repository.findAll();
	}
	@Override
	public Group addNewGroup(CreateGroupDto dto) {
		Group newGroup = new Group();
		newGroup.setName(dto.getName());
		newGroup.setDescription(dto.getDescription());
		return repository.save(newGroup);
	}
}
