import javax.imageio.IIOException;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File src = new File("C:\\Users\\User\\Documents\\Netology\\java core\\HW\\Games\\src");
        File res = new File("C:\\Users\\User\\Documents\\Netology\\java core\\HW\\Games\\res");
        File savegames = new File("C:\\Users\\User\\Documents\\Netology\\java core\\HW\\Games\\savegames");
        File temp = new File("C:\\Users\\User\\Documents\\Netology\\java core\\HW\\Games\\temp");
        StringBuilder stringBuilder = new StringBuilder();

        if (src.mkdir())
            stringBuilder.append("Создана директория " + src.getName() + System.lineSeparator());
        else
            stringBuilder.append("Ошибка создания директории " + src.getName() + System.lineSeparator());
        if (res.mkdir())
            stringBuilder.append("Создана директория " + res.getName() + System.lineSeparator());
        else
            stringBuilder.append("Ошибка создания директории " + res.getName() + System.lineSeparator());
        if (savegames.mkdir())
            stringBuilder.append("Создана директория " + savegames.getName() + System.lineSeparator());
        else
            stringBuilder.append("Ошибка создания директории " + savegames.getName() + System.lineSeparator());
        if (temp.mkdir())
            stringBuilder.append("Создана директория " + temp.getName() + System.lineSeparator());
        else
            stringBuilder.append("Ошибка создания директории " + temp.getName() + System.lineSeparator());


        File main = new File(src, "/main");
        File test = new File(src, "/test");

        if (main.mkdir())
            stringBuilder.append("В каталоге " + src.getName() + " создана новая директория " + main.getName()
                    + System.lineSeparator());
        else
            stringBuilder.append("Ошибка создания директории " + main.getName() + " В каталоге " + src.getName()
                    + System.lineSeparator());
        if (test.mkdir())
            stringBuilder.append("В каталоге " + src.getName() + " создана новая директория " + test.getName()
                    + System.lineSeparator());
        else
            stringBuilder.append("Ошибка создания директории " + test.getName() + " В каталоге " + src.getName()
                    + System.lineSeparator());


        File Main = new File(main, "Main.java");
        File Utils = new File(main, "Utils.java");
        try {
            if (Main.createNewFile())
                stringBuilder.append("Файл " + Main.getName() + " создан" + System.lineSeparator());
            else
                stringBuilder.append("Файл " + Main.getName() + " не создан" + System.lineSeparator());
        } catch (IOException e) {
            stringBuilder.append(e.getMessage());
        }
        try {
            if (Utils.createNewFile())
                stringBuilder.append("Файл " + Utils.getName() + " создан" + System.lineSeparator());
            else
                stringBuilder.append("Файл " + Utils.getName() + " не создан" + System.lineSeparator());
        } catch (IOException e) {
            stringBuilder.append(e.getMessage());
        }

        File drawables = new File(res, "/drawables");
        File vectors = new File(res, "/vectors");
        File icons = new File(res, "/icons");

        if (drawables.mkdir())
            stringBuilder.append("В каталоге " + res.getName() + " создана новая директория " + drawables.getName()
                    + System.lineSeparator());
        else stringBuilder.append("Ошибка создания директории " + drawables.getName() + " В каталоге " + res.getName()
                + System.lineSeparator());
        if (vectors.mkdir())
            stringBuilder.append("В каталоге " + res.getName() + " создана новая директория " + vectors.getName()
                    + System.lineSeparator());
        else stringBuilder.append("Ошибка создания директории " + vectors.getName() + " В каталоге " + res.getName()
                + System.lineSeparator());
        if (icons.mkdir())
            stringBuilder.append("В каталоге " + res.getName() + " создана новая директория " + icons.getName()
                    + System.lineSeparator());
        else stringBuilder.append("Ошибка создания директории " + icons.getName() + " В каталоге " + res.getName()
                + System.lineSeparator());

        File f = new File(temp, "temp.txt");
        try {
            if (f.createNewFile())
                stringBuilder.append("Файл " + f.getName() + " создан" + System.lineSeparator());
            else
                stringBuilder.append("Файл " + f.getName() + " не создан" + System.lineSeparator());
        } catch (IOException e) {
            stringBuilder.append(e.getMessage());
        }
        String text = stringBuilder.toString();
//        FileWriter fileWriter = new FileWriter(f, true);

        try (FileOutputStream fileOutputStream = new FileOutputStream(f, true)){
            byte[] bytes = text.getBytes();
            fileOutputStream.write(bytes);
        }


    }
}