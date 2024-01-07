package application;

import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TESTE 1: depratment insert");
		Department departmentInsert = new Department(null, "Esportes");
		departmentDao.insert(departmentInsert);
		System.out.println(departmentInsert.getId());
		System.out.println("==========\n");
		
		System.out.println("===== TESTE 2: depratment findById");
		Department departmentFindById = departmentDao.findById(departmentInsert.getId());
		System.out.println(departmentFindById);
		System.out.println("==========\n");
		
		System.out.println("===== TESTE 3: depratment findAll");
		List<Department> listOfAllDepartements = departmentDao.findAll();
		for (Department departmentCurrent : listOfAllDepartements) {
			System.out.println(departmentCurrent);
		}
		System.out.println("==========\n");
		
		System.out.println("===== TESTE 4: depratment update");
		Department departmetToBeUpdated = departmentDao.findById(1);
		departmetToBeUpdated.setNome("Tecnologia");
		departmentDao.update(departmetToBeUpdated);
		System.out.println("Department updated: " + departmentDao.findById(1));
		
		System.out.println("==========\n");
		
		System.out.println("===== TESTE 5: depratment delete");
		departmentDao.deleteById(8);
		listOfAllDepartements = departmentDao.findAll();
		for (Department departmentCurrent : listOfAllDepartements) {
			System.out.println(departmentCurrent);
		}
		System.out.println("==========");
		
		DB.closeConnection();

	}

}
