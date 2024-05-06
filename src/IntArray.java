public class IntArray {

    private int[]array = {};

    public IntArray(int[] array) {
        this.array = array;
    }

    public IntArray() {}

    /**
     * Get element by index
     *
     * @param index
     *          the index
     */
    public int get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index can not be negative.");
        }
        if (index > array.length -1) {
            throw new IllegalArgumentException("Index out of array length.");
        }
        return array[index];
    }

    /**
     * Remove element by index
     *
     * @param index
     *          the index
     */
    public void remove(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index can not be negative.");
        }
        if (index > array.length -1) {
            throw new IllegalArgumentException("Index out of array length.");
        }
        int length = array.length;
        int newLength = array.length -1;
        int[] newArray = new int[newLength];
        if(index == 0) {
            System.arraycopy(array, 1, newArray, 0, newLength);
        } else if (index == array.length -1) {
            System.arraycopy(array, 0, newArray, 0, newLength);
        } else {
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, length - index - 1);
        }
        array = newArray;
    }

    /**
     * Add element to the array
     *
     * @param element
     *          the element
     */
    public void add(int element) {
        int length = array.length;
        int newLength = array.length + 1;
        int[] newArray = new int[newLength];
        System.arraycopy(array, 0, newArray, 0, length);
        newArray[newArray.length -1] = element;
        array = newArray;
    }

    /**
     * Insert element by index
     *
     * @param index
     *          the index
     * @param element
     *          the element
     */
    public void insert(int index, int element) {
        if (index < 0) {
            throw new IllegalArgumentException("Index can not be negative.");
        }
        if (index > array.length) {
            throw new IllegalArgumentException("Index out of array length.");
        }
        int length = array.length;
        int newLength = array.length + 1;
        int[] newArray = new int[newLength];
        if(index == 0) {
            System.arraycopy(array, 0, newArray, 1, length);
            newArray[0] = element;
        } else if (index == newLength - 1) {
            System.arraycopy(array, 0, newArray, 0, length);
            newArray[newLength -1] = element;
        } else {
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index, newArray, index + 1, length - index);
            newArray[index] = element;
        }
        array = newArray;
    }

    /**
     * Get array size
     *
     * @return  array size
     */
    public int size() {
        return array.length;
    }

    /**
     * Swap two elements in array
     *
     * @param index1
     *          first element index
     * @param index2
     *          second element index
     */
    public void swap(int index1, int index2) {
        if (index1 < 0 || index2 < 0) {
            throw new IllegalArgumentException("Index can not be negative.");
        }
        if (index1 > array.length || index2 > 0) {
            throw new IllegalArgumentException("Index out of array length.");
        }
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Merge two arrays in one
     *
     * @param array1
     *          first array
     * @param array2
     *          second array
     * @return merged array
     */
    public int[] merge(int[] array1, int[] array2) {
        //ToDo: add implementation
       return null;
    }

    /**
     * Check if array contains element
     *
     * @param element
     *          the element
     * @return true if array contains element
     */
    public boolean contains(int element) {
        //ToDo: add implementation
        return false;
    }

    /**
     * Insert subArray by index
     *
     * @param index
     *          the index
     * @param subArray
     *          the array to be inserted
     */
    public void insert(int index, int[] subArray) {
        //ToDo: add implementation
    }
}
