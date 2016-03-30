package factoryMethodDP;

public class DocumentFactory 
{
	 public IDocument CreateVersion(String docType) // Factory Method budur. Nesne yaratma sorumlulu�unu al�r.
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
