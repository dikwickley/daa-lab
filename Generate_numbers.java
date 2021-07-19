import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;




public class  Generate_numbers{

    static int[] random_numbers(int n){
        Random rd = new Random();

        int[] nums = new int[100];

        for(int i=0; i<nums.length; i++){
            nums[i] = rd.nextInt(100);
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] randoms = random_numbers(100);

        

        

        try{
            FileWriter fw = new FileWriter("numbers.txt");
            
            for(int i=0; i<randoms.length; i++){
                fw.write(String.valueOf(randoms[i]));
                fw.write('\n');
            }

            System.out.println("File written");

            fw.close();
            
            
        } catch(IOException e){
            System.out.println("error occured");
            e.printStackTrace();
        }
        
    }
}