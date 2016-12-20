import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by snoop on 16. 12. 14.
 */
public class ThreeNOne {
    public int start(int i, int i1) {

        List<Integer> fullList = this.fullList(i, i1);

        int maxCycle = 0;
        int currentCycle = 0;
        for( int indexI = 0; indexI < fullList.size();++indexI) {
            currentCycle = this.cycle(fullList.get(indexI));

            if(currentCycle > maxCycle) {
                maxCycle = currentCycle;
            }
        }

        return maxCycle;
    }

    public int logic(int i) {

        if(i % 2 == 0) {
            return i/2;
        }
        else {
            return i * 3 + 1;
        }


    }

    public List<Integer> fullList(int i, int i1) {

        List<Integer> returnList = new ArrayList<Integer>();
        for( int indexI = i ; indexI <= i1; ++indexI) {
            returnList.add(indexI);
        }

        return returnList;
    }

    public int cycle(int i) {

        int cycle = 1;
        int next = 0;

        do {
            next = this.logic(i);
            i = next;
            ++cycle;
        }while(next != 1);




        return cycle;
    }

    public static void main(String[] args) throws IOException {

        ThreeNOne threeNOne = new ThreeNOne();

       int[] intArray = threeNOne.inputs();

        threeNOne.print(intArray[0], intArray[1]);
    }

    public int input() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String value = bufferedReader.readLine();

        int vint = Integer.valueOf(value);

        return vint;

    }

    public int[] inputs() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String value = bufferedReader.readLine();

        int[] retInts = new int[2];


        String[] values = value.split(" ");

        retInts[0] = Integer.valueOf(values[0]);
        retInts[1] = Integer.valueOf(values[1]);



        return retInts;

    }

    public void print(int i, int i1) {

        int result = this.start(i, i1);


        System.out.println(i + " " + i1 + " " + result);


    }
}
