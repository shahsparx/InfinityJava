package com.company;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Scanner;

/** This is my personal image downloader. :)
 * Created by Lenovo on 31-10-2015.
 */
public class imagedownload {
    public static void main(String [] args) throws Exception
    {
        try
        {
            String fileName = "digital_image_processing.jpg";
            String website = "http://tutorialspoint.com/java_dip/images/"+ fileName;
            System.out.println("Enter the Url of the image you want to download.");
            Scanner input = new Scanner(System.in);
            String weburl = input.nextLine();

            System.out.println("Downloading File from : " + weburl);

            URL url = new URL(weburl);
            InputStream inputStream = url.openStream();
            OutputStream outputStream = new FileOutputStream(fileName);
            byte[] buffer = new byte[2048];

            int length;

            while((length = inputStream.read(buffer)) !=-1)
            {
                System.out.println("Buffer Read of length : " + length);
                outputStream.write(buffer,0,length);
            }
            inputStream.close();
            outputStream.close();

        }catch (Exception e){
            System.out.print("Exception: " + e.getMessage());
        }
        finally {
            System.out.print("Image downloaded! Check the directory.");
        }


    }

}
