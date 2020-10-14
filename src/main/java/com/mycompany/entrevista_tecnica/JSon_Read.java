package com.mycompany.entrevista_tecnica;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import org.json.*;

public class JSon_Read {

    private static String readAll(Reader rd) throws IOException { 
    StringBuilder sb = new StringBuilder(); 
    int cp; 
    while ((cp = rd.read()) != -1) { 
     sb.append((char) cp); 
    } 
    return sb.toString(); 
    } 

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException { 
    try (InputStream is = new URL(url).openStream()) { 
     BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8"))); 
     String jsonText = readAll(rd); 
     JSONObject json = new JSONObject(jsonText); 
     return json; 
    } 
    } 

} 

    

    