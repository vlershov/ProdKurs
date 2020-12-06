package Lessons3;

import java.util.HashMap;
import java.util.Map;

public class Main3 {

    public static void main(String[] args) {
        String str = new String("В лесу родилась елочка " +
                "В лесу она росла " +
                "Зимой и летом стройная " +
                "Зеленая была");
        //- Найти список слов, из которых состоит текст (дубликаты не считать);
        int size = stringToArray(str);
        System.out.println("Размер хэшмап = "+size);
        //- Найти список слов, из которых состоит текст (дубликаты не считать);
        // - Посчитать сколько раз встречается каждое слово (использовать HashMap);
        sizeevrystring(str);
        // - Посчитать сколько раз встречается каждое слово (использовать HashMap);

        //Написать простой класс PhoneBook(внутри использовать HashMap):
        //- В качестве ключа использовать фамилию
        //- В каждой записи всего два поля: phone, e-mail
        //- Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов), и отдельный метод для поиска e-mail по фамилии. Следует учесть, что под одной фамилией может быть несколько записей
        Person Ivanov = new Person("Иванов", "+111111111", "mail@mail.ru");
        Person Petrov = new Person("Петров", "+222222222", "mail1@yandex.ru");
        Person Sidorov = new Person("Сидоров", "+3333333333", "mail2@google.ru");
        Person Ivanov1 = new Person("Иванов", "+4444444444","mail3@ya.ru");

        PhoneBook.add(Ivanov);
        PhoneBook.add(Petrov);
        PhoneBook.add(Sidorov);
        PhoneBook.add(Ivanov1);

        System.out.println("Телефоны Иванов: " + PhoneBook.getPhone("Иванов"));
        System.out.println("Электронные  Петров: " + PhoneBook.getEmails("Петров"));
        System.out.println("Телефоны Сидоров: " + PhoneBook.getPhone("Сидоров"));
        System.out.println("Электронные Иванов: " + PhoneBook.getEmails("Иванов"));


    }
    public static int stringToArray(String s) {
        String[] strArray = s.split(" ");
        HashMap<Integer,String> hashAndNames = new HashMap<>();
        int key = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (hashAndNames.containsValue(strArray[i]) == false) {
                hashAndNames.put(key,strArray[i]);
                ++key;
            }
        }

        return hashAndNames.size();
    }
    public static void sizeevrystring(String s) {
        String[] strArray = s.split(" ");
        HashMap<String,Integer> hashAndNames = new HashMap<>();
        int key = 1;
        for (int i = 0; i < strArray.length; i++) {
            if (hashAndNames.containsKey(strArray[i]) == false) {
                hashAndNames.put(strArray[i],key);
            }else{
                int size = hashAndNames.get(strArray[i]);
                hashAndNames.put(strArray[i],++size);
            }
        }
        for (Map.Entry entry: hashAndNames.entrySet()) {

            System.out.println(entry);

        }
    }
}
