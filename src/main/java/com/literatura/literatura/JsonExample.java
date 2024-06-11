package com.literatura.literatura;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        // Ejemplo de conversión de objeto Java a JSON
        MyObject obj = new MyObject();
        obj.setName("Ejemplo");
        obj.setAge(30);

        try {
            String jsonString = objectMapper.writeValueAsString(obj);
            System.out.println("JSON: " + jsonString);

            // Ejemplo de conversión de JSON a objeto Java
            MyObject objFromJson = objectMapper.readValue(jsonString, MyObject.class);
            System.out.println("Objeto: " + objFromJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyObject {
    private String name;
    private int age;

    // Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
