package monsterPackage;

/**
 *  Michael Medvedev
 *
 * Description goes here
 */
import java.util.Scanner;
import java.io.File;
//Note: this program breaks up the task into several static methods.
//You may find it easier to write one method at a time instead of trying
//to do everything at once.
public class MonsterFiles
{
	public static void main(String[] args)
	{
        //Read monsters from file (use readMonsterFile())
	
		
        //Create a new scanner to read user input
		Scanner input = new Scanner(System.in);

        //Prompt user for monster names until they type "quit"
		String input = ""; //Holds last string typed by user
		while (!input.equals("quit"))
		{
			System.out.println("Enter a monster\'s name or type \'quit\' to quit");
			//Read input from user

            //Look up monster (use findMonster()), print health and strength
		}
	}

    //Reads the monster text file and returns an array of monsters
	//File filename =
			//new file("C:\\Users\\m\\eclipse-workspace\\4.1\\monster.txt");
	private static Monster[] readMonsterFile(String filename)
	{
		File file = new File(filename);
		Monster[] monsters;
				
		try 
		{
			Scanner readFile = new Scanner(file);
			while(readFile.hasNext())
			{
				int numMonsters = readFile.nextInt();
				monsters = new Monster[numMonsters];
				Monster monster = new Monster(readFile.nextLine());
				
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not Found!");
		}
		
	}
        //Use the FileIO example and advice on Mimir to get started on this
        //You should probably write this part of the program first
}

    //Performs a linear search of the monsters array
	private static Monster findMonster(Monster[] monsters, String name)
	{
        //Use pseudocode on Mimir to get started on this
        //This method is the last part of the program you need to complete
	}
}


