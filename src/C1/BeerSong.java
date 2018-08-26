/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BeerSong
 * Author:   cheko
 * Date:     8/24/18 8:16 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package C1;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle"; //單數的瓶子
            }
            System.out.println(beerNum + "" + word + " of beer on the wall.");
            System.out.println(beerNum + "" + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum > 0) {
                System.out.println(beerNum + "" + word + " of beer on the wall.");
            } else {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }

}