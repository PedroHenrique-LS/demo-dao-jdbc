package application;

import java.util.List;

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
		List<Seller> sellerList = sellerDao.findByDepartment(new Department(2, null));
		for (Seller sellerCurrent : sellerList) {
			System.out.println(sellerCurrent);
		}
		System.out.println("\n");
		
		

	}

}
