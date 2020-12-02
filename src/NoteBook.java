public abstract class NoteBook
{
    int price;
    int getPrice(){return price;}
    void setPrice(int setprice){price = setprice;}
    abstract void launch();
    void Shutdown(){System.out.println("Shutdown...");}


}
