
package HomeWorks;
public abstract class File{
	public abstract void open();
	public abstract void edit();
	public abstract void close();
	
	
	
}

class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("to open .java file we need notepad++ or sublime tex");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit() {
		System.out.println("To esit Java files we need Eclipse");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		System.out.println("to close java file we dont need call close method");
		// TODO Auto-generated method stub
		
	}
	
}
class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open microsoft file we need microsoft office app");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit() {
		System.out.println("we can edit microsoft file by using Execel");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		System.out.println("after click save we can close file");
		// TODO Auto-generated method stub
		
	}
	
}
class PDFfile extends File{

	@Override
	public void open() {
		System.out.println("we can open PDF file by usind Adobe Acrobat app");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit() {
		System.out.println("Adobe acrobat app can edit PDF files");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		System.out.println("we can close PDF files by clicking ALT+F4");
		// TODO Auto-generated method stub
		
	}
	
}