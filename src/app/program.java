package app;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== Test 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();
        System.out.println("=== Test 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("=== Test 3: seller findAll ===");
        list = sellerDao.findaAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        /*
        System.out.println();
        System.out.println("=== Test 4: seller insert ===");
        Seller newSeller = new Seller(null, "Jose", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("new id " + newSeller.getId());
        */

        System.out.println();
        System.out.println("=== Test 5: seller insert ===");
        sellerDao.deleteById(9);
        list = sellerDao.findaAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

    }
}
