/**
 * Boyer-Moore-Horspool Algorithm == O(nm)
 *
 * Test Cases are included in Driver Method
 *
 * @authors TJ Bah & Ria Banerjee
 */

public class Main {

    public static int SIZE=500;
    public static int table[]=new int[SIZE];

    public void shiftTable(String pattern){ // O( |Σ| + m ) = O( S + m )
        //-----------------------[VARs] ----//
        int i, j, m;
        char P[] = pattern.toCharArray();
        m = pattern.length();

        for (i = 0; i < SIZE; i++) {
            table[i] = m;
//            System.out.println(i + " = i " + Arrays.toString(table));
        } //////////////////////////// for (i = 0; i < SIZE; i++) ** END **

        for (j = 0; j < m-1; j++) {
            table[P[j]] = m - 1 - j;
//            System.out.println(i + " = i " + Arrays.toString(table));
        } /////////////////////////////// for (j = 0; j < m; j++) ** END **

    } /////////////////////////////////////////////////////////  public void shiftTable(String pattern) ** END **

    public int horspoolMatching(String pattern, String text){
        //-----------------------[VARs] ----//
        int i, k, pos, m, n;
        char T[] = text.toCharArray();
        char P[] = pattern.toCharArray();
        m = pattern.length();
        n = text.length();

        int compCount = 0;

        for(i=m-1;i<n;){

            k=0;

            while( (k<m) && P[m-1-k] == T[i-k] ) {
                k++; // k = k+1;
                compCount++;
                System.out.println("------------------------ -->Comparison #: " + compCount);
             } /////////////////////////////////////////////////////// while( (k<=m-1) && P[m-1-k] == T[i-k] ) ** END **

            if( k == m ){
                    pos = i - m + 2;
                    return pos;
            } else {
                    i+=table[T[i]]; // i <-- i + Table[T[i]]
            }

            compCount++;
            System.out.println("------------------------ -->Comparison #: " + compCount);
        } /////////////////////////////////////////////////////////////////////////////////// for(i=m-1;i<n;) ** END **
        return -1;
    } ////////////////////////////////////////////// public int horspoolMatching(String pattern, String text) ** END **

    public static void main(String[] args) {
        //-----------------------[VARs] ----//
        int pos;

        // Test 0 from Lecture
//        String pattern = "BARBER";
//        String text = "JIM SAW ME IN A BARBERSHOP";

        // TEST Case 1
//        String text = "THIS IS A SIMPLE EXAMPLE";
//        String pattern = "SIMPLE";

        // Test Case 2
//        String text = "AAAAAAAAAAH";
//        String pattern = "AAAAH";

        // TEST Case 3
//        String text = "THIS IS MY NEW STRING AAAAHHHH";
//        String pattern = "NEW";

        // TEST Case 4
//        String text = "THIS TEST WILL HAVE MULTIPLE MATCHES, SO THAT WE CAN TEST. ONE MORE TEST.";
//        String pattern = "TEST";

        // TEST Case 5
//        String text = "COMPUTER SCIENCE IS NO MORE ABOUT COMPUTERS THAN ASTRONOMY IS ABOUT TELESCOPES";
//        String pattern = "NO";

        // TEST Case 6
//        String text = "NO COMPUTER IS EVER GOING TO ASK A NEW, REASONABLE QUESTION. IT TAKES TRAINED PEOPLE TO DO THAT.";
//        String pattern = "TRAINED";

        // TEST Case 7
//        String text = "WE CAN ONLY SEE A SHORT DISTANCE AHEAD, BUT WE CAN SEE PLENTY THERE THAT NEEDS TO BE DONE.";
//        String pattern = "DISTANCE";

        // TEST Case 8
//        String text = "QAZQAZQAZQAZZQAZZQAZZQAZZZZZZZZQQQQQQQZZZZZQAQAQAQAQAZZZQAAAAAZZZQAZZZZZZZQQQQQAAAZZZ";
//        String pattern = "QAZZZ";

        // TEST Case 9
//        String text = "COMPUTER SCIENCE IS THE OPERATING SYSTEM FOR ALL INNOVATION.";
//        String pattern = "NOVA";

        // TEST Case 10
        String text = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKWWWWWKWWWWK";
        String pattern = "WWWK";


        Main sT = new Main();

        sT.shiftTable(pattern);
        pos = sT.horspoolMatching(pattern, text);

        if(pos == -1) {
            System.out.println("Pattern Not Found");
        } else {
            System.out.println("Pattern Found at Position: \t" + pos + "\n");
        } // else ** END **


//        for (int i = 0; i < table.length; i++) { // Print Shift Table
//            System.out.println(" ASCII = " + i + " | " + table[i]);
//        }

    } //////////////////////////////////////////////////////////////// public static void main(String[] args) ** END **
} 
