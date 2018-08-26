/**
 * FileName: PhraseOmatic
 * Author:   cheko
 * Date:     8/26/18 6:52 PM
 * Description:
 * History:
 */
package C1;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cheko
 * @create 8/26/18
 * @since 1.0.0
 */
public class PhraseOmatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multiTiger", "30000 foot", "B-to-B", "win-win", "front-end"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "centric"};
        String[] wordListThree = {"process", "tipping point", "solution", "architecture"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);

        String phrase = wordListOne[rand1] + "" + wordListTwo[rand2] + "" + wordListThree[rand3];
        System.out.println("What we meed is a "+ phrase);

    }

}