package application;

import java.time.LocalDate;
import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TESTE 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("\n");
		
		
		System.out.println("===== TESTE 2: seller findByDepartment =====");
		List<Seller> sellerListByDepartment = sellerDao.findByDepartment(new Department(2, null));
		for (Seller sellerCurrent : sellerListByDepartment) {
			System.out.println(sellerCurrent);
		}
		System.out.println("\n");
		
		System.out.println("===== TESTE 3: seller findAll =====");
		List<Seller> listOfAllSelles = sellerDao.findAll();
		for (Seller sellerCurrent : listOfAllSelles) {
			System.out.println(sellerCurrent);
		}
		System.out.println("\n");
		
//		System.out.println("===== TESTE 4: seller insert =====");
//		Seller seller2 = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, new Department(2, null));
//		sellerDao.insert(seller2);
//		System.out.println("new id: " + seller2.getId());
//		System.out.println("\n");
		
		System.out.println("===== TESTE 5: seller update =====");
		Seller seller3 = sellerDao.findById(10);
		seller3.setBaseSalary(3940.0);
		seller3.setBirthDate(LocalDate.now());
		sellerDao.update(seller3);
	    seller3 = sellerDao.findById(10);
		System.out.println(seller3);
		System.out.println("\n");
		
		System.out.println("===== TESTE 6: seller deleteById =====");
		Seller seller4 = sellerDao.findById(15);
		System.out.println(seller4);
		sellerDao.deleteById(15);
		seller4 = sellerDao.findById(15);
		System.out.println(seller4);
		
	    DB.closeConnection();

	}

}
