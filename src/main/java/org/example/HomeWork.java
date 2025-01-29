package org.example;

import java.sql.SQLOutput;

public class HomeWork  {
    public static void main(String[] args) {
        // Рога и Копыта

        int massSausage = 2000;
        int massHam = 8511;
        int massNeck = 6988;

        int priceSausage = 800;
        int priceHam = 350;
        int priceNeck = 500;

        int priceSausageMin = 414;
        int priceSausageAver = 408;
        int priceSausageMax = 404;

        int priceHamProd = 275;
        int priceNeckMin = 311;
        int priceNeckMax = 299;

        if (massSausage >= 1000);
        {
            System.out.println("Себестоимость сосисок до 1000 кг");
            System.out.println(massSausage * priceSausageMin);

        } if (massSausage < 2000);
        {
            System.out.println("Себестоимость сосисок до 2000 кг");
            System.out.println(massSausage * priceSausageAver);
        } if (massSausage > 2000);
        {   System.out.println("Себестоимость сосисок больше 2000 кг");
            System.out.println(massSausage * priceSausageMax);
            System.out.println("Себестоимость ветчины");
            System.out.println(massHam * priceHam);
            System.out.println("Стоиость ветчины на производстве");
            System.out.println(massHam * priceHamProd);
            System.out.println("Себестоимость шейки");
            System.out.println(massNeck * priceNeck);
            System.out.println("Себестоимость шейки при производсте меньше 500 кг");
            System.out.println(massNeck * priceNeckMin);
            System.out.println("Себестоимость шейки при производстве 500 кг и больше");
            System.out.println(massNeck * priceNeckMax);

            //Чистая прибыль

            System.out.println("Чистая прибыль сосисок");
            System.out.println(massSausage * priceSausageAver + 100000000);
            System.out.println("Чистая прибыль ветчины");
            System.out.println(massHam * priceHamProd + 100000000);
            System.out.println("Чистая прибыль шейки");
            System.out.println(massNeck * priceNeckMax + 100000000);

            // Прибыль после налогов (вся прибыль до 2_000_000

            System.out.println("Чистая прибыль после налогов с сосисок");
            System.out.println((massSausage * priceSausageAver + 1000000) * 10 / 100);
            System.out.println("Чистая прибыль с ветчины");
            System.out.println((massHam * priceHamProd + 1000000) * 10 / 100);
            System.out.println("Чистая прибыль с шейки");
            System.out.println((massNeck * priceNeckMax + 1000000) * 10 / 100);

    }}}