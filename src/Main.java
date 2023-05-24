public class Main {
    public static void main(String[] args) {
        // задача № 1
            byte a = 100 ;
            int b = -300 ;
            short c = 1000 ;
            long d = 1000000 ;
            float pz = 5.306f ;
            double pz2 = 7.306f ;
            System.out.println("Значение переменной с типом byte рравно " + a ) ;
            System.out.println("Значение переменной с типом int рравно " + b ) ;
            System.out.println("Значение переменной с типом short рравно " + c ) ;
            System.out.println("Значение переменной с типом long рравно " + d ) ;
            System.out.println("Значение переменной с типом float рравно " + pz ) ;
            System.out.println("Значение переменной с типом double рравно " + pz2 ) ;
        // задача № 2
            float pz3 = 27.12f ;
            long d2 = 987678965549L ;
            float pz4 = 2.786f ;
            short c2 = 569 ;
            short c3 = -159 ;
            short c4 = 27859 ;
            byte a2 = 67 ;
            System.out.println("float " + pz3 ) ;
            System.out.println("long " + d2 ) ;
            System.out.println("float " + pz4 ) ;
            System.out.println("short " + c2 ) ;
            System.out.println("short " + c3 ) ;
            System.out.println("short  " + c4 ) ;
            System.out.println("byte  " + a2 ) ;
        // задача № 3
            short vlPaper = 480 ;
            byte u = 23 ;
            byte u2 = 27 ;
            byte u3 = 30 ;
            int nkU = vlPaper / u ;
            int nkU2 = vlPaper / u2 ;
            int nkU3 = vlPaper / u3 ;
            System.out.println("Каждому ученику из первого класса достанется " + nkU  + " листов бумаги.") ;
            System.out.println("Каждому ученику из второго класса достанется " + nkU2  + " листов бумаги.") ;
            System.out.println("Каждому ученику из третьего класса достанется " + nkU3  + " листов бумаги.") ;
        // задача № 4
            byte btl = 16 ;
            byte time = 2 ;
            byte timeJob = 20 ;
            short timeJob2 = 1440 ;
            short timeJob3 = 4320 ;
            int timeJob4 = 44640 ;
            int prm = (btl * timeJob) / time ;
            int prm2 = (btl * timeJob2) / time ;
            int prm3 = (btl * timeJob3) / time ;
            int prm4 = (btl * timeJob4) / time ;
            System.out.println("За двадцать минут машина произведёт " + prm + " штук бутылок."  ) ;
            System.out.println("За сутки машина произведёт " + prm2 + " штук бутылок."  ) ;
            System.out.println("За три дня машина произведёт " + prm3 + " штук бутылок."  ) ;
            System.out.println("За месяц машина произведёт " + prm4 + " штук бутылок."  ) ;
        // задача № 5
            byte vBk = 120 ;
            byte kBel = 2 ;
            byte kKor = 6 ;
            int m = kBel * kKor ;
            int Sk = vBk / m ;
            int kBn = vBk / kBel ;
            int kKn = vBk / kKor ;
            System.out.println("В школе, где " + Sk + " классов, нкжно " + kBn  + " белой краски и " +
                    kKn + " банок коричневой краски." ) ;
       // задача № 6
            byte banas = 5 ;
            short milk = 200 ;
            byte moroj = 2 ;
            byte yaz = 4 ;
            byte banasWeigt = 80 ;
            byte milkWeigt = 105 ;
            byte morojWeigt = 100 ;
            byte yazWeigt = 70 ;
            int banasSumm = banas * banasWeigt ;
            int milkSumm = milk + milkWeigt ;
            int morojSumm = moroj * morojWeigt ;
            int yazSumm = yaz * yazWeigt ;
            int obWeigt = banasSumm + milkSumm + morojSumm + yazSumm ;
            float kgWeigt = obWeigt / 1000f ;
            System.out.println("Вес завтрака спотсмена составил " + obWeigt +
                    " грамм или " + kgWeigt + " килограмма."  ) ;
        // задача № 7
            byte wsnz = 7 ;
            int wsnzGr = wsnz * 1000 ;
            int weigtZaden = wsnzGr / 250 ;
            int weigtZaden2 = wsnzGr / 500 ;
            System.out.println("При сбрасывании от двухсот пятидесяти граммов в день." +
                    " Для сброса веса потребуется " + weigtZaden + " дней."  ) ;
            System.out.println("При сбрасывании от пятисот граммов в день." +
                    " Для сброса веса потребуется " + weigtZaden2 + " дней."  ) ;
        // задача № 8
            int zpMasha = 67760 ;
            int zpDenis = 83690 ;
            int zpKristina = 76230 ;
            int zpzaGodMasha = zpMasha * 12 ;
            int zpzaGodDenis = zpDenis * 12 ;
            int zpzaGodKristina = zpKristina *12 ;
            double zppovMasha = ( zpMasha * 0.1 ) + zpMasha ;
            double zppovDenis = ( zpDenis * 0.1 ) + zpDenis ;
            double zppovKrtistina = ( zpKristina * 0.1 ) + zpKristina ;
            double povzpzaGodMasha = zppovMasha * 12 ;
            double povzpzaGodDenis = zppovDenis * 12 ;
            double povzpzaGodKristina = zppovKrtistina * 12 ;
            double razzpMasha = povzpzaGodMasha - zpzaGodMasha ;
            double razzpDenis = povzpzaGodDenis - zpzaGodDenis ;
            double razzpKristina = povzpzaGodKristina - zpzaGodKristina ;
            System.out.println("Маша теперь получает " + zppovMasha +
                    " Годовой доход вырос на " + razzpMasha + " рублей.") ;
            System.out.println("Денис теперь получает " + zppovDenis +
                    " Годовой доход вырос на " + razzpDenis + " рублей.") ;
            System.out.println("Кристина теперь получает " + zppovKrtistina +
                    " Годовой доход вырос на " + razzpKristina + " рублей.") ;
            // ДЗ по переменным урок2 считаю выполненным.
    }
}