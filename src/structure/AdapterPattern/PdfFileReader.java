package structure.AdapterPattern;

public class PdfFileReader implements AdvancedFileReader{
    @Override
    public void readTextFile(String filePath) {

    }

    @Override
    public void readXlsFile(String filePath) {

    }

    @Override
    public void readPdfFile(String filePath) {
        System.out.println("读取pdf文件："+filePath);
    }
}
