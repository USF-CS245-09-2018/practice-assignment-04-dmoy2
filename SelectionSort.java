public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        for(int j =0; j<a.length-1; j++){
            swap(a, j, findMin(a, j));
        }
    }

    public void swap(int[]a, int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    public int findMin(int[]a, int from){
        int min = from;
        for(int i = from + 1; i < a.length; i++){
            if(a[i] < a[min]){
                min = i;
            }
        }
        return min;
    }
}
