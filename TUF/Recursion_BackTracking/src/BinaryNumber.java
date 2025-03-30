public class BinaryNumber {
    public static void main(String[] args) {
        int n = 5;
        int idx =0;
        printBinaryNumber2(n, idx, "", '0');
    }
    //print all binary numbers of length n(number of bits)
    public static void printBinaryNumber(int n, int idx, String temp)
    {
        //base case
        if(idx == n)
        {
            System.out.println(temp);
            return;
        }

        //add zero
        printBinaryNumber(n, idx+1, temp+"0");
        //add one
        printBinaryNumber(n, idx+1, temp + "1");
    }
    //print all binary numbers of length n(number of bits): No consecutive 1
    public static void printBinaryNumber2(int n, int idx, String temp, char prev)
    {
        //base case
        if(idx == n)
        {
            System.out.println(temp);
            return;
        }

        //add zero
        printBinaryNumber2(n, idx+1, temp+"0", '0');
        //add one

        if(idx==0 || prev == '0')
        {
            printBinaryNumber2(n, idx+1, temp + "1", '1');
        }





    }

}
