package com.mycompany.mavenproject5;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import  com.mashape.unirest.http.JsonNode;
import java.io.InputStreamReader;
import jdk.nashorn.internal.parser.JSONParser;
import org.apache.http.HttpHost;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;


public class wef {

    public static void main(String[] args) throws UnirestException {


        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.get("https://api.companieshouse.gov.uk/company/10459808")
                .header("Authorization", "Basic aVZUeG1veUd4ZnVFV3hTMDgzVkkzakFQclZ2QUdzenJqRUlWTnlqdzo=").asString();



String str = response.getBody();
System.out.println(str);
           // String result = EntityUtils.toString(response.getEntity());


           //	JSONParser parse = new JSONParser();
               // JSONObject jsonobj_2 =  (JSONObject) jsonobj_1.get("view");
           
           

    }
}
