package JavaStreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*; 

class Products {
    int id;
    String name;
    float price;
    public Products(int id, String name, float price) {
   	 this.id=id;
   	 this.name=name;
   	 this.price=price;
    }
   
}

public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Products> productList=new ArrayList<Products>();
		 productList.add(new Products(1, "HP", 25000f));
		 productList.add(new Products(2, "Dell", 27000f));
		 productList.add(new Products(3, "Lenovo", 30000f));
		 productList.add(new Products(4, "Sony", 45000f));
		 productList.add(new Products(5, "Apple", 40000f));
		 
		 productList.stream().filter(product->product.price==45000)
		 .forEach(product->System.out.println(product.name ));
		 
		 long count=productList.stream()
				 .filter(product->product.price<=40000)
				 .count();
		 System.out.println(count);
		 
		 List<Float> priceList= productList.stream()
				 .filter(p->p.price>27000)
				 .map(pm->pm.price)
				 .collect(Collectors.toList());
		 System.out.println(priceList);
		 

	}

}
