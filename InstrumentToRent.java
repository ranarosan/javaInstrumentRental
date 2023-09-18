/*Write a description of class IntrumentToRent here.
 *
 *@author (Roshan Rana)
 *21049688
 *
 */

public class InstrumentToRent extends Instrument
{
    //declearing instance variable
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    //constructor method with two parameters
    public InstrumentToRent(String instrumentName, int chargePerDay)
    {
        super(instrumentName);
        this.chargePerDay = chargePerDay;
        this.dateOfRent = "";
        this.dateOfReturn = "";
        this.noOfDays= 0;
        this.isRented = false;
    }
    //creating getter and setter method for all parameters
    public int getChargePerDay()
   {
       return this.chargePerDay;
   }
   
   public void setChargePerDay(int chargePerDay)
   {
       this.chargePerDay = chargePerDay;
   }
   
   public String getDateOfRent()
   {
       return this.dateOfRent;
   }
   
   public void setDateOfRent(String dateOfRent)
   {
       this.dateOfRent = dateOfRent;
   }
   
   public String getDateOfReturn()
   {
       return this.dateOfReturn;
   }
   
   public void setDateOfReturn(String dateOfReturn)
   {
       this.dateOfReturn = dateOfReturn;
   }
   
   public int getNoOfDays()
   {
       return this.noOfDays;
   }
   
   public void setNoOfDays(int noOfDays)
   {
       this.noOfDays = noOfDays;
   }
   
   public boolean getIsRented()
   {
       return this.isRented;
   }

   public void setIsRented(boolean isRented)
   {
       this.isRented = isRented;
   }
   
   //method to rent a instrument
   
   public void rentInstrument(String customerName, String customerMobileNumber, int panNo, String dateOfRent, String dateOfReturn, int noOfDays)
   {
      if(isRented)
      {
        System.out.println("Instrument is not available right now");  
        System.out.println("customer who has rented instrument:" + customerName);
        System.out.println("customer mobile number:" + customerMobileNumber);
        System.out.println("return date of instrument" + dateOfReturn);
     }
     else
     {
         setCustomerName(customerName);
         setCustomerMobileNumber(customerMobileNumber);
         setCustomerPAN(panNo);
         setDateOfRent(dateOfRent);
         setDateOfReturn(dateOfReturn);
         setNoOfDays(noOfDays);
         isRented = true;
        
        System.out.println("Customer Details:");
        super.display();
        System.out.println("date of return:" + dateOfReturn);
        System.out.println("date of rent:" + dateOfRent);
        System.out.println("total charge:" + noOfDays * chargePerDay);
    }
   }
   
   //create new method for return instrument
   public void returnInstrument()
   {
       if(!isRented)
       {
         System.out.println("Instrument is available");  
       }
       else
       {
         setCustomerName("");
         setCustomerMobileNumber("");
         setDateOfRent("");
         setCustomerPAN(0);
         setDateOfReturn("");
         setNoOfDays(0);
         isRented = false;
         
       }
   }
   //displaying the appropriate message
    public void display()
   {
      super.display();
      if(isRented == true)
      {
        System.out.println("return date:" + dateOfReturn);
        System.out.println("date of rent:" + dateOfRent);
    } 
   }  
}
