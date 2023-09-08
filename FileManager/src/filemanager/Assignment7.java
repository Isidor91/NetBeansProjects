package filemanager;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;
public class Assignment7 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Welcome in File Manager. Choose the following :");
            System.out.println("To list files , insert: 1 path");
            System.out.println("For info , insert: 2 path");
            System.out.println("To create new directory , insert: 3 path");
            System.out.println("To rename , insert: 4 path newname");
            System.out.println("To copy file , insert: 5 path1 path2");
            System.out.println("TO move file , insert: 6 path1 path2");
            System.out.println("To delete file , insert: 7 path");
            System.out.println("To exit, insert: 8");
        boolean running = true;
        String command = ""; 
        
        while(running){
            command = scanner.nextLine(); //COPY folder1 folder2
            String[] splited = command.split("\\s+");  
        switch(splited[0].toUpperCase())
        {
            case "1":   
                list(splited[1]);
                break;
            case "2":
                info(splited[1]);
                break;
            case "3":
                createdir(splited[1]);
                break;
            case "4":
                rename(splited[1], splited[2]);
                break;
            case "5":
                copy(splited[1], splited[2]);
                break;
            case "6":
                move(splited[1], splited[2]);
                break;
            case "7":
                delete(splited[1]); //DELETE path1
                break;
            case "8":
                    running = false;
                    break;
            default:
                System.out.println("Invalid Command");
                break;
        }
            //running = true;          
        }                      
    }    
    public static void list(String name)
    {
        File file = new File(name);
          if(file.exists() && file.isDirectory())
          {
                String[] strings = file.list();
            for(int i = 0; i < strings.length; i++)
            {
                System.out.println(strings[i]);
            }
          }
    }
    public static void info(String name) 
    {
       File fInfo = new File(name);
       if (fInfo.exists()) 
       {
           
        System.out.println("Is file = " + fInfo.isFile());
        System.out.println("Is directory = " + fInfo.isDirectory());
        System.out.println("Lenght = " + fInfo.length());
        try{     
        System.out.println("Creation Time = " + Files.readAttributes(fInfo.toPath(), BasicFileAttributes.class).creationTime());            
        }
        catch(Exception ex)
        {
             System.out.println(ex.getMessage());       
        }
                fInfo.setReadOnly();
        
        }
        /*System.out.println("Name :" + fInfo.getName());
        System.out.println("Absolute path :" + fInfo.getAbsolutePath());
        System.out.println("Size :" + fInfo.length());
        System.out.println("Created Date :" + fInfo.setReadOnly());*/
        
    }
    
    public static void createdir(String name)
    {
        File createFile = new File(name);
            try 
            {
                if(!createFile.exists())
                {
                    createFile.mkdir();
                    System.out.println("Created a directory called " + createFile.getName());
                }
                else
                {
                System.out.println("Directory called " + createFile.getName() + " already exists.");
                }
            
            }               
            catch (Exception e) 
            {
                System.out.println("Couldn't create a directory called " + createFile.getName());
            } 

    }
    
    public static void rename(String oldName,String newName)
    {
        File oldFile = new File(oldName);
        File newFile = new File(newName);
            if(!oldFile.exists())
            {
                System.out.println("File doesn't exists!");
                return;
            }
            if(newFile.exists())
            {
                System.out.println("File with desired name already exists!");
                return;
            }
            if(oldFile.renameTo(newFile))
            {
            System.out.println("Rename succesful");
            }
            else
            {
            System.out.println("Rename failed");
            }
 
    }
    
    public static void copy(String original, String destination)
    {
        File oldFile = new File(original);
        File newFile = new File(destination);
        
        try{
            Files.copy(oldFile.toPath(), newFile.toPath());
        }
        catch(Exception ex)
        {
            System.out.println("Error" + ex.toString());
        }
        

       
    }
    
    public static void move(String original, String destination)
    {
        File afile = new File(original);
        File bfile = new File(destination);
        
        try
        {
          Files.move(afile.toPath(), bfile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            
        }
        catch(IOException exc)
        {
            System.out.println(exc.getMessage());
        }
    }

    
    
    public static void delete(String name)
    {
        File dFile = new File(name);
            if(dFile.exists())
            {
                dFile.delete();
                System.out.println("File successfully deleted!");
            } 
            else
            {
                System.out.println("Cannot delete " + dFile.getName() + " because " + dFile.getName() + " does not exist.");
            }
    }
}
