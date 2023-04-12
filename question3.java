import java.util.Stack;


public class question3 {
    private Stack<Integer> stack1 = new Stack<>(); // yeni elemanların eklenmesi için
    private Stack<Integer> stack2 = new Stack<>(); // elemanların çıkarılması için

    public void enqueue(int element) { // elemanları stack1'e ekler
        stack1.push(element);
    }

    public int dequeue() { //elemanları stack2'den çıkarır
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {//eğer stack 2 boş ise stack1'deki tüm elemanları 
                stack2.push(stack1.pop());//stack2'ye taşınır
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) { // örnek stack kullanımı
        question3 queue = new question3();
        queue.enqueue(1);       
        queue.enqueue(2);                   // enqueue ile 1,2 ve 3 stack1'e eklenir    
        queue.enqueue(3);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); // 1 ve 2 elemanları stack2'den çıkarılır
        queue.enqueue(4);                    //4 stack'e eklenir                
        System.out.println(queue.dequeue()); //3 stack2'den çıkarılır 
        System.out.println(queue.dequeue()); //4 stack2'den çıkarılır
    }

    public int[] addElement(int n, int[] nums, int x) {
        return null;
    }

    
}
