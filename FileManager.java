package com.lockme;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManager 
{
public static List<String> getALLFiles(String folderpath)
{
	/**
	 * This method will return all file name from the folder
	 * @param folderpath
	 * @return List<String>
	 */
	//Creating File Object
	File fl = new File(folderpath);
	
	//Getting all files into FileArray
	File[] listOfFiles= fl.listFiles();
	
	//Declare a list to store file names
	List<String> fileNames = new ArrayList<String>();
	
	for(File f:listOfFiles)
		fileNames.add(f.getName());
	
	//return the List
	return fileNames;
}
     /**
      * This method will create or apend content into the folder specified 
      * @param folderpath
      * @param fileName
      * @param content
      * @return boolean
      */
    public static boolean createFiles(String folderpath,String fileName, List<String> content)
    {
    	try
    	{
    		File fl = new File(folderpath, fileName);
    		FileWriter fw = new FileWriter(fl);		
    		
    		for(String s:content)
    		{
    			fw.write(s+"\n");
    		}
    		fw.close();
    		return true;
    	}
    	catch(Exception Ex)
    	{
    		return false;
    	}
    }  
    /**
     * This method will delete the file from the folder.
     * @param folderpath
     * @param fileName
     * @return boolean
     */
    public static boolean deleteFile(String folderpath, String fileName)
    {
    	//adding folder path with file name and creating object
    File file = new File(folderpath+"\\"+fileName);
     try
     {
    	 if(file.delete())
    		 return true;
    	 else
    		 return false;
     }
     catch(Exception Ex)
     {
    	 return false;
     } 
    }
    /**
     * This method will search the file from the folder.
     * @param folderpath
     * @param fileName
     * @return boolean
     */
    public static boolean searchFile(String folderpath, String fileName)
    {
    	//adding folder path with file name and creating object
        File file = new File(folderpath+"\\"+fileName);
        
        	 if(file.exists())
        		 return true;
        	 else
        		 return false;
         }
 }
