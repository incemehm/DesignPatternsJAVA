package factoryMethodDP;

public class DocumentFactory 
{
	 public IDocument CreateVersion(String docType) throws Exception //Factory method
     {
         if (docType.equals("PDF"))
         {
             return new PdfDocument();
         }
         else if (docType.equals("DOCX"))
         {
             return new WordDocument();
         }
         else
         {
             throw new Exception("Wrong Choice!");
         }
     }
}
