//Duc Ngo
//Homework 02
//Arithmetic Java Program
//
// compile the program by using javac Arithmetic.java
// run program by using java Arithmetic

//import scanner for rounding calculations to 2 decimal places
import java.text.DecimalFormat;

//define class for program
public class Arithmetic{
    
    //then add a main method
public static void main(String[] args) {
    
//format numbers 2 two decimal places
DecimalFormat d = new DecimalFormat("0.##");
    
//input variables
int nSocks=3; //number of sock pairs purchased
double sockCost$=2.58; //cost per pair of socks

int nGlasses=6; //number of drinking glasses
double glassCost$=2.29; //cost per glass

int nEnvelopes=1; //number of boxes of envelopes
double envelopeCost$=3.25; //cost per box of envelopes
double taxPercent=0.06; //tax rate


//outputs required
    //total cost of each kind of item + sales tax for that total cost (that*taxrate)
    //total cost of purchases before tax (sum of all the costs)
    //total actual paid, including tax (sum*taxrate + sum)

//declare shell variables for computation
double totalSockCost$; //total cost of socks
double totalGlassCost$; //total cost of glasses
double totalEnvelopCost$; //total cost of envelopes

//total tax for each type of item
double totalSockTax$;
double totalGlassTax$;
double totalEnvelopTax$;
double totalItemCost$;
double totalTaxCost$;
double totalBillCost$;

//print out variables
System.out.println(nSocks + " pair of socks were bought at $" + sockCost$ + " each");
System.out.println(nGlasses + " drinking glasses were bought at $" + glassCost$ + " each");
System.out.println(nEnvelopes + " boxes of envelopes were bought at $" + envelopeCost$ + " each");

//calculate the cost of each item and the sales tax for that item
totalSockCost$=(nSocks*sockCost$);
totalGlassCost$=(nGlasses*glassCost$);
totalEnvelopCost$=(nEnvelopes*envelopeCost$);
totalSockTax$=(totalSockCost$*taxPercent);
totalEnvelopTax$=(totalEnvelopCost$*taxPercent);
totalGlassTax$=(totalGlassCost$*taxPercent);


//print out calculations
System.out.println("the total cost for socks comes out to be $" + d.format(totalSockCost$));
System.out.println("the tax on socks comes out to be $" + d.format(totalSockTax$));

System.out.println("the total cost for glasses will come out to be $" + d.format(totalGlassCost$));
System.out.println("the tax on glasses comes out to be $" + d.format(totalGlassTax$));

System.out.println("the total cost for envelopes will come out to be $" + d.format(totalEnvelopCost$));
System.out.println("the tax on envelopes comes out to be $" + d.format(totalEnvelopTax$));

//calculate total cost of all items as well as total tax for all items
totalItemCost$=(totalSockCost$+totalEnvelopCost$+totalGlassCost$);
totalTaxCost$=(totalSockTax$+totalEnvelopTax$+totalGlassTax$);

//print out calculations
System.out.println("the total cost for all items will be $" + d.format(totalItemCost$));
System.out.println("the total tax for all items will be $" + d.format(totalTaxCost$));

//calculate the total cost for the entire transaction
totalBillCost$=totalItemCost$+totalTaxCost$;

//print out calculations
System.out.println("the total cost of the transaction will be $" + d.format(totalBillCost$));



    } //end of main method
} //end of class