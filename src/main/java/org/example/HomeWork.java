package org.example;

public class HomeWork  {
    public static void main(String[] args) {
        // Рога и Копыта

        int massSausage = 2000;
        int massHam = 8511;
        int massNeck = 6988;

        int priceSausage = 800;
        int priceHam = 350;
        int priceNeck = 500;

        int costUpTo1000Kg = 414;
        int costUpFrom1000To2000Kg = 408;
        int costUpTo2000Kg = 404;

        int priceHamProd = 275;
        int priceNeckMin = 311;
        int priceNeckMax = 299;

        if (massSausage >= 1000);
        {
            int costSausageUpTo1000Kg = massSausage * costUpTo1000Kg;
            System.out.println("Себестоимость сосисок до 1000 кг" + costSausageUpTo1000Kg);

        } if (massSausage < 2000);
        {
            int costSausageUpFrom1000To2000Kg = massSausage * costUpFrom1000To2000Kg;
            System.out.println("Себестоимость сосисок до 2000 кг" + costSausageUpFrom1000To2000Kg);

        } if (massSausage > 2000);
        {
            int costSausageUpTo2000Kg = massSausage * costUpTo2000Kg;
            System.out.println("Себестоимость сосисок больше 2000 кг" + costSausageUpTo2000Kg);

            int costHam = massHam * priceHam;
            System.out.println("Себестоимость ветчины" + costHam);
            int costHamProd = massHam * priceHamProd;
            System.out.println("Стоиость ветчины на производстве" + costHamProd);
            int costNeck = massNeck * priceNeck;
            System.out.println("Себестоимость шейки" + costNeck);
            int costNeckUpTo500Kg = massNeck * priceNeckMin;
            System.out.println("Себестоимость шейки при производсте меньше 500 кг" + costNeckUpTo500Kg);

            int costNeckUpTo500KgToMore = massNeck * priceNeckMax;
            System.out.println("Себестоимость шейки при производстве 500 кг и больше" + costNeckUpTo500KgToMore);


            //Чистая прибыль

            int netProfitSausage = massSausage * costUpFrom1000To2000Kg + 100000000;
            System.out.println("Чистая прибыль сосисок" + netProfitSausage);
            int netProfitHam = massHam * priceHamProd + 100000000;
            System.out.println("Чистая прибыль ветчины" + netProfitHam);
            int netProfitNeck = massNeck * priceNeckMax + 100000000;
            System.out.println("Чистая прибыль шейки" + netProfitNeck);

            // Прибыль после налогов (вся прибыль до 2_000_000)

            int netProfitSausageAfterTax = (massSausage * costUpFrom1000To2000Kg + 1000000) * 10 / 100;
            System.out.println("Чистая прибыль после налогов с сосисок" + netProfitSausageAfterTax);
            int netProfitHamAfterTax = ((massHam * priceHamProd + 1000000) * 10 / 100);
            System.out.println("Чистая прибыль с ветчины" + netProfitHamAfterTax);
            int netProfitNeckAfterTax = (massNeck * priceNeckMax + 1000000) * 10 / 100;
            System.out.println("Чистая прибыль с шейки" + netProfitNeckAfterTax);

            // The End.

    }}}