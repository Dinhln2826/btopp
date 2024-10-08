public class TestAuthor {
    public static void main(String[] args) {
        Author A1 = new Author("Tan Ah Teck", "ahteck@nowhere.com",'m');
        System.out.println(A1);
        A1.setEmail("ahteck@nowhere.com");
        System.out.println("name is:"+A1.getName());
        System.out.println("email is: "+A1.getEmail());
        System.out.println("gender is:"+A1.getGender());
    }
    
}
