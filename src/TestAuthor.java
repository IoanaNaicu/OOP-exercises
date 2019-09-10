public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Creanga", "creanga@yahoo.com", 'm');
        //System.out.println(author1.toString());
        author1.setEmail("crenguta@gmail.com");
        //System.out.println(author1);

        Book book1 = new Book ("Caprele Irinucai", author1, 25);
        Book book2 = new Book ("Stea", new Author("Eminescu", "emi@yahoo.com", 'm'), 56.6, 3);

       System.out.println(book2.getAuthor());
      // System.out.println(book1.getAuthor().getName());
        System.out.println(book2.getAuthorName());
        System.out.println(book2.getAuthorEmail());
        System.out.println(book2);
    }

}
