import java.io.File;
import java.util.Scanner;  
import java.io.FileNotFoundException;  // Import this class to handle errors



public class Daa_1 {

    static int[] mode(int a[],int n) {
        int maxValue = 0, maxCount = 0, i, j;
        int[] ans = new int[2];
        for (i = 0; i < n; ++i) {
           int count = 0;
           for (j = 0; j < n; ++j) {
              if (a[j] == a[i])
              ++count;
           }
  
           if (count > maxCount) {
              maxCount = count;
              maxValue = a[i];
           }
        }
        ans[0] = maxValue;
        ans[1] = maxCount;
        return ans;
     }

     static int[] min_max(int a[], int n){
         int[] ans = new int[2];

         ans[0] = 0; //Max
         ans[1] = a[0]; //min

         for(int i=0; i<n; i++){
            if(a[i]>=ans[0])
                ans[0] = a[i];
            
            if(a[i]<=ans[1])
                ans[1] = a[i];
         }

         return ans;
     }


    public static void main(String[] args) {

        int[] nums = new int[100];
        int i=0;

        try{
        File fr = new File("numbers.txt");
        Scanner Sc = new Scanner(fr);

        while (Sc.hasNextLine()) {
            String data = Sc.nextLine();
            nums[i] = Integer.parseInt(data);
            i++;
        }
        Sc.close();

        int[] ans = mode(nums,100);
        int[] Min_Max = min_max(nums, 100);

        System.out.println("Highest Occurence: " + ans[0] + " count "+ ans[1]);
        System.out.println("Max: "+ Min_Max[0] + " Min: "+ Min_Max[1]);

        }catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
    }
}
