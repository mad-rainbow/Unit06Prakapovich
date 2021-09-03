package lt.lhu.unit06_02.text;

import java.util.ArrayList;
import java.util.List;

import lt.lhu.unit06_02.Printable;
import lt.lhu.unit06_02.text.sentence.Sentence;

public class Paragraph implements Printable {

	List<Sentence> para = new ArrayList<Sentence>();

	public void add(Sentence s) {
		para.add(s);
	}

	@Override
	public void print() {
		System.out.println(para);

	}

}
