public class countnum {
    public static void main(String[] args){
        int n = 4556567;
        int count = 0;
        while(n>=0){
            int rem = n%10;
            if(rem==6){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
