static int linearSearch(String[] arr, String target) {
    int comp = 0;
    for (int i = 0; i < arr.length; i++) {
        comp++;
        if (arr[i].equals(target)) {
            System.out.println("Comparisons=" + comp);
            return i;
        }
    }
    return -1;
}
static int binarySearch(String[] arr, String target) {
    int l = 0, r = arr.length - 1, comp = 0;

    while (l <= r) {
        comp++;
        int mid = (l + r) / 2;

        if (arr[mid].equals(target)) {
            System.out.println("Comparisons=" + comp);
            return mid;
        }
        if (arr[mid].compareTo(target) < 0) l = mid + 1;
        else r = mid - 1;
    }
    return -1;
}

// Count duplicates
static int countOccurrences(String[] arr, String target) {
    int count = 0;
    for (String s : arr)
        if (s.equals(target)) count++;
    return count;
}
