/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.file_handling;
import java.io.File;

/**
 *
 * @author user
 */
public class File_handling {

    public static void main(String[] args) {
        System.out.println("Hello welcome to filehandling operation project in java");
        File fobj=new File("name.txt");
        try{
            if(fobj.createNewFile()){
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File already exists using the existing file");
            }
        }
        catch (IOException e){
            System.out.println("error found in opertion");
            e.printStackTrace();
        }
    }
}
