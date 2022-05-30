package PROJETO1;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificadorCharact {


    protected static boolean isInteger(String str) {

        return str != null && str.matches("[0-9]*");
    }

    protected static boolean isAlfa(String str) {

        return str != null && str.matches("[A-Za-z0-9]*");
    }
    protected static boolean isValidDate(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            sdf.setLenient(false);
            sdf.parse(date);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

}
