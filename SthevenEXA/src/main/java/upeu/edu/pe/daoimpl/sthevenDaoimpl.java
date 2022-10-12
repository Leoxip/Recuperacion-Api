package upeu.edu.pe.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.dao.Operaciones;

@Component
public class sthevenDaoimpl implements Operaciones {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> readCantidaddeclientesporRegion() {
		// TODO Auto-generated method stub
		String SQL  = "SELECT RegionDescription AS region , count(*) AS empleados FROM employeeterritories ter \r\n"
				+ "JOIN employees e ON e.EmployeeID= ter.EmployeeID\r\n"
				+ "JOIN territories t ON t.TerritoryID= ter.TerritoryID \r\n"
				+ "JOIN region r ON r.RegionID=t.RegionID \r\n"
				+ "GROUP BY RegionDescription";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readOrdenTerritorio() {
		// TODO Auto-generated method stub
		String SQL  = "select te.TerritoryDescription as Territorio, count(*) as Clientes from orders ord\r\n"
				+ "join customers cu on cu.CustomerID=ord.CustomerID\r\n"
				+ "join employees em on em.EmployeeID=ord.EmployeeID\r\n"
				+ "join employeeterritories terr on terr.EmployeeID=em.EmployeeID\r\n"
				+ "join territories te on te.TerritoryID=terr.TerritoryID\r\n"
				+ "group by te.TerritoryDescription\r\n"
				+ "order by TerritoryDescription";
		return jdbcTemplate.queryForList(SQL);
	}
}
