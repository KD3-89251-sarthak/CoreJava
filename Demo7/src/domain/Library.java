/*Book details: isbn(string), price(double), authorName(string), quantity(int)
 Write a menu driven program to
 1. Add new book in list
 2. Display all books in forward order
 3. Display all books in reverse order
 4. Delete a book at given index. */ 
package domain;


public class Library {
    private String isbn;
    private double price ;
    private String authorName;
    private int quantity;
    private int index;
    Library()
    {
        this(0,"FireWings",100.30,"Kedar",1);
        //index++;
    }
    Library(int index,String isbn,double price,String authorName,int quantity)
    {
        this.authorName=authorName;
        this.isbn=isbn;
        this.price=price;
        this.quantity=quantity;
        this.index=index;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setIndex(int index) {
        this.index = index;
    }
     public boolean equals(Object o)
    {
        if(o==null)
        return false;
        if(this==o)
        return true;
        if(!(o instanceof Library))
        return false;
        Library other = (Library)o;
        if(this.index==other.index)
        return true;
        else
        return false;
    }
     @Override
     public String toString() {
        return "Library [Index=" + index + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
                + ", isbn=" + isbn + "]";
     }
    


}
