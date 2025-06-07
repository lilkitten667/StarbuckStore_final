package edu.foothill.cs1a.finalexam;

// Note: Provided skeleton must be completed so that the test file successfully compiles and runs.
//
// TODO: Define a class of type Starbucks which keeps track of various attributes of a Starbucks
//      store location information and vote information.
public class StarbucksStore
{
    // TODO: Define the following attributes with "private" visibility:
    // "storeName" of type String, which is the name of the store
    // "location" of type String, which is the city location for the store
    // "state" of type String, which is the state the store is in
    // "RTWstate" of type boolean, which specifies whether the store is in a Right
    // Work State
    // "votedYes" of type int, which is the number of "yes" votes
    // "votedNo" of type int, which is the number of "no" votes
    // "result" of type boolean, which specifies whether to there were enough yes
    // votes to enable employees to unionize.
    private boolean result;
    private boolean RTWstate;
    private int votedNo;
    private int votedYes;
    private String location;
    private String city;
    private String state;
    private String storeName;
    
   
    // TODO: complete method signature to receive an argument for each attribute as
    // required by test class called TestStarBucks.
    // Should construct an object of type StarbuckStore by initializing the instance
    // variables and checks whether the result to unionize is true only if the
    // number of employees who voted Yes is more than the number of employees
    // who voted No.
    public void StarbucksStore(String storeName)
    {
        String city;
        // TODO: Initialize attributes
        storeName = this.storeName;
        location = city + state;
        state = this.state;
        votedYes = this.votedYes;
        votedNo = this.votedNo;
        if(votedYes > votedNo)
            {
                result = true;
                System.out.print(result);
            }
        
        // TODO: Use conditional statement to validate that the result is only false
        // if the number of No votes is greater than or equal to the number of Yes
        // votes, otherwise print a message similar to the sample output.
        if (votedNo > votedYes)
        {
            result = false;
            System.out.print(result);
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
        this.StarbucksStore(storeName, "", "", false,
            0, 0, true);
    }
    public void StarbucksStore(String storeName, String location, String state, boolean RTWstate,
            int votedYes, int votedNo, boolean result)
    {
        // TODO: Initialize attribute by calling the constructor above using this()
        // method call passing in
        // the values described in the TODO method description
        this.StarbucksStore(storeName, location, state, RTWstate, votedYes, votedNo, result);
    }

    // TODO: Define a getter (i.e. accessor) method for storeName attribute
    // to receive zero arguments and to return a value of type String.
    public String getStoreName()
    {
        this.storeName(storeName);
        return storeName;
    }
    // TODO: Define a getter (i.e. accessor) method for stateName attribute
    // to receive zero arguments and to return a value of type String.
    public String getStateName()
    {
        this.StarbucksStore("unknown", "unknown", state, false, 0, 0, true);
        return state;
    }

    // TODO: Define a getter (i.e. accessor) method for RTWstate attribute
    // to receive zero arguments and to return a value of type boolean.
    public boolean getRTWstate()
    {
        this.StarbucksStore("unknown", "unknown", "unknown", RTWstate, 0, 0, true);
        
        return RTWstate;
    }
    // TODO: Define a getter (i.e. accessor) method for getVoteYes attribute
    // to receive zero arguments and to return a value of type int (the number of
    // Yes votes).
    public int getVotedYes()
    {
        this.StarbucksStore("unknown", "unknown", "unknown", false, votedYes, 0, true);
        return votedYes;
    }

    // TODO: Define a getter (i.e. accessor) method for getVoteNo attribute
    // to receive zero arguments and to return a value of type int (the number of No
    // votes).
    public int getVotedNo()
    {
        this.StarbucksStore("unknown", "unknown", "", false, 0, votedNo, true);
        return votedNo;
    }

    // TODO: Define a getter (i.e. accessor) method for result attribute
    // to receive zero arguments and to return a value of type boolean.
    public boolean getVoteResult()
    {
        if (votedYes > votedNo)
        {
            this.StarbucksStore("unknown", "unknown", "unknown", false, votedYes, votedNo, result);
            result = this.result;
        }
        return result;
    }

    // TODO: Define a setter (i.e. mutator) method for storeName attribute
    // to receive an argument of type String,
    // and to return nothing.
    private String applyStoreName(String storeName)
    {
        if (storeName.length() < 1)
        {
            System.out.println("Error, your Store Name cannot be found");
        } else
            if (storeName.length() > 1)
            {
              storeName = this.storeName(storeName); 
            }
        
    }

    // TODO: Define a setter (i.e. mutator) method for location attribute
    // to receive an argument of type String,
    // and to return nothing.
    private String applyLocaion(String location)
    {
        if (location.length() > 1)
        {
            this.StarbucksStore("", location, "", false, 0, 0, true);
            location = city + state;
        } else
            if(location.length() < 1)
            {
                System.out.println("Error, your location cannot be found. "); 
            }
        
    }
    // TODO: Define a method called printStore which receives zero
    // arguments and does not return anything.
    // Prints to standard out a String representation of the instance including
    // the storeName, the location and the result of voting to unionize.
    public void printStore()
    {
        this.StarbucksStore(storeName, location, state, RTWstate, votedYes, votedNo, result);
    }
}
