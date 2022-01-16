
public class find_maximum_of_each_column {
	
	public static void main(String[] args) {
        int arr[][]={{12, 18, 17},
                     {80, 51, 9},
                     {10, 11, 19}};
        for(int i=0;i<arr[0].length;i++){
            int max=0;
            for(int j=0;j< arr.length;j++){
                if(max<arr[j][i])
                    max=arr[j][i];
            }
            System.out.println(max);
        }
    }

}
