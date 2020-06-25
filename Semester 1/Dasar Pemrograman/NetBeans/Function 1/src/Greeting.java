class Greeting {
    static void beriSalam() {
        System.out.println("Halo! Selamat Pagi");
    }
    static void beriUcapan(String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String[] args){
        beriSalam();
        String salam = "Selamat datang di pemrograman Java";
        beriUcapan(salam);
    }
}