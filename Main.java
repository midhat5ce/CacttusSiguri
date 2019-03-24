import java.util.HashMap;
import java.util.Arrays;
import java.util.HashMap;


public class Main{
  public static void main(String arg[]){
    
    byte[] round = {1,1,2,2,2,2,2,2,1,2,2,2,2,2,2,1};

    byte[] left;
    byte[] right;

    byte[] input = {0,0,0,1,0,0,1,1,0,0,1,1,0,1,0,0, 0,1,0,1,0,1,1,1, 0,1,1,1,1,0,0,1
                    ,1,0,0,1,1,0,1,1, 1,0,1,1,1,1,0,0, 1,1,0,1,1,1,1,1, 1,1,1,1,0,0,0,1};

    Permutations perm = new Permutations();
    Shifts shift = new Shifts();

    byte[] permuted = perm.Permute(input,perm.keyPermutation);
   
    HashMap<String, byte[]> halve = shift.halve(permuted);
    left = halve.get("left");
    right = halve.get("right");

    for(int i=0; i<round.length; i++){
        left = shift.byteShift(left,round[i]);
        right = shift.byteShift(right,round[i]);
        
        byte[] _56key = shift.concatFunc(left, right);
        byte[] _48key = perm.Permute(_56key, perm.compressionPermutation);
        System.out.print( "Subkey no."+ (i+1)+": ");
        shift.Print(_48key);
    }
  }
}