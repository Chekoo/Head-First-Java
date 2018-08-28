/**
 * FileName: Dog
 * Author:   cheko
 * Date:     8/28/18 10:41 PM
 * Description:
 * History:
 */
package C1;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cheko
 * @create 8/28/18
 * @since 1.0.0
 */
class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }

}

class DogTestDrive {
    public static void main(String[] args) {
        // 測試代碼
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}