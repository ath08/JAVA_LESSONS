import java.util.*;

public class ListUtils {
  //1.1 get the max number of ArrayList **option 1**
  public final int getMaxNumber(final List < Integer > list) {
    int maxNum = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) > maxNum) {
        maxNum = list.get(i);
      }
    }
    return maxNum;
  }

  //1.2 **option 2**
  public final int returnMaxNumOfArray(List < Integer > list) {
    int maxNum = Integer.MIN_VALUE;

    for (int i: list) {
      if (maxNum < i) {
        maxNum = i;
      }
    }
    return maxNum;
  }

  //1․3 **option 3**
  public int getMaxValue(List < Integer > list) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(j).compareTo(list.get(i)) > 0) {
          int temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);
        }
      }
    }
    return list.get(0);

  }

  //2.1 get the min number of ArrayList **option 1**
  public final int getMinNumber(final List < Integer > list) {
    int minNum = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) < minNum) {
        minNum = list.get(i);
      }
    }
    return minNum;
  }
  //2.2 **option 2**
  public final int returnMin(List < Integer > list) {
    int minNum = Integer.MAX_VALUE;
    for (int i: list) {
      if (minNum > i) {
        minNum = i;
      }
    }
    return minNum;
  }
  //2.3 **option 3**
  public int getMinValue(List < Integer > list) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(j).compareTo(list.get(i)) < 0) {
          int temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);
        }
      }
    }
    return list.get(0);

  }

  //3․1 return count of repeated elements
  public final Integer counterRepeatedElem(final List < Integer > list) {
    Integer counter = 0;
    for (Integer i = 0; i < list.size(); i++) {
      for (Integer j = i + 1; j < list.size(); j++) {
        if (list.get(i) == list.get(j)) {
          counter++;
        }
      }
    }
    return counter;
  }
//3.2 **option 2**
  public final int counterRepeatedElem1(final List < Integer > list) {
    int counter = 0;
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).equals(list.get(j))) { //
          counter++;
        }
      }
    }
    return counter;
  }
  //3.3 **option 3**
  public final int getCountOfDouplicatedElems(final List < Integer > numbers) {
    final Set < Integer > uniques = new HashSet < > (numbers);
    return numbers.size() - uniques.size();
  }

  //4.1 reverse Array
  public final List < Integer > reverseArray(final List < Integer > list) {
    final List < Integer > result = new ArrayList < > ();
    for (int i = list.size() - 1; i >= 0; i--) {
      result.add(list.get(i));
    }

    return result;

  }
//4.2 **option 2**
  public List < Integer > reverse(List < Integer > list) {
    int size = list.size();
    for (int i = 0; i < size / 2; i++) {
      int temp = list.get(i);
      list.set(i, list.get(size - i - 1));
      list.set(size - i - 1, temp);
    }
    return list;
  }

  //5. get count of even
  public final int returnCountOfEvenNumbers(final List < Integer > list) {
    int counter = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 == 0) {
        counter++;
      }
    }
    return counter;
  }
  //6. is ASD
  public final boolean IsASDOrdered(final List < Integer > list) {
    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        return false;
      }
    }
    return true;
  }
//7 
  public final List < Integer > getOnlyUnique(final List < Integer > list) {
    final List < Integer > res = new ArrayList < > ();
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = i; j < list.size(); j++) {
        if (list.get(i) == list.get(i + 1)) {
          continue;
        } else {
          res.add(i);
        }
      }
    }
    return res;

  }
  // return key / value
  public final Map < Integer, String > returnMapWithKeyValue(final List < String > list) {
    Map < Integer, String > res = new HashMap < > ();
    for (int i = 0; i < list.size(); i++) {
      int keyOfMap = i + 1;
      String valueOfMap = list.get(i);
      res.put(keyOfMap, valueOfMap);

    }

    return res;
  }
//8.1
  public List < String > sortByASD1(List < String > list) {
    Collections.sort(list);
    return list;

  }
//8.2
  public List < String > sortByASD(List < String > list) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(j).compareTo(list.get(i)) < 0) {
          String temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);
        }
      }
    }
    return list;

  }

}