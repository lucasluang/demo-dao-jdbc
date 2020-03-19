package application;

import java.util.Date;

import com.mysql.fabric.xmlrpc.base.Data;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Lucas", "lucasluang@gmail.com", 
				new Date(), 3000.0, obj);
		
		System.out.println(seller);

	}

}
