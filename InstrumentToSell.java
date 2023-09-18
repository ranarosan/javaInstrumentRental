/*Write a description of class InstrumentToSell here.
 * 
 * @author (Roshan Rana)
 * 21049688
 */
public class InstrumentToSell extends Instrument
{
    //declaring instance variables
    private float price;
    private String sellDate;
    private float discountPercent;
    private boolean isSold;
    //constructor method with two parameters
    public InstrumentToSell(String InstrumentName, float price)
    {
      super(InstrumentName);
      this.price = price;
      this.sellDate = "";
      this.discountPercent = 0.0f;
      this.isSold = false;
    }
    //create getter and setter method for all parameters
    public float getPrice()
    {
        return this.price;
    }
    
    public void setPrice(float price)
    {
        if(!isSold)
        {
            this.price = price;
            
        }
        else
        {
            System.out.println("It is already sold");
        }
        
    }
    
    public String getSellDate()
    {
        return this.sellDate;
    }
    
    public void setSellDate(String sellDate)
    {
        this.sellDate = sellDate;
    }
    
    public float getDiscountPercent()
    {
        return this.discountPercent;
    }
    
    public void setDiscountPercent(float discountPercent)
    {
        this.discountPercent = discountPercent;  
    }
    
    public boolean getIsSold()
    {
        return this.isSold;
    }
    
    public void setIsSold(boolean isSold)
    {
        this.isSold = isSold;
    }
    //create new method for sellInstruments as enrolling instrument
    public void sellInstruments(String customerName, String customerMobileNumber, int panNo, String sellDate, float discountPercentage)
    {
        if(isSold) 
        {
            System.out.println("it is sold");
            System.out.println("customer name:" + getCustomerName());
            System.out.println("customer mobile number: " + getCustomerMobileNumber());
            System.out.println("customer PAN no: " + getCustomerPAN());
       
        }
        else
        {
            setCustomerName(customerName);
            setCustomerMobileNumber(customerMobileNumber);
            setCustomerPAN(panNo);
            this.sellDate = sellDate;
            this.discountPercent = discountPercentage;
            isSold = true; 
            this.price = price - ((discountPercentage/100) * price);
        }
         
    }
    //displaying the appropriate message
    public void display()
    {
        super.display();
        System.out.println("instrument price is" + price);
        if(isSold)
        {
          System.out.println("sell date:" + sellDate);
        }
    }
}