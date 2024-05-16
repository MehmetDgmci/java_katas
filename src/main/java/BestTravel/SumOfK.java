package BestTravel;

import java.util.ArrayList;
import java.util.List;

public class SumOfK {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {

        List<List<Integer>> resultLs = new ArrayList<>();
        List<Integer> tempElementLs = new ArrayList<>();
        generateSubsets(ls, k, 0, tempElementLs, resultLs);
        int sum = 0;

        for (List<Integer> subset : resultLs) {
            int tempSum = 0;

            for (Integer element : subset) {
                tempSum += element;
            }
            if (tempSum > t) {
                continue;
            } else if (tempSum == t) {
                sum = tempSum;
                return sum;
            } else if (!(tempSum <= sum)) {
                sum = tempSum;
            }
        }
        return (sum != 0) ? sum : null;
    }

    private static void generateSubsets(List<Integer> inputList, int k, int start, List<Integer> tempElementList, List<List<Integer>> resultList) {
        if (tempElementList.size() == k) {
            resultList.add(new ArrayList<>(tempElementList));
            return;
        }

        for (int i = start; i < inputList.size(); i++) {
            tempElementList.add(inputList.get(i));
            generateSubsets(inputList, k, i + 1, tempElementList, resultList);
            tempElementList.remove(tempElementList.size() - 1);
        }
    }
}

