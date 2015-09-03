//Duc Ngo
//CSE02, 09-03-2015
//This program is written to, with input from the cyclometer, print out:
    //number of minutes for each trip
    //number of counts for each trip
    //distance of each trip in miles
    //distance of two trips combined

//define public class
public class Cyclometer {
    
    //set main method required for every java program
    public static void main (String[] args) {

//document cyclometer inputs
int secsTrip1=480; //the cyclometer recorded a total of 480 seconds elapsed during the first trip
int secsTrip2=3220; //the cyclometer recorded a total of 3220 seconds elapsed during the second trip
int countsTrip1=1561; //the cyclometer recorded a total of 1561 rotation counts during the first trip
int countsTrip2=9037; //the cyclometer recorded a total of 9037 rotation counts during the second trip


//create constant variables and store distances
double wheelDiameter=27.0, //defining the diameter of the wheel as 27 inches
PI=3.14159, //defining the value of Pi as 3.14159
feetPerMile=5280, //define that 5280 feet equal to 1 mile
inchesPerFoot=12, //define that 12 inches equal to 1 foot
secondsPerMinute=60; //define that 60 seconds equal to 1 minute
double distanceTrip1, distanceTrip2,totalDistance; //create variables for each trip's distances, as well as the total distance

//print out cyclometer output in minutes and counts using stored variables and constants
System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");

distanceTrip1=countsTrip1*wheelDiameter*PI;
//the above calculation gives trip distance in inches
//for each count, a rotation of the wheel travels diameter*PI inches
distanceTrip1/=inchesPerFoot*feetPerMile; //gives the distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2; //sets total distance for the whole round trip

//print out output data
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+ totalDistance+" miles");

    } //end of main method
} //end of class