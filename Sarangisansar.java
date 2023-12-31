/**
 * Write a description of class Sarangisansar here.
 *
 * @author (Roshan Rana)
 * (21049688 )
 */

import javax.swing.*;
import java.awt.event.ActionListener.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class Sarangisansar implements ActionListener //Where to listen?
{
    //class instance variables
    private JFrame myFrame;    
    private JButton add,rent,returnBtn,display,clearAll,sellAdd,sellBtn;
    private JLabel sarangiSansar,instrumentToRent,instrumentName,chargePerDay,rentedInstrumentName,customerName,customerPhone,customerPan,returnedInstrumentName,rentDate,returnDate,noOfRentingDays,sellInstrumentName,sellInstrumentPrice,sellCustomerName,sellCustomerPhone,sellCustomerPan,sellDiscountPercentage,soldInstrumentName,sellDate,instrumentToSell;
    private JTextField instrumentNameTxt,chargePerDayTxt,rentedInstrumentNameTxt,customerNameTxt,customerPhoneTxt,customerPanTxt,returnedInstrumentNameTxt,rentDateTxt,returnDateTxt,noOfRentingDaysTxt,sellInstrumentNameTxt,sellInstrumentPriceTxt,sellCustomerNameTxt,sellCustomerPhoneTxt,sellCustomerPanTxt,sellDiscountPercentageTxt,soldInstrumentNameTxt,sellDateTxt;
    private JComboBox rentDays,rentMonth,rentYear,returnDays,returnMonth,returnYear,sellDays,sellMonth,sellYear;
    private JSeparator Separator1;
    
    //Arraylist of parent class
    private ArrayList<Instrument> list = new ArrayList<>();
    //create the constructor
    public Sarangisansar(){
        //create JFrame
        myFrame = new JFrame("Sarangi sansar");
        Separator1=new JSeparator();
        Separator1.setBounds(10,110,1150,3);
        //--------------------------Instrument To Rent---------------------------------//
        //create component
        //JLabel
        sarangiSansar = new JLabel("Sarangi sansar");
        instrumentToRent = new JLabel("Instrument To Rent");
        instrumentName = new JLabel("Instrument Name: ");
    
        chargePerDay = new JLabel("Charge Per Day: ");
        
        rentedInstrumentName = new JLabel("Instrument Name");
        customerName = new JLabel("Customer Name: ");
        customerPhone = new JLabel("Customer Phone: ");
        customerPan = new JLabel("Customer PAN: ");
        rentDate = new JLabel("Rent Date: ");
        String Days[] = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        String Month[] = {"Month","Jan","Feb","Mar","Apr","May","Jun","July","Aug","Set","Oct","Nov","Dec"};
        String Year[] = {"Year","2018","2019","2020","2021","2022"};
        rentDays = new JComboBox<String>(Days);
        rentMonth = new JComboBox<String>(Month);
        rentYear = new JComboBox<String>(Year);
        returnedInstrumentName = new JLabel("Instrument Name");
        returnDate = new JLabel("Return Date: ");
        returnDays = new JComboBox<String>(Days);
        returnMonth = new JComboBox<String>(Month);
        returnYear = new JComboBox<String>(Year);
        noOfRentingDays = new JLabel("No.Of Renting Days: ");
        
        //JTextField
        instrumentNameTxt = new JTextField();
        chargePerDayTxt = new JTextField();
        
        rentedInstrumentNameTxt = new JTextField();
        customerNameTxt = new JTextField();
        customerPhoneTxt = new JTextField();
        customerPanTxt = new JTextField();
        rentDateTxt = new JTextField();
        returnedInstrumentNameTxt = new JTextField();
        returnDateTxt = new JTextField();
        noOfRentingDaysTxt = new JTextField();
        
        //JButton
        add = new JButton("Add");
        rent = new JButton("Rent");
        returnBtn = new JButton("Return");
        display = new JButton("Display");
        clearAll = new JButton("Clear All");
        
        //set the bounds of components
        //JLabel
        sarangiSansar.setBounds(427, 21, 226, 42);
        instrumentToRent.setBounds(114, 69, 219, 34);
        instrumentName.setBounds(50, 128, 153, 25);
        
        rentedInstrumentName.setBounds(50, 282, 153, 25);
        chargePerDay.setBounds(50, 188, 140, 25);
        customerName.setBounds(50, 336, 145, 25);
        customerPhone.setBounds(50, 399, 151, 25);
        customerPan.setBounds(50, 464, 132, 25);
        rentDate.setBounds(50, 562, 90, 25);
        returnedInstrumentName.setBounds(50, 715, 153, 25);
        returnDate.setBounds(50, 614, 108, 25);
        noOfRentingDays.setBounds(50, 515, 180, 25);
        
        //JTextField
        instrumentNameTxt.setBounds(220, 125, 215, 30);
        chargePerDayTxt.setBounds(220, 185, 215, 30);
        
        rentedInstrumentNameTxt.setBounds(218, 279, 215, 30);
        returnedInstrumentNameTxt.setBounds(218, 712, 215, 30);
        customerNameTxt.setBounds(218, 333, 215, 30);
        customerPhoneTxt.setBounds(218, 396, 215, 30);
        customerPanTxt.setBounds(218, 461, 215, 30);
        noOfRentingDaysTxt.setBounds(218, 512, 215, 30);
        
        //JCombobox
        rentDays.setBounds(218, 555, 97, 32);
        rentMonth.setBounds(336, 555, 97, 32);
        rentYear.setBounds(454, 555, 97, 32);
        
        returnDays.setBounds(218, 607, 97, 32);
        returnMonth.setBounds(338, 607, 97, 32);
        returnYear.setBounds(454, 607, 97, 32);
        
        //JButton
        add.setBounds(267, 230, 120, 32);
        rent.setBounds(255, 660, 120, 32);
        returnBtn.setBounds(454, 710, 120, 32);
        display.setBounds(631, 710, 120, 32);
        clearAll.setBounds(797, 712, 120, 32);
        
        //Whom to listen
        add.addActionListener(this);
        rent.addActionListener(this);
        returnBtn.addActionListener(this);
        display.addActionListener(this);
        clearAll.addActionListener(this);
        
        //add component to JFrame
        myFrame.add(sarangiSansar);
        myFrame.add(instrumentToRent);
        myFrame.add(instrumentName);
        myFrame.add(chargePerDay);
        
        myFrame.add(rentedInstrumentName);
        myFrame.add(customerName);
        myFrame.add(customerPhone);
        myFrame.add(customerPan);
        myFrame.add(rentDate);
        myFrame.add(returnDate);
        myFrame.add(noOfRentingDays);
        myFrame.add(instrumentNameTxt);
        myFrame.add(chargePerDayTxt);
        myFrame.add(rentedInstrumentNameTxt);
        myFrame.add(customerNameTxt);
        myFrame.add(customerPhoneTxt);
        myFrame.add(customerPanTxt);
        myFrame.add(noOfRentingDaysTxt);
        myFrame.add(returnedInstrumentNameTxt);
        myFrame.add(rentDays);
        myFrame.add(rentMonth);
        myFrame.add(rentYear);
        
        myFrame.add(returnedInstrumentName);
        myFrame.add(returnDays);
        myFrame.add(returnMonth);
        myFrame.add(returnYear);
        myFrame.add(add);
        myFrame.add(rent);
        myFrame.add(returnBtn);
        myFrame.add(display);
        myFrame.add(clearAll);
        myFrame.add(Separator1);
        
        //--------------------------Instrument To Sell---------------------------------//
        //create component
        //JLabel
        instrumentToSell = new JLabel("Instrument To Sell");
        sellInstrumentName = new JLabel("Instrument Name: ");
        sellInstrumentPrice = new JLabel("Instrument Price: ");
        sellCustomerName = new JLabel("Customer Name: ");
        sellCustomerPhone = new JLabel("Customer Phone: ");
        sellCustomerPan = new JLabel("Customer PAN: ");
        sellDiscountPercentage = new JLabel("Discount Percentage: ");
        soldInstrumentName = new JLabel("Instrument Name: ");
        sellDate = new JLabel("Sell Date: ");
        
        //JComboBox
        sellDays = new JComboBox<String>(Days);
        sellMonth = new JComboBox<String>(Month);
        sellYear = new JComboBox<String>(Year);
        
        //JButton
        sellAdd = new JButton("Add");
        sellBtn = new JButton("Sell");
        
        //JTextField
        sellInstrumentNameTxt = new JTextField();
        sellInstrumentPriceTxt = new JTextField();
        sellCustomerNameTxt = new JTextField();
        sellCustomerPhoneTxt = new JTextField();
        sellCustomerPanTxt = new JTextField();
        sellDiscountPercentageTxt = new JTextField();
        soldInstrumentNameTxt = new JTextField();
        
        //set the bounds of components
        instrumentToSell.setBounds(711, 69, 208, 34);
        sellInstrumentName.setBounds(619, 128, 153, 25);
        sellInstrumentNameTxt.setBounds(789, 125, 215, 30);
        sellInstrumentPrice.setBounds(619, 188, 148, 25);
        sellInstrumentPriceTxt.setBounds(789, 185, 215, 30);
        sellCustomerName.setBounds(619, 343, 145, 25);
        sellCustomerNameTxt.setBounds(789, 340, 215, 30);
        sellCustomerPhone.setBounds(619, 406, 151, 25);
        sellCustomerPhoneTxt.setBounds(789, 403, 215, 30);
        sellCustomerPan.setBounds(619, 471, 132, 25);
        sellCustomerPanTxt.setBounds(789, 468, 215, 30);
        sellDiscountPercentage.setBounds(619, 538, 185, 25);
        sellDiscountPercentageTxt.setBounds(810, 535, 215, 30);
        soldInstrumentName.setBounds(619, 282, 153, 25);
        soldInstrumentNameTxt.setBounds(789, 279, 215, 30);
        sellDate.setBounds(619, 603, 82, 25);
        sellDays.setBounds(789, 597, 97, 32);
        sellMonth.setBounds(907, 597, 97, 32);
        sellYear.setBounds(1025, 597, 97, 32);
        //JBttton
        sellAdd.setBounds(836, 230, 120, 32);
        sellBtn.setBounds(840, 654, 120, 32);
        
        //action event listener
        sellAdd.addActionListener(this);
        sellBtn.addActionListener(this);
        
        //add component to JFrame
        myFrame.add(instrumentToSell);
        myFrame.add(sellInstrumentName);
        myFrame.add(sellInstrumentPrice);
        myFrame.add(sellCustomerName);
        myFrame.add(sellCustomerPhone);
        myFrame.add(sellCustomerPan);
        myFrame.add(sellDiscountPercentage);
        myFrame.add(soldInstrumentName);
        myFrame.add(soldInstrumentNameTxt);
        myFrame.add(sellDate);
        myFrame.add(sellInstrumentNameTxt);
        myFrame.add(sellInstrumentPriceTxt);
        myFrame.add(sellCustomerNameTxt);
        myFrame.add(sellCustomerPhoneTxt);
        myFrame.add(sellCustomerPanTxt);
        myFrame.add(sellDiscountPercentageTxt);
        myFrame.add(sellDays);
        myFrame.add(sellMonth);
        myFrame.add(sellYear);
        myFrame.add(sellAdd);
        myFrame.add(sellBtn);

        //display the frame
        myFrame.setSize(300, 400);
        myFrame.setLayout(null);
        myFrame.setVisible(true);
    }
    
    //create main method
    public static void main(String[] args){
        Sarangisansar obj2 = new Sarangisansar();
    }
    
    //functionality
    //What to do?
    //Implement the methods of the ActionListner Interface
    public void actionPerformed(ActionEvent e){
       
        if(e.getSource() == add){
            //calling add instrument for renting method
            instrumentForRent();
        }
        else if(e.getSource() == sellAdd){
            //calling add instrumnet for selling method
           instrumentForSell();
        }else if(e.getSource() == rent){ 
            //calling rent method
            instrumentToRents();
        }
        else if(e.getSource() == sellBtn){
            //calling sell method
            forSell();
        }else if(e.getSource() == returnBtn){
            //calling return method
            forReturn();
        }else if(e.getSource() == display){
            //calling display method
            forDisplay();
        }
        else if(e.getSource() == clearAll){
            //calling clear method
            forClear();
        }
    }
    
    //method to add instrument for renting
    public void instrumentForRent(){
        try{
            String instrumentName1 = instrumentNameTxt.getText();
            String charge = chargePerDayTxt.getText();
            int chargePerDay1 = Integer.parseInt(charge);  //check if charge per day is empty string to avoid number format exception
            InstrumentToRent ins = new InstrumentToRent(instrumentName1,chargePerDay1);    
            if(instrumentName1.equals("") || charge.equals("")){
                 JOptionPane.showMessageDialog(myFrame, "The fields should not be empty");      
             }else if (list.isEmpty()){ 
               
                list.add(ins);
                System.out.println(list);
                JOptionPane.showMessageDialog(myFrame,"Successful");
                instrumentNameTxt.setText("");
                chargePerDayTxt.setText("");
                
             }else{
                 //for-each loop to check whether instrument exist in array
                 for(Instrument in: list){
                     //if condition to check if text field value is equal to value in array
                      if(instrumentName1.equals(in.getInstrumentName())){
                         JOptionPane.showMessageDialog(myFrame,"Could not add, it already exist");
                     }
                     else{
                         //if instrument doesnot match add to array l
                        list.add(ins); 
                        list.size();  
                        JOptionPane.showMessageDialog(myFrame,"Successfully added");
                     }
                 }
             }
        }catch(Exception e){
            JOptionPane.showMessageDialog(myFrame,"CHECK!! the field value again");
            
        }
        
 
    }
    
    //method to add instrument name for sell
    public void instrumentForSell(){
        try{
            String instrumentName2 = sellInstrumentNameTxt.getText();
            String price = sellInstrumentPriceTxt.getText();
            float sellInstrumentPrice1 = Float.parseFloat(price);
            InstrumentToSell sell = new InstrumentToSell(instrumentName2,sellInstrumentPrice1);
             if(instrumentName2.equals("") || price.equals("")){
                 JOptionPane.showMessageDialog(myFrame,"The field should not be empty");
             }
             else if(list.isEmpty()){
                 list.add(sell);
                 JOptionPane.showMessageDialog(myFrame,"Successful");
                 sellInstrumentNameTxt.setText("");
                 sellInstrumentPriceTxt.setText("");
             }
            else{
                
                for(Instrument in: list){
                    if(instrumentName2.equals(in.getInstrumentName())){
                         JOptionPane.showMessageDialog(myFrame,"Could not add, it already exist");
                     }
                     else{
                         //if instrument doesnot match add to array l
                        list.add(sell); 
                        list.size();  
                        JOptionPane.showMessageDialog(myFrame,"Successfully added");
                     }
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(myFrame,"Check!! the field value again");
        }
    }
    
    //method to rent the instrument
    public void instrumentToRents(){
            String rentedInstrumentName1 = rentedInstrumentNameTxt.getText();
            String customerName1 = customerNameTxt.getText();
            String customerPhone1 = customerPhoneTxt.getText();
            String customerPanNo1 = customerPanTxt.getText();
            String returnDate1 = returnDays.getSelectedItem().toString() + "-" + returnMonth.getSelectedItem().toString() + "-"+ returnYear.getSelectedItem().toString();
            String rentDate1 = rentDays.getSelectedItem().toString() + "-" + rentMonth.getSelectedItem().toString() + "-"+ rentYear.getSelectedItem().toString();
            String noOfRentingDays1 = noOfRentingDaysTxt.getText();
            
            try{
               if(rentedInstrumentName1.equals("") || customerPhone1.equals("") || customerPanNo1.equals("") || noOfRentingDays1.equals("") || rentDate1.equals("")){  
                JOptionPane.showMessageDialog(myFrame,"Empty Fields");
            }else{
                for(Instrument in: list){
                    if(rentedInstrumentName1.equals(in.getInstrumentName())){
                        InstrumentToRent availableInstrument = (InstrumentToRent)in;
                        JOptionPane.showMessageDialog(myFrame,"Instrument Name: "+in.getInstrumentName() + "" + "Chargeperday: "+ availableInstrument.getChargePerDay());
                        
                        if(!availableInstrument.getIsRented()){
                          availableInstrument.rentInstrument(customerName1, customerPhone1, Integer.parseInt(customerPanNo1), rentDate1, returnDate1, Integer.parseInt(noOfRentingDays1));
                          JOptionPane.showMessageDialog(myFrame,"Successfully Rented");
                           rentedInstrumentNameTxt.setText("");
                           customerNameTxt.setText("");
                           customerPhoneTxt.setText("");
                           customerPanTxt.setText("");
                           rentDateTxt.setText("");
                           returnDateTxt.setText("");
                           noOfRentingDaysTxt.setText("");
                        
                        }else{
                            JOptionPane.showMessageDialog(myFrame,"It is not available right now!!!! ");
                            availableInstrument.rentInstrument(customerName1, customerPhone1, Integer.parseInt(customerPanNo1), rentDate1, returnDate1,Integer.parseInt(noOfRentingDays1));
                        }
                      
                    }else{
                       JOptionPane.showMessageDialog(myFrame,"Instrument not available at the moment"); 
                    }
                    break;
                  
                } 
            } 
            }catch(Exception e){
                JOptionPane.showMessageDialog(myFrame,"Warning !!!! Something is wrong");
            }
    }
    
    //method to sell the instrument
    public void forSell(){
        String soldInstrumentName1 = soldInstrumentNameTxt.getText();
        String sellCustomerName1 = sellCustomerNameTxt.getText();
        String sellCustomerPhone1 = sellCustomerPhoneTxt.getText();
        String sellCustomerPan1 = sellCustomerPanTxt.getText();
        String sellDate1 = sellDays.getSelectedItem().toString() + "-" + sellMonth.getSelectedItem().toString() + "-"+ sellYear.getSelectedItem().toString();
        String sellDiscountPercentage1 = sellDiscountPercentageTxt.getText(); 
        try{
            if(soldInstrumentName1.equals("") || sellCustomerName1.equals("") || sellCustomerPhone1.equals("") || sellCustomerPan1.equals("") || sellDate1.equals("") || sellDiscountPercentage1.equals("")){
                JOptionPane.showMessageDialog(myFrame,"Empty Fields");
            }else{
                for(Instrument in:list){
                    if(soldInstrumentName1.equals(in.getInstrumentName())){
                        InstrumentToSell availableInstrument = (InstrumentToSell)in;
                        JOptionPane.showMessageDialog(myFrame,"Instrument Name: "+in.getInstrumentName() + "" + "price: "+ availableInstrument.getPrice());
                        
                        if(!availableInstrument.getIsSold()){
                            availableInstrument.sellInstruments(sellCustomerName1,sellCustomerPhone1,Integer.parseInt(sellCustomerPan1),sellDate1,Float.parseFloat(sellDiscountPercentage1));
                            JOptionPane.showMessageDialog(myFrame,"Successfully sold");
                            soldInstrumentNameTxt.setText("");
                            sellCustomerNameTxt.setText("");
                            sellCustomerPhoneTxt.setText("");
                            sellCustomerPanTxt.setText("");
                        }else{
                            availableInstrument.sellInstruments(sellCustomerName1,sellCustomerPhone1,Integer.parseInt(sellCustomerPan1),sellDate1,Float.parseFloat(sellDiscountPercentage1));
                            JOptionPane.showMessageDialog(myFrame,"It is not available right now!!!! ");
                        }
                    }else{
                        JOptionPane.showMessageDialog(myFrame,"Instrument not available at the moment");
                    }
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(myFrame,"Warning !!!! Something is wrong");
        }
        
    }
    
    //method to return rented instrument
    public void forReturn(){
        String retuInstrumentName = returnedInstrumentNameTxt.getText();
        if(retuInstrumentName.equals("")){
            JOptionPane.showMessageDialog(myFrame,"Empty field");
        }else{
            try{
                 for(Instrument in:list){
                    if(retuInstrumentName.equals(in.getInstrumentName())){
                        InstrumentToRent availableInstrument = (InstrumentToRent)in;
                        JOptionPane.showMessageDialog(myFrame,"Instrument Name: "+in.getInstrumentName() + "" + "price: "+ availableInstrument.getChargePerDay());
                        
                        if(availableInstrument.getIsRented()){
                            availableInstrument.returnInstrument();
                            JOptionPane.showMessageDialog(myFrame,"Item returned successfully");
                            soldInstrumentNameTxt.setText("");
                            sellCustomerNameTxt.setText("");
                            sellCustomerPhoneTxt.setText("");
                            sellCustomerPanTxt.setText("");
                        }else{
                            availableInstrument.returnInstrument();
                            JOptionPane.showMessageDialog(myFrame,"Rent the instrument");
                        }
                    }else{
                        JOptionPane.showMessageDialog(myFrame,"Instrument not available at the moment");
                    }
                } 
            }catch(Exception e){
               JOptionPane.showMessageDialog(myFrame,"warning"); 
            }
      
            }
    }
    
    //methods to display
    public void forDisplay(){
        try{
            for(Instrument in: list){
                if(in instanceof InstrumentToRent){
                    InstrumentToRent instrumentRent = (InstrumentToRent)in;
                    instrumentRent.display();
                }
                if(in instanceof InstrumentToSell){
                    InstrumentToSell instrumentSell = (InstrumentToSell)in;
                    instrumentSell.display();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(myFrame,"warning"); 
        }
    }
    
    //method for clear all the textFields
    public void forClear(){
        try{
            instrumentNameTxt.setText("");
            chargePerDayTxt.setText("");
            rentedInstrumentNameTxt.setText("");
            customerNameTxt.setText("");
            customerPhoneTxt.setText("");
            customerPanTxt.setText("");
            returnedInstrumentNameTxt.setText("");
            rentDateTxt.setText("");
            returnDateTxt.setText("");
            noOfRentingDaysTxt.setText("");
            sellInstrumentNameTxt.setText("");
            sellInstrumentPriceTxt.setText("");
            sellCustomerNameTxt.setText("");
            sellCustomerPhoneTxt.setText("");
            sellCustomerPanTxt.setText("");
            sellDiscountPercentageTxt.setText("");
            soldInstrumentNameTxt.setText("");
            sellDateTxt.setText("");
        }catch(Exception e){
             JOptionPane.showMessageDialog(myFrame,"All text fields are clear.");
        }
        
    }
}
