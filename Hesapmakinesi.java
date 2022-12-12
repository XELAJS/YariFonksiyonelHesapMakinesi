import java.util.*;
public class Hesapmakinesi {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);
        System.out.println("Hesap makinesi kullanma kılavuzu:");
        System.out.println("Hesap makinemizde işlemler sembollerle gösterilir.Toplama(+),Çıkarma(-)");
        System.out.println("Çarpma(*),Bölme(/),Kosinüs(cos),Sinüs(sin),Tanjant(tan),Kotanjant(cot) ve karekök(karekök)");
        System.out.println("Sonucu sıfırlamak için(c),Hesap makinesinde yukardaki işlemleri parantez içindeki sembol ile yapabilirsiniz.");
        System.out.println("ÖNEMLİ UYARI!! Hesap makinemizde işlem önceliği yoktur.İşemler seçtiğiniz sıraya göre yapılır.\nSonucun trigonometrik değerini yada kökünü alamazsınız\n ");


        final double PI=3.14;
        double sonuc=0;
        String islem="";
        double sayi=0;
        int sira=1;
        while(!islem.equals("=")) {

            if(sira==1){  System.out.print("Sayı giriniz:");
                sayi = girdi.nextDouble();

                System.out.print("işlem giriniz:");
                islem = girdi.next();
                sira=3;


            }
            else{


            }

            if (!islem.equals("=")) {



                if (islem.equals("+")) {
                    if(sira==2) {
                        System.out.print("Sayı giriniz:");
                        sayi = girdi.nextDouble();
                        sonuc = sonuc +sayi;
                    } else if (sira==3) {
                        System.out.print("Sayı giriniz:");
                        double sayi1= girdi.nextDouble();

                        sonuc = sonuc +sayi+sayi1;
                        sira=2;
                    }
                    System.out.print("işlem giriniz:");
                    islem = girdi.next();
                } else if (islem.equals("-")) {
                    if(sira==2) {
                        System.out.print("Sayı giriniz:");
                        sayi = girdi.nextDouble();
                        sonuc = sonuc -sayi;
                    } else if (sira==3) {
                        System.out.print("Sayı giriniz:");
                        double sayi1 = girdi.nextDouble();

                        sonuc = sonuc - sayi - sayi1;
                        sira = 2;
                    }
                    System.out.print("işlem giriniz:");
                    islem = girdi.next();
                } else if (islem.equals("*")) {
                    if (sonuc==0) {
                        sonuc = 1;
                    }
                    if(sira==2) {
                        System.out.print("Sayı giriniz:");
                        sayi = girdi.nextDouble();
                        sonuc = sonuc *sayi;
                    } else if (sira==3) {
                        System.out.print("Sayı giriniz:");
                        double sayi1= girdi.nextDouble();

                        sonuc = sonuc *sayi*sayi1;
                        sira=2;
                    }
                    System.out.print("işlem giriniz:");
                    islem = girdi.next();
                } else if (islem.equals("/")) {
                    if(sira==2) {
                        System.out.print("Sayı giriniz:");
                        sayi = girdi.nextDouble();
                        if (sayi==0){
                            while (sayi==0) {
                                System.out.print("Bir sayının 0 a bölümü tanımsızdır lütfen tekrar deneyiniz:");

                                sayi = girdi.nextDouble();
                            }
                        }
                        sonuc = sonuc /sayi;
                    } else if (sira==3) {
                        System.out.print("Sayı giriniz:");
                        double sayi1= girdi.nextDouble();
                        if (sayi1==0){
                            while (sayi1==0) {
                                System.out.print("Bir sayının 0 a bölümü tanımsızdır lütfen tekrar deneyiniz:");

                                sayi1 = girdi.nextDouble();
                            }
                        }

                        sonuc = sonuc /sayi/sayi1;
                        sira=2;
                    }
                    System.out.print("işlem giriniz:");
                    islem = girdi.next();
                } else if (islem.equals("cos")) {
                    while (!islem.equals("exit")) {
                        System.out.print("Kosinüsünü almak istediğiniz sayıyı giriniz:");
                        sayi= girdi.nextDouble();
                        sayi=Math.toRadians(sayi);

                        double cos=Math.cos(sayi);
                        System.out.print("Kosinüsü alınan sayı ile sonuç ne yapılsın[+,-,*,/]:");
                        islem = girdi.next();
                        if (islem.equals("+")) {
                            sonuc = sonuc + cos;
                            break;
                        } else if (islem.equals("-")) {
                            sonuc = sonuc - cos;
                            break;
                        } else if (islem.equals("*")) {
                            if (sonuc==0){
                                sonuc=1;
                                sonuc = sonuc * cos;
                                break;
                            }else {
                                sonuc = sonuc * cos;
                                break;
                            }
                        } else if (islem.equals("/")) {
                            if (cos == 0) {
                                System.out.println("sayılar 0 a bölünürse tanımsız olur ");
                            }else{
                                sonuc=sonuc/cos;
                                break;
                            }
                        }
                    }

                    System.out.print("Sonuçla yeni sayının arasında yapılmasını istediğiniz işlemi giriniz ya da direk sonucu görmek için \"=\" basın:");
                    islem = girdi.next();

                } else if (islem.equals("sin")) {

                    while (!islem.equals("exit")) {
                        System.out.print("Sinüsünü almak istediğiniz sayıyı giriniz:");
                        sayi= girdi.nextDouble();
                        sayi=Math.toRadians(sayi);
                        double sin=Math.sin(sayi);
                        System.out.print("Sinüsü alınan sayı ile sonuç ne yapılsın[+,-,*,/]:");
                        islem = girdi.next();
                        if (islem.equals("+")) {
                            sonuc = sonuc + sin;
                            break;
                        } else if (islem.equals("-")) {
                            sonuc = sonuc - sin;
                            break;
                        } else if (islem.equals("*")) {
                            if (sonuc==0){
                                sonuc=1;
                                sonuc = sonuc * sin;
                                break;
                            }else {
                                sonuc = sonuc * sin;
                                break;
                            }
                        } else if (islem.equals("/")) {
                            if (sin == 0) {
                                System.out.print("sayılar 0 a bölünürse tanımsız olur tekrar deneyiniz: ");
                            }else{
                                sonuc=sonuc/sin;
                                break;
                            }
                        }
                    }

                    System.out.print("Sonuçla yeni sayının arasında yapılmasını istediğiniz işlemi giriniz ya da direk sonucu görmek için \"=\" basın:");
                    islem = girdi.next();

                } else if (islem.equals("tan")) {

                    while (!islem.equals("exit")) {
                        System.out.print("Tanjantını almak istediğiniz sayıyı giriniz:");
                        sayi = girdi.nextDouble();
                        sayi=Math.toRadians(sayi);
                        double tan=Math.tan(sayi);
                        if (Math.cos(sayi)==0) {
                            System.out.print("Tanjant " + sayi + " değerinde tanımsızdır.Başka değer giriniz.");
                        } else {
                            System.out.print("Tanjantı alınan sayı ile sonuç ne yapılsın[+,-,*,/]:");
                            islem = girdi.next();
                            if (islem.equals("+")) {
                                sonuc = sonuc + tan;
                                break;
                            } else if (islem.equals("-")) {
                                sonuc = sonuc - tan;
                                break;
                            } else if (islem.equals("*")) {
                                if (sonuc == 0) {
                                    sonuc = 1;
                                    sonuc = sonuc * tan;
                                    break;
                                } else {
                                    sonuc = sonuc * tan;
                                    break;
                                }
                            } else if (islem.equals("/")) {
                                if (tan == 0) {
                                    System.out.println("sayılar 0 a bölünürse tanımsız olur ");
                                } else {
                                    sonuc = sonuc / tan;
                                    break;
                                }
                            }
                        }
                    }

                    System.out.print("Sonuçla yeni sayının arasında yapılmasını istediğiniz işlemi giriniz ya da direk sonucu görmek için \"=\" basın:");
                    islem = girdi.next();

                } else if (islem.equals("cot")) {

                    while (!islem.equals("exit")) {
                        System.out.print("Kotanjantını almak istediğiniz sayıyı giriniz:");
                        sayi = girdi.nextDouble();
                        sayi=Math.toRadians(sayi);
                        double cot=1/Math.tan(sayi);
                        if (Math.sin(sayi) == 0) {
                            System.out.print("Kotanjant " + sayi + " değerinde tanımsızdır.Başka değer giriniz:");
                        } else {
                            System.out.print("Kotanjantı alınan sayı ile sonuç ne yapılsın[+,-,*,/]:");
                            islem = girdi.next();
                            if (islem.equals("+")) {
                                sonuc = sonuc + cot;
                            } else if (islem.equals("-")) {
                                sonuc = sonuc - cot;
                            } else if (islem.equals("*")) {
                                if (sonuc == 0) {
                                    sonuc = 1;
                                    sonuc = sonuc * cot;
                                } else {
                                    sonuc = sonuc * cot;
                                }
                            } else if (islem.equals("/")) {
                                if (cot == 0) {
                                    System.out.println("sayılar 0 a bölünürse tanımsız olur ");
                                } else {
                                    sonuc = sonuc / cot;
                                }
                            }
                        }
                    }

                    System.out.print("Sonuçla yeni sayının arasında yapılmasını istediğiniz işlemi giriniz ya da direk sonucu görmek için \"=\" basın:");
                    islem = girdi.next();

                } else if (islem.equals("karekök")) {

                    while (!islem.equals("exit")) {
                        System.out.print("Karekökü alınan sayı ile sonuç ne yapılsın[+,-,*,/]:");
                        islem = girdi.next();
                        System.out.print("Kökünü almak istediğiniz sayıyı giriniz:");
                        sayi = girdi.nextDouble();
                        double kareKok=Math.sqrt(sayi);
                        if (sayi < 0) {
                            System.out.println("Kökün içinin negatif olduğu durumlarda sonuç reel kümede tanımsızdır.Başka değer giriniz:");
                        } else {
                            if (islem.equals("+")) {
                                sonuc = sonuc + kareKok;
                                break;
                            } else if (islem.equals("-")) {
                                sonuc = sonuc - kareKok;
                                break;
                            } else if (islem.equals("*")) {
                                if (sonuc == 0) {
                                    sonuc = 1;
                                    sonuc = sonuc * kareKok;
                                    break;
                                } else {
                                    sonuc = sonuc * kareKok;
                                    break;
                                }
                            } else if (islem.equals("/")) {
                                if (kareKok == 0) {
                                    System.out.println("sayılar 0 a bölünürse tanımsız olur ");
                                } else {
                                    sonuc = sonuc / kareKok;
                                    break;
                                }
                            }
                        }
                    }

                    System.out.print("Sonuçla yeni sayının arasında yapılmasını istediğiniz işlemi giriniz:");
                    islem = girdi.next();

                } else if (islem.equals("c")) {
                    sonuc=0;
                    System.out.print("Sayı giriniz:");
                    sayi= girdi.nextInt();

                    System.out.print("işlem giriniz:");
                    islem = girdi.next();
                }else {
                    System.out.print("Lütfen tanımlı bir işlem giriniz:");
                    islem = girdi.next();
                }

            }
        }

        System.out.println(sonuc);
    }
}
