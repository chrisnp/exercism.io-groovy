class BinarySearch {

    List data

    // You may assume for this exercise that the input data 
    // is sorted in ascending order.
    BinarySearch(List data) {
        this.data = data
    }

    int binarySearch(value, low, high) {

        int mid = (low + high) / 2

        if (data[mid] == value) 
            return mid

        if (low >= high ) {
            return -1
        }
        else {
            if (data[mid] > value) {
                return binarySearch(value, low, mid - 1)
            }
            else {
                return binarySearch(value, mid + 1, high)
            }
        }
    }

    int indexOf(item) {
        
        if (!data || item < data[0] 
            || item > data[data.size() - 1])
            return -1 
        
        return binarySearch(item, 0, data.size() - 1)
    }
}
