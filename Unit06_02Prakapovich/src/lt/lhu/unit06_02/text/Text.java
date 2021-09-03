package lt.lhu.unit06_02.text;

import java.util.ArrayList;
import java.util.List;

import lt.lhu.unit06_02.Printable;

public class Text implements Printable {
	
	List<Paragraph> text = new ArrayList<Paragraph>();
	Heading head = new Heading();
	
	public void add(Paragraph p) {
		text.add(p);
	}

	@Override
	public void print() {
		System.out.println(head.getHead());
		System.out.println(text);
	}

}
