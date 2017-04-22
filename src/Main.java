/**
 * Created by stephen on 17-4-17.
 */
public class Main {
    public static void main(String[] args){
        for(int i=1;i<10;i++){
            for(int j=1;j<i+1;j++){
                String out=String.valueOf(i*j);
                System.out.print(i+"*"+j+"="+out+" ");
            }
            System.out.print("\n");
        }
    }
}
