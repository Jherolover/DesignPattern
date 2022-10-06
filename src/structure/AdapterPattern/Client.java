package structure.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        MultiFileReader multiFileReader = new MultiFileReader();
        multiFileReader.readFile("TEXT","D:/1.txt");
        multiFileReader.readFile("PDF","D:/2.PDF");
        multiFileReader.readFile("XLS","D:/3.xls");

    }
}
