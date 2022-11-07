package by.itacademy.klimasheuskaya_hanna;

import java.util.ArrayList;
import java.util.List;

public class Abiturients {
    public List<Abiturient> getAbiturientList(int amount) {
        List<Abiturient> listOfAbiturients = new ArrayList<>();
        int id = 1;
        for (int i = 0; i < amount; i++) {

            listOfAbiturients.add(new Abiturient(id++, generateRandomName(),
                    generateRandomSurname(), generateRandomPatronymic(), generateRandomPhoneNumber(),
                    generateRandomAddress(), generateRandomGrades()));
        }
        return listOfAbiturients;
    }

    private static String getString(String[] input) {
        int length = input.length;
        int random = (int) (Math.random() * length);
        return input[random];
    }

    private String generateRandomName() {
        String[] names = new String[]{"Гэндальф", "Арагорн", "Саруман", "Леголас", "Бильбо", "Фродо", "Сэм", "Перегрин", "Боромир", "Элронд"};
        return getString(names);
    }

    private String generateRandomSurname() {
        String[] surnames = new String[]{"Маккелен", "Мортенсер", "Ли", "Бэггинс", "Блум", "Гэмджи", "Тайлер", "Тук", "Бин", "Вуд"};
        return getString(surnames);
    }

    private String generateRandomPatronymic() {
        String[] patronymics = new String[]{"Евгеньевич", "Максимович", "Иванович", "Михайлович", "Юрьевич", "Дмитриевич", "Андреевич", "Вольдемарович"};
        return getString(patronymics);
    }

    private String generateRandomAddress() {
        String[] addresses = new String[]{"Минск, Белецкого 30", "Минск, Любимова 40", "Гомель, Центральная 10", "Витебск, Витовта 8", "Гродно, Замковая 18"};
        return getString(addresses);
    }

    public String generateRandomPhoneNumber() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String phoneNumber = new String("+375(29)xxx-xx-xx");
        for (int i =0; i < 10; i++) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }
        return phoneNumber;
    }

    public int[] generateRandomGrades () {
        int[] subjectGrades = new int[10];
        for (int i = 0; i < subjectGrades.length; i++) {
            subjectGrades[i] = (int) (Math.random()*9) + 1;;
        }
        return subjectGrades;
    }
}
