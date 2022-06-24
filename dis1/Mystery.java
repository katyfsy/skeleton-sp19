public static int mystery(int[] inputArray, int k) {
  int x = inputArray[k];
  int answer = k;
  int index = k + 1;
  while (index < inputArray.length) {
    if (inputArray[index] < x) {
      x = inputArray[index];
      answer = index;
    }
    index = index + 1;
  }
  return answer;
}

/**
It returns the index of the smallest element that occurs at or after index k in the array, in this case, 4. If k
is greater than or equal to the length of the array or less than 0, an ArrayIndexOutOfBoundsException will be
thrown, though this exception is not something you’d know without running the program.

The variable x keeps track of the smallest element found so far and the variable answer keeps track of the
index of this element. The variable index keeps track of the current position in the array. The while loop
steps through the elements of the array starting from index k + 1 and if the current element is less than x, x
and answer are updated.
 */

 //Selection Sort
 public static void mystery2(int[] inputArray) {
  int index = 0;
  while (index < inputArray.length) {
    int targetIndex = mystery(inputArray, index);
    int temp = inputArray[targetIndex];
    inputArray[targetIndex] = inputArray[index];
    inputArray[index] = temp;
    index = index + 1;
  }
 }
 /**
 At the beginning of each iteration of the while loop, the first index elements of the array are in sorted order.
 Then the method mystery is called to find the index of the smallest element of the array occurring at or after
 index. The element at the index returned by mystery is then swapped with the element at position index so
 that the first index + 1 elements of the array are in sorted order.
  */