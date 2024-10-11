package com.core;


import com.domain.Staff;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class GsonExample2 {

    public static void main(String[] args) {

    	Gson gson = new GsonBuilder()
    		      .setExclusionStrategies(new CustomExclusionStrategy(List.class)) // exclude all List fields.
    		      .create();

        try (Reader reader = new FileReader("json/student.json")) {

            // Convert JSON File to Java Object
            Staff staff = gson.fromJson(reader, Staff.class);

            // print staff
            System.out.println(staff);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

