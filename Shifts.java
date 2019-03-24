/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */

import java.util.HashMap;

public class Shifts {
    
    
    public static HashMap<String, byte[]> halve(byte[] arr)
    {
        HashMap<String, byte[]> halves = new HashMap<>(); 
        byte[] left = new byte[28];
        byte[] right = new byte[28];
        
        for(int i=0;i<28;i++)
        {
            left[i]=arr[i];
            right[i]=arr[i+28];
        }
        halves.put("left",left);
        halves.put("right", right);
        
        return halves;
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
public static byte[] concatFunc(byte[] left, byte[]right) 
{

    byte[]concat = new byte[56];
    for(int i=0;i<56;i++)
    {
        if(i<28)
            concat[i]=left[i];
        else
            concat[i]=right[i-28];
    }
    return concat;
}

public static void Print(byte[] arr) 
{
        
        for(int i=0;i<arr.length;i++) 
                {       if(i%6==0)
                            System.out.print("\t");
                        else;
                    
                
            System.out.print(arr[i]);
        }
                System.out.println("");
}

    
}
