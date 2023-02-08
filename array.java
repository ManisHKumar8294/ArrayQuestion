//import java.util.*;

/*
    import java.util.*;

/*public class array {
    public static void main(String[] args) {
        //int arr [] = new int[50];
        //String fruits [] = {"apple","mango"};
        int marks [] = new int[4];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt(); 
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();

        System.out.println("phy "+ marks[0]);
        System.out.println("che "+ marks[1]);
        System.out.println("math "+ marks[2]);
        System.out.println("math "+ marks[3]);

        marks[2]=94;
        System.out.println("updated marks in math "+marks[2]);
    }
}


public class array{
    public static void update(int marks[], int nonchangable){
        nonchangable=5;
        for(int i=0; i<marks.length;i++){
           marks[i]=marks[i]+1;
        }
         
    }
    public static void main(String[] args) {
        int marks[] = {92,93,94};
        int nonchangable=10;
        update(marks, nonchangable);
        System.out.println(nonchangable);
        for(int i =0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }       
}


//  Linear search

public class array{
    // linear search
    public static int linearsearch(int num[],int key){
        //loop
        for(int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,16};
        int key=10;
        int index=linearsearch(num, key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("key is at index "+index);
        }
    }
}


// Print the largest of number of an array

/*public class array{
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;// - infinite
        int smallest = Integer.MAX_VALUE;

        // loop
        for(int i=0; i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest> num[i]){
                smallest=num[i];
            }
        }
        System.out.println("the smallest value of an array is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[]={1,2,6,3,5};
        System.out.println("largest value in array is : "+getLargest(num));
    }
}    


//     Binary search

public class array{
    public static int binary_search(int numbers[],int key){
        int start=0;
        int end = numbers.length-1;
        // while loop
        while (start<=end){
            int mid=(start+end)/2;
            // now comparisons
            if(numbers[mid]==key){// found
                return mid;
            }
            if(numbers[mid]<key){// right 
                start= mid+1; 
            }
            else{// left
                end=end-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,17};
        int key=10;
        System.out.println("index  for key is : "+binary_search(numbers, key));
    }
}

// Reverse 
public class array{
    public static void reverse(int numbers[]){
        int first=0 , last=numbers.length-1;

        while(first<last){
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        reverse(numbers);

        //print

        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}


// Pairs of an array

public class array{
    public static void pairArray(int numbers[]){
        int tp =0 ;
        for(int i=0; i < numbers.length ; i++){
            
            int curr=numbers[i];
            for(int j=i+1; j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are "+ tp);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        pairArray(numbers);
        
        
    }
}
 
// print Subarrays

public class array{
    public static void printSubarray(int numbers[]){
        int Ts=0;
        for(int i =0; i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    
                    System.out.print(numbers[k]+" ");
                
                }
                Ts++;
                
                
            }
            System.out.println();
        }
        System.out.println("Total elementys is "+Ts);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubarray(numbers);
    }
}

// max sum of subarrays


public class array{
    public static void maxSubarray(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        

        for(int i=0; i<numbers.length ; i++){
            int start = i;  
            for(int j=i; j<numbers.length; j++){
                int end=j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum is "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubarray(numbers);
    }
}

// Max subarray using prefix sum

public class array{
    public static void maxSubarray(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0]; 
        for(int i=1; i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        

        for(int i=0; i<numbers.length ; i++){
            int start = i;  
            for(int j=i; j<numbers.length; j++){
                int end=j;
                currSum=start == 0 ? prefix[end] : prefix[end]-prefix[start-1];

                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum is "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubarray(numbers);
    }
}

// Kadanes algorithms

public class array{
    public static void kadanes(int numbers[] ){
        int ms = Integer.MIN_VALUE;
        int cs=0;

        for(int i =0 ; i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Our max subarray sum is "+ ms);
    }
    public static void main(String[] args) {
        int numbers[] = {2,-5,-3,5,-8};
        kadanes(numbers); 
    }
}


//    TRAPPED WATER

/*public class array{
    public static int trappedWater(int height[]){//O(n)
        int n = height.length;
        //calculate left max boundary-- array
        int leftMax [] = new int[n];
        leftMax[0]=height[0];
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        // calculate right max boundary-- array
        int rightMax[] = new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2; i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        // loop
        int trapped=0;
        for(int i=0; i<n; i++){
            // waterLevel=min(leftmax bound , rightmax bound)
            int waterLevel=Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterLevel - height[i]
            trapped+=waterLevel-height[i];
            

        }
        return trapped;
        

        
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        
        System.out.println("The trapped rain water is : "+trappedWater(height));

    }
}*/

//                   Buy and sell the stock



/*public class array{
    public static int buyAndSellstocks(int prices[]){
        int buyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyPrices<prices[i]){
                // profit
                int profit = prices[i]-buyPrices;// todays profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrices=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("max profit is "+buyAndSellstocks(prices));
    }
}
*/
