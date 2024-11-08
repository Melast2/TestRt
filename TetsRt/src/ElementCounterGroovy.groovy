

class ElementCounterGroovy {
    static Map<Integer, Integer> countElements(int[] array) {
        Map<Integer, Integer> elementCountMap = [:]

        array.each { element ->
            elementCountMap[element] = elementCountMap.getOrDefault(element, 0) + 1
        }

        return elementCountMap
    }

}
