/**
 * FileName: testc
 * Author:   cheko
 * Date:     8/27/18 9:18 PM
 * Description:
 * History:
 */
package C1;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cheko
 * @create 8/27/18
 * @since 1.0.0
 */
class  PoolPuzzleOne{
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1;
        }
    }
}