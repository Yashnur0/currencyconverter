import java.util.*;

import javax.management.InvalidApplicationException;

import java.text.DecimalFormat;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner yash = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Enter the the currency you want to convert from");
        System.out.println("1. USD");
        System.out.println("2. EURO");
        System.out.println("3. POUND");
        System.out.println("4. YEN");
        System.out.println("5. RUPEE");
        System.out.println("6. AUSTRALIAN DOLLAR");
        System.out.println("7. CANADIAN DOLLAR");
        System.out.println("8. SWISS FRANC");
        System.out.println("9. BD TAKA");
        System.out.println("10. RUSSIAN RUBLE");
        System.out.println("11. SWEDISH KRONA");
        System.out.println("12. RUPIYA");
        System.out.println("13. NEW ZEALAND DOLLAR");
        System.out.println("14. SOUTH AFRICAN RAND");
        System.out.println("15. CZECH KORUNA");
        System.out.println("16. DIRHAM");
        System.out.println("17. TURKISH LIRA");
        System.out.println("18. KUWAITI DINAR");
        System.out.println("19. BULGARIAN LEV");
        System.out.println("20. CROATIAN KUNA");
        System.out.println("21. HUNGARIAN FORINT");
        System.out.println("22. ICELANDIC KRONA");
        System.out.println("23. KSA RIAL");
        System.out.println("24. MALAYSIAN RINGGIT");
        System.out.println("25. MEXICAN PESO");

        int choice = yash.nextInt();

        System.out.println("Amount to be converted: ");
        double amount = yash.nextDouble();
        double usd, euro, pound, yen, rupee, australian, canadian, swiss, bdt, russian, swedish, rupiya, newzealand, southafrican, czech, dirham, turkish, kuwaiti, bulgarian, croatian, hungarian, icelandic, ksa, malaysian, mexican, swissfranc;
        if (choice == 9) {
            usd = amount/85.00;
            System.out.println("USD: " + df.format(usd));

            throw InvalidApplicationException {
                euro = amount/ 91.56
                System.out.println("EURO: " + df.format(euro));

            }
            catch {
                IndexOutOfBoundsException
            }
           

            pound = amount/ 109.00;
            System.out.println("POUND: " + df.format(pound));

            yen = amount / 0.67;
            System.out.println("YEN: " + df.format(yen));

            rupee = amount / 1.13;
            System.out.println("RUPEE: " + df.format(rupee));

            australian = amount / 61.19;
            System.out.println("AUSTRALIAN DOLLAR: " + df.format(australian));

            canadian = amount / 67.48;
            System.out.println("CANADIAN DOLLAR: " + df.format(canadian));

            swiss = amount / 89.01;
            System.out.println("SWISS FRANC: " + df.format(swiss));

            ruble = amount / 1.215;
            System.out.println("RUSSIAN RUBLE: " + df.format(russian ruble));

            swedish = amount / 8.82;
            System.out.println("SWEDISH KRONA: " + df.format(swedish));

            rupiya = amount / 19.91;
            System.out.println("RUPIYA: " + df.format(rupiya));

            newzealand = amount / 56.02;
            System.out.println("NEW ZEALAND DOLLAR: " + df.format(newzealand));

            southafrican = amount / 5.508;
            System.out.println("SOUTH AFRICAN RAND: " + df.format(southafrican));

            czech = amount / 3.72;
            System.out.println("CZECH KORUNA: " + df.format(czech));

            dirham = amount / 23.59;
            System.out.println("DIRHAM: " + df.format(dirham));

            turkish = amount / 5.84;
            System.out.println("TURKISH LIRA: " + df.format(turkish));

            kuwaiti = amount / 282.57;

            System.out.println("KUWAITI DINAR: " + df.format(kuwaiti));

            bulgarian = amount / 46.79;
            System.out.println("BULGARIAN LEV: " + df.format(bulgarian));

            croatian = amount / 12.08;
            System.out.println("CROATIAN KUNA: " + df.format(croatian));

            hungarian = amount / 0.24;
            System.out.println("HUNGARIAN FORINT: " + df.format(hungarian));

            icelandic = amount / 0.67;
            System.out.println("ICELANDIC KRONA: " + df.format(icelandic));

            ksa = amount / 23.11;
            System.out.println("KSA RIAL: " + df.format(ksa));

            malaysian = amount / 19.91;
            System.out.println("MALAYSIAN RINGGIT: " + df.format(malaysian));

            mexican = amount / 0.00;
            System.out.println("MEXICAN PESO: " + df.format(mexican));


        } else{
            System.out.println("Choose again");
        }
    }
}



