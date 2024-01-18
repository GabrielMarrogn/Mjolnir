import java.io.BufferedReader;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i= 0; i < num; i++){
            String test = br.readLine();
            String[] arr = test.split(" ");
            String nome = arr[0];

            if(nome.equals("Thor")){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }

        }
    }
}
