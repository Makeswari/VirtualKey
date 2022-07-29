package VirtualKeyApplication;

import java.io.File;
import java.util.*;

public class VirtualKey {
	public static File folder=new File("C:\\file");
	public static void main(String a[])
	{
	System.out.println("*********************************");
	System.out.println("     Virtual Key Repository      ");
	System.out.println("    Developed By Makeswari S     \n");
	System.out.println("*********************************");
	
	Operations();
	}
	public static void Operations()
	{
	System.out.println("Operation are: ");
	String[] op = { "1. To Retrieving the file names in an ascending order",
			"2. To perform Business-level operations", "3. Close the application" };
	for(String i:op)
	{
	System.out.println(i);
	}
	System.out.println("Enter the choice");
	Scanner ch=new Scanner(System.in);
	int choice=ch.nextInt();
	switch(choice)
	{
	case 1:System.out.println("Retrieving the file:\n");
			File f[]=folder.listFiles();
			Arrays.sort(f);
			for(int i=0;i<f.length;i++)
			{
				System.out.println(f[i]);

			}
			Operations();
			break;
	
	case 2:System.out.println("Business Level:\n");
		    char cha;
		    do
			{
			System.out.println(" 1 : To Add a file in the existing Directory");
			System.out.println(" 2 : To Delete a file from the existing Directory. ");
			System.out.println(" 3 : To Search a user specified file from the Directory");
			System.out.println(" 4 : Back to the main menu");
			
				int bs=ch.nextInt();
				switch(bs)
				{
				case 1:System.out.println("Adding file to tha application:\n");
				System.out.println("Enter the File Name to create");
				String s = ch.next();
				File file = new File(folder, s);

				try {
					boolean value = file.createNewFile();
					if (value) {
						System.out.println("The new file is created.");
					} else {
						System.out.println("The file already exists.");
					}
				} catch (Exception e) {
					e.getStackTrace();
				}
				break;
				
			    case 2:
				System.out.println("Enter the File Name to delete");
				String name = ch.next();
				File file1 = new File(folder, name);

				try {
					boolean value = file1.delete();
					if (value) {
						System.out.println("The new file is Deleted.");
					} else {
						System.out.println("File Not Found");
					}
				} catch (Exception e) {
					e.getStackTrace();
				}
				break;
				
 			    case 3:
				System.out.println("Enter a keyword to search");
				String search = ch.next();
				boolean flag1 = false;
				File arr1[] = folder.listFiles();
				System.out.println("File :\n");
				for (int i = 0; i < arr1.length; i++) {
					if (arr1[i].getName().startsWith(search)) {
						flag1 = true;
						System.out.println(arr1[i]);
					}
				}
				if (flag1 == false) {
					System.out.println("No file found");
				}

				break;
			    
			    default:
				System.out.println("You have made an invalid choice!");
				System.out.println("Please enter correct choice\n");

			}	   
				System.out.println("Enter the choice to enter again in the business application2!");
				cha=ch.next().charAt(0);
			}while(cha=='y');
			Operations();
	case 3:
		System.out.println("Closing Your Application...\n");
		System.out.println("-----Thank You------");
		break;
	default:
		System.out.println("You have made an invalid choice!");
		System.out.println("Please enter correct choice\n");
		Operations();
		break;
	}
}
}
