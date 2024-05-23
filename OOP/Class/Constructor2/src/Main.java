public class Main {
    public static void main(String[] args) {
        // kisaca constructorlar bir objeyi kullanabilmek icin gerekli
        // olan ozel bir metod diyebiliriz.
        //constructor adi class adiyla ayni olmali
        // return olmamali
        // default ya da parameterized  olarak iki cesidi var
        // parameterized constructorda ek olarak deger atamasi yapilir
        // cogu zaman baska bir sinifta kullanmak icin veri olusturdgumzda
        // java otomatik olarak olusturuyor
        // ozetle; asil amac, degerleri saglamak icin constructor kullnlr
        // parameterized constructor siklikla kullanilir ve oyle olmali

        // parameterized constructor ornegi

        Student student1 = new Student(12,"david", 21);
        System.out.println(student1); // bellekteki yeri gosteriyor
        student1.showInf();

        // constructor overloading ornegi
        Student student2 = new Student(22);
        student2.showInf();

        // sadece yas bilgisi girerekte bastirmis olduk

        /**
         * constructor ile method benzer fakat farklari vardir
         * - conctructor method gibi ismiyle cagirilmaz, ortuludur
         * - contructor return vermez, method icin donus sart(void olsa bile)
         * - constructor olusturmazsak java kendikini kullanir
         *   method hicbir sekile java tarafindan olusturulmaz
         * - contructor mutlaka class ile ayni isimde olmali
         */

    }
}
