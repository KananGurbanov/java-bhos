package az.edu.bhos.lesson2;

public class DataType {
    public static void main(String[] args) {
        String a = "Kanan";
        a = a.concat("Super");
        System.out.println("Super".equals("SUPER"));
        System.out.println(a.charAt(0));
        System.out.println(a.toLowerCase());
        System.out.println(a.contains("kan"));
        System.out.println(a.compareTo("Aydin"));
        System.out.println(a.length());
    }
}
