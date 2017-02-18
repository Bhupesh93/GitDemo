/**
 * Created by Boobesh S on 2/17/2017.
 */
public class GitMain {

    public static void main(String arg[]) {
        System.out.println("This is git demo ");
        print("git", 102);
        print("demo",110);
    }

    private static void print(String word, int noOfTimes) {
        for (int i = 0; i < noOfTimes; i++)
            System.out.println(word);
    }
}
