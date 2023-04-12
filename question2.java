import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // kullanıcıdan 10 adet sayı giriliyor
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Lütfen " + (i+1) + ". sayıyı girin: ");
            numbers[i] = scanner.nextInt();
        }
        
        // Stack oluşturuldu
        Stack<Integer> stack = new Stack<>();
        
        // Sayılar stack'e eklendi
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }
        
        // Stack'teki sayılar küçükten büyüğe doğru sıralandı
        Stack<Integer> sortedStack = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!sortedStack.isEmpty() && temp > sortedStack.peek()) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(temp);
        }
        
        // Sıralanmış stack'e yerleştirerek yazdırılıyor
        System.out.println("Sıralanmış stack: ");
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + " ");
            scanner.close();
        }
    }

    public int thirdElement(int[] nums) {
        return 0;
    }
}
