package cybersoft.javabackend.java12.gira.role.service.itf;

import java.util.List;

import cybersoft.javabackend.java12.gira.role.dto.CreateGroupDto;
import cybersoft.javabackend.java12.gira.role.entity.Group;

public interface GroupService {
	List<Group> findAll();

	Group addNewGroup(CreateGroupDto dto);
}
