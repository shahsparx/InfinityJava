package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.net.URLEncoder;

import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Simple app by shahsparx. Uses the JSON simple library.
 * Created by Lenovo on 08-11-2015.
 */
public class JSONReadfromurl {
    private static String readAll(Reader rd) throws IOException{
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp=rd.read())!=-1)
        {
            sb.append((char) cp);
        }

        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException,ParseException{
        InputStream is = new URL(url).openStream();

        try{
            BufferedReader rd = new BufferedReader(new InputStreamReader(is,Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(jsonText);
            JSONObject json = (JSONObject) obj;
            return json;
        }catch (ParseException pe)
        {
            System.out.println("position: " + pe.getPosition());
            System.out.println(pe);
        }
        finally
        {
            is.close();
        }
        return null;

    }

    public static void main(String [] args) throws IOException, ParseException
    {
        System.out.println("Hello There! Enter the movie you want to know Rating of.");
        Scanner input = new Scanner(System.in);
        String moviename = input.nextLine();
        String encodedmovie = URLEncoder.encode(moviename);

        System.out.println("Hello There! Enter the year, the movie was released. Its Optional.");
        String movieyear = input.nextLine();

        String link = "http://www.omdbapi.com/?t=" + encodedmovie + "&y=" + movieyear +"&plot=short&r=json\"";
        System.out.println(link);


        JSONObject json = readJsonFromUrl(link);
        System.out.print(json.get("Title"));
        System.out.print(" - ");
        System.out.println(json.get("Year"));
        System.out.print("Rating - ");
        System.out.println(json.get("imdbRating"));
    }


}

