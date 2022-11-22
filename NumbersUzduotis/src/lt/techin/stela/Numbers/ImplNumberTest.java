package lt.techin.stela.Numbers;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;

public class ImplNumberTest implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> list) {
        Collections.sort(list);
        int element=list.get(0);
        return element;
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        Collections.sort(list);
        int element=list.get(list.size()-1);
        return element;
    }

    @Override
    public boolean isEqual(Object o, Object o1) {
        //return o == o1;
        return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        return o == o1;

    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        return null;
    }

    @Override
    public int computeSumOfNumbers(int number) {
        int sum = 0;

        for(int j = 1; j <= number; ++j)
        {
            // sum = sum + j;
            sum += j;
        }
        return sum;
        //System.out.println("Sum = " + sum);
    }

    @Override
    public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
        return 0;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int number) {
            List<Integer> result = new ArrayList<>();
            for (int i = 1; i < number; i++) {
                result.add(i);
            }
            return result;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
            for (Integer list1 : list) {
                if (map.containsKey(list1)) {
                    map.put(list1, map.get(list1) + 1);
                } else {
                    map.put(list1, 1);
                }
            }
            return map;
        }

    @Override
    public IntegerGenerator createIntegerGenerator(int from, int to) {
        return new IntegerGeneratorTest();
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return null;
    }
}
