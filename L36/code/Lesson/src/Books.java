public class Books {

       String name;
       String author;
       Integer publicationYear;

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    public String readNow (String name){
        System.out.println(name+" takes this book");
        return name;
    }

    public Books(String name, String author, Integer publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
