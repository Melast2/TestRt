import java.util.HashMap;
import java.util.Map;


    public class ElementCounter {
        public static void main(String[] args) {
            // Заданный массив
            int[] array = {1, 3, 4, 5, 1, 5, 4};

            // Вызываем метод для подсчета элементов
            Map<Integer, Integer> result = countElements(array);

            // Выводим результат
            for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        // Метод для подсчета количества элементов в массиве
        public static Map<Integer, Integer> countElements(int[] array) {
            // Создаем HashMap для хранения элементов и их количества
            Map<Integer, Integer> elementCountMap = new HashMap<>();

            // Проходим по каждому элементу массива
            for (int element : array) {
                // Если элемент уже есть в HashMap, увеличиваем его значение на 1
                if (elementCountMap.containsKey(element)) {
                    elementCountMap.put(element, elementCountMap.get(element) + 1);
                }
                // Если элемента нет, добавляем его с количеством 1
                else {
                    elementCountMap.put(element, 1);
                }
            }

            // Возвращаем ассоциативный массив с результатами
            return elementCountMap;
        }
    }
