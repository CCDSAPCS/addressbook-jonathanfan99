import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }
	public void addContacts(Contact c){
		friends = new Contact[10];
		numfriends++;
	}
	public void printContacts(){
		for(int i = 0;i<numfriends;i++){
			friends[i].printContact();
		}
	}
	public int numContacts(){
		return numfriends;
	}
	public int haveContacts(String s){
		for (int i=0;i<numfriends;i++){
	    	if (friends[i].getName().equals(s))
			return i;
		}
		return -1;
	}
	public int deleteContacts(String s){
		int position = haveContact(s);
		if (position >= 0) {
	    	friends[position] = friends[numfriends-1];
	    	numfriends--;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		AddressBook blackbook = new AddressBook();
		menu(); //call the new method
		int choice = scan.nextInt();
		if(choice==1){
			addContacts();
			
		}
		if(choice==2)
			deleteContacts();
		if(choice==3)
			numContacts();
		if(choice==4)
			printContacts();
		if(choice==5)
			//quit;
	}
	public static void menu() {
		System.out.println("1.Add a new contact to your address book.");
		System.out.println("2.Delete a contact from your address book.");
		System.out.println("3.Print out the number of contacts you have.");
		System.out.println("4.Print out information of all your contacts.");
		System.out.println("5.Quit.");
    }
}
