
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main(String[] args) {
        String[] strArray = {"Alpha" ,"Bravo", "Charlie", "Delta", "Echo"};
        for (String i: strArray ){
            System.out.println(i);
            for (String f: strArray){
                System.out.print(f);
                for (String h: strArray){
                    System.out.print(h + "-");
                }
            }
    }
}
}
