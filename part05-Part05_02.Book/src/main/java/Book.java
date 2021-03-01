/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajarir
 */
public class Book {
    /* at the very beginning we need to create instance variables **/

    //private String title;
    
    private String author;
    
    private String name;
    
    private int pages;
    
   
    

    /* once we have it we have to create a constructor that allows a user to input instance variables **/
    
    public Book(String author,String name,int pages)
    {   //this.title=title;
        this.author=author;
        this.name=name;
        this.pages=pages;
        //this.cost=cost;
    }
    
    /* then we have to create an accessor method for each of the instance variables created above to retun whatever 
     * has been inputted by the user
     */
      
  
    
     public String getAuthor()
    {
        return author;
    }
    public String getName()
    {
        return name;
    }
    public int getPages()
    {
        return pages;
    } 

    

    /* now we create a mutator method for each of the instance variables created above that allows a user to change
     * the state of the object.
     */

    
     public void setAuthor(String author)
    {
       this.author=author;
    }
    public void setName(String Name)
    {
        this.name=name;
    }
    public void setPages(int pages)
    {
        this.pages=pages;
    } 

     
    
    
    /* the last part here is to create a toString method that returns all of the details of the book that has been inputted. **/
    
    @Override
    public String toString()
    {
        return  author + ", " + name + ", " + pages + " pages" ;
    }
    
    
    
}
    

