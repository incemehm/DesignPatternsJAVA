package factoryMethodDP;

public class PdfDocument implements IDocument {

	 private String _title = "A_Clockwork_Orange_PDF";
     private String _content = "PDF:  In 1970..............";

	
	public PdfDocument() {
		System.out.println("Creating PDF Version.. ");
	}

	@Override
	public String GetDocumentTitle() {
		
		return _title;
	}

	@Override
	public String GetDocumentContent() {
		
		return _content;
	}

}
