package org.example;

import java.sql.SQLOutput;
import java.util.Locale;

public class MainClass {

    public static void main(String[] args) {

        String name = "            Олег Иванович    ";
        System.out.println(name.trim());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim().toUpperCase());
        System.out.println(name);
        String name2 = name.trim().toUpperCase();
        System.out.println(name2);
        if (name2.contains("ОВ ")) {
            String str = "Уважаемый " + name2;
            System.out.println(str);
        } else if (name2.contains("ОВА ")) {
            String str2 = "Уывжвемая " + name2;
            System.out.println(str2);
        } else {
            System.out.println("Неизвестное лицо");
        }
        // Задание №2

        String alex = "   Астапов Алексей Александрович  ";
        String alex2 = alex.trim().toLowerCase();
        System.out.println(alex2);
        if (alex.contains("Алексей")) {
            System.out.println("Алёшенька");
        }
        String alex3 = (alex.trim().toUpperCase().replaceFirst("АЛЕКСЕЙ","ИВАН"));
        System.out.println(alex3);

        }



    }



