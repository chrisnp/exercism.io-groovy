class BinarySearch {
    List data
    BinarySearch(List data) {
        this.data = data.sort() // Simple sort, ascending order
    }

    int binarySearch(value, low, high) {
        int mid = (low + high) >> 1
        if (data[mid] == value) return mid
        if (low >= high ) return -1
        else {
            if (data[mid] > value) { binarySearch(value, low, mid - 1) } 
            else { binarySearch(value, mid + 1, high) }
        }
    }

    int indexOf(item) {
        if (!data || item < data[0] || item > data[data.size() - 1]) 
            return -1 
        binarySearch(item, 0, data.size() - 1)
    }
}
