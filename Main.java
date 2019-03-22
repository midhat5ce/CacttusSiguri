public class Main{
  public static void main(String arg[]){

  	public static byte[] Permutation1 = 
            {57,   49,    41,   33,    25,    17,    9,
               1,   58,    50,   42,    34,    26,   18,
              10,    2,    59,   51,    43,    35,   27,
              19,   11,     3,   60,    52,    44,   36,
              63,   55,    47,   39,    31,    23,   15,
               7,   62,    54,   46,    38,    30,   22,
              14,    6,    61,   53,    45,    37,   29,
              21,   13,     5,   28,    20,    12,    4};
    
    public static byte[] Permutation2 =
            {14, 17, 11, 24, 1,  5,
             3,  28, 15, 6,  21, 10,
            23, 19, 12, 4,  26, 8,
            16, 7,  27, 20, 13, 2,
            41, 52, 31, 37, 47, 55,
            30, 40, 51, 45, 33, 48,
            44, 49, 39, 56, 34, 53,
            46, 42, 50, 36, 29, 32
            };
    private static byte[] round = {1,1,2,2,2,2,2,2,1,2,2,2,2,2,2,1};
    
    public static byte[] Permute(byte[] key, byte[] table)
    {
         byte[] permuted= new byte[table.length];
        
        for(int i=0; i<(table.length); i++)
        {
            int temp = table[i];
            permuted[i]=key[temp-1];
        };
    
        return permuted;
    };
 
    public static byte[] byteShift(byte[] arr,int a){
          byte temp1 = arr[0];
          byte temp2 = arr[1];
          byte[] shiftedArr = new byte[28];

          for(int i=0;i<27;i++) {
              if(a ==1) {
                  shiftedArr[i] = arr[i+1];
              }else if(a ==2) {
                  if(i ==26 ) continue;
                  shiftedArr[i] = arr[i+2];
              }

          }
          if(a ==1) {
              shiftedArr[27] = temp1;
          }else {
              shiftedArr[26] = temp1;
              shiftedArr[27] = temp2;
          }

          return shiftedArr;
      } 

  }
}