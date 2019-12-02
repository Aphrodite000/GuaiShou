import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            //怪物数量
            int a=sc.nextInt();
            int b=sc.nextInt();
            int[] defense=new int[a];
            for(int i=0;i<a;i++){
                defense[i]=sc.nextInt();
            }
            for(int i=0;i<a;i++){
                if(b>defense[i]){
                    b=b+defense[i];
                }else {
                    b=b+gongYue(b,defense[i]);
                }
            }
            System.out.println(b);
        }
    }

    private static int gongYue(int a, int defense) {
        int max=0;
        for(int i=1;i<a*defense;i++){
            if(a%i==0&&defense%i==0){
                if(max==0){
                    max=i;
                }else {
                    if(max<i){
                        max=i;
                    }
                }
            }
        }
        return max;
    }
}
