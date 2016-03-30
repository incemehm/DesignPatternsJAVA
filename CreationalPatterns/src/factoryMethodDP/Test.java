package factoryMethodDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 DocumentFactory factory = new DocumentFactory();

         IDocument doc = factory.CreateVersion("PDF");
         System.out.println(doc.GetDocumentTitle());
         System.out.println(doc.GetDocumentContent());

         doc = factory.CreateVersion("DOCX");
         System.out.println(doc.GetDocumentTitle());
         System.out.println(doc.GetDocumentContent());
		
	}

}
