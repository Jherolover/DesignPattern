package structure.AdapterPattern;

/**
 * 对接多类型文件读取的类
 */
public class FileReaderAdapter implements FilerReader{

    AdvancedFileReader advancedFileReader;

    /**
     * 对应的适配器
     * @param fileType
     */
    public FileReaderAdapter(String fileType) {
       if ("TEXT".equalsIgnoreCase(fileType)){
           advancedFileReader = new TextFileReader();
       }else if("PDF".equalsIgnoreCase(fileType)){
           advancedFileReader = new PdfFileReader();
       }else if("XLS".equalsIgnoreCase(fileType)){
           advancedFileReader = new XlsFileReader();
       }else{
           System.out.println("传入的文件类型错误！");
       }
    }

    /**
     * 文件读取
     * @param fileType
     * @param filePath
     */
    @Override
    public void readFile(String fileType, String filePath) {
        if ("TEXT".equalsIgnoreCase(fileType)){
            advancedFileReader.readTextFile(filePath);
        }else if("PDF".equalsIgnoreCase(fileType)){
            advancedFileReader.readPdfFile(filePath);
        }else if("XLS".equalsIgnoreCase(fileType)){
            advancedFileReader.readXlsFile(filePath);
        }
    }
}
