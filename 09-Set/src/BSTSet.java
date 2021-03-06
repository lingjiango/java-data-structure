import java.util.ArrayList;

/**
 * @author mcrwayfun
 * @version v1.0
 * @date Created in 2018/10/16
 * @description
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {

    private BST<E> bst;

    public BSTSet(){
        bst = new BST<>();
    }

    // 返回是否为空
    @Override
    public boolean isEmpty(){
        return bst.isEmpty();
    }

    // 返回当前元素个数
    @Override
    public int getSize(){
        return bst.getSize();
    }

    // 添加元素
    @Override
    public void add(E e){
        bst.add(e);
    }

    // 移除元素
    @Override
    public void remove(E e){
        bst.remove(e);
    }

    // 判断元素是否存在
    @Override
    public boolean contains(E e){
        return bst.contains(e);
    }

    public static void main(String[] args) {

        System.out.println("Pride and Prejudice");

        ArrayList<String> words1 = new ArrayList<>();
        if(FileOperation.readFile("pride-and-prejudice.txt", words1)) {
            System.out.println("Total words: " + words1.size());

            BSTSet<String> set1 = new BSTSet<>();
            for (String word : words1)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }

        System.out.println();


        System.out.println("A Tale of Two Cities");

        ArrayList<String> words2 = new ArrayList<>();
        if(FileOperation.readFile("a-tale-of-two-cities.txt", words2)){
            System.out.println("Total words: " + words2.size());

            BSTSet<String> set2 = new BSTSet<>();
            for(String word: words2)
                set2.add(word);
            System.out.println("Total different words: " + set2.getSize());
        }

    }
}
