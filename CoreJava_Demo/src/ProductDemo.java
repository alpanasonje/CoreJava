



public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Product p1=new Product();
			p1.setProductId(101);
			p1.setProductName("Mobile");
			p1.setQty(5);
			p1.setPrice(21000);
			Product p2=new Product();
			p2.setProductId(102);
			p2.setProductName("Camera");
			p2.setQty(1);
			p2.setPrice(7000);
			System.out.println(p1.getProductId()+"\t"+p1.getProductName()+"\t"+p1.getQty()+"\t"+p1.getPrice());
			System.out.println(p2.getProductId()+"\t"+p2.getProductName()+"\t"+p2.getQty()+"\t"+p2.getPrice());
			
	}

}
