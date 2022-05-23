public class StringUtils {
    public static boolean isPositiveNumber(String str){
        if (org.apache.commons.lang3.StringUtils.startsWith(str, "-")){
            return false;
        }
        return true;
    }
}
