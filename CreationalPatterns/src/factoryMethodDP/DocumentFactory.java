package factoryMethodDP;

public class DocumentFactory 
{
	 public IDocument CreateVersion(String docType) // Factory Method budur. Nesne yaratma sorumluluðunu alýr.
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
             return null;
         }
     }
}
