package six.vjezbe;

public class MultiplicationTable {
    public static void main(String[] args) {
        int length = 25;
        printHeaderRow(length);
        System.out.println();
        System.out.println("#\t\t1\t\t2\t\t3");
        printHeaderRow(length);
        System.out.println();
        int[] columns = {1, 2, 3};
        int[] rows = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i<rows.length; i++){
            int rowNumber = rows[i];
            System.out.print(rowNumber+"\t\t");
            for(int j = 0; j<columns.length; j++){
                int columnNumber = columns[j];
                int product = rowNumber*columnNumber;
                System.out.print(product+"\t\t");
            }
            System.out.println();
        }

    }

    static void printHeaderRow(int length){
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }
}
