package parabank;

import java.util.Random;
import java.util.random.RandomGenerator;

//TODO подключить lombok
//@UtilityClass int num1, num2, num3; - отдельными строками И правильно обозвать + java phone number best practices + fourths
public class NumberGenerator {

    public static String generatePhoneNumber() {
        Random generator = new Random();
        int one = generator.nextInt(8);
        int two = generator.nextInt(8);
        int three = generator.nextInt(8);
        int fourtosix = generator.nextInt(743);
        int seventoten = generator.nextInt(10000);
        String sOne = "" + (one);
        String sTwo = "" + (two);
        String sThree = "" + (three);
        String sFourtosix = "";
        String sSeventoten = "";
        if (fourtosix >= 0 && fourtosix < 10)
            sFourtosix = "00" + (fourtosix);
        else if (fourtosix < 100)
            sFourtosix = "0" + (fourtosix);
        else
            sFourtosix = "" + (fourtosix);
        if (seventoten >= 0 && seventoten < 10)
            sSeventoten = "000" + (seventoten);
        else if (seventoten < 100)
            sSeventoten = "00" + (seventoten);
        else if (seventoten < 1000)
            sSeventoten = "0" + (seventoten);
        else
            sSeventoten = "" + (seventoten);

        //Print the phonenumber with this format xxx-xxx-xxxx
        return (sOne + sTwo + sThree + "-" + sFourtosix + "-" + sSeventoten);

/*        int num1, num2, num3; //3 numbers in area code
        int set2, set3; //sequence 2 and 3 of the phone number

        Random generator = new Random();

        //Area code number; Will not print 8 or 9
        num1 = generator.nextInt(7) + 1; //add 1 so there is no 0 to begin
        num2 = generator.nextInt(8); //randomize to 8 becuase 0 counts as a number in the generator
        num3 = generator.nextInt(8);

        // Sequence two of phone number
        // the plus 100 is so there will always be a 3 digit number
        // randomize to 643 because 0 starts the first placement so if i randomized up to 642 it would only go up yo 641 plus 100
        // and i used 643 so when it adds 100 it will not succeed 742
        set2 = generator.nextInt(643) + 100;

        //Sequence 3 of numebr
        // add 1000 so there will always be 4 numbers
        //8999 so it wont succed 9999 when the 1000 is added
        set3 = generator.nextInt(8999) + 1000;

        return "(" + num1 + "" + num2 + "" + num3 + ")" + "-" + set2 + "-" + set3;*/
    }

    public static String generateNumber(int bound) {
        return String.valueOf(RandomGenerator.getDefault().nextInt(0, bound));
    }
}
