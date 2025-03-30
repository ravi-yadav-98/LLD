package DSA;

public class BitManipultion {
    public static void main(String[] args) {
        System.out.println(getSetBitCount(7));
    }
    static private  int getSetBitCount(int num)
    {
        int setBitCount=0;
        for(int i=4; i>=0; i--)
        {
            if((num & ( 1<<i)) == 1)
            {
                setBitCount++;
            }
        }
        return setBitCount;
    }
}
