package upeu.edu.pe.dao;

import java.util.List;
import java.util.Map;

public interface Operaciones {
	
    List<Map<String, Object>> readCantidaddeclientesporRegion();
	List<Map<String, Object>> readOrdenTerritorio();
	
}
