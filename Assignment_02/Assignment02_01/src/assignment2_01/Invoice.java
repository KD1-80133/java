package assignment2_01;

public class Invoice {
		private String part_number;
		private String part_description;
		private int qty;
		private double price;
		
		public Invoice()
		{
			this.part_number=" ";
			this.part_description="";
			this.qty=0;
			this.price=0.0;
		}

		public Invoice(String part_number,String part_description,int qty,double price)
		{
			this.part_number=part_number;
			this.part_description=part_description;
			this.qty=qty;
			this.price=price;
		}


		public String getPart_number() {
			return part_number;
		}

		public void setPart_number(String part_number) {
			this.part_number = part_number;
		}

		public String getPart_description() {
			return part_description;
		}

		public void setPart_description(String part_description) {
			this.part_description = part_description;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			 if (price > 0) {
		            this.price = price;
		        } else {
		            this.price = 0.0;
		        }
		}
		 public double getInvoiceAmount() {
		        return qty * price;
		    }
		
		public static void main(String[] args)
		{
			Invoice invoice=new Invoice("01","router",10,90.9);
			System.out.println("Enter the part number= "+invoice.getPart_number());
			System.out.println("Enter the part decription= "+invoice.getPart_description());
			System.out.println("Enter the qty= "+invoice.getQty());
			System.out.println("Enter the price= "+invoice.getPrice());
			System.out.println("-----------------------------------");
			System.out.println("Invoice amount= "+invoice.getInvoiceAmount());
					
		
	}
}

