public class Main {
    public static void main(String[] args) {
        /*
        Soketler, TCP kullanarak iki bilgisayar arasındaki iletisim
        aracını uygular

        Soket programlama kullanılarak iki pc arasındaki TCP baglantisi
        kurulmasında gerceklsesn adımlar sunlardır:
            1 - sunucu, iletişimin hangi port numarasında gerceklesecigini
            belirten bir ServerSocket nesnesi baslatır
            2 - ServerSocket nesnesi baslatıkdıktan sonra sunucu, ServerSocket
            sınıfının Accept() yontemını ister. bu program, bir istemci verilen
            baglanti noktasındaki sunucuya baglanana kadar duraklar
            3 - sunucu bosta kaldıktan sonra, istemci, baglanılacak sunucu adını ve
            baglantı noktası numarasını tanımlayarak Socket sınıfının nesnesini baslatır
            4 - 3. adımdan sonra, Socket sınıfının yapıcısı, istemciyi belirlenen
            sunucuya ve port numarasına baglamaya calısır. iletişimin kimliği
            dogrulanırsa ıstemcı, sunucuyla etkilesimde bulunma konusunda yetkin
            bir Socket nesnesine hemen sahip olur
            5 - sunucu tarafında Accept() yontemı, ıstemcının soketıne baglı sunucudakı
            yen bir seokete referans return eder.
            son olarak baglantı stabil hale geldikten sonra iletisim I/O akısları ile
            gerceklestirilebilir

            Socket Sınıfı:
                bu sınıf kullanıcıların tum temel soket işlemlerini yapmasına olanak tanır
                cesitli veri alısverısı ve baglantılar bu sınıf ıle olusturulabılır
                her bir obje burada sadece 1 pcye baglanır ve baska bir baglantı daha
                olusturulmak ıstenırse baska bir obje daha olusturulmalıdır
                Socket programlama da hem istemci hem de sunucunun bit Socket nesnesi vardir,
                dolayısıyla Socket sınıfı altındakı tum yontemler hem ıstemcı hem de sunucu
                tarafından cagırılabılır.

            ServerSocket Sınıfı:
                bu sınıf ise istemci/sunucu soket baglantısının sunucu tarafının sıstemden
                bagımsız uygulanmasını saglamak icin kullanılır.
                ServerSocket sınıfı ıcın, belirtilen baglantı noktasını dınleyemezse bir
                istisna atar.

         */




    }
}