package by.itacademy.marchuk_viktor.entity;

public class Book{
    private int id;
    private String bookName;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int amountOfPages;
    private double price;
    private String typeOfBinding;

    public Book(){

    }

    public Book(int id, String bookName, String author, String publisher, int yearOfPublication,
                int amountOfPages, double price, String typeOfBinding){
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }

    public int getAmountOfPages(){
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages){
        this.amountOfPages = amountOfPages;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getTypeOfBinding(){
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding){
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Book)) return false;

        Book book = (Book)o;

        if(getId() != book.getId()) return false;
        if(getYearOfPublication() != book.getYearOfPublication()) return false;
        if(getAmountOfPages() != book.getAmountOfPages()) return false;
        if(Double.compare(book.getPrice(), getPrice()) != 0) return false;
        if(getBookName() != null ? !getBookName().equals(book.getBookName()) : book.getBookName() != null) return false;
        if(getAuthor() != null ? !getAuthor().equals(book.getAuthor()) : book.getAuthor() != null) return false;
        if(getPublisher() != null ? !getPublisher().equals(book.getPublisher()) : book.getPublisher() != null)
            return false;
        return getTypeOfBinding() != null ? getTypeOfBinding().equals(book.getTypeOfBinding()) : book.getTypeOfBinding() == null;
    }

    @Override
    public int hashCode(){
        int result;
        long temp;
        result = getId();
        result = 31 * result + (getBookName() != null ? getBookName().hashCode() : 0);
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + (getPublisher() != null ? getPublisher().hashCode() : 0);
        result = 31 * result + getYearOfPublication();
        result = 31 * result + getAmountOfPages();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int)(temp ^ (temp >>> 32));
        result = 31 * result + (getTypeOfBinding() != null ? getTypeOfBinding().hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", bookName='").append(bookName).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", publisher='").append(publisher).append('\'');
        sb.append(", yearOfPublication=").append(yearOfPublication);
        sb.append(", amountOfPages=").append(amountOfPages);
        sb.append(", price=").append(price);
        sb.append(", typeOfBinding='").append(typeOfBinding).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
