package edu.foothill.cs1a.finalexam;

// Note: Provided skeleton must be completed so that the test file successfully compiles and runs.
//
// TODO: Define a class of type Starbucks which keeps track of various attributes of a Starbucks
//      store location information and vote information.
public class StarbucksStore
{
    // 
    // @param: "storeName" of type String, which is the name of the store
    // @param: "location" of type String, which is the city location for the store
    // @param: "state" of type String, which is the state the store is in
    // @param: "RTWstate" of type boolean, which specifies whether the store is in a Right
    // @param: Work State
    // @param: "votedYes" of type int, which is the number of "yes" votes
    // @param: "votedNo" of type int, which is the number of "no" votes
    // @param: "result" of type boolean, which specifies whether to there were enough yes
    // @param: votes to enable employees to unionize.
    // I took a small data visualization class through google that said it is proper to put "@param" when finishing to do lists it makes
    // for easer to read code. As requested, each variable has been set to private with the proper setting of string boolean or int. 
    private String storeName;
    private String location;
    private String state;
    private boolean RTWstate;
    private int votedYes;
    private int votedNo;
    private boolean results;
    
    

    // TODO: complete method signature to receive an argument for each attribute as
    // required by test class called TestStarBucks.
    // Should construct an object of type StarbuckStore by initializing the instance
    // variables and checks whether the result to unionize is true only if the
    // number of employees who voted Yes is more than the number of employees
    // who voted No.
    /* @param: initialized the above variables to the proper setting
     * This will set  */
    public StarbucksStore(String storeName, String location, String state, boolean RTWstate,
            int votedYes, int votedNo, boolean results)
    {
        /* @param: Initialized variables set to proper positioning */

        this.storeName = storeName;
        this.location =  location;
        this.state = state;
        this.RTWstate = RTWstate;
        this.votedYes = votedYes;
        this.votedNo = votedNo;
        results = (this.votedYes < this.votedNo);
        
        this.results = (this.votedYes > this.votedNo);
        
        
        /* The bottom variable has been initiated with the @param: results will only be valid  if Voted yes is
         * greater than votedNo */ 
        if (this.votedYes > this.votedNo)
        {
            System.out.println(storeName + " Unionize Passed and is a RTWstate! ");
        } else 
            if (this.votedNo >= this.votedYes)
            {
                System.out.println (storeName + " Did not pass Unization.");
            }
    }

    // TODO: complete constructor such that it receives one argument of type String
    // for the storeName.
    // Initializes attributes by calling the constructor above using this() method
    // call passing in
    // the store name for the attribute storeName
    // the hard-coded String "unknown" for the location and state attributes
    // false for the RTWstate and result attributes
    // the hard-coded value 0 (i.e. zero) for the votedYes and votedNo attributes
    
    public String storeName(String storeName)
    {
        /* @param: Initiated variables to required settings for default, leaving store name the only attribute available  */
        storeName = this.storeName;
        location = "unknown";
        state = "unknown";
        RTWstate = false;
        this.votedYes = 1;
        this.votedNo = 0;
        results = false;
        
        return storeName;
    }

    public  StarbucksStore(String storeName)
    {
        /* constructor method for grabbing store by Store Name. */
        // TODO: Initialize attribute by calling the constructor above using this()
        // method call passing in
        // the values described in the TODO method description
        this(storeName, "Unknown", "Unknown", false, 0, 0, true);
    }

    // TODO: Define a getter (i.e. accessor) method for storeName attribute
    // to receive zero arguments and to return a value of type String.
    public String getStoreName()
    {
        /* This gets only the store name using object orientated programming referencing another method in this class. */
       return this.storeName(storeName);

    }

    // TODO: Define a getter (i.e. accessor) method for stateName attribute
    // to receive zero arguments and to return a value of type String.
    public String getStateName()
    {
        /* This method is to get the State Name in abbreviations */
        
        return this.state;

    }

    // TODO: Define a getter (i.e. accessor) method for RTWstate attribute
    // to receive zero arguments and to return a value of type boolean.
    public boolean getRTWstate()
    {
        /* This method retrieves the Right to work states. @param: No arguments, and returns boolean */
        
        return this.RTWstate;
    }

    // TODO: Define a getter (i.e. accessor) method for getVoteYes attribute
    // to receive zero arguments and to return a value of type int (the number of
    // Yes votes).
    public int getVotedYes()
    {
        /* This method retrieves the Yes Votes, @param: 0 arguments and returns an int */
        return this.votedYes;
    }

    // TODO: Define a getter (i.e. accessor) method for getVoteNo attribute
    // to receive zero arguments and to return a value of type int (the number of No
    // votes).
    public int getVotedNo()
    {
        /*This gets all the votedNo results. @param: 0 arguments returns int */
        return this.votedNo;
    }

    // TODO: Define a getter (i.e. accessor) method for result attribute
    // to receive zero arguments and to return a value of type boolean.
    public boolean getVoteResult()
    {
        /*This method gets the vote results, @param: 0 arguments and returns boolean*/
        return this.results;
    }

    // TODO: Define a setter (i.e. mutator) method for storeName attribute
    // to receive an argument of type String,
    // and to return nothing.
    public void setStoreName(String storeName)
    {
        /* This method sets the store name if the conditions of not being null and has not been trimmed or is empty
         * upon finding that one is it sends out an error message. @param: attribute Store Name and returns nothing */
        if (storeName != null && !storeName.trim().isEmpty())
        {
            this.storeName = storeName;
        } else
        {
            System.out.println("Error, Store Name is empty or doesn't exist");
        }
    }

    // TODO: Define a setter (i.e. mutator) method for location attribute
    // to receive an argument of type String,
    // and to return nothing.
    public void setStoreLocation(String location)
    {
        /* Sets the location if the same conditions above in much the same way. Sets location to its actual attribute if
         * conditions have been met. if not an error message has been pushed @param: location for argument set to string and
         * returns nothing. */
        if (location != null && !location.trim().isEmpty())
        {
            this.location = location;
        } else
        {
            System.out.println("Error, location is empty or doesn't exist");
        }

    }

    // TODO: Define a method called printStore which receives zero
    // arguments and does not return anything.
    // Prints to standard out a String representation of the instance including
    // the storeName, the location and the result of voting to unionize.
    public void printStore()
    {
        /*This method pulls Store Name Location and State name in the location and whether Unionize, using System out. I also used the
         * object oriented programming using "this".*/
        System.out.println("Store Name: " + this.storeName);
        System.out.println("location: " + this.location + " " + this.state);
        System.out.println("Result of the the Unionized Voting is: " + 
                (this.results ? "yes, unionized" : "No, not unionized"));
    }
}
