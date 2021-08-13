package cybersoft.javabackend.java12.gira.role.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cybersoft.javabackend.java12.gira.role.dto.CreateProgramDto;
import cybersoft.javabackend.java12.gira.role.repository.ProgramRepository;
import cybersoft.javabackend.java12.gira.role.entity.Program;
import cybersoft.javabackend.java12.gira.role.service.itf.ProgramService;

@Service
public class ProgramServiceImpl implements ProgramService{
	@Autowired
	private ProgramRepository repository;
	
	@Override
	public List<Program> findAll() {
		
		return repository.findAll();
	}
	@Override
	public Program addNewProgram(CreateProgramDto dto) {
		Program newProgram = new Program();
		newProgram.setName(dto.getName());
		newProgram.setMethod(dto.getMethod());
		newProgram.setPath(dto.getPath());
		return repository.save(newProgram);
	}
}
