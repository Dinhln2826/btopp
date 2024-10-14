public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem iv1 = new InvoiceItem("A01", "Pen Red", 888, 0.08);
        
        System.out.println(iv1);

        iv1.setQty(999);
        iv1.setUnitPrice(0.99);

        System.out.println(iv1);

        System.out.println("id is " + iv1.getId());
        System.out.println("desc is " + iv1.getDesc());
        System.out.println("qty is " + iv1.getQty());
        System.out.println("unitPrice is " + iv1.getUnitPrice());

        System.out.println("The total is " + iv1.getTotal());
    }
}