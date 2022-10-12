package upeu.edu.pe.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.dao.Operaciones;
import upeu.edu.pe.daoimpl.sthevenDaoimpl;

@Service
public class sthevenService implements Operaciones {
	
	@Autowired
	private sthevenDaoimpl sthevendaoimpl;

	@Override
	public List<Map<String, Object>> readCantidaddeclientesporRegion() {
		// TODO Auto-generated method stub
		return sthevendaoimpl.readCantidaddeclientesporRegion();
	}

	@Override
	public List<Map<String, Object>> readOrdenTerritorio() {
		// TODO Auto-generated method stub
		return sthevendaoimpl.readOrdenTerritorio();
	}

}
