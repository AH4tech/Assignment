
public class Find_A_matrix_is_lower_triangular { 
	
	public static boolean is_lower_triangular(int arr[][]){
    boolean flag=true;
    if(arr.length!=arr[0].length){
        flag=false;
    }
    for(int i=0;i< arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if( i<j ){
                if(arr[i][j]!=0){
                    flag=false;
                }
            }
            else{
                if(arr[i][j]==0){
                    flag=false;
                }
            }
        }
    }
    return flag;
}
public static void main(String[] args) {
    int arr[][]= {{4, 0, 0},
                  {2, 5, 0},
                  {9, 8, 15}};
    System.out.println(is_lower_triangular(arr));

}
}