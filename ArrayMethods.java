/********************************************
 *	AUTHOR:	Travis Becker
 * COLLABORATORS:
 *	COURSE:	CS 111 Intro to CS I - Java
 *	LAST MODIFIED:	07/27/2026
 ********************************************/

public class ArrayMethods
{

  /**DESCRIPTION: Returns the array as a formatted String */
  public static String arrayString(int[] a)
  {
    String result = "{ ";

    for (int i = 0; i < a.length; i++)
    {
      result += a[i];

      if (i < a.length - 1)
      {
        result += ", ";
      }
    }

    result += " }";

    return result;
  }


  /**DESCRIPTION: Swaps two values in an array */
  public static void swap(int[] array, int a, int b)
  {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }


  /**DESCRIPTION: Finds the index of the minimum value starting at startIndex */
  public static int indexOfMin(int[] array, int startIndex)
  {
    int minIndex = startIndex;

    for (int i = startIndex + 1; i < array.length; i++)
    {
      if (array[i] < array[minIndex])
      {
        minIndex = i;
      }
    }

    return minIndex;
  }


  /**DESCRIPTION: Reverses the order of an array */
  public static void reverse(int[] array)
  {
    for (int i = 0; i < array.length / 2; i++)
    {
      swap(array, i, array.length - 1 - i);
    }
  }


  /**DESCRIPTION: Sorts an array using selection sort */
  public static void selectionSort(int[] array)
  {
    for (int i = 0; i < array.length - 1; i++)
    {
      int minIndex = indexOfMin(array, i);

      swap(array, i, minIndex);
    }
  }

}