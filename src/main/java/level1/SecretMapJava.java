package level1;

import java.util.ArrayList;
import java.util.List;

public class SecretMapJava {

    public String[] solution(int n, int[] arr1, int[] arr2) {

        List<String> result = new ArrayList();

        for (int i = 0; i < n; i++) {
            String binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);
            binaryString= binaryString.replace("1", "#");
            binaryString = binaryString.replace("0", " ");

            for (int j = binaryString.length(); j < n; j++) {
                binaryString = " " + binaryString;
            }

            result.add(binaryString);
        }

        return result.toArray(new String[0]);
    }
}
