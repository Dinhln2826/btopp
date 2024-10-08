public class TestBook {
    public static void main(String[] args) {
        Author A1 = new Author("Tan Ah Teck", "ahteck2nowhere.com", 'm');
        System.out.println(A1);
        
        Book B1 = new Book("Java for dummy", A1, 29.95, 99);
        System.out.println(B1);
        
        B1.setPrice(29.95);
        B1.setQty(28);

        System.out.println("Name is: " + B1.getName());
        System.out.println("Price is: " + B1.getPrice());
        System.out.println("Qty is: " + B1.getQty());
        System.out.println("Author is: " + B1.getAuthor());
        System.out.println("Author's name is: " + B1.getAuthor().getName());
        System.out.println("Author's email is: " + B1.getAuthor().getEmail());

        Book a1Book = new Book("More Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(a1Book);
    }
}