/**
 * Naive / Brute-Force Algorithm == O(nm)
 *
 * Test Cases are included in Driver Method
 *
 * @authors TJ Bah & Ria Banerjee
 */

public class Main {

static void naiveSearch(String T, String P){ // ---------- --> O((n-m + 1) X m) = O(nm)

    //---------------------------------------[VARS]------//
    int nTxtLen = T.length(); // n
    int mPatLen = P.length(); // m

    int compCount = 1;

    for(int i = 0; i <= (nTxtLen - mPatLen); i++) { // for i <- 0 to n - m

        // test shift i of the pattern
        int j = 0; // j <- 0

       while(j < mPatLen && T.charAt(i+j) == P.charAt(j)){ // while j < m and T[i+j] = P[j]
           compCount++;
           j = j + 1; // j <- j + 1
       } /////////////////////////////////////////////// while(j < mPatLen && T.charAt(i+j) == P.charAt(j)) ** END **

       if(j == mPatLen){ // if j = m
           System.out.println("------------------------ -->Comparison #: " + (compCount-1));
           System.out.println("Found pattern match at index: " + i); // Print i (Match @ i)
           break;
       } else {
           System.out.println("------------------------ -->Comparison #: " + compCount);
           System.out.println("No match at index: " + i); // Print No match @ i
        } ///////////////////////////////////////////////////////////////////////////////////////////// else ** END **

        compCount++;
    } //////////////////////////////////////////////////////// for(int i = 0; i <= (nTxtLen - mPatLen); i++) ** END **

} ////////////////////////////////////////////////////////////////////////// naiveSearch(String T, String P) ** END **

    public static void main(String[] args) {


        // TEST Case 1
        String T = "THIS IS A SIMPLE EXAMPLE";
        String P = "SIMPLE";

        // Test Case 2
//        String T = "AAAAAAAAAAH";
//        String P = "AAAAH";

        // TEST Case 3
//        String T = "THIS IS MY NEW STRING AAAAHHHH";
//        String P = "NEW";

        // TEST Case 4
//        String T = "THIS TEST WILL HAVE MULTIPLE MATCHES, SO THAT WE CAN TEST. ONE MORE TEST.";
//        String P = "TEST";

        // TEST Case 5
//        String T = "COMPUTER SCIENCE IS NO MORE ABOUT COMPUTERS THAN ASTRONOMY IS ABOUT TELESCOPES";
//        String P = "NO";

        // TEST Case 6
//        String T = "NO COMPUTER IS EVER GOING TO ASK A NEW, REASONABLE QUESTION. IT TAKES TRAINED PEOPLE TO DO THAT.";
//        String P = "TRAINED";

        // TEST Case 7
//        String T = "WE CAN ONLY SEE A SHORT DISTANCE AHEAD, BUT WE CAN SEE PLENTY THERE THAT NEEDS TO BE DONE.";
//        String P = "DISTANCE";

        // TEST Case 8
//        String T = "QAZQAZQAZQAZZQAZZQAZZQAZZZZZZZZQQQQQQQZZZZZQAQAQAQAQAZZZQAAAAAZZZQAZZZZZZZQQQQQAAAZZZ";
//        String P = "QAZZZ";

        // TEST Case 9
//        String T = "COMPUTER SCIENCE IS THE OPERATING SYSTEM FOR ALL INNOVATION.";
//        String P = "NOVA";

        // TEST Case 10
//        String T = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKWWWWWKWWWWK";
//        String P = "WWWK";

        naiveSearch(T, P);

    } /////////////////////////////////////////////////////////////// public static void main(String[] args) ** END **

} //////////////////////////////////////////////////////////////////////////////////////// public class Main ** END **
