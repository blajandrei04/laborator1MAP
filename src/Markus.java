public class Markus {
    public static void billingTastatur(int[] keyboards){
        int minPrice =keyboards[0];
        for(int price :keyboards){
            if(price < minPrice){
                minPrice = price;
            }
        }
        System.out.println("Billingste Tastatur: " + minPrice);
    }
    public static void teuerGerat(int[] keyboards, int[] USB){
        int maxPrice = keyboards[0];
        for(int price : keyboards){
            if(price > maxPrice){
                maxPrice = price;
            }
        }
        for(int price : USB){
            if(price > maxPrice){
                maxPrice = price;
            }
        }
        System.out.println("Teuerste Gerat: " + maxPrice);
    }
    public static void teuerUSB(int[] USB, int budget){
        int maxUSBPrice = 0;
        for(int price : USB){
            if(price > maxUSBPrice && price <= budget){
                maxUSBPrice = price;
            }
        }
        System.out.println("Teuerste USB: " + maxUSBPrice);
    }
    public static void maxAusgebe(int[] keyboards, int[] USB, int budget) {
        int maxi = -1;

        for (int keyboardPrice : keyboards) {
            for (int usbPrice : USB) {
                int kosten = keyboardPrice + usbPrice;
                if (kosten <= budget && kosten > maxi) {
                    maxi = kosten;
                }
            }
        }
        if (maxi == -1) {
            System.out.println("Markus kann sich beide Gerate nicht leisten");
        }
        else {
            System.out.println("Markus kann sich beide Gerate leisten");
        }

    }

}
