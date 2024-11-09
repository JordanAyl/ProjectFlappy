/**
 * Lead Author(s):
 *
 * @author Jordan Ayling 5550188604
 *
 *         <<Add additional lead authors here>>
 *
 *         Other Contributors:
 *         Full name; student ID or contact information if not in class
 *         <<Add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 *
 * 	References:
 * 	Gaddis, T. (2021). Starting Out With Java Myprogramming Lab
 * 	From Control Structures Through Objects. (8th ed.). Addison-Wesley.
 *
 *
 *         <<Add more references here>>
 *
 *         Version: number or date
 *         2024-08-22
 *
 */
/**
 *
 */
public class FlapyRemake
{
	public static void ifStatements(int potatoeCount)
    {
        //If potatoeCount = 1 then it will print the String.
        if(potatoeCount==1)
        {
          System.out.println("Have the right amount of potatoes");
        }
    }

    public static void elseStatements(int potatoeCount)
    {
        //If potatoeCount = 1 then it will print the String.
        if(potatoeCount==1)
        {
          System.out.println("You have the right amount of potatoes");
        }
        //If potatoeCount is anything other than 1 then it will print the String.
        else
        {
            System.out.println("you have to many potatoes");
        }
    }

    public static void elseIfStatements(int potatoeCount)
    {
        //If potatoeCount = 1 then it will print the String.
        if(potatoeCount==1)
        {
          System.out.println(" have the right amount of potatoes");
        }
        //If potatoeCount is a negative number it will print the string.
        else if(potatoeCount<0)
        {
            System.out.println("You cant have negative potatoes!");
        }
        //If potatoeCount is anything other than 1 and not a negative number then it will print the String.
        else
        {
            System.out.println("you have to many potatoes");
        }
    }
}