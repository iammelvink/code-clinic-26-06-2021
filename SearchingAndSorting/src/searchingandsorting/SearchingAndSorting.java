package searchingandsorting;

/**
 *
 * @author Student
 */
public class SearchingAndSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myArray[] = {19, 90, 80, 33, 55, 3, 1, 0, 100};
        int Number = 55;

        //Search(myArray,Number);
        System.out.println("" + Search(myArray, Number));
        //////////////////////////////////////////////

        //BubbleSort(myArray);
        /////////////////////DISPLAYING SORTED ARRAY
////        int SortedNums[]=BubbleSort(myArray);
////
////        for(int q=0;q<SortedNums.length;q=q+1)
////        {
////            System.out.println(SortedNums[q]+"");
////
////
////        }
        for (int B = 0; B < myArray.length; B = B + 1) {

            for (int C = 0; C < myArray.length - 1; C = C + 1) {
                ///int myArray[]={90,   19,   80,  33,   55,   3,   1,    0,      100};
                // 19,90, 80, 33 ,55, 3, 1, 0, 100

                //         19 80 90 33 55 3 1 0 100
                // 0   1      3    19   33    55    80     90  100
                //0                                           //8
                //0+8/2=4
                //=4
                //midpoint = 33
                if (myArray[C] > myArray[C + 1]) {

                    int temp;

                    temp = myArray[C + 1];///===19

                    myArray[C + 1] = myArray[C];
                    ///19      =90

                    //        //90
                    myArray[C] = temp;
                    /////90  =19
                }

            }

            for (int D = 0; D < myArray.length; D = D + 1) {
                System.out.println(myArray[D] + "");

            }

            //////////////BUBBLE SORT
            int Number2 = 55;
            int last = myArray.length - 1;
            int BSearch = BinarySearch(myArray, Number2, last);

            System.out.println("Binary search");
            System.out.println(BSearch + "");

        }

    }

    public static int Search(int MyNumber[], int WantedNum) {

        for (int y = 0; y < MyNumber.length; y = y + 1) {

            if (MyNumber[y] == WantedNum) {

                return y;

            }

        }

        return -1;

    }

    public static int[] BubbleSort(int Numbers[]) {

        for (int x = 0; x < Numbers.length; x = x + 1) {

//         int myArray[]={90,19,80,33,55,3,1,0,100};
            for (int l = 0; l < Numbers.length - 1; l = l + 1) {

                if (Numbers[l] > Numbers[l + 1]) {

                    int temp = Numbers[l + 1];
                    /////  =90

                    Numbers[l] = Numbers[l + 1];
//reaasign 19 to be 90      =19

                    Numbers[1 + 1] = temp;
//reassign 90 to 19       =90

                }

            }

        }
        return Numbers;

    }

    public static int BinarySearch(int Values[], int SearchItem, int LastElement) {

        int first = 0;
        int LastSub = LastElement;
        int Midpoint = 0;
        boolean found = false;
        // 0   1      3    19   33    55    80     90  100
        //FIRST ELEMENT SUB =0 IN MYARRAY THIS IS 0 (0)

        //LAST ELEMENT SUB=8 IN MYARRAY THIS IS 100 (8)
        while (first <= LastSub && !found) {
            Midpoint = (first + LastSub) / 2;
            if (Values[Midpoint] == SearchItem) {

                found = true;

            } else if (Values[Midpoint] > SearchItem) {

                LastSub = Midpoint - 1;
            } else {
                first = Midpoint + 1;

            }

        }

        if (found == true) {
            return Midpoint;

        } else {
            return -1;

        }

    }

}
