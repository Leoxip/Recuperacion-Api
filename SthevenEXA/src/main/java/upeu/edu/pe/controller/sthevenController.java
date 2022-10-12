package upeu.edu.pe.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.service.sthevenService;

@RestController
@RequestMapping("/api/stheven")
@CrossOrigin({"*"})
public class sthevenController {
	
	@Autowired
	private sthevenService sthevenservice;
	
	@GetMapping("/cantidad_clientes")
	public List<Map<String, Object>> readCantidaddeclientesporRegion(){
		return sthevenservice.readCantidaddeclientesporRegion();
	};
	
	@GetMapping("/ordenes_territorio")
	public List<Map<String, Object>> readOrdenTerritorio(){
		return sthevenservice.readOrdenTerritorio();
	};
}
