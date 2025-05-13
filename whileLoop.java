public class whileLoop {
    public static void main(String[] args) {
        int i = 1;
        int sum =0;
        while(i<=4){
            System.out.println(2*i);
            sum = sum + (2*i);
        
            i++;
        }
        System.out.println("sum of all is :" + sum );
    }
    
}
