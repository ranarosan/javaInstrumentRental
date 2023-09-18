/*Write a description of class Instrument here.
 *
 *@author (Roshan Rana)
 *21049688
 */public class Instrument
{
  //declearing instance variable
  private static int instrumentId; //This is static vriable 
  private String instrumentName;
  private String customerName;
  private String customerMobileNumber;
  private int customerPAN;
  
  //constructor method with one parameter
  public Instrument(String instrumentName)
  {
      instrumentId++;
      this.instrumentName = instrumentName;
      this.customerName = "";
      this.customerMobileNumber = "";
      this.customerPAN = 0;      
  }
  
  //create getter and setter method for all attributes
  public int getInstrumentId()
  {
      return instrumentId;
  }
  
  public void setInstrumentId(int instrumentId)
  {
      instrumentId = instrumentId;
  }
  
  public String getInstrumentName()
  {
      return this.instrumentName;
  }
    
  public void setInstrumentName(String instrumentName)
  {
      this.instrumentName = instrumentName;
  }
  
  public String getCustomerName()
  {
      return this.customerName;
  }
  
  public void setCustomerName(String customerName)
  {
      this.customerName = customerName;
  }
  
  public String getCustomerMobileNumber()
  {
   return this.customerMobileNumber; 
  }
  
  public void setCustomerMobileNumber(String customerMobileNumber)
  {
      this.customerMobileNumber = customerMobileNumber;
  }
  
  public int getCustomerPAN()
  {
      return this.customerPAN;
  }
  
  public void setCustomerPAN(int customerPAN)
  {
    this.customerPAN = customerPAN;
  }
    
  //method to display appropriate message
  public void display()
  {
    System.out.println("The Instrument ID is " + instrumentId+ ".");
    System.out.println("The Instrument Name is " + instrumentName+ ".");
    if(!customerName.equals("") && !customerMobileNumber.equals("") && customerPAN != 0)
    {
     System.out.println("The Customer Name is " + customerName+ ".");
     System.out.println("The Customer Mobile Number is " + customerMobileNumber+ "."); 
     System.out.println("The Customer PAN is " + customerPAN+ ".");  
    }
  }
}