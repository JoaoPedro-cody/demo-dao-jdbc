package app;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("=== Teste 1: FindById ===");
        Department dep = departmentDao.findById(2);
        System.out.println(dep);

        System.out.println();
        System.out.println("=== Teste 2: FindAll ===");
        List<Department> list = new ArrayList<>();
        list = departmentDao.findaAll();
        for (Department i : list){
            System.out.println(i);
        }

        System.out.println();
        System.out.println("=== Teste 3: Insert ===");
        System.out.println("Enter the department name: ");
        String name = sc.next();
        dep = new Department(null, name);
        departmentDao.insert(dep);
        list = departmentDao.findaAll();
        for (Department i : list){
            System.out.println(i);
        }

        System.out.println();
        System.out.println("=== Teste 4: Delete ===");
        System.out.println("Enter the department id: ");
        int id1 = sc.nextInt();
        departmentDao.deleteById(id1);
        list = departmentDao.findaAll();
        for (Department i : list){
            System.out.println(i);
        }

        System.out.println();
        System.out.println("=== Teste 5: Update ===");
        System.out.println("Enter the department id: ");
        int id2 = sc.nextInt();
        System.out.println("Enter the new department name: ");
        String name2 = sc.next();
        departmentDao.update(new Department(id2, name2));
        list = departmentDao.findaAll();
        for (Department i : list){
            System.out.println(i);
        }
    }
}
