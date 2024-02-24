//#28 Array
//1] 2-D Array Declaration and Memory Allocation
/* class pankaj28{
    public static void main(String [] args){
        // int [] marks; A 1-D Array
        int [] [] flats; //A 2-D Array
        flats = new int [2] [3];
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][1] = 201;
        flats [1][0] = 202;
        flats [1][2] = 203;

        //Displaying the 2-D Array(for loop)f
        System.out.println("Printing the 2-D Array");
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.println(flats[i][j]);
            }
        }
    }
}*/
//2] 2-D Array  Declaration + Memory Allocation
 class pankaj28{
     public static void main(String [] args){
         int [][] marks = new int [2][3];
         marks [0][0]= 101;
         marks [0][1]= 102;
         marks [0][2]= 103;
         marks [1][0]= 201;
         marks [1][1]= 202;
         marks [1][2]= 203;

         System.out.println("Printing 2-D array");
         for(int i=0; i<marks.length; i++){
             for(int j=0; j<marks[i].length; j++){
                 System.out.println(marks[i][j]);
             }
         }
     }
}