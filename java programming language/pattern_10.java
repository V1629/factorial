public class pattern_10 {
    public static void numdia(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        System.out.println();
        }


    }
    public static void main(String args[]){
        numdia(6);
    }
}
