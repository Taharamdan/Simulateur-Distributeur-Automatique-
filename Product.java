public class Product 
{
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product()
    {
        this.id = 404;
        this.name = "unkown product name";
        this.price = 0;
        this.quantity = 0;
    }


    public Product(int id , String name , double price , int quantity)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;

    }

    public double getPrice()
    {
        return price;

    }

    public int getQuantity()
    {
        return quantity;

    }

    public void reduceQuantity(int amount)
    {
        if (this.quantity >= amount)
        {
            this.quantity -=amount;
        }
        else
        {
            System.out.println("la quantité est insuffisante pour " + this.name);
        }
    }

    //affichage des infos du produit : 

    public String toString()
    {
        return "Produit [ID= " + this.id + ", Nom = " + this.name + ", Prix =" + this.price + " MAD, Quantité disponible = " + this.quantity + "]";
    }
}